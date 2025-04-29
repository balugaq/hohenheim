package dev.tweep.hohenheim.items.transmutation;

import dev.tweep.hohenheim.Hohenheim;
import dev.tweep.hohenheim.data.BlockRecipe;
import dev.tweep.hohenheim.data.ItemRecipe;
import dev.tweep.hohenheim.data.PlayerData;
import dev.tweep.hohenheim.managers.EntropyManager;
import dev.tweep.hohenheim.util.Laser;
import dev.tweep.hohenheim.util.Logger;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import lombok.NonNull;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TransmutationWand extends SlimefunItem {

    public TransmutationWand(@NonNull ItemGroup category, @NonNull SlimefunItemStack item,
                             @NonNull RecipeType type, @NonNull ItemStack[] recipe) {
        super(category, item, type, recipe);
        ItemMeta meta = getItem().getItemMeta();
        if (meta != null) {
            meta.getPersistentDataContainer().set(new NamespacedKey(Hohenheim.getInstance(), "entropy"),
                    PersistentDataType.BYTE, (byte) 1);
            getItem().setItemMeta(meta);
        }
    }

    @Override
    public void preRegister() {
        ItemUseHandler handler = this::onCast;
        addItemHandler(handler);
    }

    public void onCast(@NonNull PlayerRightClickEvent event) {
        PlayerData data = EntropyManager.getInstance().getActiveUser(event.getPlayer().getUniqueId());
        Location eyeLocation = event.getPlayer().getEyeLocation();
        Block target = Laser.spawnLaser(eyeLocation, eyeLocation.getDirection());

        if (target != null) {
            performTransmutation(target, data);
        }
    }

    private void performTransmutation(@NonNull Block block, @NonNull PlayerData playerData) {
        Collection<Entity> entities = block.getWorld().getNearbyEntities(block.getLocation(), 1, 1, 1);
        List<Item> items = entities.stream().filter(item -> item instanceof Item)
                .map(entity -> (Item) entity).collect(Collectors.toList());
        if (items.isEmpty()) {
            transmutateRecipe(playerData, block);
        } else {
            transmutateRecipe(playerData, block, items);
        }
    }

    private void transmutateRecipe(@NonNull PlayerData playerData, @NonNull Block block) {
        SlimefunItem output = BlockRecipe.findRecipe(playerData, block);
        if (output != null) {
            Logger.log(output.toString());
            block.setType(output.getItem().getType());
            BlockStorage.store(block, output.getId());
            block.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, block.getLocation(), 1);
            block.getWorld().playSound(block.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        }
    }

    private void transmutateRecipe(@NonNull PlayerData playerData, @NonNull Block block, @NonNull List<Item> items) {
        List<ItemStack> itemStacks = items.stream().map(Item::getItemStack).collect(Collectors.toList());
        ItemStack output = ItemRecipe.findRecipe(playerData, itemStacks);
        if (output != null) {
            for (Item item : items) {
                ItemStack itemStack = item.getItemStack();
                if (itemStack.getAmount() == 1) {
                    item.remove();
                } else {
                    itemStack.setAmount(itemStack.getAmount() - 1);
                }
            }
            block.getWorld().dropItem(block.getLocation().clone().add(0, 1, 0), output);
            block.getWorld().spawnParticle(Particle.SPELL_WITCH, block.getLocation(), 3);
            block.getWorld().playSound(block.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
        }
    }

}
