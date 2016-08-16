package jordan.tutorial.init.mobs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBoar extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer lhorn;
    ModelRenderer rhorn;
    ModelRenderer hawk1;
    ModelRenderer hawk2;
    ModelRenderer hawk3;
    ModelRenderer hawk4;
    ModelRenderer hawk5;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
  
  public ModelBoar(float scale)
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -4F, -8F, 8, 8, 8);
      head.setRotationPoint(0F, 12F, -6F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      nose = new ModelRenderer(this, 16, 16);
      nose.addBox(-2F, -1.5F, -1F, 4, 3, 1);
      nose.setRotationPoint(0F, 13F, -14F);
      nose.setTextureSize(64, 32);
      nose.mirror = true;
      setRotation(nose, 0F, 0F, 0F);
      lhorn = new ModelRenderer(this, 39, 4);
      lhorn.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 1);
      lhorn.setRotationPoint(3F, 14F, -13.5F);
      lhorn.setTextureSize(64, 32);
      lhorn.mirror = true;
      setRotation(lhorn, 0F, 0F, 0F);
      rhorn = new ModelRenderer(this, 39, 4);
      rhorn.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 1);
      rhorn.setRotationPoint(-3F, 14F, -13.5F);
      rhorn.setTextureSize(64, 32);
      rhorn.mirror = true;
      setRotation(rhorn, 0F, 0F, 0F);
      hawk1 = new ModelRenderer(this, 0, 0);
      hawk1.addBox(-0.5F, -1.5F, -0.5F, 1, 1, 1);
      hawk1.setRotationPoint(0F, 8.5F, -13F);
      hawk1.setTextureSize(64, 32);
      hawk1.mirror = true;
      setRotation(hawk1, 0F, 0F, 0F);
      hawk2 = new ModelRenderer(this, 0, 0);
      hawk2.addBox(-0.5F, -2.5F, -0.5F, 1, 2, 1);
      hawk2.setRotationPoint(0F, 8.5F, -12F);
      hawk2.setTextureSize(64, 32);
      hawk2.mirror = true;
      setRotation(hawk2, 0F, 0F, 0F);
      hawk3 = new ModelRenderer(this, 0, 0);
      hawk3.addBox(-0.5F, -3.5F, -0.5F, 1, 3, 1);
      hawk3.setRotationPoint(0F, 8.5F, -11F);
      hawk3.setTextureSize(64, 32);
      hawk3.mirror = true;
      setRotation(hawk3, 0F, 0F, 0F);
      hawk4 = new ModelRenderer(this, 0, 0);
      hawk4.addBox(-0.5F, -2.5F, -0.5F, 1, 2, 1);
      hawk4.setRotationPoint(0F, 8.5F, -10F);
      hawk4.setTextureSize(64, 32);
      hawk4.mirror = true;
      setRotation(hawk4, 0F, 0F, 0F);
      hawk5 = new ModelRenderer(this, 0, 0);
      hawk5.addBox(-0.5F, -1.5F, -0.5F, 1, 1, 1);
      hawk5.setRotationPoint(0F, 8.5F, -9F);
      hawk5.setTextureSize(64, 32);
      hawk5.mirror = true;
      setRotation(hawk5, 0F, 0F, 0F);
      body = new ModelRenderer(this, 28, 8);
      body.addBox(-5F, -10F, -7F, 10, 16, 8);
      body.setRotationPoint(0F, 11F, 3F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg1.setRotationPoint(-3F, 18F, 7F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg2.setRotationPoint(3F, 18F, 7F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg3.setRotationPoint(-3F, 18F, -5F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-2F, 0F, -2F, 4, 6, 4);
      leg4.setRotationPoint(3F, 18F, -5F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      
      convertToChild(head, nose);
      convertToChild(head, lhorn);
      convertToChild(head, rhorn);
      convertToChild(head, hawk1);
      convertToChild(head, hawk2);
      convertToChild(head, hawk3);
      convertToChild(head, hawk4);
      convertToChild(head, hawk5);
      
  }
  
  protected void convertToChild(ModelRenderer parent, ModelRenderer child)
  {
	// move child rotation point to be relative to parent
	  child.rotationPointX -= parent.rotationPointX;
	  child.rotationPointY -= parent.rotationPointY;
	  child.rotationPointZ -= parent.rotationPointZ;
	  
	// make rotations relative to parent
	  child.rotateAngleX -= parent.rotateAngleX;
	  child.rotateAngleY -= parent.rotateAngleY;
	  child.rotateAngleZ -= parent.rotateAngleZ;
	  
	//create relationship
	  parent.addChild(child);
	  
  }
  
  
  public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
  {
    super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
    head.render(scaleFactor);
    //nose.render(scaleFactor);
    //lhorn.render(scaleFactor);
    //rhorn.render(scaleFactor);
    //hawk1.render(scaleFactor);
    //hawk2.render(scaleFactor);
    //hawk3.render(scaleFactor);
    //hawk4.render(scaleFactor);
    //hawk5.render(scaleFactor);
    body.render(scaleFactor);
    leg1.render(scaleFactor);
    leg2.render(scaleFactor);
    leg3.render(scaleFactor);
    leg4.render(scaleFactor);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
  {
	  float XAngle = headPitch / 57.29578F;
	  float YAngle = netHeadYaw / 57.29578F;
	  
	  this.head.rotateAngleX = (0.2617794F + XAngle);
	  this.head.rotateAngleY = YAngle;
	  
	  this.body.rotateAngleX = ((float)Math.PI / 2F);
	  
	  this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	  this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	  this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	  this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }

}
