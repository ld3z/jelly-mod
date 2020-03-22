package net.mcreator.jelly_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@Elementsjelly_mod.ModElement.Tag
public class MCreatorJellyHoe extends Elementsjelly_mod.ModElement {
	@ObjectHolder("jelly_mod:jellyhoe")
	public static final Item block = null;

	public MCreatorJellyHoe(Elementsjelly_mod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 4f, new Item.Properties().group(MCreatorModTab.tab)) {
		}.setRegistryName("jellyhoe"));
	}
}
