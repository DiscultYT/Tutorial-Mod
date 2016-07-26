package jordan.tutorial.init;

import jordan.tutorial.init.items.tools.TutorialItemPaxel;
import jordan.tutorial.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialTools 
{
	public static Item DIAMOND_PAXEL;
	
	public static void init()
	{
		DIAMOND_PAXEL = registerItem(new TutorialItemPaxel(ToolMaterial.DIAMOND), "diamond_paxel").setUnlocalizedName("diamond_paxel");
	}
	
	public static void registerRenders()
	{
		registerRender(DIAMOND_PAXEL);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	
	}
	
	//registerItem Start\\
		public static Item registerItem(Item item, String name)
		{
			return registerItem(item, name, null);
		}
				
		public static Item registerItem(Item item, String name, CreativeTabs tab)
		{
			GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
			return item;
		}
				//registerItem End\\
}
