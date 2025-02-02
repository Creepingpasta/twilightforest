package twilightforest.world.feature;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.LevelAccessor;
import twilightforest.block.TFBlocks;
import twilightforest.world.TFGenerationSettings;
import twilightforest.world.feature.config.TFTreeFeatureConfig;

import java.util.Random;
import java.util.Set;

public class TFGenTreeOfTime extends TFGenHollowTree {

	public TFGenTreeOfTime(Codec<TFTreeFeatureConfig> config) {
		super(config);
	}

	@Override
	public boolean generate(LevelAccessor world, Random random, BlockPos pos, Set<BlockPos> trunk, Set<BlockPos> leaves, Set<BlockPos> branch, Set<BlockPos> root, BoundingBox mbb, TFTreeFeatureConfig config) {
		int height = 8;
		int diameter = 1;

		// do we have enough height?
		if (pos.getY() < 1 || pos.getY() + height + diameter > TFGenerationSettings.MAXHEIGHT) {
			return false;
		}

		// check if we're on dirt or grass
		BlockState state = world.getBlockState(pos.below());
		if (!state.getBlock().canSustainPlant(state, world, pos.below(), Direction.UP, config.getSapling(random, pos))) {
			return false;
		}

		// make a tree!

		// build the trunk
		buildTrunk(world, random, pos, trunk, branch, root, diameter, height, mbb, config);

		// build the crown
		buildTinyCrown(world, random, pos, leaves, branch, diameter, height, mbb, config);

		// 3-5 roots at the bottom
		buildBranchRing(world, random, pos, leaves, branch, diameter, 1, 0, 12, 0.75D, 3, 5, 3, false, mbb, config);

		// several more taproots
		buildBranchRing(world, random, pos, leaves, branch, diameter, 1, 2, 18, 0.9D, 3, 5, 3, false, mbb, config);

		// add clock block
		world.setBlock(pos.offset(-1, 2, 0), TFBlocks.time_log_core.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Y), 3);

		return true;
	}

	/**
	 * Build the crown of the tree. This builds a smaller crown, since the large
	 * ones were causing some performance issues
	 */
	protected void buildTinyCrown(LevelAccessor world, Random random, BlockPos pos, Set<BlockPos> leaves, Set<BlockPos> branch, int diameter, int height, BoundingBox mbb, TFTreeFeatureConfig config) {
		int crownRadius = 4;
		int bvar = 1;

		// 3-5 medium branches starting at the bottom of the crown
		buildBranchRing(world, random, pos, leaves, branch, diameter, height - crownRadius, 0, crownRadius, 0.35D, bvar, bvar + 2, 1, true, mbb, config);

		// 3-5 medium branches at the crown middle
		buildBranchRing(world, random, pos, leaves, branch, diameter, height - (crownRadius / 2), 0, crownRadius, 0.28D, bvar, bvar + 2, 1, true, mbb, config);

		// 2-4 medium branches at the crown top
		buildBranchRing(world, random, pos, leaves, branch, diameter, height, 0, crownRadius, 0.15D, 2, 4, 0, true, mbb, config);

		// 3-6 medium branches going straight up
		buildBranchRing(world, random, pos, leaves, branch, diameter, height, 0, (crownRadius / 2), 0.05D, bvar, bvar + 2, 0, true, mbb, config);
	}
}
