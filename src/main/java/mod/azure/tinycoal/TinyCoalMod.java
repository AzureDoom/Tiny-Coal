package mod.azure.tinycoal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TinyCoalMod implements ModInitializer {

	public static final String MODID = "tinycoal";
	public static final Item TINY_COAL = new Item(new Item.Settings());
	public static final Item TINY_CHARCOAL = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier(MODID, "tinycoal"), TINY_COAL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "tinycharcoal"), TINY_CHARCOAL);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(TINY_COAL));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> entries.add(TINY_CHARCOAL));
		FuelRegistry.INSTANCE.add(TINY_COAL, 200);
		FuelRegistry.INSTANCE.add(TINY_CHARCOAL, 200);
	}
}