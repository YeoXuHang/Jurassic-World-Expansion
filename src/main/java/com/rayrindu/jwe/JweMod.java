package com.rayrindu.jwe;

import com.mojang.logging.LogUtils;
import com.rayrindu.jwe.block.JweModBlocks;
import com.rayrindu.jwe.entity.JweModEntityTypes;
import com.rayrindu.jwe.entity.client.renderer.TyrannosaurusRexRenderer;
import com.rayrindu.jwe.item.JweModItems;
import com.rayrindu.jwe.util.JweJigsawHelper;
import com.rayrindu.jwe.util.JweModConfig;
import com.rayrindu.jwe.villager.JweModPoiTypes;
import com.rayrindu.jwe.villager.JweModProfessions;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

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
        JweModProfessions.PROFESSIONS.register(eventBus);
        JweModPoiTypes.POI_TYPES.register(eventBus);

        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(JweModBlocks.CYCAD_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(JweModBlocks.CYCAD_SAPLING.get(), RenderType.cutout());

        EntityRenderers.register(JweModEntityTypes.T_REX.get(), TyrannosaurusRexRenderer::new);
    }

    @SubscribeEvent
    public void onServerAboutToStartEvent(ServerAboutToStartEvent event) {
        // PLAINS VILLAGE HOUSES
        if (JweModConfig.GENERATE_PLAINS_HOUSES.get()) {
            JweJigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/plains/houses"),
                    new ResourceLocation("jwe:village/plains/plains_archaeolist"), JweModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
        // TAIGA VILLAGE HOUSES
        if (JweModConfig.GENERATE_TAIGA_HOUSES.get()) {
            JweJigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/taiga/houses"),
                    new ResourceLocation("jwe:village/taiga/taiga_archaeolist"), JweModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
        // SAVANNA VILLAGE HOUSES
        if (JweModConfig.GENERATE_SAVANNA_HOUSES.get()) {
            JweJigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/savanna/houses"),
                    new ResourceLocation("jwe:village/savanna/savanna_archaeolist"), JweModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
        // SNOWY VILLAGE HOUSES
        if (JweModConfig.GENERATE_SNOWY_HOUSES.get()) {
            JweJigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/snowy/houses"),
                    new ResourceLocation("jwe:village/snowy/snowy_archaeolist"), JweModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
        // DESERT VILLAGE HOUSES
        if (JweModConfig.GENERATE_DESERT_HOUSES.get()) {
            JweJigsawHelper.registerJigsaw(event.getServer(), new ResourceLocation("minecraft:village/desert/houses"),
                    new ResourceLocation("jwe:village/desert/desert_archaeolist"), JweModConfig.ARCHAEOLOGIST_HOUSE_WEIGHT.get());
        }
    }
}
