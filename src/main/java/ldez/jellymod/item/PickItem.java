
package ldez.jellymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import ldez.jellymod.itemgroup.ModTabItemGroup;
import ldez.jellymod.JellyModElements;

@JellyModElements.ModElement.Tag
public class PickItem extends JellyModElements.ModElement {
	@ObjectHolder("jellymod:pick")
	public static final Item block = null;
	public PickItem(JellyModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -1.2f, new Item.Properties().group(ModTabItemGroup.tab)) {
		}.setRegistryName("pick"));
	}
}
