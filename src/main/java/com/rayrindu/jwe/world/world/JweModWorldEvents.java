package com.rayrindu.jwe.world.world;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.world.world.gen.JweModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = JweMod.MOD_ID)
public class JweModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        JweModOreGeneration.generateOres(event);
    }
}
