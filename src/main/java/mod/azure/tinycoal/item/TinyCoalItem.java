package mod.azure.tinycoal.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TinyCoalItem extends Item {

	public TinyCoalItem() {
		super(new Item.Properties().group(ItemGroup.MATERIALS));
	}

	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 200;
	}
}