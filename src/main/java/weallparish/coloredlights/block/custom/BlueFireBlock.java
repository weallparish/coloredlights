package weallparish.coloredlights.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;
import weallparish.coloredlights.util.ModTags;

public class BlueFireBlock extends FireBlock {

    public BlueFireBlock(Settings settings) {
        super(settings);
    }

    public static boolean isLapisBase(BlockState state) {
        return state.isIn(ModTags.Blocks.BLUE_FIRE_BASE_BLOCKS);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return false;
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
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return BlueFireBlock.isLapisBase(world.getBlockState(pos.down()));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (this.canPlaceAt(state, world, pos)) {
            return this.getDefaultState();
        }
        return Blocks.AIR.getDefaultState();
    }
}