package com.limoxd.horseengine.events;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber(modid = "horse_engine")
public class HorseInteractingEvent {

    @SubscribeEvent
    public void Interact(PlayerInteractEvent.EntityInteract interaction){
        //runs only on serverside
        if (!interaction.getLevel().isClientSide()){return;}

        if (!(interaction.getTarget() instanceof Horse)){return;}

        Player player = interaction.getEntity();
        Horse horse = (Horse) interaction.getTarget();

        if (player.getItemInHand(InteractionHand.MAIN_HAND).is(Items.LAVA_BUCKET)){
            player.sendSystemMessage(Component.literal("it works"));
            player.sendSystemMessage(Component.literal(String.valueOf(horse.getAttribute(Attributes.MOVEMENT_SPEED))));
        }

        interaction.setCancellationResult(InteractionResult.SUCCESS);
    }

}
