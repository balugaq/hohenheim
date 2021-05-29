package dev.tweep.hohenheim.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.block.Block;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class BlockRecipe {

    private static final HashMap<BlockInputData, BlockRecipe> map = new HashMap<>();

    private final BlockInputData input;
    private final SlimefunItem output;
    private final int cost;

    public static SlimefunItem findRecipe(PlayerData data, Block block) {
        BlockRecipe recipe = map.get(new BlockInputData(block));
        if (recipe != null && recipe.cost < data.getEntropy()) {
            data.setEntropy(data.getEntropy() - recipe.cost);
            return recipe.output;
        }
        return null;
    }

    public void register() {
        map.put(this.input, this);
    }

}
