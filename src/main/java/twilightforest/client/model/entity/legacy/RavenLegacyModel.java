// Date: 4/28/2012 9:46:20 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package twilightforest.client.model.entity.legacy;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import twilightforest.entity.passive.RavenEntity;

public class RavenLegacyModel extends ListModel<RavenEntity> {
	//fields
	ModelPart head;
	ModelPart beak1;
	ModelPart beak2;
	ModelPart body;
	ModelPart rightarm;
	ModelPart leftarm;
	ModelPart rightleg;
	ModelPart leftleg;
	ModelPart rightfoot;
	ModelPart leftfoot;
	ModelPart tail;

	public RavenLegacyModel() {
		texWidth = 32;
		texHeight = 32;

		head = new ModelPart(this, 0, 0);
		head.addBox(-1.5F, -1.5F, -3F, 3, 3, 3);
		head.setPos(0F, 18F, 0F);
		head.setTexSize(32, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);

		beak1 = new ModelPart(this, 12, 0);
		beak1.addBox(-0.5F, -1F, -2F, 1, 1, 2);
		beak1.setPos(0F, 0F, -2.5F);
		beak1.xRot = 0.2617994F;
		head.addChild(beak1);

		beak2 = new ModelPart(this, 12, 0);
		beak2.addBox(-0.5F, 0F, -2F, 1, 1, 2);
		beak2.setPos(0F, 0F, -2.5F);
		beak2.xRot = -0.2617994F;
		head.addChild(beak2);

		body = new ModelPart(this, 0, 6);
		body.addBox(-1.5F, 0F, -1F, 3, 4, 6);
		body.setPos(0F, 17F, 1F);
		body.setTexSize(32, 32);
		setRotation(body, -0.5235988F, 0F, 0F);

		rightarm = new ModelPart(this, 0, 16);
		rightarm.addBox(-1F, 0F, -1.5F, 1, 3, 6);
		rightarm.setPos(-1.5F, 18F, 1F);
		rightarm.setTexSize(32, 32);

		leftarm = new ModelPart(this, 0, 16);
		leftarm.addBox(0F, 0F, -1.5F, 1, 3, 6);
		leftarm.setPos(1.5F, 18F, 1F);
		leftarm.setTexSize(32, 32);

		rightleg = new ModelPart(this, 14, 16);
		rightleg.addBox(0F, 0F, 0F, 1, 2, 1);
		rightleg.setPos(-1.5F, 21F, 1F);
		rightleg.setTexSize(32, 32);

		rightfoot = new ModelPart(this, 14, 20);
		rightfoot.addBox(0F, -1F, -2F, 1, 1, 2);
		rightfoot.setPos(0F, 2F, 1F);
		rightfoot.setTexSize(32, 32);
		setRotation(rightfoot, 0.5235988F, 0F, 0F);
		rightleg.addChild(rightfoot);

		leftleg = new ModelPart(this, 14, 16);
		leftleg.addBox(0F, 0F, 0F, 1, 2, 1);
		leftleg.setPos(0.5F, 21F, 1F);
		leftleg.setTexSize(32, 32);

		leftfoot = new ModelPart(this, 14, 20);
		leftfoot.addBox(0F, -1F, -2F, 1, 1, 2);
		leftfoot.setPos(0F, 2F, 1F);
		leftfoot.setTexSize(32, 32);
		setRotation(leftfoot, 0.5235988F, 0F, 0F);
		leftleg.addChild(leftfoot);

		tail = new ModelPart(this, 0, 25);
		tail.addBox(-1.5F, -0.5F, 0F, 3, 1, 3);
		tail.setPos(0F, 21F, 4F);
		tail.setTexSize(32, 32);
		setRotation(tail, -0.5235988F, 0F, 0F);
	}

//	@Override
//	public void render(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
//		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
//		setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
//	}

	@Override
	public Iterable<ModelPart> parts() {
		return ImmutableList.of(
				head,
				body,
				rightarm,
				leftarm,
				rightleg,
				leftleg,
				tail
		);
	}

	private void setRotation(ModelPart model, float x, float y, float z) {
		model.xRot = x;
		model.yRot = y;
		model.zRot = z;
	}


	@Override
	public void setupAnim(RavenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		head.xRot = headPitch / (180F / (float) Math.PI);
		head.yRot = netHeadYaw / (180F / (float) Math.PI);
		head.zRot = netHeadYaw > 5 ? -0.2617994F : 0;

		rightleg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		leftleg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;

		rightarm.zRot = ageInTicks;
		leftarm.zRot = -ageInTicks;

		if (entity.isBirdLanded()) {
			rightleg.y = 21;
			leftleg.y = 21;
		} else {
			rightleg.y = 20F;
			leftleg.y = 20F;
		}
	}
}
