package com.rayrindu.jwe.world.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class JweModPlacedFeatures {
    public static final Holder<PlacedFeature> AMBER_ORE_PLACED = PlacementUtils.register("citrine_ore_placed",
            JweModConfiguredFeatures.AMBER_ORE, JweModOrePlacement.rareOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

}
