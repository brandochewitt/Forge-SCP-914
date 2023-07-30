package net.bradraj.scp914mod.block.entity;

import net.bradraj.scp914mod.SCP914Mod;
import net.bradraj.scp914mod.block.ModBlocks;
import net.bradraj.scp914mod.block.entity.custom.ExampleBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, SCP914Mod.MOD_ID);


    public static final RegistryObject<BlockEntityType<ExampleBlockEntity>> EXAMPLE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("example_block_entity", () -> BlockEntityType.Builder.of(ExampleBlockEntity::new, ModBlocks.EXAMPLE_ENTITY.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
