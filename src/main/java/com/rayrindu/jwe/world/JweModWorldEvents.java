package com.rayrindu.jwe.world;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.world.gen.JweModEntityGeneration;
import com.rayrindu.jwe.world.gen.JweModOreGeneration;
import com.rayrindu.jwe.world.gen.JweModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JweMod.MOD_ID)
public class JweModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        JweModTreeGeneration.generateTrees(event);
        JweModOreGeneration.generateOres(event);
        JweModEntityGeneration.onEntitySpawn(event);
    }
}
