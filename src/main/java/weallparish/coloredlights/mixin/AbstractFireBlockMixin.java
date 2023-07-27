package weallparish.coloredlights.mixin;


import net.minecraft.block.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import weallparish.coloredlights.ColoredLightMod;
import weallparish.coloredlights.block.ModBlocks;
import weallparish.coloredlights.block.custom.GreenFireBlock;

import java.awt.*;

@Mixin(AbstractFireBlock.class)
public abstract class AbstractFireBlockMixin {

    @Inject(method="getState",at=@At("RETURN"),cancellable = true)
    private static void getState(BlockView world, BlockPos pos,CallbackInfoReturnable<BlockState> returnInfo) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);

        ColoredLightMod.LOGGER.info(blockState.getBlock().getName().toString());

        if (GreenFireBlock.isCopperBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.GREEN_FIRE.getDefaultState());
        }
    }

}
