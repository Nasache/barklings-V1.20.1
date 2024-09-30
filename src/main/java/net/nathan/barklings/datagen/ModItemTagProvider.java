package net.nathan.barklings.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.nathan.barklings.block.ModBlocks;
import net.nathan.barklings.item.ModItems;
import net.nathan.barklings.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.GILDED_OAK_LOG.asItem(), ModBlocks.GILDED_OAK_WOOD.asItem(),
                        ModBlocks.STRIPPED_GILDED_OAK_LOG.asItem(), ModBlocks.STRIPPED_GILDED_OAK_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.GILDED_OAK_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlocks.GILDED_OAK_LOG.asItem(), ModBlocks.GILDED_OAK_WOOD.asItem(),
                        ModBlocks.STRIPPED_GILDED_OAK_LOG.asItem(), ModBlocks.STRIPPED_GILDED_OAK_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlocks.GILDED_OAK_LEAVES.asItem());

        getOrCreateTagBuilder(ModTags.Items.GILDED_OAK_LOGS)
                .add(ModBlocks.GILDED_OAK_LOG.asItem(),
                        ModBlocks.GILDED_OAK_WOOD.asItem(),
                        ModBlocks.STRIPPED_GILDED_OAK_LOG.asItem(),
                        ModBlocks.STRIPPED_GILDED_OAK_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.HIDDEN_VOICES_MUSIC_DISC);

    }
}
