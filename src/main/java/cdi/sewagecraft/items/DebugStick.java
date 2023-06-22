package cdi.sewagecraft.items;

import cdi.sewagecraft.capabilities.metabolism.MetabolismCapability;
import cdi.sewagecraft.tab.TabSewage;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import org.jetbrains.annotations.NotNull;

public class DebugStick extends Item {
    public DebugStick() {
        super(new Properties().tab(TabSewage.INSTANCE));
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext pContext) {

        if(!pContext.getLevel().isClientSide) {
            var player = pContext.getPlayer();
            if(player == null) {
                return super.useOn(pContext);
            }
            var cap = player.getCapability(MetabolismCapability.INSTANCE);
            cap.ifPresent((value) -> player.sendSystemMessage(Component.literal(String.valueOf(value.getCarbohydrates().getValue()))));
        }
        return super.useOn(pContext);
    }
}
