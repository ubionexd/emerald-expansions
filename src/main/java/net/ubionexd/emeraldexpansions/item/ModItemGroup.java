package net.ubionexd.emeraldexpansions.item;

import net.ubionexd.emeraldexpansions.EmeraldExpansions;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup EMERALD_EXPANSIONS = FabricItemGroupBuilder.build(new Identifier(EmeraldExpansions.MOD_ID, "emerald_expansions"), () -> new ItemStack(ModItems.RAW_EMERALD));
}
