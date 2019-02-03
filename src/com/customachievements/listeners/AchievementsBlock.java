package com.customachievements.listeners;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.customachievements.configs.PlayerFiles;
import com.customachievements.utils.Utils;
import com.valkutils.modules.BlockModule;

public class AchievementsBlock implements Listener {
	@EventHandler
	private void breakBlock(BlockBreakEvent e) {
		if (BlockModule.isLog(e.getBlock().getType())) {
			PlayerFiles cm = PlayerFiles.getConfig(e.getPlayer());
			FileConfiguration config = cm.getConfig();
			
			if (!config.getBoolean("achievement_1")) {
				config.set("achievement_1", true);
				Utils.achievement(e.getPlayer(), "Just Getting Started");
				cm.saveConfig();
			}
		}
	}
}
