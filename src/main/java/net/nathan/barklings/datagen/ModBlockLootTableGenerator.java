package net.nathan.barklings.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.nathan.barklings.block.ModBlocks;
import net.nathan.barklings.block.custom.BlueberryBush;
import net.nathan.barklings.block.custom.GrapeBush;
import net.nathan.barklings.block.custom.StrawberryBush;
import net.nathan.barklings.item.ModItems;


import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {

    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Blocks.BIRCH_LEAVES, birchLeavesDrops(Blocks.BIRCH_LEAVES, Blocks.BIRCH_SAPLING, .05f));
        addDrop(Blocks.SPRUCE_LEAVES, spruceLeavesDrops(Blocks.SPRUCE_LEAVES, Blocks.SPRUCE_SAPLING, .05f));
        addDrop(Blocks.ACACIA_LEAVES, acaciaLeavesDrops(Blocks.ACACIA_LEAVES, Blocks.ACACIA_SAPLING, .05f));
        addDrop(Blocks.JUNGLE_LEAVES, jungleLeavesDrops(Blocks.JUNGLE_LEAVES, Blocks.JUNGLE_SAPLING, .05f));
        addDrop(Blocks.DARK_OAK_LEAVES, darkOakLeavesDrops(Blocks.DARK_OAK_LEAVES, Blocks.DARK_OAK_SAPLING, .05f));
        addDrop(Blocks.CHERRY_LEAVES, cherryLeavesDrops(Blocks.CHERRY_LEAVES, Blocks.CHERRY_SAPLING, .05f));
        addDrop(Blocks.MANGROVE_LEAVES, mangroveLeavesDrops(Blocks.MANGROVE_LEAVES, Blocks.MANGROVE_PROPAGULE, .05f));
        addDrop(ModBlocks.GILDED_OAK_LEAVES, gildedOakLeavesDrops(ModBlocks.GILDED_OAK_LEAVES, ModBlocks.GILDED_OAK_SAPLING, .05f));

        addDrop(ModBlocks.GILDED_OAK_PLANKS);
        addDrop(ModBlocks.GILDED_OAK_LOG);
        addDrop(ModBlocks.GILDED_OAK_WOOD);
        addDrop(ModBlocks.STRIPPED_GILDED_OAK_LOG);
        addDrop(ModBlocks.STRIPPED_GILDED_OAK_WOOD);
        addDrop(ModBlocks.GILDED_OAK_STAIRS);
        addDrop(ModBlocks.GILDED_OAK_SLAB, slabDrops(ModBlocks.GILDED_OAK_SLAB));
        addDrop(ModBlocks.GILDED_OAK_BUTTON);
        addDrop(ModBlocks.GILDED_OAK_PRESSURE_PLATE);
        addDrop(ModBlocks.GILDED_OAK_FENCE);
        addDrop(ModBlocks.GILDED_OAK_FENCE_GATE);
        addDrop(ModBlocks.GILDED_OAK_DOOR, doorDrops(ModBlocks.GILDED_OAK_DOOR));
        addDrop(ModBlocks.GILDED_OAK_TRAPDOOR);
        addDrop(ModBlocks.GILDED_OAK_SIGN);
        addDrop(ModBlocks.GILDED_OAK_WALL_SIGN);
        addDrop(ModBlocks.GILDED_OAK_HANGING_SIGN);
        addDrop(ModBlocks.GILDED_OAK_WALL_HANGING_SIGN);
        addDrop(ModBlocks.GILDED_OAK_SAPLING);
        addDrop(ModBlocks.POTTED_GILDED_OAK_SAPLING, pottedPlantDrops(ModBlocks.GILDED_OAK_SAPLING));

        addDrop(ModBlocks.LIVING_LANTERN);
        addDrop(ModBlocks.CLOVER, flowerbedDrops(ModBlocks.CLOVER));

        LootCondition.Builder builder1 = BlockStatePropertyLootCondition.builder(ModBlocks.BLUEBERRY_BUSH)
                .properties(StatePredicate.Builder.create().exactMatch(BlueberryBush.AGE, 3));
        this.addDrop(ModBlocks.BLUEBERRY_BUSH, this.cropDrops(ModBlocks.BLUEBERRY_BUSH, ModItems.BLUEBERRY, Items.AIR, builder1));
        LootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.GRAPE_BUSH)
                .properties(StatePredicate.Builder.create().exactMatch(GrapeBush.AGE, 3));
        this.addDrop(ModBlocks.GRAPE_BUSH, this.cropDrops(ModBlocks.GRAPE_BUSH, ModItems.GRAPES, Items.AIR, builder2));
        LootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.STRAWBERRY_BUSH)
                .properties(StatePredicate.Builder.create().exactMatch(StrawberryBush.AGE, 3));
        this.addDrop(ModBlocks.STRAWBERRY_BUSH, this.cropDrops(ModBlocks.STRAWBERRY_BUSH, ModItems.STRAWBERRY, Items.AIR, builder3));

    }

    public LootTable.Builder birchLeavesDrops(Block leaves, Block drop, float... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.PEAR))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }
    public LootTable.Builder spruceLeavesDrops(Block leaves, Block drop, float... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.PLUM))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }
    public LootTable.Builder acaciaLeavesDrops(Block leaves, Block drop, float... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.ORANGE))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }
    public LootTable.Builder jungleLeavesDrops(Block leaves, Block drop, float... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.BANANA))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }
    public LootTable.Builder darkOakLeavesDrops(Block leaves, Block drop, float... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.POMEGRANATE))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }
    public LootTable.Builder cherryLeavesDrops(Block leaves, Block drop, float... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.CHERRIES))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }
    public LootTable.Builder mangroveLeavesDrops(Block leaves, Block drop, float... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.STARFRUIT))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }

    public LootTable.Builder gildedOakLeavesDrops(Block leaves, Block drop, float... chance) {
        return this.leavesDrops(leaves, drop, chance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(WITHOUT_SILK_TOUCH_NOR_SHEARS).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(Items.GOLDEN_APPLE))).conditionally(TableBonusLootCondition.builder(Enchantments.FORTUNE, new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }


}
