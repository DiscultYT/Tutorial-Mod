package jordan.tutorial.proxy;


import jordan.tutorial.init.TutorialArmor;
import jordan.tutorial.init.TutorialBlocks;
import jordan.tutorial.init.TutorialTools;
import jordan.tutorial.main.Reference;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);

		
	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		TutorialArmor.registerRenders();
		TutorialTools.registerRenders();
		TutorialBlocks.registerRenders();
		
		
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}
}