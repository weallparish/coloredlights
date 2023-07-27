package weallparish.coloredlights.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import weallparish.coloredlights.ColoredLightMod;
import weallparish.coloredlights.block.custom.CustomFireBlock;
import weallparish.coloredlights.block.custom.RedFireBlock;
import weallparish.coloredlights.block.custom.WhiteFireBlock;

public class ModBlocks {
    public static final Block GREEN_FIRE = registerBlockWithoutBlockItem("green_fire",
            new CustomFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block RED_FIRE = registerBlockWithoutBlockItem("red_fire",
            new RedFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block WHITE_FIRE = registerBlockWithoutBlockItem("white_fire",
            new WhiteFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ColoredLightMod.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(ColoredLightMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ColoredLightMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ColoredLightMod.LOGGER.info("Register ModBlocks for " + ColoredLightMod.MOD_ID);
    }

}
