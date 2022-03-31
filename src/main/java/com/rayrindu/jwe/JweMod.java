package com.rayrindu.jwe;

import com.mojang.logging.LogUtils;
import com.rayrindu.jwe.block.JweModBlocks;
import com.rayrindu.jwe.entity.JweModEntityTypes;
import com.rayrindu.jwe.entity.client.renderer.TyrannosaurusRexRenderer;
import com.rayrindu.jwe.item.JweModItems;
import com.rayrindu.jwe.util.JigsawHelper;
import com.rayrindu.jwe.util.ModConfig;
import com.rayrindu.jwe.villager.ModPoiTypes;
import com.rayrindu.jwe.villager.ModProfessions;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JweMod.MOD_ID)
public class JweMod
{
    public static final String MOD_ID = "jwe";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public JweMod()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        JweModItems.register(eventBus);
        JweModBlocks.register(eventBus);
        JweModEntityTypes.register(eventBus);
        ModProfessions.PROFESSIONS.register(eventBus);
        ModPoiTypes.POI_TYPES.register(eventBus);

        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        EntityRenderers.register(JweModEntityTypes.T_REX.get(), TyrannosaurusRexRenderer::new);
    }

    @SubscribeEvent
    public void onServerAboutToStartEvent(ServerAboutToStartEvent event) {
        // PLAINS VILLAGE HOUSES
        if (ModConfig.GENERATE_PLAINS_HOUSES.get()) {
            JigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/plains/houses"),
                    new ResourceLocation("jwe:village/plains/plains_archaeolist"), ModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
        // TAIGA VILLAGE HOUSES
        if (ModConfig.GENERATE_TAIGA_HOUSES.get()) {
            JigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/taiga/houses"),
                    new ResourceLocation("jwe:village/taiga/taiga_archaeolist"), ModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
        // SAVANNA VILLAGE HOUSES
        if (ModConfig.GENERATE_SAVANNA_HOUSES.get()) {
            JigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/savanna/houses"),
                    new ResourceLocation("jwe:village/savanna/savanna_archaeolist"), ModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
        // SNOWY VILLAGE HOUSES
        if (ModConfig.GENERATE_SNOWY_HOUSES.get()) {
            JigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/snowy/houses"),
                    new ResourceLocation("jwe:village/snowy/snowy_archaeolist"), ModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
        // DESERT VILLAGE HOUSES
        if (ModConfig.GENERATE_DESERT_HOUSES.get()) {
            JigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/desert/houses"),
                    new ResourceLocation("jwe:village/desert/desert_archaeolist"), ModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
    }
}
