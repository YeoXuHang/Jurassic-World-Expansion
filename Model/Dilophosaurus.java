public abstract class Dilophosaurus<T extends Entity> extends AgeableListModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "dilophosaurus"), "main");
	private final ModelPart dilophosaurus;
	public final ModelPart root;
	//dilophosaurus
	public final ModelPart body;
	public final ModelPart left_leg;
	public final ModelPart right_leg;
	//body
	public final ModelPart head;
	public final ModelPart tile;
	//head
	public final ModelPart mouth;
	public final ModelPart wings;
	//wings
	public final ModelPart right;
	public final ModelPart left;

	public Dilophosaurus(ModelPart root) {
		this.root = root;
		this.dilophosaurus = root.getChild("dilophosaurus");
		//dilophosaurus
		this.body = dilophosaurus.getChild("body");
		this.left_leg = dilophosaurus.getChild("left_leg");
		this.right_leg = dilophosaurus.getChild("right_leg");
		//body
		this.head = body.getChild("head");
		this.tile = body.getChild("tile");
		//head
		this.mouth = head.getChild("mouth");
		this.wings = head.getChild("wings");
		//wings
		this.left = wings.getChild("left");
		this.right = wings.getChild("right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition dilophosaurus = partdefinition.addOrReplaceChild("dilophosaurus", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = dilophosaurus.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 24).addBox(-3.5F, -7.5F, -13.5F, 7.0F, 9.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(24, 49).addBox(2.0F, -1.5F, -12.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(13, 49).addBox(-4.0F, -1.5F, -12.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.5F, 2.5F));

		PartDefinition tile = body.addOrReplaceChild("tile", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, 0.0F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.5F, 1.5F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -7.8951F, -3.5999F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, -12.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(51, 0).addBox(-1.3557F, -12.0308F, -8.0299F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3134F, 0.2696F, 0.1571F, -0.0349F, 0.2443F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(51, 0).addBox(0.3557F, -12.0308F, -8.0299F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3134F, 0.2696F, 0.1571F, 0.0349F, -0.2443F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(63, 36).addBox(-2.0F, -9.001F, -7.0436F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(73, 19).addBox(-3.0F, -9.001F, -2.0436F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3134F, -1.7304F, 0.1745F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(50, 10).addBox(-3.0F, -5.001F, -2.0436F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3134F, -1.7304F, 0.1745F, 0.0F, 0.0F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, -3.6866F, -4.4804F));

		PartDefinition head_r5 = mouth.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(66, 2).addBox(-2.0F, -5.001F, -7.0436F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 2.75F, 0.1745F, 0.0F, 0.0F));

		PartDefinition wings = head.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3134F, -3.2304F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left = wings.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offset(1.0F, -5.5F, 0.0F));

		PartDefinition head_r6 = left.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(47, 16).addBox(0.9934F, -15.0006F, -0.0338F, 11.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5F, 0.0F, 0.1745F, -0.3316F, -0.0524F));

		PartDefinition right = wings.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(-1.0F, -6.0F, 0.0F));

		PartDefinition head_r7 = right.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(28, 0).addBox(-11.9934F, -15.0006F, -0.0338F, 11.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.0F, 0.0F, 0.1745F, 0.3316F, 0.0524F));

		PartDefinition left_leg = dilophosaurus.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(40, 45).addBox(-3.0F, -1.0F, -3.0F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(29, 23).addBox(-2.5F, 12.0F, -5.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -14.0F, 1.0F));

		PartDefinition leftLeg_r1 = left_leg.addOrReplaceChild("leftLeg_r1", CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, -1.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition right_leg = dilophosaurus.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(44, 33).addBox(-1.0F, -1.0F, -3.0F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(33, 31).addBox(-0.5F, 12.0F, -5.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -14.0F, 1.0F));

		PartDefinition rightLeg_r1 = right_leg.addOrReplaceChild("rightLeg_r1", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 8.0F, -1.0F, -0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float tail_angle = 0.2f;
		float body_degree = 0.2f;
		float mouth_attack = Mth.sin(this.attackTime * 1f * (float) Math.PI);
		this.body.zRot = Mth.cos(limbSwing * 0.3f) * body_degree * limbSwingAmount;
		this.mouth.xRot = (Mth.cos(ageInTicks * 0.1f) + Mth.sin(ageInTicks * 0.1f) + 0.5f) * 0.07f + (Mth.cos(limbSwing * 0.4f) + 0.6f) * limbSwingAmount / 3 + mouth_attack;
		this.left.yRot = Mth.cos(ageInTicks * 0.5f * 0.3f) * 0.5f * 0.25f;
		this.right.yRot = Mth.cos(ageInTicks * 0.5f * 0.3f) * 0.5f * -0.25f;
		this.tile.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * 0.5f * 0.5F * 0.25F;
		this.tile.yRot = Mth.cos(limbSwing * 0.3f) * tail_angle * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 0.5F) * 0.5F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 0.5F) * -0.5F * limbSwingAmount;
		if (this.isAggressive()) {
			this.left.yRot = 10f;
			this.right.yRot = -10f;
		}

	}
	public abstract boolean isAggressive();

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		if (this.young) {
			poseStack.scale(0.6F, 0.6F, 0.6F);
			poseStack.translate(0, 1, 0);
		}
		dilophosaurus.render(poseStack, buffer, packedLight, packedOverlay);
	}

	protected Iterable<ModelPart> headParts() {
		return ImmutableList.of(this.head);
	}

	protected Iterable<ModelPart> bodyParts() {
		return ImmutableList.of(this.body, this.left_leg, this.right_leg);
	}
}