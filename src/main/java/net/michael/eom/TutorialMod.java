package net.michael.eom;

import net.fabricmc.api.ModInitializer;

import net.michael.eom.block.ModBlocks;
import net.michael.eom.item.ModItemGroups;
import net.michael.eom.item.ModItems;
import net.michael.eom.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "eom";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}