package com.rayrindu.jwe.world.gen;

import com.rayrindu.jwe.entity.JweModEntityTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class JweModEntityGeneration
{
    public static void onEntitySpawn(final BiomeLoadingEvent event)
    {
        if(doesBiomeMatch(event.getName(), Biomes.JUNGLE))
        {
            event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(JweModEntityTypes.DILOPHOSAURUS.get(), 3, 2, 4));
        }
        //Example Spawner if want another biome
        /**else if(doesBiomeMatch(event.getName(), Biomes.BADLANDS)){
            event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(CftlcModEntityTypes.MOSS_WALKER.get(), 100, 5, 1));
        }**/
    }

    public static boolean doesBiomeMatch(ResourceLocation biomeNameIn, ResourceKey<Biome> biomeIn)
    {
        return biomeNameIn.getPath().matches(biomeIn.location().getPath());
    }
}