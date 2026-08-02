package com.limoxd.horseengine.effect;

import com.limoxd.horseengine.HorseEngines;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECT = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, HorseEngines.MODID);

    public static final Holder<MobEffect> OILED_UP = MOB_EFFECT.register("oiled_up", () ->new OiledUpEffect(MobEffectCategory.NEUTRAL, 91776)
            .addAttributeModifier());

    public static void register(IEventBus modEventBus) {
    }
}
