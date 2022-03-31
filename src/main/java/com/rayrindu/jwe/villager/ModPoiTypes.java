package com.rayrindu.jwe.villager;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.block.JweModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModPoiTypes {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, JweMod.MOD_ID);

    public static final RegistryObject<PoiType> ARCHAEOLOGIST_POI = POI_TYPES.register("archaeologist", () -> new PoiType("archaeologist", PoiType.getBlockStates(JweModBlocks.CULTIVATOR.get()), 1, 1));

    public static void registerPOIs() {
        for (RegistryObject<PoiType> poi : POI_TYPES.getEntries()) {
            try {
                ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, poi.get());
            } catch (InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
