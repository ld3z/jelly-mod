package net.mcreator.jelly_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsjelly_mod.ModElement.Tag
public class MCreatorJelly extends Elementsjelly_mod.ModElement {
	@ObjectHolder("jelly_mod:jelly")
	public static final Item block = null;

	public MCreatorJelly(Elementsjelly_mod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorModTab.tab).maxStackSize(32));
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
