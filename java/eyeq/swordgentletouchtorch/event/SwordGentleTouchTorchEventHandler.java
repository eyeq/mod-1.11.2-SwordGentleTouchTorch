package eyeq.swordgentletouchtorch.event;

import net.minecraft.block.BlockTorch;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SwordGentleTouchTorchEventHandler {
    @SubscribeEvent
    public void onBreak(BreakSpeed event) {
        ItemStack itemStack = event.getEntityPlayer().getHeldItemMainhand();
        if(itemStack.getItem() instanceof ItemSword && event.getState().getBlock() instanceof BlockTorch) {
            event.setNewSpeed(0.0F);
        }
    }
}
