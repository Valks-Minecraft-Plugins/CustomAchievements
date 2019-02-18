package com.customachievements.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import com.customachievements.utils.Utils;

public class AchievementsDrop implements Listener {
	@EventHandler
	private void playerDropEvent(PlayerDropItemEvent e) {
		Material type = e.getItemDrop().getItemStack().getType();
		Player p = e.getPlayer();
		
		switch (type) {
		case DIAMOND:
			Utils.achievement(p, "achievement_drop_2", "I'm Wealthy");
			break;
		default:
			Utils.achievement(p, "achievement_drop_1", "Goodbye " + type.name().toLowerCase() + " :(");
			break;
		}
	}
}
