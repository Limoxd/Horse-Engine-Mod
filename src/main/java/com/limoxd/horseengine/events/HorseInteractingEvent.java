package com.limoxd.horseengine.events;

import com.limoxd.horseengine.effect.ModEffects;
import com.limoxd.horseengine.util.HorseEngineTags;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber(modid = "horse_engine")
public class HorseInteractingEvent {

    @SubscribeEvent
    public void Interact(PlayerInteractEvent.EntityInteract interaction) {
        if (interaction.getLevel().isClientSide()) {
            return;
        }

        if (!(interaction.getTarget() instanceof Horse)) {
            return;
        }

        Player player = interaction.getEntity();
        Horse horse = (Horse) interaction.getTarget();
        MobEffectInstance instance = new MobEffectInstance(ModEffects.OILED_UP, 6000, 0, true, true, true);

        if (player.getItemInHand(InteractionHand.MAIN_HAND).is(HorseEngineTags.Items.FEEDING_HORSE_OIL_ITEM)) {
            player.getItemInHand(InteractionHand.MAIN_HAND).consumeAndReturn(1, horse);
            player.sendSystemMessage(Component.literal("it works"));
            horse.addEffect(instance);
        }

        interaction.setCancellationResult(InteractionResult.SUCCESS);
    }
}
