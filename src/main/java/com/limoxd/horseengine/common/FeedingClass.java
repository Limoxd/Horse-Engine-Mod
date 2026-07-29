package com.limoxd.horseengine.common;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Interaction;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber(modid = "horse_engine")
public class FeedingClass{
    PlayerInteractEvent.EntityInteractSpecific entityInteractSpecific;

    public PlayerInteractEvent.EntityInteractSpecific getEntityInteractSpecific() {

        return entityInteractSpecific;
    }


}
