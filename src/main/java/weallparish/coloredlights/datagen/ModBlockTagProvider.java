package weallparish.coloredlights.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import weallparish.coloredlights.ColoredLightMod;
import weallparish.coloredlights.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.LIME_FIRE_BASE_BLOCKS)
                .add(Blocks.COPPER_BLOCK)
                .add(Blocks.EXPOSED_COPPER)
                .add(Blocks.WEATHERED_COPPER)
                .add(Blocks.OXIDIZED_COPPER)
                .add(Blocks.CUT_COPPER)
                .add(Blocks.EXPOSED_CUT_COPPER)
                .add(Blocks.WEATHERED_CUT_COPPER)
                .add(Blocks.OXIDIZED_CUT_COPPER)
                .add(Blocks.WAXED_COPPER_BLOCK)
                .add(Blocks.WAXED_EXPOSED_COPPER)
                .add(Blocks.WAXED_WEATHERED_COPPER)
                .add(Blocks.WAXED_OXIDIZED_COPPER)
                .add(Blocks.WAXED_CUT_COPPER)
                .add(Blocks.WAXED_EXPOSED_CUT_COPPER)
                .add(Blocks.WAXED_WEATHERED_CUT_COPPER)
                .add(Blocks.WAXED_OXIDIZED_CUT_COPPER)
                .forceAddTag(BlockTags.COPPER_ORES)
                .add(Blocks.RAW_COPPER_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.RED_FIRE_BASE_BLOCKS)
                .add(Blocks.REDSTONE_BLOCK)
                .add(Blocks.TARGET)
                .add(Blocks.PISTON)
                .add(Blocks.STICKY_PISTON)
                .add(Blocks.REDSTONE_LAMP)
                .forceAddTag(BlockTags.REDSTONE_ORES);

        getOrCreateTagBuilder(ModTags.Blocks.WHITE_FIRE_BASE_BLOCKS)
                .add(Blocks.CALCITE)
                .add(Blocks.BONE_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.BLACK_FIRE_BASE_BLOCKS)
                .add(Blocks.SCULK)
                .add(Blocks.SCULK_CATALYST);

        getOrCreateTagBuilder(ModTags.Blocks.MAGENTA_FIRE_BASE_BLOCKS)
                .add(Blocks.END_STONE)
                .add(Blocks.END_STONE_BRICKS)
                .add(Blocks.PURPUR_BLOCK)
                .add(Blocks.PURPUR_PILLAR);

        getOrCreateTagBuilder(ModTags.Blocks.YELLOW_FIRE_BASE_BLOCKS)
                .forceAddTag(BlockTags.GOLD_ORES)
                .add(Blocks.RAW_GOLD_BLOCK)
                .add(Blocks.GOLD_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.GREEN_FIRE_BASE_BLOCKS)
                .add(Blocks.MOSS_BLOCK)
                .add(Blocks.MOSSY_COBBLESTONE)
                .add(Blocks.MOSSY_STONE_BRICKS);

        getOrCreateTagBuilder(ModTags.Blocks.CYAN_FIRE_BASE_BLOCKS)
                .add(Blocks.PRISMARINE)
                .add(Blocks.DARK_PRISMARINE)
                .add(Blocks.PRISMARINE_BRICKS);

        getOrCreateTagBuilder(ModTags.Blocks.BLUE_FIRE_BASE_BLOCKS)
                .add(Blocks.LAPIS_BLOCK)
                .forceAddTag(BlockTags.LAPIS_ORES);

        getOrCreateTagBuilder(ModTags.Blocks.PURPLE_FIRE_BASE_BLOCKS)
                .add(Blocks.CRYING_OBSIDIAN)
                .add(Blocks.RESPAWN_ANCHOR);

        getOrCreateTagBuilder(ModTags.Blocks.PINK_FIRE_BASE_BLOCKS)
                .forceAddTag(BlockTags.CORAL_BLOCKS);

        getOrCreateTagBuilder(ModTags.Blocks.LIGHT_GRAY_FIRE_BASE_BLOCKS)
                .add(Blocks.MYCELIUM);

        getOrCreateTagBuilder(ModTags.Blocks.GRAY_FIRE_BASE_BLOCKS)
                .add(Blocks.COAL_BLOCK)
                .forceAddTag(BlockTags.COAL_ORES);

        getOrCreateTagBuilder(ModTags.Blocks.BROWN_FIRE_BASE_BLOCKS)
                .add(Blocks.ANCIENT_DEBRIS);
    }
}
