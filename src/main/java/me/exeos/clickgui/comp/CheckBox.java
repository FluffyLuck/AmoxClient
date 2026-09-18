package me.exeos.clickgui.comp;

import me.exeos.clickgui.Clickgui;
import me.exeos.clickgui.setting.Setting;
import me.exeos.module.Module;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;

public final class CheckBox extends Comp {
    public CheckBox(double x, double y, Clickgui parent, Module module, Setting setting) {
        this.x = x;
        this.y = y;
        this.parent = parent;
        this.module = module;
        this.setting = setting;
    }

    @Override
    public void drawScreen(DrawContext context, int mouseX, int mouseY) {
        int left = (int) parent.posX + (int) x - 70;
        int top = (int) parent.posY + (int) y;
        context.fill(left, top, left + 80, top + 10, setting.getValBoolean() ? 0xffe60ae6 : 0xff1e1e1e);
        context.drawText(parent.textRenderer, Text.literal(setting.getName()), left + 15, top + 1, 0xffc8c8c8, false);
    }

    @Override
    public void mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0 && isInside(mouseX, mouseY, parent.posX + x - 70, parent.posY + y, parent.posX + x + 10, parent.posY + y + 10)) {
            setting.setValBoolean(!setting.getValBoolean());
        }
    }
}