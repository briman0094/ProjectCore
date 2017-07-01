package com.gmail.trentech.pjc.core;

import java.util.Map.Entry;
import java.util.Optional;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.DataContainer;
import org.spongepowered.api.data.DataQuery;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.item.recipe.crafting.Ingredient;
import org.spongepowered.api.item.recipe.crafting.ShapedCraftingRecipe;
import org.spongepowered.api.item.recipe.crafting.ShapedCraftingRecipe.Builder;
import org.spongepowered.api.item.recipe.crafting.ShapedCraftingRecipe.Builder.RowsStep;

import com.gmail.trentech.pjc.Main;
import com.gmail.trentech.pjc.utils.InvalidItemTypeException;

import ninja.leaping.configurate.ConfigurationNode;

public class RecipeManager {

	public static void register(ConfigurationNode node, ItemStack itemStack) {
		Main.instance().getLog().info("Registering recipe for " + itemStack.getTranslation().get());

//		try {
//			Sponge.getRegistry().getCraftingRecipeRegistry().register(getShapedRecipe(node, itemStack));
//		} catch (InvalidItemTypeException e) {
//			e.printStackTrace();
//		}
	}

//	public static ShapedCraftingRecipe getShapedRecipe(ConfigurationNode node, ItemStack result) throws InvalidItemTypeException {
//		RowsStep builder = ShapedCraftingRecipe.builder().rows();
//
//		for (Entry<Object, ? extends ConfigurationNode> child : node.getChildrenMap().entrySet()) {
//			ConfigurationNode childNode = child.getValue();
//
//			String key = childNode.getKey().toString();
//
//			if (key.equals("enable") || key.equals("result")) {
//				continue;
//			} else if (key.equals("grid_size")) {
//				String[] size = childNode.getString().split("x");
//
//				builder.dimensions(new Vector2i(Integer.parseInt(size[0]), Integer.parseInt(size[1])));
//			} else {
//				String itemId = childNode.getString();
//				String[] args = itemId.split(":");
//
//				Optional<ItemType> optionalItemType = Sponge.getRegistry().getType(ItemType.class, itemId);
//
//				if (optionalItemType.isPresent()) {
//					ItemStack itemStack = ItemStack.builder().itemType(optionalItemType.get()).build();
//
//					if (args.length == 3) {
//						DataContainer container = itemStack.toContainer();
//						DataQuery query = DataQuery.of('/', "UnsafeDamage");
//						container.set(query, Integer.parseInt(args[2]));
//						itemStack.setRawData(container);
//					}
//
//					String[] grid = key.split("x");
//					builder.row(Ingredient.builder().with(itemStack).build()).result(result);
//					builder.ingredient(new Vector2i(Integer.parseInt(grid[0]), Integer.parseInt(grid[1])), itemStack);
//				} else {
//					throw new InvalidItemTypeException("ItemType in config.conf at " + childNode.getKey().toString() + " is invalid");
//				}
//			}
//		}
//		
//		return builder.r.result(result);
//	}
}
