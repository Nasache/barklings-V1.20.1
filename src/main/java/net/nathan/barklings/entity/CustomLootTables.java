package net.nathan.barklings.entity;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.nathan.barklings.BarklingsMain;

public class CustomLootTables {
    private static final Set<Identifier> LOOT_TABLES = new HashSet<>();
    private static final Set<Identifier> LOOT_TABLES_READ_ONLY;

    public static final Identifier OAK_BARKLING_BARTERING;
    public static final Identifier BIRCH_BARKLING_BARTERING;
    public static final Identifier SPRUCE_BARKLING_BARTERING;
    public static final Identifier DARK_OAK_BARKLING_BARTERING;
    public static final Identifier MANGROVE_BARKLING_BARTERING;
    public static final Identifier CHERRY_BARKLING_BARTERING;
    public static final Identifier JUNGLE_BARKLING_BARTERING;
    public static final Identifier ACACIA_BARKLING_BARTERING;
    public static final Identifier CRIMSON_BARKLING_BARTERING;
    public static final Identifier WARPED_BARKLING_BARTERING;
    public static final Identifier MUSHROOM_BARKLING_BARTERING;
    public static final Identifier AZALEA_BARKLING_BARTERING;

    public static final Identifier OAK_BARKLING_DROPS;
    public static final Identifier BIRCH_BARKLING_DROPS;
    public static final Identifier SPRUCE_BARKLING_DROPS;
    public static final Identifier DARK_OAK_BARKLING_DROPS;
    public static final Identifier MANGROVE_BARKLING_DROPS;
    public static final Identifier CHERRY_BARKLING_DROPS;
    public static final Identifier JUNGLE_BARKLING_DROPS;
    public static final Identifier ACACIA_BARKLING_DROPS;
    public static final Identifier CRIMSON_BARKLING_DROPS;
    public static final Identifier WARPED_BARKLING_DROPS;
    public static final Identifier MUSHROOM_BARKLING_DROPS;
    public static final Identifier AZALEA_BARKLING_DROPS;

    static {
        LOOT_TABLES_READ_ONLY = Collections.unmodifiableSet(LOOT_TABLES);

        OAK_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/oak_dweller_bartering"));
        BIRCH_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/birch_dweller_bartering"));
        SPRUCE_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/spruce_dweller_bartering"));
        DARK_OAK_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/dark_oak_dweller_bartering"));
        MANGROVE_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/mangrove_dweller_bartering"));
        CHERRY_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/cherry_dweller_bartering"));
        JUNGLE_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/jungle_dweller_bartering"));
        ACACIA_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/acacia_dweller_bartering"));
        CRIMSON_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/crimson_dweller_bartering"));
        WARPED_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/warped_dweller_bartering"));
        MUSHROOM_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/mushroom_dweller_bartering"));
        AZALEA_BARKLING_BARTERING = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "gameplay/dweller/azalea_dweller_bartering"));


        OAK_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/oak_dweller_drops"));
        BIRCH_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/birch_dweller_drops"));
        SPRUCE_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/spruce_dweller_drops"));
        DARK_OAK_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/dark_oak_dweller_drops"));
        MANGROVE_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/mangrove_dweller_drops"));
        CHERRY_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/cherry_dweller_drops"));
        JUNGLE_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/jungle_dweller_drops"));
        ACACIA_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/acacia_dweller_drops"));
        CRIMSON_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/crimson_dweller_drops"));
        WARPED_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/warped_dweller_drops"));
        MUSHROOM_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/mushroom_dweller_drops"));
        AZALEA_BARKLING_DROPS = registerLootTable(new Identifier(BarklingsMain.MOD_ID, "entities/azalea_dweller_drops"));
    }

    private static Identifier registerLootTable(Identifier id) {
        if (LOOT_TABLES.add(id)) {
            return id;
        } else {
            throw new IllegalArgumentException(id.toString() + " is already a registered built-in loot table");
        }
    }

    public static Set<Identifier> getAll() {
        return LOOT_TABLES_READ_ONLY;
    }
}
