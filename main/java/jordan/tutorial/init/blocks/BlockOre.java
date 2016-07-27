package jordan.tutorial.init.blocks;

import java.util.Random;

import jordan.tutorial.init.TutorialBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class BlockOre extends Block
{
	public BlockOre()
    {
		super(Material.ROCK);
    }
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		return this == TutorialBlocks.RUBY_ORE ? Items.DIAMOND : Item.getItemFromBlock(this);
    }
	
	/**
	 * public int quantityDropped(Random random
	 * {
	 * 	return this == Blocks.WHATBLOCKIS ? MAX NUM E.G. 4 + random.nextInt(5) : 1;
	 * }
	 */
	
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
	
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
	
	 @Override
	    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
	    {
	        Random rand = world instanceof World ? ((World)world).rand : new Random();
	        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
	        {
	            int i = 0;

	            if (this == TutorialBlocks.RUBY_ORE)
	            {
	                i = MathHelper.getRandomIntegerInRange(rand, 3, 6);
	            }

	            return i;
	        }
	        return 0;
	    }
	 
	 public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	    {
	        return new ItemStack(this);
	    }
}
