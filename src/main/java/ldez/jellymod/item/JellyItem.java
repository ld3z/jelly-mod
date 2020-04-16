
package ldez.jellymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import ldez.jellymod.itemgroup.ModTabItemGroup;
import ldez.jellymod.JellyModElements;

@JellyModElements.ModElement.Tag
public class JellyItem extends JellyModElements.ModElement {
	@ObjectHolder("jellymod:jelly")
	public static final Item block = null;
	public JellyItem(JellyModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ModTabItemGroup.tab).maxStackSize(32));
			setRegistryName("jelly");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
