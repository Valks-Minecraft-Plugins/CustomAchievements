package com.customachievements.utils;

import org.bukkit.entity.Player;

import com.customachievements.CustomAchievements;
import com.valkutils.modules.TextModule;

public class Utils {
	public static void achievement(Player p, String message) {
		p.sendTitle("", message, 20, 60, 20);
		CustomAchievements.plugin.getServer().broadcastMessage(TextModule.color("&f" + p.getPlayer().getName() + " &7just achieved &f" + message + "&7!"));
	}
}
