package weallparish.coloredlights.mixin;


import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import weallparish.coloredlights.ColoredLightMod;
import weallparish.coloredlights.block.ModBlocks;
import weallparish.coloredlights.block.custom.*;

@Mixin(AbstractFireBlock.class)
public abstract class AbstractFireBlockMixin {

    @Inject(method="getState",at=@At("RETURN"),cancellable = true)
    private static void getState(BlockView world, BlockPos pos,CallbackInfoReturnable<BlockState> returnInfo) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);

        ColoredLightMod.LOGGER.info(blockState.getBlock().getName().toString());

        if (LimeFireBlock.isCopperBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.COPPER_FIRE.getDefaultState());
        }
        else if (RedFireBlock.isRedstoneBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.REDSTONE_FIRE.getDefaultState());
        }
        else if (WhiteFireBlock.isCalciteBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.CALCIUM_FIRE.getDefaultState());
        }
        else if (BlackFireBlock.isSculkBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.SCULK_FIRE.getDefaultState());
        }
        else if (MagentaFireBlock.isEndstoneBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.END_FIRE.getDefaultState());
        }
        else if (YellowFireBlock.isGoldBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.GOLD_FIRE.getDefaultState());
        }
        else if (GreenFireBlock.isMossBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.MOSS_FIRE.getDefaultState());
        }
        else if (CyanFireBlock.isPrismarineBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.PRISMARINE_FIRE.getDefaultState());
        }
        else if (BlueFireBlock.isLapisBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.LAPIS_FIRE.getDefaultState());
        }
        else if (PurpleFireBlock.isCryingObsidianBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.CRYING_OBSIDIAN_FIRE.getDefaultState());
        }
        else if (PinkFireBlock.isCoralBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.CORAL_FIRE.getDefaultState());
        }
        else if (LightGrayFireBlock.isMyceliumBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.MYCELIUM_FIRE.getDefaultState());
        }
        else if (GrayFireBlock.isCoalBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.COAL_FIRE.getDefaultState());
        }
        else if (BrownFireBlock.isDebrisBase(blockState)) {
            returnInfo.setReturnValue(ModBlocks.DEBRIS_FIRE.getDefaultState());
        }
    }

}
