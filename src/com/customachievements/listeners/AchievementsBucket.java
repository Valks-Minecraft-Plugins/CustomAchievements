package com.customachievements.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;

import com.customachievements.utils.Utils;

public class AchievementsBucket implements Listener {
	@EventHandler
	private void bucketFillEvent(PlayerBucketFillEvent e) {
		Material type = e.getBlockClicked().getType();
		Player p = e.getPlayer();
		
		switch (type) {
		case WATER:
			Utils.achievement(p, "achievement_bucket_1", "Water Begone!");
			break;
		case LAVA:
			Utils.achievement(p, "achievement_bucket_2", "Hot!");
			break;
		default:
			break;
		}
	}
	
	@EventHandler
	private void bucketEmptyEvent(PlayerBucketEmptyEvent e) {
		Material type = e.getBucket();
		Player p = e.getPlayer();
		
		switch (type) {
		case LAVA_BUCKET:
			Utils.achievement(p, "achievement_bucket_3", "Let it Burn!!");
			break;
		case WATER_BUCKET:
			Utils.achievement(p, "achievement_bucket_4", "Yipeee!");
			break;
		default:
			break;
		}
	}
}
