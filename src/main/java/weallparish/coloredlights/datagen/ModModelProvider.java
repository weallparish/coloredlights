package weallparish.coloredlights.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import weallparish.coloredlights.block.ModBlocks;

import java.util.List;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        generateCustomFireModels(blockStateModelGenerator, ModBlocks.GREEN_FIRE);

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
