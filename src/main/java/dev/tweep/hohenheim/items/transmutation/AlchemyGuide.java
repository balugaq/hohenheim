package dev.tweep.hohenheim.items.transmutation;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class AlchemyGuide extends SlimefunItem {

    private static final String[][] pages = {
        {
                "",
                "",
                ChatColor.RED + "炼金术，古老的艺术与科学",
                "",
                ""
            },
            {
                "",
                "...这种艺术由技艺高超的炼金术士施展，",
                "他们用自己的力量塑造大地与天空，",
                "从自身内部……",
                ""
            },
            {
                "",
                "...他们称之为熵的力量。为了能够引导这种力量，他们",
                "必须借助媒介。这就是炼金术士魔杖的作用，",
                "能够凭空创造出物质……",
                ""
            },
            {
                "",
                "...炼金术的方法通常是将魔法施加到地面上的物品，",
                "或者通过魔杖的挥动直接作用于地面本身。他们的",
                "能力取决于他们自身以及魔杖能够引导的熵的量……",
                ""
            },
            {
                "",
                "...草药学是炼金术士的重要部分，因为它允许他们通过自然的力量",
                "以前所未有的方式操纵熵。然而，炼金术士所需的特定植物",
                "可能已经不再存在于这个世界中了。也许通过某种炼金术，",
                "它们可以被重新带回这个世界？",
                ""
            },
            {
                "",
                "...存在禁忌的炼金术，其中必须以灵魂作为过程的一部分。",
                "只有技艺最为高超的炼金术士才敢尝试这样的行为……",
                "...要撕裂灵魂，该灵魂必须对自己的同类犯下谋杀罪……",
                "...只有被夺走灵魂的人才能进行炼金术……",
                ""
            },
            {
                "",
                "",
                ChatColor.RED + "完",
                "",
                ""
        }
    };

    private static final SlimefunItemStack ALCHEMY_GUIDE_STACK = new SlimefunItemStack("ALCHEMY_GUIDE",
            Material.WRITTEN_BOOK, ChatColor.RED + "Alchemy, Ancient Art and Science");

    public AlchemyGuide(ItemGroup category, RecipeType type, ItemStack[] recipe) {
        super(category, ALCHEMY_GUIDE_STACK, type, recipe);

        BookMeta meta = (BookMeta) ALCHEMY_GUIDE_STACK.getItemMeta();
        if (meta != null) {
            meta.setAuthor("Enzixar Edolius");
            meta.setGeneration(BookMeta.Generation.TATTERED);
            for (String[] page : pages) {
                meta.addPage(page);
            }
            ALCHEMY_GUIDE_STACK.setItemMeta(meta);
        }

    }
}
