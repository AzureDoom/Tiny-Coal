package mod.azure.tinycoal;

import mod.azure.tinycoal.item.TinyCoalItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("tinycoal")
public class TinyCoalMod {

	public static final String MODID = "tinycoal";

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			TinyCoalMod.MODID);
	public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tinycoal", () -> new TinyCoalItem());
	public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tinycharcoal", () -> new TinyCoalItem());

	public TinyCoalMod() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		ITEMS.register(modEventBus);
	}
}