package jordan.tutorial.init.mobs;

import jordan.tutorial.init.mobs.entitys.EntityBoar;
import jordan.tutorial.init.mobs.models.ModelBoar;
import jordan.tutorial.init.mobs.renderers.RenderBoar;
import jordan.tutorial.main.Tutorial;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry 
{
	
	
	public static void register()
	{
		MobRegistry.registerRender();
		MobRegistry.registerEntity();
	}
	
	public static void registerRender()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBoar.class, new RenderBoar(Minecraft.getMinecraft().getRenderManager(), new ModelBoar(0.5F), 0.5F));
	}
	
	public static void registerEntity()
	{
		EntityRegistry.registerModEntity(EntityBoar.class, "boar", 300, Tutorial.instance, 64, 1, true, 0xf7f7f7, 0x202421);
		EntityRegistry.addSpawn(EntityBoar.class, 10, 1, 6, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(BiomeDictionary.Type.PLAINS));
	}
}
