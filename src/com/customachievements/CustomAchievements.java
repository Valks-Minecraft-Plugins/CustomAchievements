package com.customachievements;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.customachievements.listeners.AchievementsBlock;
import com.customachievements.listeners.AchievementsCrafting;
import com.customachievements.listeners.AchievementsEntity;

public class CustomAchievements extends JavaPlugin {
	public static CustomAchievements plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		registerListeners(getServer().getPluginManager());
	}
	
	private void registerListeners(PluginManager pm) {
		pm.registerEvents(new AchievementsBlock(), this);
		pm.registerEvents(new AchievementsCrafting(), this);
		pm.registerEvents(new AchievementsEntity(), this);
	}
}
