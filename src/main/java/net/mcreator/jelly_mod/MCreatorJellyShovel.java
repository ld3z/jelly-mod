package net.mcreator.jelly_mod;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@Elementsjelly_mod.ModElement.Tag
public class MCreatorJellyShovel extends Elementsjelly_mod.ModElement {
	@ObjectHolder("jelly_mod:jellyshovel")
	public static final Item block = null;

	public MCreatorJellyShovel(Elementsjelly_mod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 13f;
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
		}, 1, -1.2F, new Item.Properties().group(MCreatorModTab.tab)) {
		}.setRegistryName("jellyshovel"));
	}
}
