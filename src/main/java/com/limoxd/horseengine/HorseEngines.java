package com.limoxd.horseengine;

import com.limoxd.horseengine.effect.ModEffects;
import com.limoxd.horseengine.events.HorseInteractingEvent;
import com.limoxd.horseengine.util.HorseEngineTags;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(HorseEngines.MODID)
public class HorseEngines {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "horse_engines";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    public HorseEngines(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (HorseEngines) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ModEffects.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        NeoForge.EVENT_BUS.register(new HorseInteractingEvent());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
}
