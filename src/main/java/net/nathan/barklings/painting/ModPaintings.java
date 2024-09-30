package net.nathan.barklings.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nathan.barklings.BarklingsMain;

public class ModPaintings {
    public static final PaintingVariant NATURES_PALETTE = registerPainting("natures_palette", new PaintingVariant(32, 16));
    public static final PaintingVariant FORESTS_CHILD = registerPainting("the_forests_child", new PaintingVariant(16, 16));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(BarklingsMain.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        BarklingsMain.LOGGER.info("Registering Paintings for " + BarklingsMain.MOD_ID);
    }
}
