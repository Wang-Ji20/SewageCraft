package cdi.sewagecraft.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

public class TabSewage extends CreativeModeTab {
    public static final TabSewage INSTANCE = new TabSewage();
    private TabSewage() {
        super("sewage");
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(Items.REDSTONE);
    }
}
