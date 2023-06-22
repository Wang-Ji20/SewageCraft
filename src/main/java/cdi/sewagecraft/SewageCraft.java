package cdi.sewagecraft;

import cdi.sewagecraft.loaders.ItemLoader;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SewageCraft.MODID)
public class SewageCraft
{
    public static final String MODID = "sewagecraft";

    public SewageCraft() {
        ItemLoader.registerAll();
    }
}
