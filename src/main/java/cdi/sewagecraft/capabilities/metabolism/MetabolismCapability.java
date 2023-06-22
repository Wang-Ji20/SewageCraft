package cdi.sewagecraft.capabilities.metabolism;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;

public class MetabolismCapability {
    public static final Capability<Metabolism> INSTANCE = CapabilityManager.get(new CapabilityToken<>() {});
}
