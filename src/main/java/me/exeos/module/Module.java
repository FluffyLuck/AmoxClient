package me.exeos.module;

import me.exeos.clickgui.setting.Setting;

import java.util.ArrayList;
import java.util.List;

public final class Module {
    private final String name;
    private final Category category;
    private final List<Setting> settings = new ArrayList<>();
    private boolean toggled;

    public Module(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isToggled() {
        return toggled;
    }

    public void toggle() {
        toggled = !toggled;
    }

    public List<Setting> getSettings() {
        return settings;
    }

    public void addSetting(Setting setting) {
        settings.add(setting);
    }
}