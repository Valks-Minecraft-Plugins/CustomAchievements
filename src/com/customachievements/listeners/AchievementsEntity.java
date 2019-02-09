package com.customachievements.listeners;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import com.customachievements.configs.PlayerFiles;
import com.customachievements.utils.Utils;

public class AchievementsEntity implements Listener {
	@EventHandler
	private void entityDeath(EntityDeathEvent e) {
		if (e.getEntity() instanceof Monster) {
			if (e.getEntity().getKiller() instanceof Player) {
				PlayerFiles cm = PlayerFiles.getConfig(e.getEntity().getKiller());
				FileConfiguration config = cm.getConfig();
				
				switch (e.getEntity().getType()) {
				case SLIME:
					if (!config.isSet("achievement_entity_1")) {
						config.set("achievement_entity_1", true);
						cm.saveConfig();
						Utils.achievement(e.getEntity().getKiller(), "A Sticky Situation");
					}
					break;
				case HUSK:
					if (!config.isSet("achievement_entity_2")) {
						config.set("achievement_entity_2", true);
						cm.saveConfig();
						Utils.achievement(e.getEntity().getKiller(), "These Guys Are Tough!");
					}
					break;
				default:
					break;
				}
			}
		}
	}
}
