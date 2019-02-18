package com.customachievements.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import com.customachievements.utils.Utils;

public class AchievementsCommands implements Listener {
	@EventHandler
	private void onCommand(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		
		switch (e.getMessage()) {
		case "/sethome":
			Utils.achievement(p, "achievement_command_1", "Home Sweet Home");
			break;
		case "/delhome":
			Utils.achievement(p, "achievement_command_2", "No More Home");
			break;
		case "/home":
			Utils.achievement(p, "achievement_command_3", "I Ran Home");
			break;
		case "/help":
			Utils.achievement(p, "achievement_command_4", "Time to Learn Stuff!");
			break;
		case "/spawn":
			Utils.achievement(p, "achievement_command_5", "Where it All Began");
			break;
		default:
			break;
		}
	}
}
