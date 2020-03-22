package net.mcreator.jellymod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@Elementsjellymod.ModElement.Tag
public class MCreatorJellyBread extends Elementsjellymod.ModElement {
	@ObjectHolder("jellymod:jellybread")
	public static final Item block = null;

	public MCreatorJellyBread(Elementsjellymod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MCreatorModTab.tab).maxStackSize(5)
					.food((new Food.Builder()).hunger(10).saturation(0.300000011920929f).build()));
			setRegistryName("jellybread");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
