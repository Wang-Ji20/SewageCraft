package cdi.sewagecraft.loaders;

import cdi.sewagecraft.SewageCraft;
import cdi.sewagecraft.items.DebugStick;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemLoader {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SewageCraft.MODID);

    @SuppressWarnings("unused")
    public static final RegistryObject<Item> DEBUG_STICK = ITEMS.register("debug_stick", DebugStick::new);

    public static void registerAll() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
