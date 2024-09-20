package net.nathan.barklings.world;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.nathan.barklings.BarklingsMain;
import net.nathan.barklings.block.ModBlocks;
import net.nathan.barklings.block.custom.BlueberryBush;
import net.nathan.barklings.block.custom.GrapeBush;
import net.nathan.barklings.block.custom.StrawberryBush;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_STRAWBERRY_BUSH = registerKey("strawberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_GRAPE_BUSH = registerKey("grape_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_BLUEBERRY_BUSH = registerKey("blueberry_bush");

    public static final RegistryKey<ConfiguredFeature<?, ?>> GILDED_OAK_KEY = registerKey("gilded_oak");



    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        ConfiguredFeatures.register(context, PATCH_STRAWBERRY_BUSH, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of((BlockState) ModBlocks.STRAWBERRY_BUSH.getDefaultState()
                                .with(StrawberryBush.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));

        ConfiguredFeatures.register(context, PATCH_GRAPE_BUSH, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of((BlockState) ModBlocks.GRAPE_BUSH.getDefaultState()
                                .with(GrapeBush.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));

        ConfiguredFeatures.register(context, PATCH_BLUEBERRY_BUSH, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of((BlockState) ModBlocks.BLUEBERRY_BUSH.getDefaultState()
                                .with(BlueberryBush.AGE, 3))), List.of(Blocks.GRASS_BLOCK)));


        register(context, GILDED_OAK_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.GILDED_OAK_LOG),
                new StraightTrunkPlacer(3, 4, 3),
                BlockStateProvider.of(ModBlocks.GILDED_OAK_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(1), ConstantIntProvider.create(5),
                        0.25f, 0.5f, 0.5f, 0.25f),
                new TwoLayersFeatureSize(1, 0, 1)).build());


    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BarklingsMain.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}