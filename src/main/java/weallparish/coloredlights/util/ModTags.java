package weallparish.coloredlights.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import weallparish.coloredlights.ColoredLightDataGenerator;
import weallparish.coloredlights.ColoredLightMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> LIME_FIRE_BASE_BLOCKS =
                createBlockTag("lime_fire_base_blocks");
        public static final TagKey<Block> RED_FIRE_BASE_BLOCKS =
                createBlockTag("red_fire_base_blocks");
        public static final TagKey<Block> WHITE_FIRE_BASE_BLOCKS =
                createBlockTag("white_fire_base_blocks");
        public static final TagKey<Block> BLACK_FIRE_BASE_BLOCKS =
                createBlockTag("black_fire_base_blocks");
        public static final TagKey<Block> MAGENTA_FIRE_BASE_BLOCKS =
                createBlockTag("magenta_fire_base_blocks");
        public static final TagKey<Block> YELLOW_FIRE_BASE_BLOCKS =
                createBlockTag("yellow_fire_base_blocks");
        public static final TagKey<Block> GREEN_FIRE_BASE_BLOCKS =
                createBlockTag("green_fire_base_blocks");
        public static final TagKey<Block> CYAN_FIRE_BASE_BLOCKS =
                createBlockTag("cyan_fire_base_blocks");
        public static final TagKey<Block> BLUE_FIRE_BASE_BLOCKS =
                createBlockTag("blue_fire_base_blocks");
        public static final TagKey<Block> PURPLE_FIRE_BASE_BLOCKS =
                createBlockTag("purple_fire_base_blocks");
        public static final TagKey<Block> PINK_FIRE_BASE_BLOCKS =
                createBlockTag("pink_fire_base_blocks");
        public static final TagKey<Block> LIGHT_GRAY_FIRE_BASE_BLOCKS =
                createBlockTag("light_gray_fire_base_blocks");
        public static final TagKey<Block> GRAY_FIRE_BASE_BLOCKS =
                createBlockTag("gray_fire_base_blocks");
        public static final TagKey<Block> BROWN_FIRE_BASE_BLOCKS =
                createBlockTag("brown_fire_base_blocks");

        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(ColoredLightMod.MOD_ID, name));
        }
        private static TagKey<Block> createCommonBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items {
        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(ColoredLightMod.MOD_ID, name));
        }
        private static TagKey<Item> createCommonItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }
}
