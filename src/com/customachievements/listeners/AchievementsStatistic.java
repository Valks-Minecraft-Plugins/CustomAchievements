package com.customachievements.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import org.bukkit.inventory.EntityEquipment;

import com.customachievements.utils.Utils;
import com.valkcore.modules.PlayerModule;

public class AchievementsStatistic implements Listener {
	@EventHandler
	private void statistic(PlayerStatisticIncrementEvent e) {
		Player p = e.getPlayer();
		int value = e.getNewValue();
		
		switch (e.getStatistic()) {
		case USE_ITEM:
			EntityEquipment equip = p.getEquipment();
			Material item = equip.getItemInMainHand().getType();
			if (PlayerModule.isPickaxe(item)) {
				switch (value) {
				case 100:
					Utils.achievement(p, "achievement_stat_use_item_2", "Mined " + value + " blocks.");
					break;
				case 250:
					Utils.achievement(p, "achievement_stat_use_item_3", "Mined " + value + " blocks.");
					break;
				case 500:
					Utils.achievement(p, "achievement_stat_use_item_4", "Mined " + value + " blocks.");
					break;
				case 1000:
					Utils.achievement(p, "achievement_stat_use_item_5", "Mined " + value + " blocks.");
					break;
				case 10000:
					Utils.achievement(p, "achievement_stat_use_item_6", "Mined " + value + " blocks.");
					break;
				}
			}
			
			if (PlayerModule.isAxe(item)) {
				switch (value) {
				case 100:
					Utils.achievement(p, "achievement_stat_use_item_8", "Chopped " + value + " blocks.");
					break;
				case 250:
					Utils.achievement(p, "achievement_stat_use_item_9", "Chopped " + value + " blocks.");
					break;
				case 500:
					Utils.achievement(p, "achievement_stat_use_item_10", "Chopped " + value + " blocks.");
					break;
				case 1000:
					Utils.achievement(p, "achievement_stat_use_item_11", "Chopped " + value + " blocks.");
					break;
				case 10000:
					Utils.achievement(p, "achievement_stat_use_item_12", "Chopped " + value + " blocks.");
					break;
				}
			}
			
			if (PlayerModule.isHoe(item)) {
				switch (value) {
				case 100:
					Utils.achievement(p, "achievement_stat_use_item_14", "Farmed " + value + " blocks.");
					break;
				case 250:
					Utils.achievement(p, "achievement_stat_use_item_15", "Farmed " + value + " blocks.");
					break;
				case 500:
					Utils.achievement(p, "achievement_stat_use_item_16", "Farmed " + value + " blocks.");
					break;
				case 1000:
					Utils.achievement(p, "achievement_stat_use_item_17", "Farmed " + value + " blocks.");
					break;
				case 10000:
					Utils.achievement(p, "achievement_stat_use_item_18", "Farmed " + value + " blocks.");
					break;
				}
			}
			
			if (PlayerModule.isSword(item)) {
				switch (value) {
				case 100:
					Utils.achievement(p, "achievement_stat_use_item_19", "I really like swinging swords all day.");
					break;
				case 250:
					Utils.achievement(p, "achievement_stat_use_item_20", "Swinged a sword " + value + " times.");
					break;
				case 500:
					Utils.achievement(p, "achievement_stat_use_item_21", "Swinged a sword " + value + " times.");
					break;
				case 1000:
					Utils.achievement(p, "achievement_stat_use_item_22", "Swinged a sword " + value + " times.");
					break;
				case 10000:
					Utils.achievement(p, "achievement_stat_use_item_23", "Swinged a sword " + value + " times.");
					break;
				}
			}
			
			if (PlayerModule.isShovel(item)) {
				switch (value) {
				case 100:
					Utils.achievement(p, "achievement_stat_use_item_25", "Excavated " + value + " blocks.");
					break;
				case 250:
					Utils.achievement(p, "achievement_stat_use_item_26", "Excavated " + value + " blocks.");
					break;
				case 500:
					Utils.achievement(p, "achievement_stat_use_item_27", "Excavated " + value + " blocks.");
					break;
				case 1000:
					Utils.achievement(p, "achievement_stat_use_item_28", "Excavated " + value + " blocks.");
					break;
				case 10000:
					Utils.achievement(p, "achievement_stat_use_item_29", "Excavated " + value + " blocks.");
					break;
				}
			}
			break;
		case DAMAGE_TAKEN:
			switch (value) {
			case 10000:
				Utils.achievement(p, "achievement_stat_damage_taken_1", "Dealed " + value + " damage.");
				break;
			case 25000:
				Utils.achievement(p, "achievement_stat_damage_taken_2", "Dealed " + value + " damage.");
				break;
			case 50000:
				Utils.achievement(p, "achievement_stat_damage_taken_3", "Dealed " + value + " damage.");
				break;
			case 100000:
				Utils.achievement(p, "achievement_stat_damage_taken_4", "Dealed " + value + " damage.");
				break;
			case 250000:
				Utils.achievement(p, "achievement_stat_damage_taken_5", "Dealed " + value + " damage.");
				break;
			case 500000:
				Utils.achievement(p, "achievement_stat_damage_taken_6", "Dealed " + value + " damage.");
				break;
			case 1000000:
				Utils.achievement(p, "achievement_stat_damage_taken_7", "Dealed " + value + " damage.");
				break;
			}
			break;
		case DAMAGE_DEALT:
			switch (value) {
			case 10000:
				Utils.achievement(p, "achievement_stat_damage_recieved_1", "Recieved " + value + " damage.");
				break;
			case 25000:
				Utils.achievement(p, "achievement_stat_damage_recieved_2", "Recieved " + value + " damage.");
				break;
			case 50000:
				Utils.achievement(p, "achievement_stat_damage_recieved_3", "Recieved " + value + " damage.");
				break;
			case 100000:
				Utils.achievement(p, "achievement_stat_damage_recieved_4", "Recieved " + value + " damage.");
				break;
			case 250000:
				Utils.achievement(p, "achievement_stat_damage_recieved_5", "Recieved " + value + " damage.");
				break;
			case 500000:
				Utils.achievement(p, "achievement_stat_damage_recieved_6", "Recieved " + value + " damage.");
				break;
			case 1000000:
				Utils.achievement(p, "achievement_stat_damage_recieved_7", "Recieved " + value + " damage.");
				break;
			}
			break;
		case JUMP:
			switch (value) {
			case 2500:
				Utils.achievement(p, "achievement_stat_jump_2", "Jumped " + value + " times.");
				break;
			case 5000:
				Utils.achievement(p, "achievement_stat_jump_3", "Jumped " + value + " times.");
				break;
			case 10000:
				Utils.achievement(p, "achievement_stat_jump_4", "Jumped " + value + " times.");
				break;
			case 25000:
				Utils.achievement(p, "achievement_stat_jump_5", "Jumped " + value + " times.");
				break;
			case 50000:
				Utils.achievement(p, "achievement_stat_jump_6", "Jumped " + value + " times.");
				break;
			case 100000:
				Utils.achievement(p, "achievement_stat_jump_7", "Jumped " + value + " times.");
				break;
			}
			break;
		case PICKUP:
			switch (value) {
			case 100:
				Utils.achievement(p, "achievement_stat_pickup_1", "Picked up " + value + " items.");
				break;
			case 1000:
				Utils.achievement(p, "achievement_stat_pickup_2", "Picked up " + value + " items.");
				break;
			case 10000:
				Utils.achievement(p, "achievement_stat_pickup_3", "Picked up " + value + " items.");
				break;
			}
			break;
		case DROP: // Drop 64 items at once.
			if (value >= 64) {
				Utils.achievement(p, "achievement_stat_drop_1", "A Whole Stack? Gone!");
			}
			break;
		case DROP_COUNT:
			switch (value) {
			case 100:
				Utils.achievement(p, "achievement_stat_drop_count_1", "Dropped " + value + " items.");
				break;
			case 1000:
				Utils.achievement(p, "achievement_stat_drop_count_2", "Dropped " + value + " items.");
				break;
			case 10000:
				Utils.achievement(p, "achievement_stat_drop_count_3", "Dropped " + value + " items.");
				break;
			}
			break;
		case BREAK_ITEM:
			switch (value) {
			case 1:
				Utils.achievement(p, "achievement_stat_break_item_1", "A Broken Mess");
				break;
			case 10:
				Utils.achievement(p, "achievement_stat_break_item_2", "It Keeps Breaking!");
				break;
			case 100:
				Utils.achievement(p, "achievement_stat_break_item_3", "Give Me a Break!");
				break;
			}
			break;
		case DEATHS:
			switch (value) {
			case 1:
				Utils.achievement(p, "achievement_stat_deaths_1", "First Blood");
				break;
			case 3:
				Utils.achievement(p, "achievement_stat_deaths_2", "This is Tough");
				break;
			case 10:
				Utils.achievement(p, "achievement_stat_deaths_3", "Not Again :(");
				break;
			case 20:
				Utils.achievement(p, "achievement_stat_deaths_4", "The Cats Did This");
				break;
			case 30:
				Utils.achievement(p, "achievement_stat_deaths_5", "This Cat Conspiracy is Real!");
				break;
			case 50:
				Utils.achievement(p, "achievement_stat_deaths_6", "I'm Dead");
				break;
			case 100:
				Utils.achievement(p, "achievement_stat_deaths_7", "We're all Dead");
				break;
			}
			break;
		case ITEM_ENCHANTED:
			switch (value) {
			case 1:
				Utils.achievement(p, "achievement_stat_item_enchanted_1", "And Thou Enchanted Thee");
				break;
			}
			break;
		case KILL_ENTITY:
			switch (value) {
			case 100:
				Utils.achievement(p, "achievement_stat_kill_entity_2", "I Killed " + value + " Mobs");
				break;
			case 250:
				Utils.achievement(p, "achievement_stat_kill_entity_3", "I Killed " + value + " Mobs");
				break;
			case 500:
				Utils.achievement(p, "achievement_stat_kill_entity_4", "I Killed " + value + " Mobs");
				break;
			case 1000:
				Utils.achievement(p, "achievement_stat_kill_entity_5", "I Killed " + value + " Mobs");
				break;
			case 2500:
				Utils.achievement(p, "achievement_stat_kill_entity_6", "I Killed " + value + " Mobs");
				break;
			case 5000:
				Utils.achievement(p, "achievement_stat_kill_entity_7", "I Killed " + value + " Mobs");
				break;
			case 10000:
				Utils.achievement(p, "achievement_stat_kill_entity_8", "I Killed " + value + " Mobs");
				break;
			case 25000:
				Utils.achievement(p, "achievement_stat_kill_entity_9", "I Killed " + value + " Mobs");
				break;
			}
			break;
		case CRAFT_ITEM:
			switch (value) {
			case 25:
				Utils.achievement(p, "achievement_stat_craft_item_1", "I Know How to Craft Stuff");
				break;
			case 100:
				Utils.achievement(p, "achievement_stat_craft_item_2", "The Crafter");
				break;
			case 250:
				Utils.achievement(p, "achievement_stat_craft_item_3", "Craft Master");
				break;
			case 500:
				Utils.achievement(p, "achievement_stat_craft_item_4", "Cat Craft Master");
				break;
			case 1000:
				Utils.achievement(p, "achievement_stat_craft_item_5", "Neko Craft Master");
				break;
			case 2500:
				Utils.achievement(p, "achievement_stat_craft_item_6", "Crafting is What I Do");
				break;
			case 5000:
				Utils.achievement(p, "achievement_stat_craft_item_7", p.getName() + " Likes to Craft");
				break;
			case 10000:
				Utils.achievement(p, "achievement_stat_craft_item_8", "Crafta Holic");
				break;
			}
			break;
		case CHEST_OPENED:
			switch (value) {
			case 1000:
				Utils.achievement(p, "achievement_stat_chest_opened_1", "You opened a chest " + value + " times. Yay?");
				break;
			case 10000:
				Utils.achievement(p, "achievement_stat_chest_opened_2", "You opened a chest " + value + " times. Yay?");
				break;
			}
			break;
		default:
			break;
		}
	}
}
