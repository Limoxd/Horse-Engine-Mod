package com.limoxd.horseengine.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class OiledUpEffect extends MobEffect {
    public OiledUpEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean isBeneficial() {
        return true;
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {return true;}

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {return true;}
}
