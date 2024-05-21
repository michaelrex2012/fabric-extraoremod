package net.michael.eom.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.michael.eom.TutorialMod;
import net.michael.eom.block.ModBlocks;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<PackagingTable> PACKAGING_TABLE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TutorialMod.MOD_ID, "packaging_table_be"),
                    FabricBlockEntityTypeBuilder.create(PackagingTable::new,
                            ModBlocks.PACKAGING_TABLE).build());

}
