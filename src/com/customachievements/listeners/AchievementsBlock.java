package com.customachievements.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.customachievements.utils.Utils;
import com.valkutils.modules.BlockModule;

public class AchievementsBlock implements Listener {
	@EventHandler
	private void breakBlock(BlockBreakEvent e) {
		if (BlockModule.isLog(e.getBlock().getType())) {
			Player p = e.getPlayer();
			
			switch (e.getBlock().getType()) {
			case OAK_LOG:
				Utils.achievement(p, "achievement_block_1", "Just Getting Started");
				break;
			case GRASS_BLOCK:
			case DIRT:
				Utils.achievement(p, "achievement_block_2", "Scratching the Surface");
				break;
			case COAL_ORE:
				Utils.achievement(p, "achievement_block_3", "What is This?");
				break;
			case DIAMOND_ORE:
				Utils.achievement(p, "achievement_block_4", "Just the Beginning");
				break;
			case EMERALD_ORE:
				Utils.achievement(p, "achievement_block_5", "A Villagers Damnation");
				break;
			case CRAFTING_TABLE:
			case CHEST:
			case FURNACE:
				Utils.achievement(p, "achievement_block_6", "Pack Rat");
				break;
			case GRASS:
				Utils.achievement(p, "achievement_block_7", "Grass Have Feelings Too!");
				break;
			default:
				break;
			}
			
		}
	}
}
