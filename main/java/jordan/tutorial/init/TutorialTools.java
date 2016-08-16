package jordan.tutorial.init;

import jordan.tutorial.init.items.MaterialItem;
import jordan.tutorial.init.items.tools.TutorialItemPaxel;
import jordan.tutorial.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialTools 
{
	public static Item DIAMOND_PAXEL;
	
	public static void init()
	{
		DIAMOND_PAXEL = new TutorialItemPaxel(ToolMaterial.DIAMOND, "diamond_paxel");
	}
	
	public static void register()
	{
		registerItem(DIAMOND_PAXEL);
	}
	
	public static void registerItem(Item item)
	{
		
		GameRegistry.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	
	}
}
