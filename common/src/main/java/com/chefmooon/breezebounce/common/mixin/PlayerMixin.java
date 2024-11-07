package com.chefmooon.breezebounce.common.mixin;

import com.chefmooon.breezebounce.common.block.SimpleBreezeBounceBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class PlayerMixin {

    @Inject(method = "jumpFromGround()V", at = @At("TAIL"))
    public void breezeBounceJump(CallbackInfo ci) {
        Player player = (Player) (Object) this;
        Level level = player.level();

        BlockPos blockPos = player.getOnPos();
        Block block = level.getBlockState(blockPos).getBlock();
        if (block instanceof SimpleBreezeBounceBlock simpleBreezeBounceBlock) {
            level.playSound(player, player.getOnPos(), simpleBreezeBounceBlock.getBounceSound(), SoundSource.BLOCKS, 0.7F, 0.5F);
        }
    }
}
