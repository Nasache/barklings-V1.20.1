package net.nathan.barklings.block;

import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.nathan.barklings.BarklingsMain;
import net.nathan.barklings.block.custom.*;
import net.nathan.barklings.util.ModWoodTypes;
import net.nathan.barklings.world.tree.GildedOakSaplingGenerator;

public class ModBlocks {

    public static final Block BLOOM_BERRY_BUSH = registerBlockWithoutBlockItem("bloom_berry_bush",
            new BloomBerryBush(AbstractBlock.Settings.create().mapColor(MapColor.LIME).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DRY_BERRY_BUSH = registerBlockWithoutBlockItem("dry_berry_bush",
            new DryBerryBush(AbstractBlock.Settings.create().mapColor(MapColor.LIME).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DUSK_BERRY_BUSH = registerBlockWithoutBlockItem("dusk_berry_bush",
            new DuskBerryBush(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WARPED_MANGO_POD = registerBlockWithoutBlockItem("warped_mango_pod",
            new WarpedMangoPod(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRIMSON_DURIAN_POD = registerBlockWithoutBlockItem("crimson_durian_pod",
            new CrimsonDurianPod(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block CLOVER_CARPET = registerBlock("clover_carpet",
            new FlowerbedBlock(AbstractBlock.Settings.copy(Blocks.PINK_PETALS)));

    public static final Block LIVING_LANTERN = registerBlock("living_lantern",
            new LivingLanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN).mapColor(MapColor.BROWN).sounds(BlockSoundGroup.WOOD).luminance((state) -> {
                return 12;})));

    public static final Block GILDED_OAK_PLANKS = registerBlock("gilded_oak_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block GILDED_OAK_STAIRS = registerBlock("gilded_oak_stairs",
            new StairsBlock(ModBlocks.GILDED_OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block GILDED_OAK_SLAB = registerBlock("gilded_oak_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block GILDED_OAK_BUTTON = registerBlock("gilded_oak_button",
            new ButtonBlock(AbstractBlock.Settings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final Block GILDED_OAK_PRESSURE_PLATE = registerBlock("gilded_oak_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block GILDED_OAK_FENCE = registerBlock("gilded_oak_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block GILDED_OAK_FENCE_GATE = registerBlock("gilded_oak_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block GILDED_OAK_DOOR = registerBlock("gilded_oak_door",
            new DoorBlock(AbstractBlock.Settings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block GILDED_OAK_TRAPDOOR = registerBlock("gilded_oak_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block GILDED_OAK_LOG = registerBlock("gilded_oak_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block GILDED_OAK_WOOD = registerBlock("gilded_oak_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_GILDED_OAK_LOG = registerBlock("stripped_gilded_oak_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_GILDED_OAK_WOOD = registerBlock("stripped_gilded_oak_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block GILDED_OAK_LEAVES = registerBlock("gilded_oak_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.GOLD)));
    public static final Block GILDED_OAK_SAPLING = registerBlock("gilded_oak_sapling",
            new SaplingBlock(new GildedOakSaplingGenerator(), AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).mapColor(MapColor.GOLD)));
    public static final Block POTTED_GILDED_OAK_SAPLING = registerBlockWithoutBlockItem("potted_gilded_oak_sapling",
            new FlowerPotBlock(GILDED_OAK_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING).mapColor(MapColor.GOLD)));

    public static final Block GILDED_OAK_SIGN = registerBlockWithoutBlockItem("gilded_oak_sign",
            new ModStandingSignBlock(AbstractBlock.Settings.copy(Blocks.OAK_SIGN), ModWoodTypes.GILDED_OAK));
    public static final Block GILDED_OAK_WALL_SIGN = registerBlockWithoutBlockItem("gilded_oak_wall_sign",
            new ModWallSignBlock(AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN).dropsLike(GILDED_OAK_SIGN), ModWoodTypes.GILDED_OAK));
    public static final Block GILDED_OAK_HANGING_SIGN = registerBlockWithoutBlockItem("gilded_oak_hanging_sign",
            new ModHangingSignBlock(AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.GILDED_OAK));
    public static final Block GILDED_OAK_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("gilded_oak_wall_hanging_sign",
            new ModWallHangingSignBlock(AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(GILDED_OAK_HANGING_SIGN), ModWoodTypes.GILDED_OAK));


    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(BarklingsMain.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BarklingsMain.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BarklingsMain.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        BarklingsMain.LOGGER.info("Registering ModBlocks for " + BarklingsMain.MOD_ID);
    }
}
