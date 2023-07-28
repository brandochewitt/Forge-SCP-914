package net.bradraj.scp914mod.item;

import net.bradraj.scp914mod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SCP_TAB = new CreativeModeTab("scptab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SCP500PILL.get());
        }
    };
}
