package io.github.nebulamodding.cepheus.datagen.data.tags;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import io.github.nebulamodding.cepheus.registry.CTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CBlockTagsProvider extends BlockTagsProvider {
    public CBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Cepheus.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // Lists with collections of blocks with multiple of the same tag to save on lines of code and make this file more readable
        final List<DeferredBlock<? extends Block>> blueschistOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> blueShaleOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> waterIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> methaneIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> nitrogenIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> oxygenIceOres = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeStairs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeSlabs = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> pickaxeWalls = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stonePressurePlates = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> stoneButtons = new ArrayList<>();
        final List<DeferredBlock<? extends Block>> ices = new ArrayList<>();
        // Ores
        blueschistOres.add(CBlocks.BLUESCHIST_COAL_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_IRON_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_COPPER_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_GOLD_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_REDSTONE_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_EMERALD_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_LAPIS_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_DIAMOND_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_OBDURIUM_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_MALUNITE_ORE);
        blueschistOres.add(CBlocks.BLUESCHIST_LUTRUM_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_COAL_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_IRON_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_COPPER_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_GOLD_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_REDSTONE_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_EMERALD_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_LAPIS_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_DIAMOND_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_OBDURIUM_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_MALUNITE_ORE);
        blueShaleOres.add(CBlocks.BLUE_SHALE_LUTRUM_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_COAL_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_IRON_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_COPPER_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_GOLD_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_REDSTONE_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_EMERALD_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_LAPIS_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_DIAMOND_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_OBDURIUM_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_MALUNITE_ORE);
        waterIceOres.add(CBlocks.WATER_ICE_LUTRUM_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_COAL_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_IRON_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_COPPER_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_GOLD_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_REDSTONE_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_EMERALD_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_LAPIS_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_DIAMOND_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_MALUNITE_ORE);
        nitrogenIceOres.add(CBlocks.NITROGEN_ICE_LUTRUM_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_COAL_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_IRON_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_COPPER_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_GOLD_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_REDSTONE_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_EMERALD_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_LAPIS_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_DIAMOND_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_MALUNITE_ORE);
        oxygenIceOres.add(CBlocks.OXYGEN_ICE_LUTRUM_ORE);
        // Frigus Mud
        pickaxeStairs.add(CBlocks.FRIGUS_MUD_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.FRIGUS_MUD_BRICK_SLAB);
        pickaxeWalls.add(CBlocks.FRIGUS_MUD_BRICK_WALL);
        // Frigus Stone
        pickaxeStairs.add(CBlocks.BLUESCHIST_STAIRS);
        pickaxeStairs.add(CBlocks.FRIGUS_COBBLESTONE_STAIRS);
        pickaxeStairs.add(CBlocks.POLISHED_BLUESCHIST_STAIRS);
        pickaxeStairs.add(CBlocks.BLUESCHIST_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_slab"));
        pickaxeSlabs.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("cobbled_blueschist_slab"));
        pickaxeSlabs.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("polished_blueschist_slab"));
        pickaxeSlabs.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_slab"));
        pickaxeWalls.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_wall"));
        pickaxeWalls.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("cobbled_blueschist_wall"));
        pickaxeWalls.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("polished_blueschist_wall"));
        pickaxeWalls.add(CBlocks.BLUESCHIST_BLOCKS_CONTINUED.get("blueschist_brick_wall"));
        stonePressurePlates.add(CBlocks.BLUESCHIST_PRESSURE_PLATE);
        stoneButtons.add(CBlocks.BLUESCHIST_BUTTON);
        // Frigus Deepslate
        pickaxeStairs.add(CBlocks.BLUE_SHALE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_BLUE_SHALE_STAIRS);
        pickaxeStairs.add(CBlocks.POLISHED_BLUE_SHALE_STAIRS);
        pickaxeStairs.add(CBlocks.BLUE_SHALE_BRICK_STAIRS);
        pickaxeStairs.add(CBlocks.BLUE_SHALE_TILE_STAIRS);
        pickaxeSlabs.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_slab"));
        pickaxeSlabs.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("cobbled_blue_shale_slab"));
        pickaxeSlabs.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("polished_blue_shale_slab"));
        pickaxeSlabs.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_brick_slab"));
        pickaxeSlabs.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_tile_slab"));
        pickaxeWalls.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_wall"));
        pickaxeWalls.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("cobbled_blue_shale_wall"));
        pickaxeWalls.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("polished_blue_shale_wall"));
        pickaxeWalls.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_brick_wall"));
        pickaxeWalls.add(CBlocks.BLUE_SHALE_BLOCKS_CONTINUED.get("blue_shale_tile_wall"));
        // Permafrost
        pickaxeStairs.add(CBlocks.PERMAFROST_STAIRS);
        pickaxeStairs.add(CBlocks.POLISHED_PERMAFROST_STAIRS);
        pickaxeStairs.add(CBlocks.PERMAFROST_BRICK_STAIRS);
        pickaxeStairs.add(CBlocks.PERMAFROST_TILE_STAIRS);
        pickaxeSlabs.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_slab"));
        pickaxeSlabs.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("polished_permafrost_slab"));
        pickaxeSlabs.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_slab"));
        pickaxeSlabs.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_slab"));
        pickaxeWalls.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_wall"));
        pickaxeWalls.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("polished_permafrost_wall"));
        pickaxeWalls.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_brick_wall"));
        pickaxeWalls.add(CBlocks.PERMAFROST_BLOCKS_CONTINUED.get("permafrost_tile_wall"));
        // Ices
        ices.add(CBlocks.WATER_ICE_BLOCKS.get("water_ice"));
        ices.add(CBlocks.WATER_ICE_BLOCKS.get("cobbled_water_ice"));
        ices.add(CBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks"));
        ices.add(CBlocks.WATER_ICE_BLOCKS.get("cracked_water_ice_bricks"));
        ices.add(CBlocks.WATER_ICE_BLOCKS.get("water_ice_pillar"));
        pickaxeStairs.add(CBlocks.WATER_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_WATER_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.WATER_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_slab"));
        pickaxeSlabs.add(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("cobbled_water_ice_slab"));
        pickaxeSlabs.add(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_wall"));
        pickaxeWalls.add(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("cobbled_water_ice_wall"));
        pickaxeWalls.add(CBlocks.WATER_ICE_BLOCKS_CONTINUED.get("water_ice_brick_wall"));
        ices.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice"));
        ices.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_cobbled_water_ice"));
        ices.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks"));
        ices.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_cracked_water_ice_bricks"));
        ices.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_pillar"));
        pickaxeStairs.add(CBlocks.THOLIN_POOR_WATER_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_POOR_COBBLED_WATER_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_POOR_WATER_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_cobbled_water_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_cobbled_water_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED.get("tholin_poor_water_ice_brick_wall"));
        ices.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice"));
        ices.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_cobbled_water_ice"));
        ices.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks"));
        ices.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_cracked_water_ice_bricks"));
        ices.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_pillar"));
        pickaxeStairs.add(CBlocks.THOLIN_RICH_WATER_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_RICH_COBBLED_WATER_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_RICH_WATER_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_cobbled_water_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_cobbled_water_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED.get("tholin_rich_water_ice_brick_wall"));
        ices.add(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice"));
        ices.add(CBlocks.BLACK_WATER_ICE_BLOCKS.get("cobbled_black_water_ice"));
        ices.add(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks"));
        ices.add(CBlocks.BLACK_WATER_ICE_BLOCKS.get("cracked_black_water_ice_bricks"));
        ices.add(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_pillar"));
        pickaxeStairs.add(CBlocks.BLACK_WATER_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_BLACK_WATER_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.BLACK_WATER_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_slab"));
        pickaxeSlabs.add(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("cobbled_black_water_ice_slab"));
        pickaxeSlabs.add(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_wall"));
        pickaxeWalls.add(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("cobbled_black_water_ice_wall"));
        pickaxeWalls.add(CBlocks.BLACK_WATER_ICE_BLOCKS_CONTINUED.get("black_water_ice_brick_wall"));
        ices.add(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice"));
        ices.add(CBlocks.METHANE_ICE_BLOCKS.get("cobbled_methane_ice"));
        ices.add(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks"));
        ices.add(CBlocks.METHANE_ICE_BLOCKS.get("cracked_methane_ice_bricks"));
        ices.add(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice_pillar"));
        pickaxeStairs.add(CBlocks.METHANE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_METHANE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.METHANE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_slab"));
        pickaxeSlabs.add(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("cobbled_methane_ice_slab"));
        pickaxeSlabs.add(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_wall"));
        pickaxeWalls.add(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("cobbled_methane_ice_wall"));
        pickaxeWalls.add(CBlocks.METHANE_ICE_BLOCKS_CONTINUED.get("methane_ice_brick_wall"));
        ices.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice"));
        ices.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_cobbled_methane_ice"));
        ices.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks"));
        ices.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_cracked_methane_ice_bricks"));
        ices.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_pillar"));
        pickaxeStairs.add(CBlocks.THOLIN_POOR_METHANE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_POOR_COBBLED_METHANE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_POOR_METHANE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_cobbled_methane_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_cobbled_methane_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_poor_methane_ice_brick_wall"));
        ices.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice"));
        ices.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_cobbled_methane_ice"));
        ices.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks"));
        ices.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_cracked_methane_ice_bricks"));
        ices.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_pillar"));
        pickaxeStairs.add(CBlocks.THOLIN_RICH_METHANE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_RICH_COBBLED_METHANE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_RICH_METHANE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_cobbled_methane_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_cobbled_methane_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED.get("tholin_rich_methane_ice_brick_wall"));
        ices.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice"));
        ices.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_carbon_dioxide_ice"));
        ices.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks"));
        ices.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("cracked_carbon_dioxide_ice_bricks"));
        ices.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_pillar"));
        pickaxeStairs.add(CBlocks.CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_wall"));
        pickaxeWalls.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("carbon_dioxide_ice_brick_wall"));
        ices.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice"));
        ices.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_cobbled_carbon_dioxide_ice"));
        ices.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks"));
        ices.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_cracked_carbon_dioxide_ice_bricks"));
        ices.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_pillar"));
        pickaxeStairs.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_POOR_COBBLED_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_cobbled_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_cobbled_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_poor_carbon_dioxide_ice_brick_wall"));
        ices.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice"));
        ices.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_cobbled_carbon_dioxide_ice"));
        ices.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks"));
        ices.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_cracked_carbon_dioxide_ice_bricks"));
        ices.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_pillar"));
        pickaxeStairs.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_RICH_COBBLED_CARBON_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_cobbled_carbon_dioxide_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_cobbled_carbon_dioxide_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED.get("tholin_rich_carbon_dioxide_ice_brick_wall"));
        ices.add(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice"));
        ices.add(CBlocks.AMMONIA_ICE_BLOCKS.get("cobbled_ammonia_ice"));
        ices.add(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks"));
        ices.add(CBlocks.AMMONIA_ICE_BLOCKS.get("cracked_ammonia_ice_bricks"));
        ices.add(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_pillar"));
        pickaxeStairs.add(CBlocks.AMMONIA_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_AMMONIA_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.AMMONIA_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_slab"));
        pickaxeSlabs.add(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("cobbled_ammonia_ice_slab"));
        pickaxeSlabs.add(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_wall"));
        pickaxeWalls.add(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("cobbled_ammonia_ice_wall"));
        pickaxeWalls.add(CBlocks.AMMONIA_ICE_BLOCKS_CONTINUED.get("ammonia_ice_brick_wall"));
        ices.add(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice"));
        ices.add(CBlocks.NITROGEN_ICE_BLOCKS.get("cobbled_nitrogen_ice"));
        ices.add(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks"));
        ices.add(CBlocks.NITROGEN_ICE_BLOCKS.get("cracked_nitrogen_ice_bricks"));
        ices.add(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_pillar"));
        pickaxeStairs.add(CBlocks.NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.NITROGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_slab"));
        pickaxeSlabs.add(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_nitrogen_ice_slab"));
        pickaxeSlabs.add(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_wall"));
        pickaxeWalls.add(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_nitrogen_ice_wall"));
        pickaxeWalls.add(CBlocks.NITROGEN_ICE_BLOCKS_CONTINUED.get("nitrogen_ice_brick_wall"));
        ices.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice"));
        ices.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_cobbled_nitrogen_ice"));
        ices.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks"));
        ices.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_cracked_nitrogen_ice_bricks"));
        ices.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_pillar"));
        pickaxeStairs.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_POOR_COBBLED_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_cobbled_nitrogen_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_cobbled_nitrogen_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_poor_nitrogen_ice_brick_wall"));
        ices.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice"));
        ices.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_cobbled_nitrogen_ice"));
        ices.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks"));
        ices.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_cracked_nitrogen_ice_bricks"));
        ices.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_pillar"));
        pickaxeStairs.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_RICH_COBBLED_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_cobbled_nitrogen_ice_slab"));
        pickaxeSlabs.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_cobbled_nitrogen_ice_wall"));
        pickaxeWalls.add(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED.get("tholin_rich_nitrogen_ice_brick_wall"));
        ices.add(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice"));
        ices.add(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("cobbled_red_nitrogen_ice"));
        ices.add(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks"));
        ices.add(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("cracked_red_nitrogen_ice_bricks"));
        ices.add(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_pillar"));
        pickaxeStairs.add(CBlocks.RED_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_RED_NITROGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.RED_NITROGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_slab"));
        pickaxeSlabs.add(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_red_nitrogen_ice_slab"));
        pickaxeSlabs.add(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_wall"));
        pickaxeWalls.add(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("cobbled_red_nitrogen_ice_wall"));
        pickaxeWalls.add(CBlocks.RED_NITROGEN_ICE_BLOCKS_CONTINUED.get("red_nitrogen_ice_brick_wall"));
        ices.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice"));
        ices.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("cobbled_sulfur_dioxide_ice"));
        ices.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks"));
        ices.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("cracked_sulfur_dioxide_ice_bricks"));
        ices.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_pillar"));
        pickaxeStairs.add(CBlocks.SULFUR_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_SULFUR_DIOXIDE_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.SULFUR_DIOXIDE_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_slab"));
        pickaxeSlabs.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_sulfur_dioxide_ice_slab"));
        pickaxeSlabs.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_wall"));
        pickaxeWalls.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("cobbled_sulfur_dioxide_ice_wall"));
        pickaxeWalls.add(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED.get("sulfur_dioxide_ice_brick_wall"));
        ices.add(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice"));
        ices.add(CBlocks.OXYGEN_ICE_BLOCKS.get("cobbled_oxygen_ice"));
        ices.add(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks"));
        ices.add(CBlocks.OXYGEN_ICE_BLOCKS.get("cracked_oxygen_ice_bricks"));
        ices.add(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_pillar"));
        pickaxeStairs.add(CBlocks.OXYGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.COBBLED_OXYGEN_ICE_STAIRS);
        pickaxeStairs.add(CBlocks.OXYGEN_ICE_BRICK_STAIRS);
        pickaxeSlabs.add(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_slab"));
        pickaxeSlabs.add(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("cobbled_oxygen_ice_slab"));
        pickaxeSlabs.add(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_slab"));
        pickaxeWalls.add(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_wall"));
        pickaxeWalls.add(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("cobbled_oxygen_ice_wall"));
        pickaxeWalls.add(CBlocks.OXYGEN_ICE_BLOCKS_CONTINUED.get("oxygen_ice_brick_wall"));

        /*
        Tool Tags
         */

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(CBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(CBlocks.FRIGUS_DIRT_PATH.get())
                .add(CBlocks.FRIGUS_DIRT.get())
                .add(CBlocks.COARSE_FRIGUS_DIRT.get())
                .add(CBlocks.FRIGUS_FARMLAND.get())
                .add(CBlocks.FRIGUS_MUD.get())

                .add(CBlocks.SALT_DUST_BLOCK.get())
                .add(CBlocks.SULFUR_DUST_BLOCK.get())
                .add(CBlocks.GRAPHITE_DUST_BLOCK.get())
        ;
        blueschistOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        blueShaleOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        waterIceOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        nitrogenIceOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        oxygenIceOres.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeStairs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        pickaxeSlabs.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        stonePressurePlates.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        ices.forEach(entry -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(entry.get()));
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // Frigus Stones
                .add(CBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
                .add(CBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get())
                .add(CBlocks.BLUESCHIST_BLOCKS.get("chiseled_blueschist").get())
                .add(CBlocks.BLUESCHIST_BLOCKS.get("polished_blueschist").get())
                .add(CBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks").get())
                .add(CBlocks.BLUESCHIST_BLOCKS.get("cracked_blueschist_bricks").get())
                .add(CBlocks.BLUESCHIST_BLOCKS.get("blueschist_pillar").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("cobbled_blue_shale").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("chiseled_blue_shale").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("polished_blue_shale").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_bricks").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("cracked_blue_shale_bricks").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_tiles").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_pillar").get())
                // Permafrost
                .add(CBlocks.PERMAFROST_BLOCKS.get("permafrost").get())
                .add(CBlocks.PERMAFROST_BLOCKS.get("chiseled_permafrost").get())
                .add(CBlocks.PERMAFROST_BLOCKS.get("polished_permafrost").get())
                .add(CBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks").get())
                .add(CBlocks.PERMAFROST_BLOCKS.get("cracked_permafrost_bricks").get())
                .add(CBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles").get())
                .add(CBlocks.PERMAFROST_BLOCKS.get("permafrost_pillar").get())
                // Plating
                .add(CBlocks.MALUNITE_PLATING_PRESSURE_PLATE.get())
                .add(CBlocks.MALUNITE_PLATING_BUTTON.get())
                // Miscellaneous
                .add(CBlocks.PACKED_FRIGUS_MUD.get())
                .add(CBlocks.FRIGUS_MUD_BRICKS.get())
        ;
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(CBlocks.FRIGUS_SHORT_GRASS.get())
                .add(CBlocks.MAYURA_LOG.get())
                .add(CBlocks.MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(CBlocks.MAYURA_PLANKS.get())
                .add(CBlocks.MAYURA_FENCE_GATE.get())
                .add(CBlocks.GRIMWOOD_LOG.get())
                .add(CBlocks.GRIMWOOD_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
                .add(CBlocks.GRIMWOOD_PLANKS.get())
                .add(CBlocks.GRIMWOOD_FENCE_GATE.get())
        ;
        tag(BlockTags.MINEABLE_WITH_HOE)
                .add(CBlocks.MAYURA_LEAVES.get())
                .add(CBlocks.GRIMWOOD_LEAVES.get())
                .add(CBlocks.BRUMA_BLOCK.get())
        ;
        tag(BlockTags.SWORD_EFFICIENT)
                .add(CBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(CBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(CBlocks.BLUESCHIST_IRON_ORE.get())
                .add(CBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(CBlocks.BLUESCHIST_LUTRUM_ORE.get())
                .add(CBlocks.BLUE_SHALE_COPPER_ORE.get())
                .add(CBlocks.BLUE_SHALE_IRON_ORE.get())
                .add(CBlocks.BLUE_SHALE_LAPIS_ORE.get())
                .add(CBlocks.BLUE_SHALE_LUTRUM_ORE.get())
                .add(CBlocks.WATER_ICE_COPPER_ORE.get())
                .add(CBlocks.WATER_ICE_IRON_ORE.get())
                .add(CBlocks.WATER_ICE_LAPIS_ORE.get())
                .add(CBlocks.WATER_ICE_LUTRUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.NITROGEN_ICE_IRON_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LUTRUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.OXYGEN_ICE_IRON_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LUTRUM_ORE.get())
        ;
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(CBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(CBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(CBlocks.BLUESCHIST_EMERALD_ORE.get())
                .add(CBlocks.BLUESCHIST_DIAMOND_ORE.get())
                .add(CBlocks.BLUESCHIST_OBDURIUM_ORE.get())
                .add(CBlocks.BLUESCHIST_MALUNITE_ORE.get())
                .add(CBlocks.BLUE_SHALE_GOLD_ORE.get())
                .add(CBlocks.BLUE_SHALE_REDSTONE_ORE.get())
                .add(CBlocks.BLUE_SHALE_EMERALD_ORE.get())
                .add(CBlocks.BLUE_SHALE_DIAMOND_ORE.get())
                .add(CBlocks.BLUE_SHALE_OBDURIUM_ORE.get())
                .add(CBlocks.BLUE_SHALE_MALUNITE_ORE.get())
                .add(CBlocks.WATER_ICE_GOLD_ORE.get())
                .add(CBlocks.WATER_ICE_REDSTONE_ORE.get())
                .add(CBlocks.WATER_ICE_EMERALD_ORE.get())
                .add(CBlocks.WATER_ICE_DIAMOND_ORE.get())
                .add(CBlocks.WATER_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.WATER_ICE_MALUNITE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_MALUNITE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_MALUNITE_ORE.get())
        ;
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_STONE_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
        ;
        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
        ;

        /*
        Block Variant Tags
         */

        pickaxeStairs.forEach(entry -> tag(BlockTags.STAIRS).add(entry.get()));
        tag(BlockTags.STAIRS)
        ;
        tag(BlockTags.WOODEN_STAIRS)
                .add(CBlocks.MAYURA_STAIRS.get())
                .add(CBlocks.GRIMWOOD_STAIRS.get())
        ;
        pickaxeSlabs.forEach(entry -> tag(BlockTags.SLABS).add(entry.get()));
        tag(BlockTags.SLABS)
        ;
        tag(BlockTags.WOODEN_SLABS)
                .add(CBlocks.MAYURA_SLAB.get())
                .add(CBlocks.GRIMWOOD_SLAB.get())
        ;
        tag(BlockTags.FENCES)
        ;
        tag(BlockTags.WOODEN_FENCES)
                .add(CBlocks.MAYURA_FENCE.get())
                .add(CBlocks.GRIMWOOD_FENCE.get())
        ;
        tag(BlockTags.FENCE_GATES)
                .add(CBlocks.MAYURA_FENCE_GATE.get())
                .add(CBlocks.GRIMWOOD_FENCE_GATE.get())
        ;
        tag(Tags.Blocks.FENCE_GATES)
        ;
        tag(Tags.Blocks.FENCE_GATES_WOODEN)
                .add(CBlocks.MAYURA_FENCE_GATE.get())
                .add(CBlocks.GRIMWOOD_FENCE_GATE.get())
        ;
        pickaxeWalls.forEach(entry -> tag(BlockTags.WALLS).add(entry.get()));
        tag(BlockTags.WALLS)
        ;
        tag(BlockTags.DOORS)
        ;
        tag(BlockTags.WOODEN_DOORS)
                .add(CBlocks.MAYURA_DOOR.get())
                .add(CBlocks.GRIMWOOD_DOOR.get())
        ;
        tag(BlockTags.TRAPDOORS)
        ;
        tag(BlockTags.WOODEN_TRAPDOORS)
                .add(CBlocks.MAYURA_TRAPDOOR.get())
                .add(CBlocks.GRIMWOOD_TRAPDOOR.get())
        ;
        tag(BlockTags.PRESSURE_PLATES)
                .add(CBlocks.MALUNITE_PLATING_PRESSURE_PLATE.get())
        ;
        stonePressurePlates.forEach(entry -> tag(BlockTags.STONE_PRESSURE_PLATES).add(entry.get()));
        tag(BlockTags.STONE_PRESSURE_PLATES)
        ;
        tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(CBlocks.MAYURA_PRESSURE_PLATE.get())
                .add(CBlocks.GRIMWOOD_PRESSURE_PLATE.get())
        ;
        tag(BlockTags.BUTTONS)
                .add(CBlocks.MALUNITE_PLATING_BUTTON.get())
        ;
        stoneButtons.forEach(entry -> tag(BlockTags.STONE_BUTTONS).add(entry.get()));
        tag(BlockTags.STONE_BUTTONS)
        ;
        tag(BlockTags.WOODEN_BUTTONS)
                .add(CBlocks.MAYURA_BUTTON.get())
                .add(CBlocks.GRIMWOOD_BUTTON.get())
        ;

        /*
        Ore Tags
         */

        tag(BlockTags.COAL_ORES)
                .add(CBlocks.BLUESCHIST_COAL_ORE.get())
                .add(CBlocks.BLUE_SHALE_COAL_ORE.get())
                .add(CBlocks.WATER_ICE_COAL_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COAL_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COAL_ORE.get())
        ;
        tag(BlockTags.IRON_ORES)
                .add(CBlocks.BLUESCHIST_IRON_ORE.get())
                .add(CBlocks.BLUE_SHALE_IRON_ORE.get())
                .add(CBlocks.WATER_ICE_IRON_ORE.get())
                .add(CBlocks.NITROGEN_ICE_IRON_ORE.get())
                .add(CBlocks.OXYGEN_ICE_IRON_ORE.get())
        ;
        tag(BlockTags.COPPER_ORES)
                .add(CBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(CBlocks.BLUE_SHALE_COPPER_ORE.get())
                .add(CBlocks.WATER_ICE_COPPER_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COPPER_ORE.get())
        ;
        tag(BlockTags.GOLD_ORES)
                .add(CBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(CBlocks.BLUE_SHALE_GOLD_ORE.get())
                .add(CBlocks.WATER_ICE_GOLD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_GOLD_ORE.get())
        ;
        tag(BlockTags.REDSTONE_ORES)
                .add(CBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(CBlocks.BLUE_SHALE_REDSTONE_ORE.get())
                .add(CBlocks.WATER_ICE_REDSTONE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_REDSTONE_ORE.get())
        ;
        tag(BlockTags.EMERALD_ORES)
                .add(CBlocks.BLUESCHIST_EMERALD_ORE.get())
                .add(CBlocks.BLUE_SHALE_EMERALD_ORE.get())
                .add(CBlocks.WATER_ICE_EMERALD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_EMERALD_ORE.get())
        ;
        tag(BlockTags.LAPIS_ORES)
                .add(CBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(CBlocks.BLUE_SHALE_LAPIS_ORE.get())
                .add(CBlocks.WATER_ICE_LAPIS_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LAPIS_ORE.get())
        ;
        tag(BlockTags.DIAMOND_ORES)
                .add(CBlocks.BLUESCHIST_DIAMOND_ORE.get())
                .add(CBlocks.BLUE_SHALE_DIAMOND_ORE.get())
                .add(CBlocks.WATER_ICE_DIAMOND_ORE.get())
                .add(CBlocks.NITROGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.OXYGEN_ICE_DIAMOND_ORE.get())
        ;
        tag(CTags.EUBlockTags.ORES_OBDURIUM)
                .add(CBlocks.BLUESCHIST_OBDURIUM_ORE.get())
                .add(CBlocks.BLUE_SHALE_OBDURIUM_ORE.get())
                .add(CBlocks.WATER_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE.get())
        ;
        tag(CTags.EUBlockTags.ORES_MALUNITE)
                .add(CBlocks.BLUESCHIST_MALUNITE_ORE.get())
                .add(CBlocks.BLUE_SHALE_MALUNITE_ORE.get())
                .add(CBlocks.WATER_ICE_MALUNITE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_MALUNITE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_MALUNITE_ORE.get())
        ;
        tag(CTags.EUBlockTags.ORES_LUTRUM)
                .add(CBlocks.BLUESCHIST_LUTRUM_ORE.get())
                .add(CBlocks.BLUE_SHALE_LUTRUM_ORE.get())
                .add(CBlocks.WATER_ICE_LUTRUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LUTRUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LUTRUM_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_DENSE)
                .add(CBlocks.BLUESCHIST_COPPER_ORE.get())
                .add(CBlocks.BLUESCHIST_REDSTONE_ORE.get())
                .add(CBlocks.BLUESCHIST_LAPIS_ORE.get())
                .add(CBlocks.BLUESCHIST_LUTRUM_ORE.get())
                .add(CBlocks.BLUE_SHALE_COPPER_ORE.get())
                .add(CBlocks.BLUE_SHALE_REDSTONE_ORE.get())
                .add(CBlocks.BLUE_SHALE_LAPIS_ORE.get())
                .add(CBlocks.BLUE_SHALE_LUTRUM_ORE.get())
                .add(CBlocks.WATER_ICE_COPPER_ORE.get())
                .add(CBlocks.WATER_ICE_REDSTONE_ORE.get())
                .add(CBlocks.WATER_ICE_LAPIS_ORE.get())
                .add(CBlocks.WATER_ICE_LUTRUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.NITROGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.NITROGEN_ICE_LUTRUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COPPER_ORE.get())
                .add(CBlocks.OXYGEN_ICE_REDSTONE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LAPIS_ORE.get())
                .add(CBlocks.OXYGEN_ICE_LUTRUM_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_SINGULAR)
                .add(CBlocks.BLUESCHIST_COAL_ORE.get())
                .add(CBlocks.BLUESCHIST_IRON_ORE.get())
                .add(CBlocks.BLUESCHIST_GOLD_ORE.get())
                .add(CBlocks.BLUESCHIST_EMERALD_ORE.get())
                .add(CBlocks.BLUESCHIST_DIAMOND_ORE.get())
                .add(CBlocks.BLUESCHIST_OBDURIUM_ORE.get())
                .add(CBlocks.BLUESCHIST_MALUNITE_ORE.get())
                .add(CBlocks.BLUE_SHALE_COAL_ORE.get())
                .add(CBlocks.BLUE_SHALE_IRON_ORE.get())
                .add(CBlocks.BLUE_SHALE_GOLD_ORE.get())
                .add(CBlocks.BLUE_SHALE_EMERALD_ORE.get())
                .add(CBlocks.BLUE_SHALE_DIAMOND_ORE.get())
                .add(CBlocks.BLUE_SHALE_OBDURIUM_ORE.get())
                .add(CBlocks.BLUE_SHALE_MALUNITE_ORE.get())
                .add(CBlocks.WATER_ICE_COAL_ORE.get())
                .add(CBlocks.WATER_ICE_IRON_ORE.get())
                .add(CBlocks.WATER_ICE_GOLD_ORE.get())
                .add(CBlocks.WATER_ICE_EMERALD_ORE.get())
                .add(CBlocks.WATER_ICE_DIAMOND_ORE.get())
                .add(CBlocks.WATER_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.WATER_ICE_MALUNITE_ORE.get())
                .add(CBlocks.NITROGEN_ICE_COAL_ORE.get())
                .add(CBlocks.NITROGEN_ICE_IRON_ORE.get())
                .add(CBlocks.NITROGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.NITROGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.NITROGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.NITROGEN_ICE_MALUNITE_ORE.get())
                .add(CBlocks.OXYGEN_ICE_COAL_ORE.get())
                .add(CBlocks.OXYGEN_ICE_IRON_ORE.get())
                .add(CBlocks.OXYGEN_ICE_GOLD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_EMERALD_ORE.get())
                .add(CBlocks.OXYGEN_ICE_DIAMOND_ORE.get())
                .add(CBlocks.OXYGEN_ICE_OBDURIUM_ORE.get())
                .add(CBlocks.OXYGEN_ICE_MALUNITE_ORE.get())
        ;
        tag(Tags.Blocks.ORE_RATES_SPARSE)
        ;
        tag(CTags.EUBlockTags.ORE_BEARING_GROUND_BLUESCHIST)
                .add(CBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
        ;
        tag(CTags.EUBlockTags.ORE_BEARING_GROUND_BLUE_SHALE)
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale").get())
        ;
        tag(CTags.EUBlockTags.ORE_BEARING_GROUND_WATER_ICE)
                .add(CBlocks.WATER_ICE_BLOCKS.get("water_ice").get())
        ;
        tag(CTags.EUBlockTags.ORE_BEARING_GROUND_NITROGEN_ICE)
                .add(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice").get())
        ;
        tag(CTags.EUBlockTags.ORE_BEARING_GROUND_OXYGEN_ICE)
                .add(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice").get())
        ;
        blueschistOres.forEach(entry -> tag(CTags.EUBlockTags.ORES_IN_GROUND_BLUESCHIST).add(entry.get()));
        blueShaleOres.forEach(entry -> tag(CTags.EUBlockTags.ORES_IN_GROUND_BLUE_SHALE).add(entry.get()));
        waterIceOres.forEach(entry -> tag(CTags.EUBlockTags.ORES_IN_GROUND_WATER_ICE).add(entry.get()));
        nitrogenIceOres.forEach(entry -> tag(CTags.EUBlockTags.ORES_IN_GROUND_NITROGEN_ICE).add(entry.get()));
        oxygenIceOres.forEach(entry -> tag(CTags.EUBlockTags.ORES_IN_GROUND_OXYGEN_ICE).add(entry.get()));

        /*
        Stone Tags
         */

        tag(Tags.Blocks.STONES)
                .add(CBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale").get())
                .add(CBlocks.PERMAFROST_BLOCKS.get("permafrost").get())
        ;
        tag(Tags.Blocks.COBBLESTONES)
                .addTag(CTags.EUBlockTags.COBBLESTONES_BLUESCHIST)
                .addTag(CTags.EUBlockTags.COBBLESTONES_BLUE_SHALE)
        ;
        tag(CTags.EUBlockTags.COBBLESTONES_BLUESCHIST)
                .add(CBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get())
        ;
        tag(CTags.EUBlockTags.COBBLESTONES_BLUE_SHALE)
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("cobbled_blue_shale").get())
        ;

        // Base Stone Tags
        tag(CTags.EUBlockTags.BASE_STONE_FRIGUS)
                .add(CBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale").get())
                .add(CBlocks.PERMAFROST_BLOCKS.get("permafrost").get())
        ;

        /*
        Storage Block Tags
         */

        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(CTags.EUBlockTags.STORAGE_BLOCKS_BRUMA)
                .addTag(CTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM)
                .addTag(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM)
                .addTag(CTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE)
                .addTag(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE)
                .addTag(CTags.EUBlockTags.STORAGE_BLOCKS_LUTRUM)
                .addTag(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_LUTRUM)
        ;
        tag(CTags.EUBlockTags.STORAGE_BLOCKS_BRUMA)
                .add(CBlocks.BRUMA_BLOCK.get())
        ;
        tag(CTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM)
                .add(CBlocks.OBDURIUM_BLOCK.get())
        ;
        tag(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM)
                .add(CBlocks.RAW_OBDURIUM_BLOCK.get())
        ;
        tag(CTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE)
                .add(CBlocks.MALUNITE_BLOCK.get())
        ;
        tag(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE)
                .add(CBlocks.RAW_MALUNITE_BLOCK.get())
        ;
        tag(CTags.EUBlockTags.STORAGE_BLOCKS_LUTRUM)
                .add(CBlocks.LUTRUM_BLOCK.get())
        ;
        tag(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_LUTRUM)
                .add(CBlocks.RAW_LUTRUM_BLOCK.get())
        ;

        /*
        Soil Tags
         */

        tag(BlockTags.DIRT)
                .add(CBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(CBlocks.FRIGUS_DIRT.get())
                .add(CBlocks.COARSE_FRIGUS_DIRT.get())
                .add(CBlocks.FRIGUS_MUD.get())
        ;
        tag(CTags.EUBlockTags.CONVERTABLE_TO_FRIGUS_MUD)
                .add(CBlocks.FRIGUS_DIRT.get())
                .add(CBlocks.COARSE_FRIGUS_DIRT.get())
        ;
        tag(BlockTags.ANIMALS_SPAWNABLE_ON)
                .add(CBlocks.FRIGUS_GRASS_BLOCK.get())
        ;
        tag(BlockTags.SNIFFER_DIGGABLE_BLOCK)
                .add(CBlocks.FRIGUS_GRASS_BLOCK.get())
                .add(CBlocks.FRIGUS_DIRT.get())
                .add(CBlocks.COARSE_FRIGUS_DIRT.get())
        ;
        tag(BlockTags.VALID_SPAWN)
                .add(CBlocks.FRIGUS_GRASS_BLOCK.get())
        ;
        tag(Tags.Blocks.VILLAGER_FARMLANDS)
                .add(CBlocks.FRIGUS_FARMLAND.get())
        ;

        /*
        Tree Tags
         */

        tag(BlockTags.LEAVES)
                .add(CBlocks.MAYURA_LEAVES.get())
                .add(CBlocks.GRIMWOOD_LEAVES.get())
        ;
        tag(BlockTags.LOGS)
                .add(CBlocks.MAYURA_LOG.get())
                .add(CBlocks.MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(CBlocks.GRIMWOOD_LOG.get())
                .add(CBlocks.GRIMWOOD_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        tag(Tags.Blocks.STRIPPED_LOGS)
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
        ;
        tag(Tags.Blocks.STRIPPED_WOODS)
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        tag(BlockTags.LOGS_THAT_BURN)
                .add(CBlocks.MAYURA_LOG.get())
                .add(CBlocks.MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
                .add(CBlocks.GRIMWOOD_LOG.get())
                .add(CBlocks.GRIMWOOD_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;
        tag(BlockTags.PLANKS)
                .add(CBlocks.MAYURA_PLANKS.get())
                .add(CBlocks.GRIMWOOD_PLANKS.get())
        ;
        tag(CTags.EUBlockTags.MAYURA_LOGS)
                .add(CBlocks.MAYURA_LOG.get())
                .add(CBlocks.MAYURA_WOOD.get())
                .add(CBlocks.STRIPPED_MAYURA_LOG.get())
                .add(CBlocks.STRIPPED_MAYURA_WOOD.get())
        ;
        tag(CTags.EUBlockTags.GRIMWOOD_LOGS)
                .add(CBlocks.GRIMWOOD_LOG.get())
                .add(CBlocks.GRIMWOOD_WOOD.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_LOG.get())
                .add(CBlocks.STRIPPED_GRIMWOOD_WOOD.get())
        ;

        /*
        Plant Tags
         */

        tag(BlockTags.REPLACEABLE_BY_TREES)
                .add(CBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.SAPLINGS)
                .add(CBlocks.MAYURA_SAPLING.get())
        ;
        tag(BlockTags.SMALL_FLOWERS)
                .add(CBlocks.VIVIAN.get())
                .add(CBlocks.WICKUL.get())
                .add(CBlocks.ICEFLOWER.get())
        ;
        tag(BlockTags.TALL_FLOWERS)
        ;
        tag(BlockTags.FLOWER_POTS)
                .add(CBlocks.POTTED_VIVIAN.get())
                .add(CBlocks.POTTED_WICKUL.get())
                .add(CBlocks.POTTED_ICEFLOWER.get())
        ;

        /*
        Carver Replaceable Tags
         */

        tag(CTags.EUBlockTags.FRIGUS_CARVER_REPLACEABLES)
                .addTag(CTags.EUBlockTags.BASE_STONE_FRIGUS)
                .addTag(BlockTags.DIRT)
                .addTag(BlockTags.SAND)
                .addTag(BlockTags.COPPER_ORES)
                .addTag(BlockTags.IRON_ORES)
                .addTag(BlockTags.SNOW)
                .add(Blocks.PACKED_ICE)
                .add(Blocks.RAW_COPPER_BLOCK)
                .add(Blocks.RAW_IRON_BLOCK)
                .add(Blocks.WATER)
        ;

        /*
        Ore Replaceable Tags
         */

        tag(CTags.EUBlockTags.BLUESCHIST_ORE_REPLACEABLES)
                .add(CBlocks.BLUESCHIST_BLOCKS.get("blueschist").get())
                .add(CBlocks.PERMAFROST_BLOCKS.get("permafrost").get())
        ;
        tag(CTags.EUBlockTags.BLUE_SHALE_ORE_REPLACEABLES)
                .add(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale").get())
        ;

        /*
        Miscellaneous Tags
         */

        tag(BlockTags.ENCHANTMENT_POWER_TRANSMITTER)
                // Prevents blocks from interfering with enchanting
                .add(CBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.REPLACEABLE)
                .add(CBlocks.FRIGUS_SHORT_GRASS.get())
        ;
        tag(BlockTags.ICE)
                .add(CBlocks.WATER_ICE_BLOCKS.get("water_ice").get())
                .add(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice").get())
                .add(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice").get())
        ;
    }
}