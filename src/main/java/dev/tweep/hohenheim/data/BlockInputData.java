package dev.tweep.hohenheim.data;

import lombok.Data;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.jetbrains.annotations.Nullable;

@Data
public class BlockInputData {

    private final Material material;
    private final String id;

    public BlockInputData(Block block) {
        this.material = block.getType();
        this.id = BlockStorage.checkID(block);
    }

    public BlockInputData(Material material, @Nullable BlockInputData item) {
        this.material = material;
        if (item != null) {
            this.id = item.getId();
        } else {
            this.id = null;
        }
    }

}
