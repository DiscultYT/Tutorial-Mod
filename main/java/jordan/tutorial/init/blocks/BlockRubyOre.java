package jordan.tutorial.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRubyOre extends Block 
{

	public BlockRubyOre() 
	{
		super(Material.ROCK);
		setRegistryName("ruby_ore");
		setUnlocalizedName("ruby_ore");
		setCreativeTab(CreativeTabs.TOOLS);
	}
	
}
