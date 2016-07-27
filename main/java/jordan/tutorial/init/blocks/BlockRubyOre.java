package jordan.tutorial.init.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRubyOre extends BlockOre
{

	public BlockRubyOre() 
	{
		super();
		setRegistryName("ruby_ore");
		setUnlocalizedName("ruby_ore");
		setHarvestLevel("pickaxe", 2);
		setHardness(3F);
		setResistance(2F);
		setCreativeTab(CreativeTabs.TOOLS);
	}
	
}
