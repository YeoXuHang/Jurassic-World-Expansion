package com.rayrindu.jwe.entity.client.renderer;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.entity.client.model.DilophosaurusModel;
import com.rayrindu.jwe.entity.client.model.TyrannosaurusRexModel;
import com.rayrindu.jwe.entity.custom.DilophosaurusEntity;
import com.rayrindu.jwe.entity.custom.TyrannosaurusRexEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DilophosaurusRenderer extends MobRenderer<DilophosaurusEntity, DilophosaurusModel<DilophosaurusEntity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(JweMod.MOD_ID,
            "textures/entity/dilophosaurus.png");

    public DilophosaurusRenderer(EntityRendererProvider.Context context) {
        super(context, new DilophosaurusModel<>(context.bakeLayer(DilophosaurusModel.LAYER_LOCATION)), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(DilophosaurusEntity entity) {
        return TEXTURE;
    }
}