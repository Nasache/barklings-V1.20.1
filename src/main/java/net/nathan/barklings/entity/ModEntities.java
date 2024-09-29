package net.nathan.barklings.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nathan.barklings.BarklingsMain;
import net.nathan.barklings.entity.custom.BarklingEntity;

public class ModEntities {

    public static final EntityType<BarklingEntity> BARKLING = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(BarklingsMain.MOD_ID, "barkling"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BarklingEntity::new).dimensions(EntityDimensions.fixed(0.7f, 0.9f)).build());


    public static void registerModEntities() {
        BarklingsMain.LOGGER.info("Registering Mod Entities for " + BarklingsMain.MOD_ID);
    }
}
