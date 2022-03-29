package com.rayrindu.jwe.entity;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.entity.custom.TyrannosaurusRexEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JweModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, JweMod.MOD_ID);

    public static final RegistryObject<EntityType<TyrannosaurusRexEntity>> T_REX = ENTITY_TYPES.register("tyrannosaurus_rex",
            () -> EntityType.Builder.of(TyrannosaurusRexEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(JweMod.MOD_ID, "tyrannosaurus_rex").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
