package twilightforest.structures.minotaurmaze;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import twilightforest.block.TFBlocks;

import java.util.Random;

public class MazestoneProcessor extends StructurePiece.BlockSelector {

	@Override
	public void next(Random random, int x, int y, int z, boolean wall) {
		if (!wall) {
			this.next = Blocks.AIR.defaultBlockState();
		} else {
			this.next = TFBlocks.maze_stone.get().defaultBlockState();
			float rf = random.nextFloat();

			if (rf < 0.2F) {
				this.next = TFBlocks.maze_stone_mossy.get().defaultBlockState();
			} else if (rf < 0.5F) {
				this.next = TFBlocks.maze_stone_cracked.get().defaultBlockState();
			} else {
				this.next = TFBlocks.maze_stone_brick.get().defaultBlockState();
			}
		}
	}

}
