package com.limoxd.horseengine.common;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber(modid = "horse_engine")
public class FeedingClass{
    Player player;

    public static void register(IEventBus modEventBus) {}

    @SubscribeEvent
    public void FeedingHorse(PlayerInteractEvent.EntityInteract interact){

        Entity entity = interact.getEntity();
        ItemStack MainHand = player.getMainHandItem();
        if(entity instanceof Horse horse) {
            horse.remove(Entity.RemovalReason.KILLED);
        }
    }
}
