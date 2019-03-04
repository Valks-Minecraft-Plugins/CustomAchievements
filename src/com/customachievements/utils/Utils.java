package com.customachievements.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import com.customachievements.CustomAchievements;
import com.customachievements.configs.PlayerFiles;
import com.valkcore.modules.TextModule;

public class Utils {
	public static void achievement(Player p, String achievement, String message) {
		PlayerFiles cm = PlayerFiles.getConfig(p);
		FileConfiguration config = cm.getConfig();
		
		if (!config.isSet(achievement)) {
			config.set(achievement, true);
			cm.saveConfig();
			
			p.sendTitle("", message, 20, 60, 20);
			CustomAchievements.plugin.getServer().broadcastMessage(TextModule.color("&q" + p.getPlayer().getName() + " &wjust achieved &q" + message));
		}
	}
}
