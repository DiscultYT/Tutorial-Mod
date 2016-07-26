package jordan.tutorial.proxy;

import jordan.tutorial.init.TutorialArmor;
import jordan.tutorial.init.TutorialBlocks;
import jordan.tutorial.init.TutorialTools;
import jordan.tutorial.init.tileentity.blocks.furnace.TEQuartzFurnace;
import jordan.tutorial.main.Tutorial;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event)
	{
		TutorialArmor.init();
		TutorialTools.init();
		
		TutorialBlocks.init();
		TutorialBlocks.register();
		
		GameRegistry.registerTileEntity(TEQuartzFurnace.class, "QF");
	}
	
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
