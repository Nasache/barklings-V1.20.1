package net.nathan.barklings.datagen;

import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.TagProvider;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.PaintingVariantTags;
import net.minecraft.util.Identifier;
import net.nathan.barklings.BarklingsMain;

import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantTagProvider extends TagProvider<PaintingVariant> {
    public ModPaintingVariantTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture) {
        super(output, RegistryKeys.PAINTING_VARIANT, registryLookupFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(PaintingVariantTags.PLACEABLE)
                .addOptional(new Identifier(BarklingsMain.MOD_ID, "natures_palette"))
                .addOptional(new Identifier(BarklingsMain.MOD_ID, "the_forests_child"));
    }
}