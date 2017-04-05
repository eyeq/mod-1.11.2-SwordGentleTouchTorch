package eyeq.swordgentletouchtorch;

import eyeq.swordgentletouchtorch.event.SwordGentleTouchTorchEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static eyeq.swordgentletouchtorch.SwordGentleTouchTorch.MOD_ID;

@Mod(modid = MOD_ID, version = "1.0", dependencies = "after:eyeq_util")
public class SwordGentleTouchTorch {
    public static final String MOD_ID = "eyeq_swordgentletouchtorch";

    @Mod.Instance(MOD_ID)
    public static SwordGentleTouchTorch instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new SwordGentleTouchTorchEventHandler());
    }
}
