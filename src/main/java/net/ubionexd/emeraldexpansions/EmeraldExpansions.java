package net.ubionexd.emeraldexpansions;

import net.ubionexd.emeraldexpansions.block.ModBlocks;
import net.ubionexd.emeraldexpansions.item.ModItems;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmeraldExpansions implements ModInitializer {
    public static final String MOD_ID = "emeraldexpansions";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
