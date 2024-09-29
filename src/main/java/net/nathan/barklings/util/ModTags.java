package net.nathan.barklings.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.nathan.barklings.BarklingsMain;

public class ModTags {
    public static class Blocks{

        public static final TagKey<Block> GILDED_OAK_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("barklings", "gilded_oak_logs"));


        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BarklingsMain.MOD_ID, name));
        }
    }
    private static TagKey<Block> createCommonBlockTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
    }

    public static class Items {

        public static final TagKey<Item> FRUIT = createItemTag("fruit");
        public static final TagKey<Item> GILDED_OAK_LOGS = createItemTag("gilded_oak_logs");

        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BarklingsMain.MOD_ID, name));
        }

        private static TagKey<Item> createCommonItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }
}
