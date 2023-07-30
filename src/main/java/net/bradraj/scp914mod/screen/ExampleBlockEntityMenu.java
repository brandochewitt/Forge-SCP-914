package net.bradraj.scp914mod.screen;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import org.jetbrains.annotations.Nullable;

public class ExampleBlockEntityMenu extends AbstractContainerMenu {
    public ExampleBlockEntityMenu(int pContainerId) {
        super(pMenuType, pContainerId);
    }
    public ExampleBlockEntityMenu(int pContainerId) {
        super(pMenuType, pContainerId);
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return false;
    }
}
