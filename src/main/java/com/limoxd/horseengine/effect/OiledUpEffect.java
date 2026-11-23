package com.limoxd.horseengine.effect;

import net.minecraft.client.particle.Particle;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class OiledUpEffect extends MobEffect {
    public OiledUpEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean isBeneficial() {
        return true;
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        if (livingEntity.isSprinting()){
             Level level = null;
             level.addParticle(
                     ParticleTypes.CAMPFIRE_COSY_SMOKE,
                     livingEntity.getX(),
                     livingEntity.getY(),
                     livingEntity.getZ(),
                     1, 1, 1);
        }
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {return true;}

    @Override
    public void onEffectAdded(LivingEntity entity, int amplifier) {
        super.onEffectAdded(entity, amplifier);
    }

    @Override
    public void onEffectStarted(LivingEntity entity, int amplifier) {}
}
