package com.limoxd.horseengine.effect;

import com.limoxd.horseengine.HorseEngines;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, HorseEngines.MODID);

    public static final Holder<MobEffect> OILED_UP = MOB_EFFECTS.register("oiled_up", () -> new OiledUpEffect(MobEffectCategory.NEUTRAL, 3025193)
            .addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(HorseEngines.MODID,"oiled_up"), 0.6, AttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static void register(IEventBus EventBus) {
        MOB_EFFECTS.register(EventBus);
    }
}
