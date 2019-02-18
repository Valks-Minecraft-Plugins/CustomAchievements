package com.customachievements.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

import com.customachievements.utils.Utils;

public class AchievementsCrafting implements Listener {
	@EventHandler
	private void playerCraftEvent(CraftItemEvent e) {
		Player p = (Player) e.getWhoClicked();

		switch (e.getRecipe().getResult().getType()) {
		case STICK:
			Utils.achievement(p, "achievement_crafting_1", "A Strong Stick");
			break;
		case OAK_SLAB:
			Utils.achievement(p, "achievement_crafting_2", "Stick Smasher");
			break;
		case CHEST:
			Utils.achievement(p, "achievement_crafting_3", "Storage!");
			break;
		case CRAFTING_TABLE:
			Utils.achievement(p, "achievement_crafting_4", "More Recipes!");
			break;
		case FURNACE:
			Utils.achievement(p, "achievement_crafting_5", "The Smelter");
			break;
		case WOODEN_SWORD:
		case BOW:
		case LEATHER_HELMET:
		case LEATHER_CHESTPLATE:
		case LEATHER_LEGGINGS:
		case LEATHER_BOOTS:
			Utils.achievement(p, "achievement_crafting_6", "I Came Prepared");
			break;
		case WOODEN_AXE:
		case WOODEN_PICKAXE:
		case WOODEN_HOE:
		case WOODEN_SHOVEL:
			Utils.achievement(p, "achievement_crafting_7", "Primitive Age");
			break;
		case STONE_AXE:
		case STONE_PICKAXE:
		case STONE_HOE:
		case STONE_SHOVEL:
			Utils.achievement(p, "achievement_crafting_8", "Stone Age");
		case IRON_AXE:
		case IRON_PICKAXE:
		case IRON_HOE:
		case IRON_SHOVEL:
			Utils.achievement(p, "achievement_crafting_9", "Cerussite Age");
			break;
		case GOLDEN_AXE:
		case GOLDEN_PICKAXE:
		case GOLDEN_HOE:
		case GOLDEN_SHOVEL:
			Utils.achievement(p, "achievement_crafting_10", "Limonite Age");
			break;
		case DIAMOND_AXE:
		case DIAMOND_PICKAXE:
		case DIAMOND_HOE:
		case DIAMOND_SHOVEL:
			Utils.achievement(p, "achievement_crafting_11", "Azurite Age");
			break;
		case VILLAGER_SPAWN_EGG:
		case SHEEP_SPAWN_EGG:
		case CHICKEN_SPAWN_EGG:
		case HORSE_SPAWN_EGG:
		case DONKEY_SPAWN_EGG:
		case LLAMA_SPAWN_EGG:
			Utils.achievement(p, "achievement_crafting_12", "The Summoner");
			break;
		case REDSTONE:
			Utils.achievement(p, "achievement_crafting_13", "Mechanical Expert");
			break;
		case WHITE_BED:
			Utils.achievement(p, "achievement_crafting_14", "I'm Tired");
			break;
		case BREWING_STAND:
		case CAULDRON:
			Utils.achievement(p, "achievement_crafting_15", "I'm a Crazy Person");
			break;
		case REDSTONE_TORCH:
			Utils.achievement(p, "achievement_crafting_16", "Light");
			break;
		case TORCH:
			Utils.achievement(p, "achievement_crafting_17", "Super Light");
			break;
		case TNT:
			Utils.achievement(p, "achievement_crafting_18", "Boom!");
			break;
		case CARVED_PUMPKIN:
			Utils.achievement(p, "achievement_crafting_19", "They Will Never Find Me!");
			break;
		case ELYTRA:
			Utils.achievement(p, "achievement_crafting_20", "The God");
			break;
		default:
			break;
		}
	}
}
