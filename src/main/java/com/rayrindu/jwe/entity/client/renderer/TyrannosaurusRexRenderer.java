package com.rayrindu.jwe.entity.client.renderer;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.entity.client.model.TyrannosaurusRexModel;
import com.rayrindu.jwe.entity.custom.TyrannosaurusRexEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TyrannosaurusRexRenderer extends MobRenderer<TyrannosaurusRexEntity, TyrannosaurusRexModel<TyrannosaurusRexEntity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(JweMod.MOD_ID,
            "textures/entity/tyrannosaurus_rex.png");

    public TyrannosaurusRexRenderer(EntityRendererProvider.Context context) {
        super(context, new TyrannosaurusRexModel<>(context.bakeLayer(TyrannosaurusRexModel.LAYER_LOCATION)), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(TyrannosaurusRexEntity entity) {
        return TEXTURE;
    }
}