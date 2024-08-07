package net.nathan.nathansbiomes.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.nathan.nathansbiomes.NathansBiomes;
import net.nathan.nathansbiomes.block.custom.FallingIceBlock;
import net.nathan.nathansbiomes.block.custom.SnowGrassBlock;
import net.nathan.nathansbiomes.block.custom.StarshroomBlock;
import net.nathan.nathansbiomes.world.tree.ModSaplingGenerators;

public class ModBlocks {

    public static final Block STARSHROOM_PLANKS = registerBlock("starshroom_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block STARSHROOM_STAIRS = registerBlock("starshroom_stairs",
            new StairsBlock(ModBlocks.STARSHROOM_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));
    public static final Block STARSHROOM_SLAB = registerBlock("starshroom_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)));
    public static final Block STARSHROOM_BUTTON = registerBlock("starshroom_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));
    public static final Block STARSHROOM_PRESSURE_PLATE = registerBlock("starshroom_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));
    public static final Block STARSHROOM_FENCE = registerBlock("starshroom_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));
    public static final Block STARSHROOM_FENCE_GATE = registerBlock("starshroom_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));
    public static final Block STARSHROOM_DOOR = registerBlock("starshroom_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));
    public static final Block STARSHROOM_TRAPDOOR = registerBlock("starshroom_trapdoor",
            new TrapdoorBlock( BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));
    public static final Block STARSHROOM_STEM = registerBlock("starshroom_stem",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block STARSHROOM_WOOD = registerBlock("starshroom_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_STARSHROOM_STEM = registerBlock("stripped_starshroom_stem",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_STARSHROOM_WOOD = registerBlock("stripped_starshroom_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));





    public static final Block SNOW_GRASS_BLOCK = registerBlock("snow_grass_block",
            new SnowGrassBlock(AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT).ticksRandomly().strength(0.6F)));

    public static final Block BLUE_STARSHROOM_BLOCK = registerBlock("blue_starshroom_block",
            new StarshroomBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque().luminance((state) -> {
                return 5;
            })));
    public static final Block BLUE_STARSHROOM = registerBlock("blue_starshroom",
            new SaplingBlock(ModSaplingGenerators.BLUE_STARSHROOM, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).mapColor(MapColor.LIGHT_BLUE)));
    public static final Block POTTED_BLUE_STARSHROOM = registerBlockWithoutBlockItem("potted_blue_starshroom",
            new FlowerPotBlock(BLUE_STARSHROOM, AbstractBlock.Settings.copy(Blocks.POTTED_OXEYE_DAISY).mapColor(MapColor.LIGHT_BLUE)));

    public static final Block GREEN_STARSHROOM_BLOCK = registerBlock("green_starshroom_block",
            new StarshroomBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque().luminance((state) -> {
                return 5;
            })));
    public static final Block PURPLE_STARSHROOM_BLOCK = registerBlock("purple_starshroom_block",
            new StarshroomBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque().luminance((state) -> {
                return 5;
            })));



    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(ModBlocks.SNOW_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STONE_BRICK_STAIRS)));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_SLAB)));
    public static final Block SNOW_BRICK_BUTTON = registerBlock("snow_brick_button",
            new ButtonBlock(BlockSetType.STONE, 20, AbstractBlock.Settings.copy(Blocks.STONE_BUTTON)));
    public static final Block SNOW_BRICK_PRESSURE_PLATE = registerBlock("snow_brick_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(Blocks.STONE_PRESSURE_PLATE)));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICK_WALL)));

    public static final Block FALLING_ICE_BLOCK = registerBlockWithoutBlockItem("falling_ice_block",
            new FallingIceBlock(AbstractBlock.Settings.copy(Blocks.ICE)));


    public static final Block SNOWDROP = registerBlock("snowdrop",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY).mapColor(MapColor.WHITE)));
    public static final Block POTTED_SNOWDROP = registerBlockWithoutBlockItem("potted_snowdrop",
            new FlowerPotBlock(SNOWDROP, AbstractBlock.Settings.copy(Blocks.POTTED_OXEYE_DAISY).mapColor(MapColor.WHITE)));






    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(NathansBiomes.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NathansBiomes.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(NathansBiomes.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        NathansBiomes.LOGGER.info("Registering ModBlocks for " + NathansBiomes.MOD_ID);
    }
}
