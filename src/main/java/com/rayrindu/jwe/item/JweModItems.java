package com.rayrindu.jwe.item;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.entity.JweModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JweModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JweMod.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(JweModTab.JWE_TAB)));

    public static final RegistryObject<Item> AMBER_WITH_MOSQUITO = ITEMS.register("amber_with_mosquito",
            () -> new Item(new Item.Properties().tab(JweModTab.JWE_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> RACCOON_SPAWN_EGG = ITEMS.register("raccoon_spawn_egg",
            () -> new ForgeSpawnEggItem(JweModEntityTypes.T_REX,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(JweModTab.JWE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}