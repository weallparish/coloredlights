package weallparish.coloredlights.block.custom;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;
import weallparish.coloredlights.util.ModTags;

public class GreenFireBlock extends AbstractFireBlock {
    public GreenFireBlock(Settings settings) {
        super(settings, 3.0f);
    }

    @Override
    public BlockState getAppearance(BlockState state, BlockRenderView renderView, BlockPos pos, Direction side, @Nullable BlockState sourceState, @Nullable BlockPos sourcePos) {
        return super.getAppearance(state, renderView, pos, side, sourceState, sourcePos);
    }

    @Override
    public boolean isEnabled(FeatureSet enabledFeatures) {
        return super.isEnabled(enabledFeatures);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return false;
    }

    public static boolean isCopperBase(BlockState state) {
        return state.isIn(ModTags.Blocks.GREEN_FIRE_BASE_BLOCKS);
    }
}
