package com.customachievements.listeners;

import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.customachievements.utils.Utils;

public class AchievementsEntity implements Listener {
	@EventHandler
	private void entityDeath(EntityDeathEvent e) {
		if (e.getEntity() instanceof Monster) {
			if (e.getEntity().getKiller() instanceof Player) {
				Player p = (Player) e.getEntity().getKiller();
				
				switch (e.getEntity().getType()) {
				case SLIME:
					Utils.achievement(p, "achievement_entity_1", "A Sticky Situation");
					break;
				case ZOMBIE:
					Utils.achievement(p, "achievement_entity_2", "Zombies?!");
					break;
				case HUSK:
					Utils.achievement(p, "achievement_entity_3", "These Guys are Tough!");
					break;
				case SPIDER:
					Utils.achievement(p, "achievement_entity_4", "Spiders Never Gonna' Get Me");
					break;
				case PHANTOM:
					Utils.achievement(p, "achievement_entity_5", "Why Did I Come Here?");
					break;
				case WITHER_SKELETON:
					Utils.achievement(p, "achievement_entity_6", "Nope! Nope! Nope!");
					break;
				case WITHER:
					Utils.achievement(p, "achievement_entity_7", "I am the One");
					break;
				default:
					break;
				}
			}
		}
	}
}
