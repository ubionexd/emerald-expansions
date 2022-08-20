package net.ubionexd.emeraldexpansions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.ubionexd.emeraldexpansions.EmeraldExpansions;
import net.ubionexd.emeraldexpansions.item.custom.ModHoeItem;

public class ModItems {
    // Emerald items
    public static final Item EMERALD_INGOT = registerItem("emerald_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));

    public static final Item RAW_EMERALD = registerItem("raw_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));


    // Emerald armor
    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));

    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));

    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));

    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));


    // Emerald tools
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new SwordItem(ModToolMaterials.EMERALD, 3, -2.2f,
                    new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));

    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new AxeItem(ModToolMaterials.EMERALD, 5, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));

    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new PickaxeItem(ModToolMaterials.EMERALD, 1, -2.6f,
                    new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));

    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterials.EMERALD, 2, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));

    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new ModHoeItem(ModToolMaterials.EMERALD, -3, 0.2f,
                    new FabricItemSettings().group(ModItemGroup.EMERALD_EXPANSIONS)));



    // Registry
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EmeraldExpansions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EmeraldExpansions.LOGGER.debug("Registering ModItems for " + EmeraldExpansions.MOD_ID);
    }

}
