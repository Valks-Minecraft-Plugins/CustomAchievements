package com.customachievements;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.customachievements.listeners.AchievementsBedEnter;
import com.customachievements.listeners.AchievementsBlock;
import com.customachievements.listeners.AchievementsBucket;
import com.customachievements.listeners.AchievementsCommands;
import com.customachievements.listeners.AchievementsConsume;
import com.customachievements.listeners.AchievementsCrafting;
import com.customachievements.listeners.AchievementsDrop;
import com.customachievements.listeners.AchievementsEntity;
import com.customachievements.listeners.AchievementsStatistic;
import com.customachievements.listeners.AchievementsXP;

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
		pm.registerEvents(new AchievementsConsume(), this);
		pm.registerEvents(new AchievementsBedEnter(), this);
		pm.registerEvents(new AchievementsBucket(), this);
		pm.registerEvents(new AchievementsDrop(), this);
		pm.registerEvents(new AchievementsXP(), this);
		pm.registerEvents(new AchievementsCommands(), this);
		pm.registerEvents(new AchievementsStatistic(), this);
	}
}
