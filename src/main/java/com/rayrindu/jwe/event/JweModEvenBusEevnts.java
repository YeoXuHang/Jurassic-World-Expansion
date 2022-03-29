package com.rayrindu.jwe.event;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.entity.JweModEntityTypes;
import com.rayrindu.jwe.entity.custom.TyrannosaurusRexEntity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = JweMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JweModEvenBusEevnts {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(JweModEntityTypes.T_REX.get(), TyrannosaurusRexEntity.setAttributes());
    }
}