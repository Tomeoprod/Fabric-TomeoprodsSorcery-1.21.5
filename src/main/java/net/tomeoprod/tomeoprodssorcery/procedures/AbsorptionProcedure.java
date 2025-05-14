package net.tomeoprod.tomeoprodssorcery.procedures;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Blocks;
import net.minecraft.util.ActionResult;

public class AbsorptionProcedure {
    public static void absorbGrassBlock() {
        UseBlockCallback.EVENT.register((playerEntity, world, hand, blockHitResult) -> {
            ActionResult result = ActionResult.PASS;
            if (world.getBlockState(blockHitResult.getBlockPos()) == Blocks.GRASS_BLOCK.getDefaultState()) {
                if (playerEntity.getMainHandStack().isEmpty()) {
                    world.setBlockState(blockHitResult.getBlockPos(), Blocks.BEDROCK.getDefaultState());
                    result = ActionResult.SUCCESS;
                }
            }
            return result;
        });
    }
}

