package jordan.tutorial.init.mobs.renderers;

import jordan.tutorial.init.mobs.entitys.EntityBoar;
import jordan.tutorial.init.mobs.models.ModelBoar;
import jordan.tutorial.main.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderBoar extends RenderLiving<EntityBoar>
{
	private static final ResourceLocation BOAR_TEXTURE = new ResourceLocation(Reference.MODID, "textures/entity/boar/boar.png");
	
	public RenderBoar(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) 
	{
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		this.addLayer(new LayerSaddle(this));
	}

	
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBoar entity) 
	{
		return BOAR_TEXTURE;
	}
	
	
	
	
	
	@SideOnly(Side.CLIENT)
	public class LayerSaddle implements LayerRenderer<EntityBoar>
	{
		private final ResourceLocation TEXTURE = new ResourceLocation(Reference.MODID, "textures/entity/boar/boar.png");
		private final RenderBoar pigRenderer;
        private final ModelBoar pigModel = new ModelBoar(0.5F);

        public LayerSaddle(RenderBoar pigRendererIn)
        {
            this.pigRenderer = pigRendererIn;
        }
        
        public void doRenderLayer(EntityBoar entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
        {
            if (entitylivingbaseIn.getSaddled())
            {
                this.pigRenderer.bindTexture(TEXTURE);
                this.pigModel.setModelAttributes(this.pigRenderer.getMainModel());
                this.pigModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            }
        }

        public boolean shouldCombineTextures()
        {
            return false;
        }
        
	}

	

}
