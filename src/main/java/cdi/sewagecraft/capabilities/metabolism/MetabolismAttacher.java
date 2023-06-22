package cdi.sewagecraft.capabilities.metabolism;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class MetabolismAttacher {
    @SubscribeEvent
    public static void onAttach(AttachCapabilitiesEvent<Entity> event) {
        var entity = event.getObject();
        if (entity instanceof Player) {
           event.addCapability(MetabolismProvider.NAME, new MetabolismProvider());
        }
    }

    @SubscribeEvent
    public static void onPlayerClone(PlayerEvent.Clone event) {
        if(!event.isWasDeath()) {
            var oldCap = event.getOriginal().getCapability(MetabolismCapability.INSTANCE);
            var newCap = event.getEntity().getCapability(MetabolismCapability.INSTANCE);
            oldCap.ifPresent((new2) -> newCap.ifPresent((old2) -> new2.deserializeNBT(old2.serializeNBT())));
        }
    }
}
