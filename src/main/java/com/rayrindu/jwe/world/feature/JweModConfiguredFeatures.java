package com.rayrindu.jwe.world.feature;

import com.rayrindu.jwe.block.JweModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class JweModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CYCAD_TREE =
            FeatureUtils.register("cycad", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(JweModBlocks.CYCAD_LOG.get()),
                    new StraightTrunkPlacer(2, 6, 1),
                    BlockStateProvider.simple(JweModBlocks.CYCAD_LEAVES.get()),
                    new AcaciaFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1, 1, 1)).build());

    public static final Holder<PlacedFeature> CYCAD_CHECKED = PlacementUtils.register("cycad_checked", CYCAD_TREE,
            PlacementUtils.filteredByBlockSurvival(JweModBlocks.CYCAD_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CYCAD_SPAWN =
            FeatureUtils.register("cycad_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(CYCAD_CHECKED,
                            0.5F)), CYCAD_CHECKED));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_AMBER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, JweModBlocks.AMBER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, JweModBlocks.DEEPSLATE_AMBER_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AMBER_ORE = FeatureUtils.register("citrine_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_AMBER_ORES, 9));

}
