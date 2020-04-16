
package ldez.jellymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import ldez.jellymod.itemgroup.ModTabItemGroup;
import ldez.jellymod.JellyModElements;

@JellyModElements.ModElement.Tag
public class JellyMeatSlabItem extends JellyModElements.ModElement {
	@ObjectHolder("jellymod:jellymeatslab")
	public static final Item block = null;
	public JellyMeatSlabItem(JellyModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ModTabItemGroup.tab).maxStackSize(16)
					.food((new Food.Builder()).hunger(30).saturation(0.300000011920929f).build()));
			setRegistryName("jellymeatslab");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
