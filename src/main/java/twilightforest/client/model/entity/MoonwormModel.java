// Date: 11/8/2012 9:54:59 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package twilightforest.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.util.Mth;
import twilightforest.client.BugModelAnimationHelper;
import twilightforest.tileentity.MoonwormTileEntity;

import javax.annotation.Nullable;

public class MoonwormModel extends Model {
	ModelPart shape1;
	ModelPart shape2;
	ModelPart shape3;
	ModelPart head;

	public MoonwormModel() {
		super(RenderType::entityCutoutNoCull);
	}

	public static LayerDefinition create() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		partdefinition.addOrReplaceChild("shape1",
				CubeListBuilder.create()
						.texOffs(0, 4)
						.addBox(-1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F),
				PartPose.offset(-1.0F, 7.0F, 3.0F));
		partdefinition.addOrReplaceChild("shape2",
				CubeListBuilder.create()
						.texOffs(0, 8)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 4.0F),
				PartPose.offset(3.0F, 7.0F, 0.0F));
		partdefinition.addOrReplaceChild("shape3",
				CubeListBuilder.create()
						.texOffs(0, 14)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offset(2.0F, 7.0F, -2.0F));
		partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create()
						.texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F),
				PartPose.offset(-3.0F, 7.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setRotationAngles(@Nullable MoonwormTileEntity moonworm, float partialTime) {
		head.y = 7F;
		shape1.y = 7F;
		shape2.y = 7F;
		shape3.y = 7F;

		if (moonworm != null && moonworm.yawDelay == 0) {
			float time = (moonworm.desiredYaw - moonworm.currentYaw) - partialTime;

			// moving
			head.y += Math.min(0, Mth.sin(time / 2));
			shape1.y += Math.min(0, Mth.sin(time / 2 + 1));
			shape2.y += Math.min(0, Mth.sin(time / 2 + 2));
			shape3.y += Math.min(0, Mth.sin(time / 2 + 3));
		} else if (moonworm == null && BugModelAnimationHelper.yawWriggleDelay == 0) {
			float time = (BugModelAnimationHelper.desiredRotation - BugModelAnimationHelper.currentRotation) - partialTime;

			// moving
			head.y += Math.min(0, Mth.sin(time / 2));
			shape1.y += Math.min(0, Mth.sin(time / 2 + 1));
			shape2.y += Math.min(0, Mth.sin(time / 2 + 2));
			shape3.y += Math.min(0, Mth.sin(time / 2 + 3));
		}
	}

	@Override
	public void renderToBuffer(PoseStack ms, VertexConsumer buffer, int light, int overlay, float r, float g, float b, float a) {
		shape1.render(ms, buffer, light, overlay, r, g, b, a);
		shape2.render(ms, buffer, light, overlay, r, g, b, a);
		shape3.render(ms, buffer, light, overlay, r, g, b, a);
		head.render(ms, buffer, light, overlay, r, g, b, a);
	}
}
