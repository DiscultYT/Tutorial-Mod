package jordan.tutorial.init;

import jordan.tutorial.init.blocks.BlockRubyOre;
import jordan.tutorial.init.blocks.furnaces.BlockQuartzFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialBlocks 
{
	//Ores
	public static Block RUBY_ORE;
	
	
	
	//Furnaces
	public static Block QUARTZ_FURNACE;
	public static Block LIT_QUARTZ_FURNACE;
	
	
	public static void init()
	{
		RUBY_ORE = new BlockRubyOre();
		QUARTZ_FURNACE = new BlockQuartzFurnace(false, "quartz_furnace");
		LIT_QUARTZ_FURNACE = new BlockQuartzFurnace(true, "lit_quartz_furnace");
	}
	
	public static void register()
	{
		registerBlock(RUBY_ORE);
		
		registerBlock(QUARTZ_FURNACE);
		registerBlock(LIT_QUARTZ_FURNACE);
		
	}
	
	public static void registerBlock(Block block)
	{
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(RUBY_ORE);
		
		registerRender(QUARTZ_FURNACE);
		registerRender(LIT_QUARTZ_FURNACE);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
