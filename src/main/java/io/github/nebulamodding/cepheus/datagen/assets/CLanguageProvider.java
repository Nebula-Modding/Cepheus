package io.github.nebulamodding.cepheus.datagen.assets;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.block.CBlocks;
import io.github.nebulamodding.cepheus.registry.item.CItems;
import io.github.nebulamodding.cepheus.registry.CCreativeTab;
import io.github.nebulamodding.cepheus.registry.CTags;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import org.codehaus.plexus.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CLanguageProvider extends LanguageProvider {
    public CLanguageProvider(PackOutput output) {
        super(output, Cepheus.MOD_ID, "en_us");
    }
    @Override
    protected void addTranslations() {
        final List<DeferredBlock<? extends Block>> excludedBlocks = new ArrayList<>();
        // Blocks excluded from having a translation automatically provided
        excludedBlocks.add(CBlocks.SALT_CRYSTAL_BLOCK);
        excludedBlocks.add(CBlocks.SALT_DUST_BLOCK);

        excludedBlocks.add(CBlocks.SULFUR_CRYSTAL_BLOCK);
        excludedBlocks.add(CBlocks.SULFUR_DUST_BLOCK);

        excludedBlocks.add(CBlocks.GRAPHITE_CRYSTAL_BLOCK);
        excludedBlocks.add(CBlocks.GRAPHITE_DUST_BLOCK);

        excludedBlocks.add(CBlocks.FLESH_BLOCK);

        excludedBlocks.add(CBlocks.BRUMA_BLOCK);

        excludedBlocks.add(CBlocks.BRUMA_BLOCK);
        excludedBlocks.add(CBlocks.RAW_OBDURIUM_BLOCK);
        excludedBlocks.add(CBlocks.RAW_MALUNITE_BLOCK);
        excludedBlocks.add(CBlocks.LUTRUM_AMALGAMATE_BLOCK);
        excludedBlocks.add(CBlocks.RAW_LUTRUM_BLOCK);

        excludedBlocks.add(CBlocks.OBDURIUM_BLOCK);
        excludedBlocks.add(CBlocks.MALUNITE_BLOCK);
        excludedBlocks.add(CBlocks.LUTRUM_BLOCK);

        final List<DeferredItem<? extends Item>> excludedItems = new ArrayList<>();
        // Items excluded from having a translation automatically provided
        excludedItems.add(CItems.GOLDEN_AZURE_ROOT);
        excludedItems.add(CItems.ENCHANTED_GOLDEN_AZURE_ROOT);
        excludedItems.add(CItems.COOKED_FLESH);

        /*
        Manual Translations
         */

        // Blocks
        addBlock(CBlocks.SALT_CRYSTAL_BLOCK, "Block of Salt Crystals");
        addBlock(CBlocks.SALT_DUST_BLOCK, "Block of Salt Dust");

        addBlock(CBlocks.SULFUR_CRYSTAL_BLOCK, "Block of Sulfur Crystals");
        addBlock(CBlocks.SULFUR_DUST_BLOCK, "Block of Sulfur Dust");

        addBlock(CBlocks.GRAPHITE_CRYSTAL_BLOCK, "Block of Graphite Crystals");
        addBlock(CBlocks.GRAPHITE_DUST_BLOCK, "Block of Graphite Dust");

        addBlock(CBlocks.FLESH_BLOCK, "Block of Flesh");

        addBlock(CBlocks.BRUMA_BLOCK, "Bruma Bale");
        addBlock(CBlocks.RAW_OBDURIUM_BLOCK, "Block of Raw Obdurium");
        addBlock(CBlocks.RAW_MALUNITE_BLOCK, "Block of Raw Malunite");
        addBlock(CBlocks.LUTRUM_AMALGAMATE_BLOCK, "Block of Lutrum Amalgamate");
        addBlock(CBlocks.RAW_LUTRUM_BLOCK, "Block of Raw Lutrum");

        addBlock(CBlocks.OBDURIUM_BLOCK, "Block of Obdurium");
        addBlock(CBlocks.MALUNITE_BLOCK, "Block of Malunite");
        addBlock(CBlocks.LUTRUM_BLOCK, "Block of Lutrum");

        // Items
        addItem(CItems.GOLDEN_AZURE_ROOT, "Golden Root");
        addItem(CItems.ENCHANTED_GOLDEN_AZURE_ROOT, "Enchanted Golden Root");
        addItem(CItems.COOKED_FLESH, "Jerky");

        /*
        Tag Translations
         */

        // Block Tags
        add(CTags.EUBlockTags.COBBLESTONES_BLUESCHIST, "Blueschist Cobblestones");
        add(CTags.EUBlockTags.COBBLESTONES_BLUE_SHALE, "Blue Shale Cobblestones");
        add(CTags.EUBlockTags.ORE_BEARING_GROUND_BLUESCHIST, "Blueschist Ore Bearing Ground");
        add(CTags.EUBlockTags.ORE_BEARING_GROUND_BLUE_SHALE, "Blue Shale Ore Bearing Ground");
        add(CTags.EUBlockTags.ORE_BEARING_GROUND_WATER_ICE, "Water Ice Ore Bearing Ground");
        add(CTags.EUBlockTags.ORE_BEARING_GROUND_METHANE_ICE, "Methane Ice Ore Bearing Ground");
        add(CTags.EUBlockTags.ORE_BEARING_GROUND_NITROGEN_ICE, "Nitrogen Ice Ore Bearing Ground");
        add(CTags.EUBlockTags.ORE_BEARING_GROUND_OXYGEN_ICE, "Oxygen Ice Ore Bearing Ground");
        add(CTags.EUBlockTags.ORES_IN_GROUND_BLUESCHIST, "Blueschist Ores In Ground");
        add(CTags.EUBlockTags.ORES_IN_GROUND_BLUE_SHALE, "Blue Shale Ores In Ground");
        add(CTags.EUBlockTags.ORES_IN_GROUND_WATER_ICE, "Water Ice Ores In Ground");
        add(CTags.EUBlockTags.ORES_IN_GROUND_METHANE_ICE, "Methane Ice Ores In Ground");
        add(CTags.EUBlockTags.ORES_IN_GROUND_NITROGEN_ICE, "Nitrogen Ice Ores In Ground");
        add(CTags.EUBlockTags.ORES_IN_GROUND_OXYGEN_ICE, "Oxygen Ice Ores In Ground");
        add(CTags.EUBlockTags.ORES_OBDURIUM, "Obdurium Ores");
        add(CTags.EUBlockTags.ORES_MALUNITE, "Malunite Ores");
        add(CTags.EUBlockTags.ORES_LUTRUM, "Lutrum Ores");
        add(CTags.EUBlockTags.STORAGE_BLOCKS_BRUMA, "Bruma Storage Blocks");
        add(CTags.EUBlockTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(CTags.EUBlockTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(CTags.EUBlockTags.STORAGE_BLOCKS_LUTRUM, "Lutrum Storage Blocks");
        add(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");
        add(CTags.EUBlockTags.STORAGE_BLOCKS_RAW_LUTRUM, "Raw Lutrum Storage Blocks");
        // Cepheus Tags
        add(CTags.EUBlockTags.NEEDS_OBDURIUM_TOOL, "Needs Obdurium Tool");
        add(CTags.EUBlockTags.NEEDS_MALUNITE_TOOL, "Needs Malunite Tool");
        add(CTags.EUBlockTags.NEEDS_LUTRUM_TOOL, "Needs Lutrum Tool");
        add(CTags.EUBlockTags.BASE_STONE_FRIGUS, "Frigus Base Stones");
        add(CTags.EUBlockTags.FRIGUS_CARVER_REPLACEABLES, "Frigus Carver Replaceables");
        add(CTags.EUBlockTags.BLUESCHIST_ORE_REPLACEABLES, "Blueschist Ore Replaceables");
        add(CTags.EUBlockTags.BLUE_SHALE_ORE_REPLACEABLES, "Blue Shale Ore Replaceables");
        add(CTags.EUBlockTags.CONVERTABLE_TO_FRIGUS_MUD, "Convertable to Frigus Mud");
        add(CTags.EUBlockTags.MAYURA_LOGS, "Mayura Logs");
        add(CTags.EUBlockTags.GRIMWOOD_LOGS, "Grimwood Logs");

        // Block Item Tags
        add(CTags.EUItemTags.COBBLESTONES_BLUESCHIST, "Blueschist Cobblestones");
        add(CTags.EUItemTags.COBBLESTONES_BLUE_SHALE, "Blue Shale Cobblestones");
        add(CTags.EUItemTags.ORE_BEARING_GROUND_BLUESCHIST, "Blueschist Ore Bearing Ground");
        add(CTags.EUItemTags.ORE_BEARING_GROUND_BLUE_SHALE, "Blue Shale Ore Bearing Ground");
        add(CTags.EUItemTags.ORE_BEARING_GROUND_WATER_ICE, "Water Ice Ore Bearing Ground");
        add(CTags.EUItemTags.ORE_BEARING_GROUND_METHANE_ICE, "Methane Ice Ore Bearing Ground");
        add(CTags.EUItemTags.ORE_BEARING_GROUND_NITROGEN_ICE, "Nitrogen Ice Ore Bearing Ground");
        add(CTags.EUItemTags.ORE_BEARING_GROUND_OXYGEN_ICE, "Oxygen Ice Ore Bearing Ground");
        add(CTags.EUItemTags.ORES_IN_GROUND_BLUESCHIST, "Blueschist Ores In Ground");
        add(CTags.EUItemTags.ORES_IN_GROUND_BLUE_SHALE, "Blue Shale Ores In Ground");
        add(CTags.EUItemTags.ORES_IN_GROUND_WATER_ICE, "Water Ice Ores In Ground");
        add(CTags.EUItemTags.ORES_IN_GROUND_METHANE_ICE, "Methane Ice Ores In Ground");
        add(CTags.EUItemTags.ORES_IN_GROUND_NITROGEN_ICE, "Nitrogen Ice Ores In Ground");
        add(CTags.EUItemTags.ORES_IN_GROUND_OXYGEN_ICE, "Oxygen Ice Ores In Ground");
        add(CTags.EUItemTags.ORES_OBDURIUM, "Obdurium Ores");
        add(CTags.EUItemTags.ORES_MALUNITE, "Malunite Ores");
        add(CTags.EUItemTags.ORES_LUTRUM, "Lutrum Ores");
        add(CTags.EUItemTags.STORAGE_BLOCKS_BRUMA, "Bruma Storage Blocks");
        add(CTags.EUItemTags.STORAGE_BLOCKS_OBDURIUM, "Obdurium Storage Blocks");
        add(CTags.EUItemTags.STORAGE_BLOCKS_MALUNITE, "Malunite Storage Blocks");
        add(CTags.EUItemTags.STORAGE_BLOCKS_LUTRUM, "Lutrum Storage Blocks");
        add(CTags.EUItemTags.STORAGE_BLOCKS_RAW_OBDURIUM, "Raw Obdurium Storage Blocks");
        add(CTags.EUItemTags.STORAGE_BLOCKS_RAW_MALUNITE, "Raw Malunite Storage Blocks");
        add(CTags.EUItemTags.STORAGE_BLOCKS_RAW_LUTRUM, "Raw Lutrum Storage Blocks");
        // Cepheus Tags
        add(CTags.EUItemTags.MAYURA_LOGS, "Mayura Logs");
        add(CTags.EUItemTags.GRIMWOOD_LOGS, "Grimwood Logs");

        // Item Tags
        add(CTags.EUItemTags.PLATES, "Plates");
        add(CTags.EUItemTags.RAW_MATERIALS_OBDURIUM, "Obdurium Raw Materials");
        add(CTags.EUItemTags.NUGGETS_OBDURIUM, "Obdurium Nuggets");
        add(CTags.EUItemTags.INGOTS_OBDURIUM, "Obdurium Ingots");
        add(CTags.EUItemTags.PLATES_OBDURIUM, "Obdurium Plates");
        add(CTags.EUItemTags.RODS_OBDURIUM, "Obdurium Rods");
        add(CTags.EUItemTags.RAW_MATERIALS_MALUNITE, "Malunite Raw Materials");
        add(CTags.EUItemTags.NUGGETS_MALUNITE, "Malunite Nuggets");
        add(CTags.EUItemTags.INGOTS_MALUNITE, "Malunite Ingots");
        add(CTags.EUItemTags.PLATES_MALUNITE, "Malunite Plates");
        add(CTags.EUItemTags.RODS_MALUNITE, "Malunite Rods");
        add(CTags.EUItemTags.RAW_MATERIALS_LUTRUM, "Lutrum Raw Materials");
        add(CTags.EUItemTags.NUGGETS_LUTRUM, "Lutrum Nuggets");
        add(CTags.EUItemTags.INGOTS_LUTRUM, "Lutrum Ingots");
        add(CTags.EUItemTags.PLATES_LUTRUM, "Lutrum Plates");
        add(CTags.EUItemTags.RODS_LUTRUM, "Lutrum Rods");

        /*
        Miscellaneous Translations
         */

        add(CCreativeTab.CREATIVE_TAB_TITLE, "Cepheus");

        /*
        Automated Translations
         */

        // Blocks
        CBlocks.BLOCKS.getEntries()
                .stream()
                .filter(b -> !excludedBlocks.contains(b))
                .forEach(entry -> addBlock(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));
        // Items
        CItems.ITEMS.getEntries()
                .stream()
                .filter(i -> !(i.get() instanceof BlockItem) && !excludedItems.contains(i))
                .forEach(entry -> addItem(entry,
                        StringUtils.capitaliseAllWords(entry
                                .getId()
                                .getPath()
                                .replace("_", " "))));
    }
}
