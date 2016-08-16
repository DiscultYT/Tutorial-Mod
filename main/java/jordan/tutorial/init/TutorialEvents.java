package jordan.tutorial.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TutorialEvents 
{
	@SubscribeEvent
	public void diammondPaxelCrafting(RightClickBlock event)
	{
		if (event.getItemStack() != null && event.getWorld().getBlockState(event.getPos()).getBlock() !=null)
		{
			if (event.getWorld().getBlockState(event.getPos()).getBlock().equals(TutorialBlocks.RUBY_ORE)
					&& event.getItemStack().getItem().equals(Items.DIAMOND)
					&& event.getEntityPlayer().inventory.hasItemStack(new ItemStack(Items.DIAMOND))
					&& event.getEntityPlayer().inventory.hasItemStack(new ItemStack(Items.STICK))) 
			{
				event.getEntityPlayer().inventory.clearMatchingItems(Items.DIAMOND, 0, 4, null);
				event.getEntityPlayer().inventory.clearMatchingItems(Items.STICK, 0, 2, null);
				event.getEntityPlayer().inventory.addItemStackToInventory(new ItemStack(TutorialTools.DIAMOND_PAXEL));
				
				event.getWorld().spawnParticle(EnumParticleTypes.EXPLOSION_HUGE, event.getPos().getX(),
						event.getPos().getY(), event.getPos().getZ(), 0, 0, 0, null);
				event.getEntityPlayer().motionX = event.getEntityPlayer().getLookVec().xCoord;
			}
		}
	}
}
