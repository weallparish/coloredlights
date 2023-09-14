package weallparish.coloredlights.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import weallparish.coloredlights.block.ModBlocks;

import java.util.List;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.COPPER_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.REDSTONE_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.CALCIUM_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.SCULK_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.END_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.GOLD_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.MOSS_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.PRISMARINE_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.LAPIS_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.CRYING_OBSIDIAN_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.CORAL_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.MYCELIUM_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.COAL_FIRE);
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.DEBRIS_FIRE);

        blockStateModelGenerator.registerTorch(ModBlocks.COPPER_TORCH, ModBlocks.COPPER_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.DECORATIVE_REDSTONE_TORCH, ModBlocks.DECORATIVE_REDSTONE_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.CALCIUM_TORCH, ModBlocks.CALCIUM_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.SCULK_TORCH, ModBlocks.SCULK_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.END_TORCH, ModBlocks.END_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.GOLD_TORCH, ModBlocks.GOLD_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.MOSS_TORCH, ModBlocks.MOSS_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.PRISMARINE_TORCH, ModBlocks.PRISMARINE_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.LAPIS_TORCH, ModBlocks.LAPIS_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.CRYING_OBSIDIAN_TORCH, ModBlocks.CRYING_OBSIDIAN_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.CORAL_TORCH, ModBlocks.CORAL_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.MYCELIUM_TORCH, ModBlocks.MYCELIUM_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.COAL_TORCH, ModBlocks.COAL_WALL_TORCH);
        blockStateModelGenerator.registerTorch(ModBlocks.DEBRIS_TORCH, ModBlocks.DEBRIS_WALL_TORCH);

        blockStateModelGenerator.registerLantern(ModBlocks.COPPER_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.DECORATIVE_REDSTONE_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.CALCIUM_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.SCULK_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.END_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.GOLD_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.MOSS_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.PRISMARINE_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.LAPIS_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.CRYING_OBSIDIAN_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.CORAL_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.MYCELIUM_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.COAL_LANTERN);
        blockStateModelGenerator.registerLantern(ModBlocks.DEBRIS_LANTERN);

        blockStateModelGenerator.registerCampfire(ModBlocks.COPPER_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.REDSTONE_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.CALCIUM_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.SCULK_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.END_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.GOLD_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.MOSS_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.PRISMARINE_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.LAPIS_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.CRYING_OBSIDIAN_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.CORAL_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.MYCELIUM_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.COAL_CAMPFIRE);
        blockStateModelGenerator.registerCampfire(ModBlocks.DEBRIS_CAMPFIRE);

    }

    public void generateCustomFireModels(BlockStateModelGenerator blockStateModelGenerator, Block fire) {
        List<Identifier> list = blockStateModelGenerator.getFireFloorModels(fire);
        List<Identifier> list2 = blockStateModelGenerator.getFireSideModels(fire);
        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(fire).
                with(BlockStateModelGenerator.buildBlockStateVariants(list, blockStateVariant -> blockStateVariant))
                .with(BlockStateModelGenerator.buildBlockStateVariants(list2, blockStateVariant -> blockStateVariant))
                .with(BlockStateModelGenerator.buildBlockStateVariants(list2, blockStateVariant -> blockStateVariant.put(VariantSettings.Y, VariantSettings.Rotation.R90)))
                .with(BlockStateModelGenerator.buildBlockStateVariants(list2, blockStateVariant -> blockStateVariant.put(VariantSettings.Y, VariantSettings.Rotation.R180)))
                .with(BlockStateModelGenerator.buildBlockStateVariants(list2, blockStateVariant -> blockStateVariant.put(VariantSettings.Y, VariantSettings.Rotation.R270))));

    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
