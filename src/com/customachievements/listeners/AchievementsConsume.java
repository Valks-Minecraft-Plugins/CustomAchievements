package com.customachievements.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import com.customachievements.utils.Utils;

public class AchievementsConsume implements Listener {
	@EventHandler
	private void playerConsumeEvent(PlayerItemConsumeEvent e) {
		Material type = e.getItem().getType();
		Player p = e.getPlayer();
		
		switch (type) {
		case BEETROOT:
			Utils.achievement(p, "achievement_consume_1", "I Could Get Use to This");
			break;
		case COOKIE:
			Utils.achievement(p, "achievement_consume_2", "Plant Fibre is a Cookie");
			break;
		case BAKED_POTATO:
			Utils.achievement(p, "achievement_consume_3", "I Feel Great!");
			break;
		case DRIED_KELP:
			Utils.achievement(p, "achievement_consume_4", "At Least You Tried It");
			break;
		default:
			break;
		}
	}
}
