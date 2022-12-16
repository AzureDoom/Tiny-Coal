package mod.azure.tinycoal;

import mod.azure.tinycoal.item.TinyCoalItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("tinycoal")
public class TinyCoalMod {

	public static final String MODID = "tinycoal";
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tinycoal", () -> new TinyCoalItem());
	public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tinycharcoal", () -> new TinyCoalItem());

	public TinyCoalMod() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		ITEMS.register(modEventBus);
		modEventBus.addListener(this::addCreativeTabs);
	}

	public void addCreativeTabs(final CreativeModeTabEvent.BuildContents event) {
		if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
			event.accept(TINY_COAL.get());
			event.accept(TINY_CHARCOAL.get());
		}
	}
}