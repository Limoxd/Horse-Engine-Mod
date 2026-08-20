package com.limoxd.horseengine.util;

import com.limoxd.horseengine.HorseEngines;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;

public class HorseEngineTags {
    public static class Items {
        public static final TagKey<Item> FEEDING_HORSE_OIL_ITEM = createTag("feeding_horse_oil_item");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(HorseEngines.MODID, name));
        }
    }

}
