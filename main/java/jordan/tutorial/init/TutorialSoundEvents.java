package jordan.tutorial.init;

import jordan.tutorial.main.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialSoundEvents 
{
	public static SoundEvent ENTITY_BOAR_AMBIENT;
	
	public static void registerSounds()
	{
		ENTITY_BOAR_AMBIENT = registerSound("boar.ambient");
	}
	
	private static SoundEvent registerSound(String soundName)
	{
		final ResourceLocation soundID = new ResourceLocation(Reference.MODID, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}
