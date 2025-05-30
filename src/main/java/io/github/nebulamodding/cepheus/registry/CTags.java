package io.github.nebulamodding.cepheus.registry;

import io.github.nebulamodding.cepheus.Cepheus;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CTags {
    public static TagKey<Block> commonBlockTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
    public static TagKey<Item> commonItemTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
    public static TagKey<Block> blockTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Cepheus.MOD_ID, name));
    }
    public static TagKey<Item> itemTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Cepheus.MOD_ID, name));
    }
    public static class EUBlockTags {
        // Blocks
        public static final TagKey<Block>

                /*
                Common Tags
                 */

                // Cobblestones
                COBBLESTONES_BLUESCHIST = commonBlockTag("cobblestones/blueschist"),
                COBBLESTONES_BLUE_SHALE = commonBlockTag("cobblestones/blue_shale"),

                // Ore Bearing Ground
                ORE_BEARING_GROUND_BLUESCHIST = commonBlockTag("ore_bearing_ground/blueschist"),
                ORE_BEARING_GROUND_BLUE_SHALE = commonBlockTag("ore_bearing_ground/blue_shale"),
                ORE_BEARING_GROUND_WATER_ICE = commonBlockTag("ore_bearing_ground/water_ice"),
                ORE_BEARING_GROUND_METHANE_ICE = commonBlockTag("ore_bearing_ground/methane_ice"),
                ORE_BEARING_GROUND_NITROGEN_ICE = commonBlockTag("ore_bearing_ground/nitrogen_ice"),
                ORE_BEARING_GROUND_OXYGEN_ICE = commonBlockTag("ore_bearing_ground/oxygen_ice"),

                // Ores In Ground
                ORES_IN_GROUND_BLUESCHIST = commonBlockTag("ores_in_ground/blueschist"),
                ORES_IN_GROUND_BLUE_SHALE = commonBlockTag("ores_in_ground/blue_shale"),
                ORES_IN_GROUND_WATER_ICE = commonBlockTag("ores_in_ground/water_ice"),
                ORES_IN_GROUND_METHANE_ICE = commonBlockTag("ores_in_ground/methane_ice"),
                ORES_IN_GROUND_NITROGEN_ICE = commonBlockTag("ores_in_ground/nitrogen_ice"),
                ORES_IN_GROUND_OXYGEN_ICE = commonBlockTag("ores_in_ground/oxygen_ice"),

                // Ore Blocks
                ORES_OBDURIUM = commonBlockTag("ores/obdurium"),
                ORES_MALUNITE = commonBlockTag("ores/malunite"),
                ORES_LUTRUM = commonBlockTag("ores/lutrum"),

                // Storage Blocks
                STORAGE_BLOCKS_BRUMA = commonBlockTag("storage_blocks/bruma"),
                STORAGE_BLOCKS_OBDURIUM = commonBlockTag("storage_blocks/obdurium"),
                STORAGE_BLOCKS_MALUNITE = commonBlockTag("storage_blocks/malunite"),
                STORAGE_BLOCKS_LUTRUM = commonBlockTag("storage_blocks/lutrum"),
                STORAGE_BLOCKS_RAW_OBDURIUM = commonBlockTag("storage_blocks/raw_obdurium"),
                STORAGE_BLOCKS_RAW_MALUNITE = commonBlockTag("storage_blocks/raw_malunite"),
                STORAGE_BLOCKS_RAW_LUTRUM = commonBlockTag("storage_blocks/raw_lutrum"),

                /*
                Cepheus Tags
                 */

                // Needs Tools
                NEEDS_OBDURIUM_TOOL = blockTag("needs_obdurium_tool"),
                NEEDS_MALUNITE_TOOL = blockTag("needs_malunite_tool"),
                NEEDS_LUTRUM_TOOL = blockTag("needs_lutrum_tool"),

                // Base Stones
                BASE_STONE_FRIGUS = blockTag("base_stone_frigus"),

                // Carver Replacables
                FRIGUS_CARVER_REPLACEABLES = blockTag("frigus_carver_replaceables"),

                // Ore Replacables
                BLUESCHIST_ORE_REPLACEABLES = blockTag("blueschist_ore_replaceables"),
                BLUE_SHALE_ORE_REPLACEABLES = blockTag("blue_shale_ore_replaceables"),

                // Convertable to Mud
                CONVERTABLE_TO_FRIGUS_MUD = blockTag("convertable_to_frigus_mud"),

                // Logs
                MAYURA_LOGS = blockTag("mayura_logs"),
                GRIMWOOD_LOGS = blockTag("grimwood_logs")
        ;
    }
    public static class EUItemTags {
        // Block Items
        public static final TagKey<Item>
                // Cobblestones
                COBBLESTONES_BLUESCHIST = commonItemTag("cobblestones/blueschist"),
                COBBLESTONES_BLUE_SHALE = commonItemTag("cobblestones/blue_shale"),

                // Ore Bearing Ground
                ORE_BEARING_GROUND_BLUESCHIST = commonItemTag("ore_bearing_ground/blueschist"),
                ORE_BEARING_GROUND_BLUE_SHALE = commonItemTag("ore_bearing_ground/blue_shale"),
                ORE_BEARING_GROUND_WATER_ICE = commonItemTag("ore_bearing_ground/water_ice"),
                ORE_BEARING_GROUND_METHANE_ICE = commonItemTag("ore_bearing_ground/methane_ice"),
                ORE_BEARING_GROUND_NITROGEN_ICE = commonItemTag("ore_bearing_ground/nitrogen_ice"),
                ORE_BEARING_GROUND_OXYGEN_ICE = commonItemTag("ore_bearing_ground/oxygen_ice"),

                // Ores In Ground
                ORES_IN_GROUND_BLUESCHIST = commonItemTag("ores_in_ground/blueschist"),
                ORES_IN_GROUND_BLUE_SHALE = commonItemTag("ores_in_ground/blue_shale"),
                ORES_IN_GROUND_WATER_ICE = commonItemTag("ores_in_ground/water_ice"),
                ORES_IN_GROUND_METHANE_ICE = commonItemTag("ores_in_ground/methane_ice"),
                ORES_IN_GROUND_NITROGEN_ICE = commonItemTag("ores_in_ground/nitrogen_ice"),
                ORES_IN_GROUND_OXYGEN_ICE = commonItemTag("ores_in_ground/oxygen_ice"),

                // Ore Blocks
                ORES_OBDURIUM = commonItemTag("ores/obdurium"),
                ORES_MALUNITE = commonItemTag("ores/malunite"),
                ORES_LUTRUM = commonItemTag("ores/lutrum"),

                // Storage Blocks
                STORAGE_BLOCKS_BRUMA = commonItemTag("storage_blocks/bruma"),
                STORAGE_BLOCKS_OBDURIUM = commonItemTag("storage_blocks/obdurium"),
                STORAGE_BLOCKS_MALUNITE = commonItemTag("storage_blocks/malunite"),
                STORAGE_BLOCKS_LUTRUM = commonItemTag("storage_blocks/lutrum"),
                STORAGE_BLOCKS_RAW_OBDURIUM = commonItemTag("storage_blocks/raw_obdurium"),
                STORAGE_BLOCKS_RAW_MALUNITE = commonItemTag("storage_blocks/raw_malunite"),
                STORAGE_BLOCKS_RAW_LUTRUM = commonItemTag("storage_blocks/raw_lutrum"),

                /*
                Cepheus Tags
                 */

                // Logs
                MAYURA_LOGS = itemTag("mayura_logs"),
                GRIMWOOD_LOGS = itemTag("grimwood_logs")
        ;
        // Items
        public static final TagKey<Item>
                // Adds a plates tag because neoforge doesn't have a common tag for it by default
                PLATES = commonItemTag("plates"),

                RAW_MATERIALS_OBDURIUM = commonItemTag("raw_material/obdurium"),
                NUGGETS_OBDURIUM = commonItemTag("nuggets/obdurium"),
                INGOTS_OBDURIUM = commonItemTag("ingots/obdurium"),
                PLATES_OBDURIUM = commonItemTag("plates/obdurium"),
                RODS_OBDURIUM = commonItemTag("rods/obdurium"),

                RAW_MATERIALS_MALUNITE = commonItemTag("raw_material/malunite"),
                NUGGETS_MALUNITE = commonItemTag("nuggets/malunite"),
                INGOTS_MALUNITE = commonItemTag("ingots/malunite"),
                PLATES_MALUNITE = commonItemTag("plates/malunite"),
                RODS_MALUNITE = commonItemTag("rods/malunite"),

                RAW_MATERIALS_LUTRUM = commonItemTag("raw_material/lutrum"),
                NUGGETS_LUTRUM = commonItemTag("nuggets/lutrum"),
                INGOTS_LUTRUM = commonItemTag("ingots/lutrum"),
                PLATES_LUTRUM = commonItemTag("plates/lutrum"),
                RODS_LUTRUM = commonItemTag("rods/lutrum")
        ;
    }
}