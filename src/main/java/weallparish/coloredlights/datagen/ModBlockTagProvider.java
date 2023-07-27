package weallparish.coloredlights.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
        getOrCreateTagBuilder(ModTags.Blocks.GREEN_FIRE_BASE_BLOCKS)
                .add(Blocks.COPPER_BLOCK)
                .add(Blocks.CUT_COPPER)
                .forceAddTag(BlockTags.COPPER_ORES);

        getOrCreateTagBuilder(ModTags.Blocks.RED_FIRE_BASE_BLOCKS)
                .add(Blocks.REDSTONE_BLOCK)
                .forceAddTag(BlockTags.REDSTONE_ORES);
    }
}
