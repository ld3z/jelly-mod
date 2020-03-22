package net.mcreator.jelly_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@Elementsjelly_mod.ModElement.Tag
public class MCreatorAxe extends Elementsjelly_mod.ModElement {
	@ObjectHolder("jelly_mod:axe")
	public static final Item block = null;

	public MCreatorAxe(Elementsjelly_mod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 1, -1.2F, new Item.Properties().group(MCreatorModTab.tab)) {
		}.setRegistryName("axe"));
	}
}
