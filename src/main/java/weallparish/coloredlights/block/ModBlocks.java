package weallparish.coloredlights.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import weallparish.coloredlights.ColoredLightMod;
import weallparish.coloredlights.block.custom.*;
import weallparish.coloredlights.particle.ModParticleTypes;

public class ModBlocks {
    //Copper Lights
    public static final Block COPPER_FIRE = registerBlockWithoutBlockItem("copper_fire",
            new LimeFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block COPPER_TORCH = registerBlockWithoutBlockItem("copper_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.LIME_FLAME));
    public static final Block COPPER_WALL_TORCH = registerBlockWithoutBlockItem("copper_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.LIME_FLAME));
    public static final Block COPPER_LANTERN = registerBlock("copper_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block COPPER_CAMPFIRE = registerBlock("copper_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Redstone Lights
    public static final Block REDSTONE_FIRE = registerBlockWithoutBlockItem("redstone_fire",
            new RedFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block DECORATIVE_REDSTONE_TORCH = registerBlockWithoutBlockItem("decorative_redstone_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.RED_FLAME));
    public static final Block DECORATIVE_REDSTONE_WALL_TORCH = registerBlockWithoutBlockItem("decorative_redstone_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.RED_FLAME));
    public static final Block DECORATIVE_REDSTONE_LANTERN = registerBlock("decorative_redstone_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block REDSTONE_CAMPFIRE = registerBlock("redstone_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Calcium Lights
    public static final Block CALCIUM_FIRE = registerBlockWithoutBlockItem("calcium_fire",
            new WhiteFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block CALCIUM_TORCH = registerBlockWithoutBlockItem("calcium_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.WHITE_FLAME));
    public static final Block CALCIUM_WALL_TORCH = registerBlockWithoutBlockItem("calcium_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.WHITE_FLAME));
    public static final Block CALCIUM_LANTERN = registerBlock("calcium_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block CALCIUM_CAMPFIRE = registerBlock("calcium_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Sculk Lights
    public static final Block SCULK_FIRE = registerBlockWithoutBlockItem("sculk_fire",
            new BlackFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block SCULK_TORCH = registerBlockWithoutBlockItem("sculk_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.BLACK_FLAME));
    public static final Block SCULK_WALL_TORCH = registerBlockWithoutBlockItem("sculk_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.BLACK_FLAME));
    public static final Block SCULK_LANTERN = registerBlock("sculk_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block SCULK_CAMPFIRE = registerBlock("sculk_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //End Lights
    public static final Block END_FIRE = registerBlockWithoutBlockItem("end_fire",
            new MagentaFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block END_TORCH = registerBlockWithoutBlockItem("end_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.MAGENTA_FLAME));
    public static final Block END_WALL_TORCH = registerBlockWithoutBlockItem("end_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.MAGENTA_FLAME));
    public static final Block END_LANTERN = registerBlock("end_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block END_CAMPFIRE = registerBlock("end_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Gold Lights
    public static final Block GOLD_FIRE = registerBlockWithoutBlockItem("gold_fire",
            new YellowFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block GOLD_TORCH = registerBlockWithoutBlockItem("gold_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.YELLOW_FLAME));
    public static final Block GOLD_WALL_TORCH = registerBlockWithoutBlockItem("gold_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.YELLOW_FLAME));
    public static final Block GOLD_LANTERN = registerBlock("gold_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block GOLD_CAMPFIRE = registerBlock("gold_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Moss Lights
    public static final Block MOSS_FIRE = registerBlockWithoutBlockItem("moss_fire",
            new GreenFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block MOSS_TORCH = registerBlockWithoutBlockItem("moss_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.GREEN_FLAME));
    public static final Block MOSS_WALL_TORCH = registerBlockWithoutBlockItem("moss_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.GREEN_FLAME));
    public static final Block MOSS_LANTERN = registerBlock("moss_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block MOSS_CAMPFIRE = registerBlock("moss_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Prismarine Lights
    public static final Block PRISMARINE_FIRE = registerBlockWithoutBlockItem("prismarine_fire",
                new CyanFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block PRISMARINE_TORCH = registerBlockWithoutBlockItem("prismarine_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.CYAN_FLAME));
    public static final Block PRISMARINE_WALL_TORCH = registerBlockWithoutBlockItem("prismarine_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.CYAN_FLAME));
    public static final Block PRISMARINE_LANTERN = registerBlock("prismarine_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block PRISMARINE_CAMPFIRE = registerBlock("prismarine_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Lapis Lights
    public static final Block LAPIS_FIRE = registerBlockWithoutBlockItem("lapis_fire",
            new BlueFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block LAPIS_TORCH = registerBlockWithoutBlockItem("lapis_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.BLUE_FLAME));
    public static final Block LAPIS_WALL_TORCH = registerBlockWithoutBlockItem("lapis_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.BLUE_FLAME));
    public static final Block LAPIS_LANTERN = registerBlock("lapis_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block LAPIS_CAMPFIRE = registerBlock("lapis_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Crying Obsidian Lights
    public static final Block CRYING_OBSIDIAN_FIRE = registerBlockWithoutBlockItem("crying_obsidian_fire",
            new PurpleFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block CRYING_OBSIDIAN_TORCH = registerBlockWithoutBlockItem("crying_obsidian_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.PURPLE_FLAME));
    public static final Block CRYING_OBSIDIAN_WALL_TORCH = registerBlockWithoutBlockItem("crying_obsidian_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.PURPLE_FLAME));
    public static final Block CRYING_OBSIDIAN_LANTERN = registerBlock("crying_obsidian_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block CRYING_OBSIDIAN_CAMPFIRE = registerBlock("crying_obsidian_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Coral Lights
    public static final Block CORAL_FIRE = registerBlockWithoutBlockItem("coral_fire",
            new PinkFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block CORAL_TORCH = registerBlockWithoutBlockItem("coral_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.PINK_FLAME));
    public static final Block CORAL_WALL_TORCH = registerBlockWithoutBlockItem("coral_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.PINK_FLAME));
    public static final Block CORAL_LANTERN = registerBlock("coral_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block CORAL_CAMPFIRE = registerBlock("coral_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Mycelium Lights
    public static final Block MYCELIUM_FIRE = registerBlockWithoutBlockItem("mycelium_fire",
            new LightGrayFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block MYCELIUM_TORCH = registerBlockWithoutBlockItem("mycelium_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.LIGHT_GRAY_FLAME));
    public static final Block MYCELIUM_WALL_TORCH = registerBlockWithoutBlockItem("mycelium_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.LIGHT_GRAY_FLAME));
    public static final Block MYCELIUM_LANTERN = registerBlock("mycelium_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block MYCELIUM_CAMPFIRE = registerBlock("mycelium_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Coal Lights
    public static final Block COAL_FIRE = registerBlockWithoutBlockItem("coal_fire",
            new GrayFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block COAL_TORCH = registerBlockWithoutBlockItem("coal_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.GRAY_FLAME));
    public static final Block COAL_WALL_TORCH = registerBlockWithoutBlockItem("coal_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.GRAY_FLAME));
    public static final Block COAL_LANTERN = registerBlock("coal_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block COAL_CAMPFIRE = registerBlock("coal_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    //Debris Lights
    public static final Block DEBRIS_FIRE = registerBlockWithoutBlockItem("debris_fire",
            new BrownFireBlock(FabricBlockSettings.copyOf(Blocks.SOUL_FIRE)));
    public static final Block DEBRIS_TORCH = registerBlockWithoutBlockItem("debris_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH), ModParticleTypes.BROWN_FLAME));
    public static final Block DEBRIS_WALL_TORCH = registerBlockWithoutBlockItem("debris_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.WALL_TORCH), ModParticleTypes.BROWN_FLAME));
    public static final Block DEBRIS_LANTERN = registerBlock("debris_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN)));
    public static final Block DEBRIS_CAMPFIRE = registerBlock("debris_campfire",
            new CampfireBlock(false,1,FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

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
