package com.customachievements.listeners;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import com.customachievements.utils.Utils;

public class AchievementsBedEnter implements Listener {
	@EventHandler
	private void playerBedEnterEvent(PlayerBedEnterEvent e) {
		Player p = e.getPlayer();
		World w = p.getWorld();
		long time = w.getTime();
		
		if (time > 12300 || time < 23850) {
			Utils.achievement(p, "achievement_bedenter_1", "The Night is TOO Scary For Me!");
		}
		
		if (w.hasStorm() || w.isThundering()) {
			Utils.achievement(p, "achievement_bedenter_2", "What a Stormy Night!");
		}
	}
}
