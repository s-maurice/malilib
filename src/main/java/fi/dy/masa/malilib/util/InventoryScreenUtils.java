package fi.dy.masa.malilib.util;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Slot;
import fi.dy.masa.malilib.mixin.IMixinGuiContainer;

public class InventoryScreenUtils
{
    public static int getGuiPosX(GuiContainer gui)
    {
        return ((IMixinGuiContainer) gui).getGuiPosX();
    }

    public static int getGuiPosY(GuiContainer gui)
    {
        return ((IMixinGuiContainer) gui).getGuiPosY();
    }

    public static int getGuiSizeX(GuiContainer gui)
    {
        return ((IMixinGuiContainer) gui).getGuiSizeX();
    }

    public static int getGuiSizeY(GuiContainer gui)
    {
        return ((IMixinGuiContainer) gui).getGuiSizeY();
    }

    public static Slot getSlotUnderMouse(GuiContainer gui)
    {
        return ((IMixinGuiContainer) gui).getHoveredSlot();
    }
}
