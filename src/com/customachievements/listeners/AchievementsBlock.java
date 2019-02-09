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
			
			switch (e.getBlock().getType()) {
			case OAK_LOG:
				if (!config.getBoolean("achievement_block_1")) {
					config.set("achievement_block_1", true);
					Utils.achievement(e.getPlayer(), "Just Getting Started");
					cm.saveConfig();
				}
				break;
			case GRASS_BLOCK:
			case DIRT:
				if (!config.getBoolean("achievement_block_2")) {
					config.set("achievement_block_2", true);
					Utils.achievement(e.getPlayer(), "Scratching the Surface");
					cm.saveConfig();
				}
				break;
			case COAL_ORE:
				if (!config.getBoolean("achievement_block_3")) {
					config.set("achievement_block_3", true);
					Utils.achievement(e.getPlayer(), "What is This?");
					cm.saveConfig();
				}
				break;
			case DIAMOND_ORE:
				if (!config.getBoolean("achievement_block_4")) {
					config.set("achievement_block_4", true);
					Utils.achievement(e.getPlayer(), "Just the Beginning");
					cm.saveConfig();
				}
				break;
			case EMERALD_ORE:
				if (!config.getBoolean("achievement_block_5")) {
					config.set("achievement_block_5", true);
					Utils.achievement(e.getPlayer(), "A Villagers Delight");
					cm.saveConfig();
				}
				break;
			case CRAFTING_TABLE:
			case CHEST:
			case FURNACE:
				if (!config.getBoolean("achievement_block_6")) {
					config.set("achievement_block_6", true);
					Utils.achievement(e.getPlayer(), "Pack Rat");
					cm.saveConfig();
				}
				break;
			case GRASS:
				if (!config.getBoolean("achievement_block_7")) {
					config.set("achievement_block_7", true);
					Utils.achievement(e.getPlayer(), "Grass Have Feelings Too!");
					cm.saveConfig();
				}
				break;
			default:
				break;
			}
			
		}
	}
}
