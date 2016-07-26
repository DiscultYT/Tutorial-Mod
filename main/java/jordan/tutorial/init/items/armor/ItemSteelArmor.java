package jordan.tutorial.init.items.armor;

import java.util.UUID;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import jordan.tutorial.init.TutorialArmor;
import jordan.tutorial.init.TutorialArmorMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSteelArmor extends ItemArmor
{

	public ItemSteelArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(TutorialArmorMaterial.STEEL, renderIndexIn, equipmentSlotIn);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	

	
}
