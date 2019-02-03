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
				if (!config.isSet("achievement_3")) {
					config.set("achievement_3", true);
					cm.saveConfig();
					Utils.achievement(e.getEntity().getKiller(), "Monster Slayer");
				}
			}
		}
	}
}
