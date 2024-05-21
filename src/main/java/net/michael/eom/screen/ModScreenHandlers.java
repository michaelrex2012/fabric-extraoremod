package net.michael.eom.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.michael.eom.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PackagingTableScreenHandler> PACKAGING_TABLE_SCREEN_HANDLER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(TutorialMod.MOD_ID, "packaging_table"),
                    new ExtendedScreenHandlerType<>(PackagingTableScreenHandler::new));

    public static void registerScreenHandlers() {
        TutorialMod.LOGGER.info("Registering Screen Handlers for " + TutorialMod.MOD_ID);
    }
}