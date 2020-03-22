package net.mcreator.jelly_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementsjelly_mod.ModElement.Tag
public class MCreatorSword extends Elementsjelly_mod.ModElement {
	@ObjectHolder("jelly_mod:sword")
	public static final Item block = null;

	public MCreatorSword(Elementsjelly_mod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
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
		}, 3, -1.2F, new Item.Properties().group(MCreatorModTab.tab)) {
		}.setRegistryName("sword"));
	}
}
