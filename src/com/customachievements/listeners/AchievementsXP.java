package com.customachievements.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLevelChangeEvent;

import com.customachievements.utils.Utils;

public class AchievementsXP implements Listener {
	@EventHandler
	private void playerLevelChangeEvent(PlayerLevelChangeEvent e) {
		Player p = e.getPlayer();
		
		int level = e.getNewLevel();
		
		if (level == 1) {
			Utils.achievement(p, "achievement_xp_1", "Level One Baby!");
		}
		
		if (level >= 3) {
			Utils.achievement(p, "achievement_xp_2", "I'm Starting to Like This!");
		}
		
		if (level >= 5) {
			Utils.achievement(p, "achievement_xp_3", "I'm an Experienced Player!");
		}
		
		if (level >= 10) {
			Utils.achievement(p, "achievement_xp_4", "I'm not Dead Yet!");
		}
		
		if (level >= 15) {
			Utils.achievement(p, "achievement_xp_5", "You'll Never Take Me Alive!");
		}
		
		if (level >= 20) {
			Utils.achievement(p, "achievement_xp_6", "Nothing can Kill Me!");
		}
		
		if (level >= 25) {
			Utils.achievement(p, "achievement_xp_7", "I'm Unstoppable!");
		}
		
		if (level >= 30) {
			Utils.achievement(p, "achievement_xp_8", "Not Even the Cats can Touch Me Now");
		}
		
		if (level >= 40) {
			Utils.achievement(p, "achievement_xp_9", "You Know it Gets Real When " + p.getName() + " Is Around");
		}
		
		if (level >= 50) {
			Utils.achievement(p, "achievement_xp_10", p.getHealth() + " Health Points Ain't So Bad?");
		}
		
		if (level >= 60) {
			Utils.achievement(p, "achievement_xp_11", p.getExp() + " Experience!");
		}
		
		if (level >= 70) {
			Utils.achievement(p, "achievement_xp_12", p.getEquipment().getItemInMainHand() == null ? "I Did it With my Hands!" : "Give the " + p.getEquipment().getItemInMainHand().getType().name().toLowerCase() + " a break!");
		}
		
		if (level >= 80) {
			Utils.achievement(p, "achievement_xp_13", p.getName() + " is Now Level 80!");
		}
		
		if (level >= 90) {
			Utils.achievement(p, "achievement_xp_14", p.getName() + " is Now Level 90!");
		}
		
		if (level >= 100) {
			Utils.achievement(p, "achievement_xp_15", "100!");
		}
	}
}
