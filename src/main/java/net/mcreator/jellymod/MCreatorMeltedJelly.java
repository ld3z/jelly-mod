package net.mcreator.jellymod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsjellymod.ModElement.Tag
public class MCreatorMeltedJelly extends Elementsjellymod.ModElement {
	@ObjectHolder("jellymod:meltedjelly")
	public static final Item block = null;

	public MCreatorMeltedJelly(Elementsjellymod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorModTab.tab).maxStackSize(32));
			setRegistryName("meltedjelly");
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
