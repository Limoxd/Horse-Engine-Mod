package com.limoxd.horseengine.effect;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

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
