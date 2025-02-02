// Date: 4/25/2012 10:28:13 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package twilightforest.client.model.entity.legacy;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.AgeableListModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import twilightforest.entity.passive.TinyBirdEntity;

public class TinyBirdLegacyModel extends AgeableListModel<TinyBirdEntity> {
	//fields
	ModelPart beak;
	ModelPart head;
	ModelPart body;
	ModelPart rightarm;
	ModelPart leftarm;
	ModelPart rightleg;
	ModelPart leftleg;
	ModelPart tail;

	public TinyBirdLegacyModel() {
		texWidth = 32;
		texHeight = 32;

		head = new ModelPart(this, 0, 0);
		head.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		head.setPos(0F, 20.5F, -0.5F);
		head.setTexSize(32, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);

		beak = new ModelPart(this, 12, 0);
		beak.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1);
		beak.setPos(0F, 0.5F, -2F);

		head.addChild(beak);

		body = new ModelPart(this, 0, 6);
		body.addBox(-1.5F, 0F, -1F, 3, 3, 3);
		body.setPos(0F, 20F, 0F);
		body.setTexSize(32, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		rightarm = new ModelPart(this, 12, 2);
		rightarm.addBox(-1F, 0F, -1.5F, 1, 2, 3);
		rightarm.setPos(-1.5F, 20.5F, 1F);
		rightarm.setTexSize(32, 32);
		rightarm.mirror = true;
		setRotation(rightarm, 0F, 0F, 0F);
		leftarm = new ModelPart(this, 12, 2);
		leftarm.addBox(0F, 0F, -1.5F, 1, 2, 3);
		leftarm.setPos(1.5F, 20.5F, 1F);
		leftarm.setTexSize(32, 32);
		leftarm.mirror = true;
		setRotation(leftarm, 0F, 0F, 0F);
		rightleg = new ModelPart(this, 0, 12);
		rightleg.addBox(0F, 0F, 0F, 1, 1, 1);
		rightleg.setPos(-1.5F, 23F, 0F);
		rightleg.setTexSize(32, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelPart(this, 0, 12);
		leftleg.addBox(0.5F, 0F, 0F, 1, 1, 1);
		leftleg.setPos(0F, 23F, 0F);
		leftleg.setTexSize(32, 32);
		leftleg.mirror = true;
		setRotation(leftleg, 0F, 0F, 0F);
		tail = new ModelPart(this, 0, 14);
		tail.addBox(-1.5F, -0.5F, 0F, 3, 1, 2);
		tail.setPos(0F, 22F, 2F);
		tail.setTexSize(32, 32);
		tail.mirror = true;
		setRotation(tail, 0F, 0F, 0F);
	}

	@Override
	protected Iterable<ModelPart> headParts() {
		return ImmutableList.of(this.head);
	}

	@Override
	protected Iterable<ModelPart> bodyParts() {
		return ImmutableList.of(
				head,
				body,
				rightleg,
				leftleg,
				rightarm,
				leftarm,
				tail
		);
	}

	@Override
	public void renderToBuffer(PoseStack stack, VertexConsumer builder, int light, int overlay, float red, float green, float blue, float scale) {
		if (young) {
			float f = 2.0F;
			stack.pushPose();
			stack.translate(0.0F, 5F * scale, 0.75F * scale);
			this.headParts().forEach((renderer) -> renderer.render(stack, builder, light, overlay, red, green, blue, scale));
			stack.popPose();
			stack.pushPose();
			stack.scale(1.0F / f, 1.0F / f, 1.0F / f);
			stack.translate(0.0F, 24F * scale, 0.0F);
			this.bodyParts().forEach((renderer) -> renderer.render(stack, builder, light, overlay, red, green, blue, scale));
			stack.popPose();
		} else {
			this.headParts().forEach((renderer) -> renderer.render(stack, builder, light, overlay, red, green, blue, scale));
			this.bodyParts().forEach((renderer) -> renderer.render(stack, builder, light, overlay, red, green, blue, scale));
		}
	}

	private void setRotation(ModelPart model, float x, float y, float z) {
		model.xRot = x;
		model.yRot = y;
		model.zRot = z;
	}

	/**
	 * Sets the models various rotation angles.
	 */
	@Override
	public void setupAnim(TinyBirdEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.xRot = headPitch / (180F / (float) Math.PI);
		head.yRot = netHeadYaw / (180F / (float) Math.PI);

		rightleg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		leftleg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;

		rightarm.zRot = ageInTicks;
		leftarm.zRot = -ageInTicks;

		if (entity.isBirdLanded()) {
			rightleg.y = 23;
			leftleg.y = 23;
		} else {
			rightleg.y = 22.5F;
			leftleg.y = 22.5F;
		}
	}
}
