package net.mcreator.jellymod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@Elementsjellymod.ModElement.Tag
public class MCreatorJellyMeatHalf extends Elementsjellymod.ModElement {
	@ObjectHolder("jellymod:jellymeathalf")
	public static final Item block = null;

	public MCreatorJellyMeatHalf(Elementsjellymod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MCreatorModTab.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(6).saturation(0.300000011920929f).build()));
			setRegistryName("jellymeathalf");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
