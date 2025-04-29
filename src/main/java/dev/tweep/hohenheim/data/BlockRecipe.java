package dev.tweep.hohenheim.data;

import dev.tweep.hohenheim.util.Logger;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import lombok.AllArgsConstructor;
import lombok.Data;
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
        if (recipe != null && recipe.getCost() < data.getEntropy()) {
            Logger.log(recipe.toString());
            data.setEntropy(data.getEntropy() - recipe.getCost());
            return recipe.getOutput();
        }
        return null;
    }

    public void register() {
        map.put(this.input, this);
    }

}
