package me.exeos.clickgui.comp;

import me.exeos.clickgui.Clickgui;
import me.exeos.clickgui.setting.Setting;
import me.exeos.module.Module;
import net.minecraft.client.gui.DrawContext;

public class Comp {
    public double x, y, x2, y2;
    public Clickgui parent;
    public Module module;
    public Setting setting;

    public void mouseClicked(double mouseX, double mouseY, int button) {
    }

    public void mouseReleased(double mouseX, double mouseY, int button) {
    }

    public void drawScreen(DrawContext context, int mouseX, int mouseY) {
    }

    public boolean isInside(double mouseX, double mouseY, double left, double top, double right, double bottom) {
        return mouseX > left && mouseX < right && mouseY > top && mouseY < bottom;
    }

    public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
        return false;
    }
}