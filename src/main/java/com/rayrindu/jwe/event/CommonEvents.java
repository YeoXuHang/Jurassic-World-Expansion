package com.rayrindu.jwe.event;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.villager.ModPoiTypes;
import com.rayrindu.jwe.villager.ModProfessions;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = JweMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {
    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModProfessions.fillTradeData();
            ModPoiTypes.registerPOIs();
        });
    }
}
