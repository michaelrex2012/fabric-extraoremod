package net.michael.eom.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.michael.eom.block.ModBlocks;
import net.michael.eom.world.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGenerator {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RUBY_ORE_PLACED_KEY);
    }
}
