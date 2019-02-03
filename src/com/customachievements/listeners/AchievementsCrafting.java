package com.customachievements.listeners;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

import com.customachievements.configs.PlayerFiles;
import com.customachievements.utils.Utils;

public class AchievementsCrafting implements Listener {
	@EventHandler
	private void playerCraftEvent(CraftItemEvent e) {
		Player p = (Player) e.getWhoClicked();
		PlayerFiles cm = PlayerFiles.getConfig(p);
		FileConfiguration config = cm.getConfig();
		if (!config.isSet("achievement_2")) {
			config.set("achievement_2", true);
			cm.saveConfig();
			Utils.achievement(p, "Crafted First Item");
		}
	}
}
