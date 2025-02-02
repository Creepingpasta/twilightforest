// Date: 2/5/2012 10:11:18 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package twilightforest.client.model.entity.legacy;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import twilightforest.entity.boss.HydraEntity;
import twilightforest.entity.boss.HydraPartEntity;

public class HydraLegacyModel extends ListModel<HydraEntity> {
	//fields
	ModelPart body;
	ModelPart leg1;
	ModelPart leg2;
	ModelPart tail1;
	ModelPart tail2;
	ModelPart tail3;
	ModelPart tail4;
	ModelPart neck1a;
	ModelPart neck1b;
	ModelPart neck1c;
	ModelPart neck1d;
	ModelPart head1;
	ModelPart jaw1;
	ModelPart frill1;
	ModelPart neck2a;
	ModelPart neck2b;
	ModelPart neck2c;
	ModelPart neck2d;
	ModelPart head2;
	ModelPart jaw2;
	ModelPart frill2;
	ModelPart neck3a;
	ModelPart neck3b;
	ModelPart neck3c;
	ModelPart neck3d;
	ModelPart head3;
	ModelPart jaw3;
	ModelPart frill3;

	public HydraLegacyModel() {
		texWidth = 512;
		texHeight = 256;

		body = new ModelPart(this/*, "body"*/);
		body.setPos(0F, -12F, 0F);
		body.texOffs(0, 0).addBox(-48F, 0F, 0F, 96, 96, 40);
		setRotation(body, 1.22173F, 0F, 0F);

		leg1 = new ModelPart(this/*, "leg"*/);
		leg1.setPos(48F, -24F, 0F);
		leg1.texOffs(0, 136).addBox(-16F, 0F, -16F, 32, 48, 32);
		leg1.texOffs(184, 200).addBox(-20F, 40F, -20F, 8, 8, 8);
		leg1.texOffs(184, 200).addBox(-4F, 40F, -22F, 8, 8, 8);
		leg1.texOffs(184, 200).addBox(12F, 40F, -20F, 8, 8, 8);

		leg2 = new ModelPart(this/*, "leg"*/);
		leg2.setPos(-48F, -24F, 0F);
		leg2.mirror = true;
		leg2.texOffs(0, 136).addBox(-16F, 0F, -16F, 32, 48, 32);
		leg2.texOffs(184, 200).addBox(-20F, 40F, -20F, 8, 8, 8);
		leg2.texOffs(184, 200).addBox(-4F, 40F, -22F, 8, 8, 8);
		leg2.texOffs(184, 200).addBox(12F, 40F, -20F, 8, 8, 8);

		tail1 = new ModelPart(this/*, "tail"*/);
		tail1.setPos(0F, 6F, 108F);
		tail1.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		tail1.texOffs(128, 200).addBox(-2F, -28F, -11F, 4, 24, 24);

		tail2 = new ModelPart(this/*, "tail"*/);
		tail2.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		tail2.texOffs(128, 200).addBox(-2F, -28F, -11F, 4, 24, 24);
		tail2.setPos(0F, 7F, 142F);

		tail3 = new ModelPart(this/*, "tail"*/);
		tail3.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		tail3.texOffs(128, 200).addBox(-2F, -28F, -11F, 4, 24, 24);
		tail3.setPos(0F, 8F, 176F);

		tail4 = new ModelPart(this/*, "tail"*/);
		tail4.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		tail4.texOffs(128, 200).addBox(-2F, -28F, -11F, 4, 24, 24);
		tail4.setPos(0F, 8F, 210F);


		neck1a = new ModelPart(this/*, "neck"*/);
		neck1a.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck1a.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck1a.setPos(0F, -48F, 16F);

		neck1b = new ModelPart(this/*, "neck"*/);
		neck1b.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck1b.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck1b.setPos(0F, -68F, 0F);

		neck1c = new ModelPart(this/*, "neck"*/);
		neck1c.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck1c.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck1c.setPos(0F, -93F, -14F);

		neck1d = new ModelPart(this/*, "neck"*/);
		neck1d.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck1d.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck1d.setPos(0F, -116F, -37F);

		head1 = new ModelPart(this/*, "head"*/);
		head1.texOffs(272, 0).addBox(-16F, -14F, -32F, 32, 24, 32);
		head1.texOffs(272, 56).addBox(-15F, -2F, -56F, 30, 12, 24);
		head1.texOffs(128, 200).addBox(-2F, -30F, -12F, 4, 24, 24);
		head1.setPos(0F, -128F, -53F);

		jaw1 = new ModelPart(this/*, "jaw"*/);
		jaw1.setPos(0F, 10F, -4F);
		jaw1.texOffs(272, 92).addBox(-15F, 0F, -48F, 30, 8, 48);
		setRotation(jaw1, 0F, 0F, 0F);
		head1.addChild(jaw1);

		frill1 = new ModelPart(this/*, "frill"*/);
		frill1.setPos(0F, 0F, -10F);
		frill1.texOffs(272, 200).addBox(-24F, -40.0F, 0F, 48, 48, 4);
		setRotation(frill1, -0.5235988F, 0F, 0F);
		head1.addChild(frill1);


		neck2a = new ModelPart(this/*, "neck"*/);
		neck2a.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck2a.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck2a.setPos(48F, -48F, 16F);

		neck2b = new ModelPart(this/*, "neck"*/);
		neck2b.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck2b.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck2b.setPos(71F, -68F, 0F);

		neck2c = new ModelPart(this/*, "neck"*/);
		neck2c.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck2c.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck2c.setPos(96F, -93F, -14F);

		neck2d = new ModelPart(this/*, "neck"*/);
		neck2d.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck2d.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck2d.setPos(108F, -116F, -37F);

		head2 = new ModelPart(this/*, "head"*/);
		head2.texOffs(272, 0).addBox(-16F, -14F, -32F, 32, 24, 32);
		head2.texOffs(272, 56).addBox(-15F, -2F, -56F, 30, 12, 24);
		head2.texOffs(128, 200).addBox(-2F, -30F, -12F, 4, 24, 24);
		head2.setPos(108F, -128F, -53F);

		jaw2 = new ModelPart(this/*, "jaw"*/);
		jaw2.setPos(0F, 10F, -4F);
		jaw2.texOffs(272, 92).addBox(-15F, 0F, -48F, 30, 8, 48);
		setRotation(jaw2, 0F, 0F, 0F);
		head2.addChild(jaw2);

		frill2 = new ModelPart(this/*, "frill"*/);
		frill2.setPos(0F, 0F, -10F);
		frill2.texOffs(272, 200).addBox(-24F, -40.0F, 0F, 48, 48, 4);
		setRotation(frill2, -0.5235988F, 0F, 0F);
		head2.addChild(frill2);


		neck3a = new ModelPart(this/*, "neck"*/);
		neck3a.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 31);
		neck3a.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck3a.setPos(-48F, -48F, 16F);

		neck3b = new ModelPart(this/*, "neck"*/);
		neck3b.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck3b.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck3b.setPos(-71F, -43F, 0F);

		neck3c = new ModelPart(this/*, "neck"*/);
		neck3c.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck3c.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck3c.setPos(-96F, -33F, -14F);

		neck3d = new ModelPart(this/*, "neck"*/);
		neck3d.texOffs(128, 136).addBox(-16F, -16F, -16F, 32, 32, 32);
		neck3d.texOffs(128, 200).addBox(-2F, -23F, 0F, 4, 24, 24);
		neck3d.setPos(-108F, -24F, -37F);

		head3 = new ModelPart(this/*, "head"*/);
		head3.texOffs(272, 0).addBox(-16F, -14F, -32F, 32, 24, 32);
		head3.texOffs(272, 56).addBox(-15F, -2F, -56F, 30, 12, 24);
		head3.texOffs(128, 200).addBox(-2F, -30F, -12F, 4, 24, 24);
		head3.setPos(-108F, -24F, -53F);

		jaw3 = new ModelPart(this/*, "jaw"*/);
		jaw3.setPos(0F, 10F, -4F);
		jaw3.texOffs(272, 92).addBox(-15F, 0F, -48F, 30, 8, 48);
		setRotation(jaw3, 0.125F, 0F, 0F);
		head3.addChild(jaw3);

		frill3 = new ModelPart(this/*, "frill"*/);
		frill3.setPos(0F, 0F, -10F);
		frill3.texOffs(272, 200).addBox(-24F, -40.0F, 0F, 48, 48, 4);
		setRotation(frill3, -0.5235988F, 0F, 0F);
		head3.addChild(frill3);
	}

    @Override
	public Iterable<ModelPart> parts() {
		return ImmutableList.of(
				body,
				leg1,
				leg2,
				tail1,
				tail2,
				tail3,
				tail4
		);
	}

	private void setRotation(ModelPart model, float x, float y, float z) {
		model.xRot = x;
		model.yRot = y;
		model.zRot = z;
	}

	@Override
	public void setupAnim(HydraEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		//super.setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);

		leg1.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		leg2.xRot = Mth.cos(limbSwing * 0.6662F + 3.141593F) * 1.4F * limbSwingAmount;

		leg1.yRot = 0.0F;
		leg2.yRot = 0.0F;
	}

    public float getRotationY(HydraEntity hydra, HydraPartEntity whichHead, float time) {

		float yawOffset = hydra.yBodyRotO + (hydra.yBodyRot - hydra.yBodyRotO) * time;
		float yaw = whichHead.yRotO + (whichHead.yRot - whichHead.yRotO) * time;

		return (yaw - yawOffset) / 57.29578F;
	}

	public float getRotationX(HydraEntity hydra, HydraPartEntity whichHead, float time) {

		return (whichHead.xRotO + (whichHead.xRot - whichHead.xRotO) * time) / 57.29578F;
	}
}
