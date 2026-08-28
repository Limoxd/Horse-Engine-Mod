package com.limoxd.horseengine.util;

import com.limoxd.horseengine.HorseEngines;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class HorseEngineTags {
    public static class Items {
        public static final TagKey<Item> HORSE_DRINKABLE_OIL = createTag("horse_drinkable_oil");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(HorseEngines.MODID, name));
        }
    }

}
