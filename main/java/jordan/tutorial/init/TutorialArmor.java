package jordan.tutorial.init;

import jordan.tutorial.init.items.armor.ItemSteelArmor;
import jordan.tutorial.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialArmor 
{
	
	public static Item STEEL_HELMET, STEEL_CHESTPLATE, STEEL_LEGGINGS, STEEL_BOOTS;
	
	public static void init()
	{
		STEEL_HELMET = registerItem(new ItemSteelArmor(1, EntityEquipmentSlot.HEAD), "steel_helmet").setUnlocalizedName("steel_helmet");
		STEEL_CHESTPLATE = registerItem(new ItemSteelArmor(1, EntityEquipmentSlot.CHEST), "steel_chestplate").setUnlocalizedName("steel_chestplate");
		STEEL_LEGGINGS = registerItem(new ItemSteelArmor(2, EntityEquipmentSlot.LEGS), "steel_leggings").setUnlocalizedName("steel_leggings");
		STEEL_BOOTS = registerItem(new ItemSteelArmor(1, EntityEquipmentSlot.FEET), "steel_boots").setUnlocalizedName("steel_boots");
	}
	
	public static void registerRenders()
	{
		registerRender(STEEL_HELMET);
		registerRender(STEEL_CHESTPLATE);
		registerRender(STEEL_LEGGINGS);
		registerRender(STEEL_BOOTS);
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
