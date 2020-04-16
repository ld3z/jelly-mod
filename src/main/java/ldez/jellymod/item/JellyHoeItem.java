
package ldez.jellymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import ldez.jellymod.itemgroup.ModTabItemGroup;
import ldez.jellymod.JellyModElements;

@JellyModElements.ModElement.Tag
public class JellyHoeItem extends JellyModElements.ModElement {
	@ObjectHolder("jellymod:jellyhoe")
	public static final Item block = null;
	public JellyHoeItem(JellyModElements instance) {
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
				return Ingredient.EMPTY;
			}
		}, -1.2f, new Item.Properties().group(ModTabItemGroup.tab)) {
		}.setRegistryName("jellyhoe"));
	}
}
