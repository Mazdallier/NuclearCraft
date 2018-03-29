package nc.block.fluid;

import nc.fluid.FluidCryotheum;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockFluidCryotheum extends BlockFluid {
	
	public BlockFluidCryotheum(FluidCryotheum fluid) {
		super(fluid, Material.LAVA);
	}
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		entityIn.attackEntityFrom(BlockSuperFluid.superfluid_freeze, 4.0F);
	}
}