package com.Obstinate_3.tutorialmod.blocks;

import com.Obstinate_3.tutorialmod.TutorialMod;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.gui.ResourceLoadProgressGui;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class FirstBlockScreen extends ContainerScreen<FirstBlockContainer> {

    private ResourceLocation GUI =  new ResourceLocation(TutorialMod.MODID, "textures/gui/firstblock_gui.png");

    public FirstBlockScreen(FirstBlockContainer container, PlayerInventory inv, ITextComponent name) {
        super(container,inv,name);
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        this.renderBackground();
        super.render(mouseX,mouseY,partialTicks);
        this.renderHoveredToolTip(mouseX,mouseY);
    }


    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {
        this.font.drawString(this.title.getFormattedText(), 8.0F, 6.0F, 4210752); 
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int moustY) {
        GlStateManager.color4f(1.0F,1.0F,1.0F,1.0F);
        this.minecraft.getTextureManager().bindTexture(GUI);
        int relX = (this.width - this.xSize) /2;
        int relY = (this.height - this.ySize) /2;
        this.blit(relX,relY,0,0,this.xSize,this.ySize);
    }
}
