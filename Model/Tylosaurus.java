public class Tylosaurus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tylosaurus"), "main");
	private final ModelPart root;
	private final ModelPart tylosaurus;
	// tylosaurus
	private final ModelPart body;
	// body
	private final ModelPart body_main;
	// body_main
	private final ModelPart fine_left;
	private final ModelPart fine_right;
	private final ModelPart body_back;
	private final ModelPart head_main;
	// head_main
	private final ModelPart head;
	// head
	private final ModelPart down;
	private final ModelPart up;
	// body_back
	private final ModelPart fine_back_left;
	private final ModelPart fine_back_right;
	private final ModelPart tile;
	// tile
	private final ModelPart tile2;

	public Tylosaurus(ModelPart root) {
		this.root = root;
		this.tylosaurus = root.getChild("tylosaurus");
		// tylosaurus
		this.body = tylosaurus.getChild("body");
		// body
		this.body_main = body.getChild("body_main");
		// body_main
		this.fine_left = body_main.getChild("fine_left");
		this.fine_right = body_main.getChild("fine_right");
		this.body_back = body_main.getChild("body_back");
		this.head_main = body_main.getChild("head_main");
		// head_main
		this.head = head_main.getChild("head");
		// head
		this.up = head.getChild("up");
		this.down = head.getChild("down");
		// body_back
		this.fine_back_left = body_back.getChild("fine3");
		this.fine_back_right = body_back.getChild("fine4");
		this.tile = body_back.getChild("tile");
		// tile
		this.tile2 = tile.getChild("tile2");

	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tylosaurus = partdefinition.addOrReplaceChild("tylosaurus", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, -40.0F));

		PartDefinition body = tylosaurus.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 21.0F, 40.0F));

		PartDefinition body_main = body.addOrReplaceChild("body_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-15.0F, -28.0F, 36.0F, 30.0F, 42.0F, 37.0F, new CubeDeformation(0.0F)).texOffs(111, 113)
						.addBox(-1.0F, -31.0F, 39.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(71, 113)
						.addBox(-1.0F, -31.0F, 66.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(82, 80)
						.addBox(-1.0F, -30.0F, 71.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-1.0F, -32.0F, 44.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(98, 0)
						.addBox(-1.0F, -33.0F, 49.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 22)
						.addBox(-1.0F, -33.0F, 55.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-1.0F, -32.0F, 61.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -14.0F, -63.0F));

		PartDefinition fine_left = body_main.addOrReplaceChild("fine_left",
				CubeListBuilder.create().texOffs(65, 182)
						.addBox(0.0F, -1.0F, -6.0F, 6.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 160)
						.addBox(6.0F, -1.0F, -6.0F, 30.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, 0.0F, 47.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition fine_right = body_main.addOrReplaceChild("fine_right",
				CubeListBuilder.create().texOffs(98, 0)
						.addBox(-35.0F, -1.0F, -6.0F, 30.0F, 2.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(182, 60)
						.addBox(-5.0F, -1.0F, -6.0F, 6.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0F, 0.0F, 47.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition body_back = body_main.addOrReplaceChild("body_back", CubeListBuilder.create().texOffs(96, 40)
				.addBox(-11.5F, -16.0F, 1.0F, 23.0F, 33.0F, 39.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -10.0F, 72.0F));

		PartDefinition fine3 = body_back.addOrReplaceChild("fine3",
				CubeListBuilder.create().texOffs(99, 165)
						.addBox(5.5F, -1.0F, -6.0F, 26.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(111, 113)
						.addBox(0.5F, -1.0F, -6.0F, 5.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 10.0F, 29.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition fine4 = body_back.addOrReplaceChild("fine4",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-5.5F, -1.0F, -6.0F, 5.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(135, 22)
						.addBox(-31.5F, -1.0F, -6.0F, 26.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 10.0F, 29.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bone = body_back.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 10.0F, -72.0F));

		PartDefinition tile = body_back.addOrReplaceChild("tile", CubeListBuilder.create().texOffs(27, 200)
				.addBox(-5.5F, -8.0F, -2.0F, 11.0F, 19.0F, 37.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 42.0F));

		PartDefinition tile2 = tile.addOrReplaceChild("tile2",
				CubeListBuilder.create().texOffs(39, 79)
						.addBox(-0.5F, -16.0F, 10.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(98, 21)
						.addBox(-0.5F, 15.0F, 10.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(85, 89)
						.addBox(-0.5F, -15.0F, 42.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(85, 101)
						.addBox(-0.5F, 15.0F, 42.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(71, 80)
						.addBox(-0.5F, -17.0F, 25.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(71, 92)
						.addBox(-0.5F, 15.0F, 25.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(98, 10)
						.addBox(-0.5F, -16.0F, 18.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 102)
						.addBox(-0.5F, 15.0F, 18.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 102)
						.addBox(-0.5F, -16.0F, 34.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(71, 104)
						.addBox(-0.5F, 15.0F, 34.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-4.5F, -12.0F, 0.0F, 9.0F, 27.0F, 52.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 35.0F));

		PartDefinition head_main = body_main.addOrReplaceChild("head_main",
				CubeListBuilder.create().texOffs(179, 179)
						.addBox(-13.0F, -17.5F, -3.5F, 26.0F, 34.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 182)
						.addBox(-11.0F, -17.5F, -13.5F, 22.0F, 26.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.5F, 34.5F));

		PartDefinition head = head_main.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -1.5F, -11.5F));

		PartDefinition down = head.addOrReplaceChild("down",
				CubeListBuilder.create().texOffs(0, 102)
						.addBox(-5.0F, 1.5F, -26.0F, 10.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(183, 42)
						.addBox(-6.0F, -0.5F, -11.0F, 12.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.5F, -3.0F));

		PartDefinition head_r1 = down.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(99, 23).addBox(-7.0F, 5.75F, -19.0F, 14.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.5F, -20.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition head_r2 = down.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(71, 113).addBox(-6.0F, 4.5F, -6.1F, 12.0F, 2.0F, 15.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 6.5F, -20.0F, 3.1416F, 3.1416F, 0.0F));

		PartDefinition up = head.addOrReplaceChild("up",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -17.0F, 19.0F, 14.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(178, 0)
						.addBox(-8.0F, -14.0F, 9.0F, 16.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(1, 81)
						.addBox(-7.0F, -17.0F, 9.0F, 14.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(178, 113)
						.addBox(-6.0F, -14.0F, -6.0F, 12.0F, 9.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(71, 113)
						.addBox(-6.0F, -5.0F, -6.1F, 12.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(99, 23)
						.addBox(-7.0F, -7.0F, 9.0F, 14.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, -23.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		float body_degree = 0.2f;
		float tail_angle = 0.2f;
		this.body.zRot = Mth.cos(limbSwing * 0.3f) * body_degree * limbSwingAmount;
		this.tile.yRot = Mth.cos(limbSwing * 0.3f) * tail_angle * limbSwingAmount;
		this.tile2.yRot = Mth.cos(limbSwing * 0.3f) * tail_angle * limbSwingAmount;
		this.fine_left.zRot = Mth.cos(limbSwing * 0.5F) * 1F * limbSwingAmount;
		this.fine_right.zRot = Mth.cos(limbSwing * 0.5F) * -1F * limbSwingAmount;
		this.fine_back_left.zRot = Mth.cos(limbSwing * 0.5F) * -1F * limbSwingAmount;
		this.fine_back_right.zRot = Mth.cos(limbSwing * 0.5F) * 1F * limbSwingAmount;
		this.head.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * 0.5f * 0.5F * 0.25F;
		this.tile.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * 0.5f * 0.5F * 0.25F;
		this.tile2.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * 0.5f * 0.1F * 0.25F;
		this.body.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * -0.5f * 0.1F * 0.25F;
		this.body_back.xRot = Mth.cos(ageInTicks * 0.5f * 0.3F) * -0.5f * 0.1F * 0.25F;
		this.down.xRot = (Mth.cos(ageInTicks * 0.1f) + Mth.sin(ageInTicks * 0.1f) + 0.5f) * 0.07f + (Mth.cos(limbSwing * 0.4f) + 0.6f) * limbSwingAmount / 3;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		if(this.young){
			poseStack.scale(0.6F, 0.6F, 0.6F);
			poseStack.translate(0, 1, 0);
		}
		tylosaurus.render(poseStack, buffer, packedLight, packedOverlay);
	}
}