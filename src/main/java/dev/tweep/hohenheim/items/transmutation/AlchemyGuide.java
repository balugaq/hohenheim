package dev.tweep.hohenheim.items.transmutation;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class AlchemyGuide extends SlimefunItem {

    private static final String[][] pages = {
            {
                    "",
                    "",
                    ChatColor.RED + "Alchemy, Ancient Art and Science",
                    "",
                    ""
            },
            {
                "",
                "...the art is performed by alchemists of great skill",
                    "who with their power shape the land and the sky",
                    "from within themselves...",
                    ""
            },
            {
                "",
                "...power they call entropy. To be able to channel this power, they",
                "must use a medium. This is the purpose of the wand of an alchemist, to",
                "be able to create matter out of matter...",
                ""
            },
            {
                "",
                "...methods of alchemy are usually either by casting their magic to items",
                "on the ground, or in the ground itself with a flick of their wand. Their",
                "ability depends on how much entropy they can channel within themselves and",
                "their wand respectively...",
                ""
            },
            {
                "",
                "...herbology is a vital part for the alchemist, as it allows it to manipulate",
                "entropy via the power of nature in never seen before ways. However, the specific",
                "plants an alchemist needs may not exist in this realm anymore. Perhaps with some",
                "transmutation, it might be possible to bring them back?",
                ""
            },
            {
                "",
                "...are forbidden transmutations, in which one's soul must be a part of the process.",
                "Only the most skilled alchemists would ever dare to do something like this...",
                "...tear a soul, said soul must commit homicide on your own species...",
                "...only the one whose soul was taken from could do the transmutation...",
                ""
            },
            {
                "",
                "",
                ChatColor.RED + "End of the book",
                "",
                ""
            }
    };

    private static final SlimefunItemStack ALCHEMY_GUIDE_STACK = new SlimefunItemStack("ALCHEMY_GUIDE",
            Material.WRITTEN_BOOK, ChatColor.RED + "Alchemy, Ancient Art and Science");

    public AlchemyGuide(Category category, RecipeType type, ItemStack[] recipe) {
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
