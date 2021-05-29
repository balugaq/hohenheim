package dev.tweep.hohenheim.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.inventory.ItemStack;

@Data
@AllArgsConstructor
public class WandRecipe {

    private ItemStack[] recipeEntry;
    private ItemStack output;
    private int cost;

}
