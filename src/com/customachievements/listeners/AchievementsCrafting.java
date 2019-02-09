package com.customachievements.listeners;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

import com.customachievements.configs.PlayerFiles;
import com.customachievements.utils.Utils;

public class AchievementsCrafting implements Listener {
	@EventHandler
	private void playerCraftEvent(CraftItemEvent e) {
		Player p = (Player) e.getWhoClicked();
		PlayerFiles cm = PlayerFiles.getConfig(p);
		FileConfiguration config = cm.getConfig();

		switch (e.getRecipe().getResult().getType()) {
		case STICK:
			if (!config.isSet("achievement_crafting_2")) {
				config.set("achievement_crafting_2", true);
				cm.saveConfig();
				Utils.achievement(p, "A Strong Stick");
			}
			break;
		case OAK_SLAB:
			if (!config.isSet("achievement_crafting_3")) {
				config.set("achievement_crafting_3", true);
				cm.saveConfig();
				Utils.achievement(p, "Stick Smasher");
			}
			break;
		case CHEST:
			if (!config.isSet("achievement_crafting_4")) {
				config.set("achievement_crafting_4", true);
				cm.saveConfig();
				Utils.achievement(p, "Something to Store Stuff In");
			}
			break;
		case CRAFTING_TABLE:
			if (!config.isSet("achievement_crafting_5")) {
				config.set("achievement_crafting_5", true);
				cm.saveConfig();
				Utils.achievement(p, "Tec Savy");
			}
			break;
		case FURNACE:
			if (!config.isSet("achievement_crafting_6")) {
				config.set("achievement_crafting_6", true);
				cm.saveConfig();
				Utils.achievement(p, "The Smelter");
			}
			break;
		case WOODEN_SWORD:
		case BOW:
		case LEATHER_HELMET:
		case LEATHER_CHESTPLATE:
		case LEATHER_LEGGINGS:
		case LEATHER_BOOTS:
			if (!config.isSet("achievement_crafting_7")) {
				config.set("achievement_crafting_7", true);
				cm.saveConfig();
				Utils.achievement(p, "I Came Prepared");
			}
			break;
		case WOODEN_AXE:
		case WOODEN_PICKAXE:
		case WOODEN_HOE:
		case WOODEN_SHOVEL:
			if (!config.isSet("achievement_crafting_8")) {
				config.set("achievement_crafting_8", true);
				cm.saveConfig();
				Utils.achievement(p, "Primitive Age");
			}
			break;
		case STONE_AXE:
		case STONE_PICKAXE:
		case STONE_HOE:
		case STONE_SHOVEL:
			if (!config.isSet("achievement_crafting_9")) {
				config.set("achievement_crafting_9", true);
				cm.saveConfig();
				Utils.achievement(p, "Stone Age");
			}
			break;
		case IRON_AXE:
		case IRON_PICKAXE:
		case IRON_HOE:
		case IRON_SHOVEL:
			if (!config.isSet("achievement_crafting_10")) {
				config.set("achievement_crafting_10", true);
				cm.saveConfig();
				Utils.achievement(p, "Cerussite Age");
			}
			break;
		case GOLDEN_AXE:
		case GOLDEN_PICKAXE:
		case GOLDEN_HOE:
		case GOLDEN_SHOVEL:
			if (!config.isSet("achievement_crafting_11")) {
				config.set("achievement_crafting_11", true);
				cm.saveConfig();
				Utils.achievement(p, "Limonite Age");
			}
			break;
		case DIAMOND_AXE:
		case DIAMOND_PICKAXE:
		case DIAMOND_HOE:
		case DIAMOND_SHOVEL:
			if (!config.isSet("achievement_crafting_12")) {
				config.set("achievement_crafting_12", true);
				cm.saveConfig();
				Utils.achievement(p, "Azurite Age");
			}
			break;
		case VILLAGER_SPAWN_EGG:
		case SHEEP_SPAWN_EGG:
		case CHICKEN_SPAWN_EGG:
		case HORSE_SPAWN_EGG:
		case DONKEY_SPAWN_EGG:
		case LLAMA_SPAWN_EGG:
			if (!config.isSet("achievement_crafting_13")) {
				config.set("achievement_crafting_13", true);
				cm.saveConfig();
				Utils.achievement(p, "The Summoner");
			}
			break;
		case REDSTONE:
			if (!config.isSet("achievement_crafting_14")) {
				config.set("achievement_crafting_14", true);
				cm.saveConfig();
				Utils.achievement(p, "Mechanical Expert");
			}
			break;
		case WHITE_BED:
			if (!config.isSet("achievement_crafting_15")) {
				config.set("achievement_crafting_15", true);
				cm.saveConfig();
				Utils.achievement(p, "I'm Tired");
			}
			break;
		case BREWING_STAND:
		case CAULDRON:
			if (!config.isSet("achievement_crafting_16")) {
				config.set("achievement_crafting_16", true);
				cm.saveConfig();
				Utils.achievement(p, "I'm a Crazy Person");
			}
			break;
		case REDSTONE_TORCH:
			if (!config.isSet("achievement_crafting_17")) {
				config.set("achievement_crafting_17", true);
				cm.saveConfig();
				Utils.achievement(p, "Light");
			}
			break;
		case TORCH:
			if (!config.isSet("achievement_crafting_18")) {
				config.set("achievement_crafting_18", true);
				cm.saveConfig();
				Utils.achievement(p, "Super Light");
			}
			break;
		case TNT:
			if (!config.isSet("achievement_crafting_19")) {
				config.set("achievement_crafting_19", true);
				cm.saveConfig();
				Utils.achievement(p, "Boom!");
			}
			break;
		case CARVED_PUMPKIN:
			if (!config.isSet("achievement_crafting_20")) {
				config.set("achievement_crafting_20", true);
				cm.saveConfig();
				Utils.achievement(p, "They Will Never Find Me!");
			}
			break;
		case ELYTRA:
			if (!config.isSet("achievement_crafting_21")) {
				config.set("achievement_crafting_21", true);
				cm.saveConfig();
				Utils.achievement(p, "The God");
			}
			break;
		default:
			if (!config.isSet("achievement_crafting_1")) {
				config.set("achievement_crafting_1", true);
				cm.saveConfig();
				Utils.achievement(p, "Crafted First Item");
			}
			break;
		}
	}
}
