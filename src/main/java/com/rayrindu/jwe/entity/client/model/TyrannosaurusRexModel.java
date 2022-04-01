package com.rayrindu.jwe.entity.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.entity.custom.TyrannosaurusRexEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class TyrannosaurusRexModel<T extends TyrannosaurusRexEntity> extends EntityModel<T> {
	 //This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(JweMod.MOD_ID, "tyrannosaurus_rex"), "main");
	private final ModelPart root;
	private final ModelPart t_rex;
	//t_rex
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	//body
	private final ModelPart head;
	private final ModelPart tile;
	//tile
	private final ModelPart tile2;
	//head
	private final ModelPart head_main;
	//head_main
	private final ModelPart mouth;

	public TyrannosaurusRexModel(ModelPart root) {
		this.root = root;
		this.t_rex = root.getChild("t_rex");
		//t_rex
		this.body = t_rex.getChild("body");
		this.left_leg = t_rex.getChild("LeftLeg");
		this.right_leg = t_rex.getChild("RightLeg");
		//body
		this.head = body.getChild("head");
		this.tile = body.getChild("tile");
		//tile
		this.tile2 = tile.getChild("tile2");
		//head
		this.head_main = head.getChild("head_main");
		//head_main
		this.mouth = head_main.getChild("mouth");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition t_rex = partdefinition.addOrReplaceChild("t_rex", CubeListBuilder.create(), PartPose.offset(0.0F, -22.0F, 0.0F));

		PartDefinition body = t_rex.addOrReplaceChild("body", CubeListBuilder.create().texOffs(126, 102).addBox(-13.0F, -38.0F, -54.0F, 26.0F, 38.0F, 26.0F, new CubeDeformation(0.0F))
		.texOffs(126, 102).addBox(11.0F, -8.0F, -49.0F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(88, 0).addBox(-16.0F, -8.0F, -49.0F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 77).addBox(-14.0F, -38.0F, -28.0F, 28.0F, 45.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 29.0F));

		PartDefinition tile = body.addOrReplaceChild("tile", CubeListBuilder.create().texOffs(110, 35).addBox(-10.0F, -7.0F, 0.0F, 20.0F, 25.0F, 42.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -27.0F, 7.0F));

		PartDefinition tile2 = tile.addOrReplaceChild("tile2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -6.0F, 0.0F, 12.0F, 13.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 42.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -27.0F, -53.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(180, 166).addBox(-9.0F, -96.0F, -36.0F, 18.0F, 38.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 69.0F, 25.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head_main = head.addOrReplaceChild("head_main", CubeListBuilder.create().texOffs(88, 0).addBox(-10.0F, -96.0F, -51.0F, 20.0F, 14.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(60, 157).addBox(-10.0F, -82.0F, -41.0F, 20.0F, 9.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 91).addBox(6.0F, -97.0F, -52.0F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 77).addBox(-11.0F, -97.0F, -52.0F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0F, -94.0F, -68.0F, 14.0F, 15.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-6.75F, -79.75F, -68.0F, 0.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(6.75F, -79.75F, -68.0F, 0.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 69.0F, 25.0F));

		PartDefinition mouth = head_main.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(204, 102).addBox(-10.0F, -5.45F, -7.0F, 20.0F, 9.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(164, 222).addBox(-5.0F, -2.45F, -23.0F, 10.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -76.75F, -44.0F));

		PartDefinition LeftLeg = t_rex.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 159).addBox(-9.0F, -11.0F, -13.0F, 15.0F, 35.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(88, 34).addBox(-7.0F, 54.0F, -7.0F, 11.0F, 7.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(91, 77).addBox(2.0F, 53.0F, -9.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 34).addBox(-8.0F, 53.0F, -9.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(45, 0).addBox(-3.0F, 53.0F, -9.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(15.0F, -15.0F, 20.0F));

		PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(192, 24).addBox(9.0F, -46.0F, 22.0F, 9.0F, 41.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, 61.0F, -20.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition RightLeg = t_rex.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 159).addBox(-9.0F, -11.0F, -12.0F, 15.0F, 35.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-7.0F, 54.0F, -7.0F, 11.0F, 7.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(39, 32).addBox(2.0F, 53.0F, -9.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-8.0F, 53.0F, -9.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.0F, 53.0F, -9.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, -15.0F, 20.0F));

		PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(192, 24).addBox(-18.0F, -46.0F, 22.0F, 9.0F, 41.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 61.0F, -20.0F, -0.0436F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float body_degree = 0.2f;
		float tail_angle = 0.2f;
		int i = entity.getAttackTimer();
		if (i <= 0) {
			mouth.xRot = 0.0F;
		}
		this.body.zRot = Mth.cos(limbSwing * 0.3f) * body_degree * limbSwingAmount;
		this.tile.yRot = Mth.cos(limbSwing * 0.3f) * tail_angle * limbSwingAmount;
		this.tile2.yRot = Mth.cos(limbSwing * 0.3f) * tail_angle * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 0.5F) * 0.5F * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 0.5F) * -0.5F * limbSwingAmount;
		this.head.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * 0.5f * 0.5F * 0.25F;
		this.tile.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * 0.5f * 0.5F * 0.25F;
		this.tile2.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * 0.5f * 0.1F * 0.25F;
		this.body.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * -0.5f * 0.1F * 0.25F;
		this.mouth.xRot = (Mth.cos(ageInTicks * 0.1f) + Mth.sin(ageInTicks * 0.1f) + 0.5f) * 0.07f + (Mth.cos(limbSwing * 0.4f) + 0.6f) * limbSwingAmount / 3;
	}

	public void prepareMobModel(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		int i = entityIn.getAttackTimer();
		if (i > 0) {
			right_leg.xRot = -0.9F + 0.9F * Mth.triangleWave((float) i - partialTick, 10.0F);
			mouth.xRot = 0.375F - 0.375F * Mth.triangleWave((float) i - partialTick, 10.0F);
		}
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		if(this.young){
			poseStack.scale(0.6F, 0.6F, 0.6F);
			poseStack.translate(0, 1, 0);
		}
		t_rex.render(poseStack, buffer, packedLight, packedOverlay);
	}
}