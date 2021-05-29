package dev.tweep.hohenheim.data;

import lombok.Data;
import lombok.NonNull;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.List;

@Data
public class ItemRecipe {

    private static final HashMap<Integer, ItemRecipe> map = new HashMap<>();

    private final ItemStack output;
    private final int cost;
    private int hash;

    /**
     * @param data        The {@link PlayerData} instance of the player that is crafting
     * @param recipeEntry A list of the Itemstacks provided.
     * @return The recipe that was used.
     */

    public static ItemStack findRecipe(@NonNull PlayerData data, @NonNull List<ItemStack> recipeEntry) {
        int currentHash = 0;
        ItemStack item;
        for (ItemStack entry : recipeEntry) {
            item = entry.clone();
            item.setAmount(1);
            currentHash += item.hashCode();
        }
        ItemRecipe recipe = map.get(currentHash);
        if (recipe != null && recipe.cost < data.getEntropy()) {
            data.setEntropy(data.getEntropy() - recipe.cost);
            return recipe.output;
        }
        return null;
    }

    public ItemRecipe(@NonNull ItemStack[] recipeEntry, @NonNull ItemStack output, @NonNull int cost) {
        this.output = output;
        this.cost = cost;
        for (ItemStack stack : recipeEntry) {
            hash += stack.hashCode();
        }
    }

    public void register() {
        map.put(this.hash, this);
    }

}
