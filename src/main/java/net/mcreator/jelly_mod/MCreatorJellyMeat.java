package net.mcreator.jelly_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@Elementsjelly_mod.ModElement.Tag
public class MCreatorJellyMeat extends Elementsjelly_mod.ModElement {
	@ObjectHolder("jelly_mod:jellymeat")
	public static final Item block = null;

	public MCreatorJellyMeat(Elementsjelly_mod instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MCreatorModTab.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(8).saturation(0.300000011920929f).build()));
			setRegistryName("jellymeat");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
