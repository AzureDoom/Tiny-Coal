package mod.azure.tinycoal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TinyCoalMod implements ModInitializer {

	public static final String MODID = "tinycoal";
	public static final Item TINY_COAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Item TINY_CHARCOAL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MODID, "tinycoal"), TINY_COAL);
		Registry.register(Registry.ITEM, new Identifier(MODID, "tinycharcoal"), TINY_CHARCOAL);
		FuelRegistry.INSTANCE.add(TINY_COAL, 200);
		FuelRegistry.INSTANCE.add(TINY_CHARCOAL, 200);
	}
}