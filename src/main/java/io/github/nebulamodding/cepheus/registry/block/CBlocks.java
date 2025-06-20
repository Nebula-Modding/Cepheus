package io.github.nebulamodding.cepheus.registry.block;

import io.github.nebulamodding.cepheus.Cepheus;
import io.github.nebulamodding.cepheus.registry.block.classes.*;
import io.github.nebulamodding.cepheus.registry.item.CItems;
import martian.regolith.DeferredHolders;
import martian.regolith.builder.RegolithBlockBuilder;
import martian.regolith.neoforge.RegolithNeoForge;
import net.minecraft.core.Direction;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static io.github.nebulamodding.cepheus.registry.block.CWoodTypes.GRIMWOOD;
import static io.github.nebulamodding.cepheus.registry.block.CWoodTypes.MAYURA;

public class CBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Cepheus.MOD_ID);

    /*
    Seeds
     */

    public static final DeferredBlock<Block>
    TEMPBLOCKTEST = register("tempblocktest", () -> new Block(stoneProperties().mapColor(MapColor.PLANT)));
    //        BRUMA_SEEDS = register("bruma_seeds", () -> new CropBlock(plantProperties().mapColor(MapColor.COLOR_BLUE).randomTicks().sound(SoundType.CROP))),
    //        AZURE_ROOTS = register("azure_roots", () -> new CropBlock(plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).randomTicks().sound(SoundType.CROP)));

    /*
    Wood Blocks
     */

    public static final DeferredBlock<Block>
            MAYURA_LOG = register("mayura_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG).mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.GLOW_LICHEN : MapColor.TERRACOTTA_LIGHT_BLUE))),
            MAYURA_WOOD = register("mayura_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            STRIPPED_MAYURA_LOG = register("stripped_mayura_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.GLOW_LICHEN))),
            STRIPPED_MAYURA_WOOD = register("stripped_mayura_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_PLANKS = register("mayura_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_STAIRS = register("mayura_stairs", () -> new StairBlock(MAYURA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_STAIRS).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_SLAB = register("mayura_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_FENCE = register("mayura_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_FENCE_GATE = register("mayura_fence_gate", () -> new FenceGateBlock(MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE_GATE).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_DOOR = register("mayura_door", () -> new DoorBlock(CBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_DOOR).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_TRAPDOOR = register("mayura_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_TRAPDOOR).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_PRESSURE_PLATE = register("mayura_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.MAYURA, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_BUTTON = register("mayura_button", () -> new ButtonBlock(CBlockSetTypes.MAYURA, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_BUTTON))),
            MAYURA_LEAVES = register("mayura_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).mapColor(MapColor.GLOW_LICHEN))),
            MAYURA_SAPLING = register("mayura_sapling", () -> new SaplingBlock(TreeGrower.SPRUCE, plantProperties().randomTicks().mapColor(MapColor.GLOW_LICHEN)));

    public static final DeferredBlock<Block>
            GRIMWOOD_LOG = register("grimwood_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG).mapColor(state -> state.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? MapColor.TERRACOTTA_CYAN : MapColor.TERRACOTTA_BLACK))),
            GRIMWOOD_WOOD = register("grimwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_BLACK))),
            STRIPPED_GRIMWOOD_LOG = register("stripped_grimwood_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.TERRACOTTA_CYAN))),
            STRIPPED_GRIMWOOD_WOOD = register("stripped_grimwood_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_WOOD).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_PLANKS = register("grimwood_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_STAIRS = register("grimwood_stairs", () -> new StairBlock(GRIMWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_STAIRS).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_SLAB = register("grimwood_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SLAB).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_FENCE = register("grimwood_fence", () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_FENCE_GATE = register("grimwood_fence_gate", () -> new FenceGateBlock(GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_FENCE_GATE).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_DOOR = register("grimwood_door", () -> new DoorBlock(CBlockSetTypes.GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_DOOR).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_TRAPDOOR = register("grimwood_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_TRAPDOOR).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_PRESSURE_PLATE = register("grimwood_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.GRIMWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_CYAN))),
            GRIMWOOD_BUTTON = register("grimwood_button", () -> new ButtonBlock(CBlockSetTypes.GRIMWOOD, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_BUTTON))),
            GRIMWOOD_LEAVES = register("grimwood_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).mapColor(MapColor.SNOW))),
            GRIMWOOD_SAPLING = register("grimwood_sapling", () -> new SaplingBlock(TreeGrower.SPRUCE, plantProperties().randomTicks().mapColor(MapColor.TERRACOTTA_CYAN)));

    /*
    Frigus
     */

    public static final DeferredBlock<Block>
            FRIGUS_GRASS_BLOCK = register("frigus_grass_block", () -> new FrigusGrassBlock(grassProperties().mapColor(MapColor.GLOW_LICHEN))),
            FRIGUS_DIRT = register("frigus_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_DIRT_PATH = register("frigus_dirt_path", () -> new FrigusDirtPathBlock(pathProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            COARSE_FRIGUS_DIRT = register("coarse_frigus_dirt", () -> new Block(dirtProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_FARMLAND = register("frigus_farmland", () -> new FrigusFarmlandBlock(farmlandProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_MUD = register("frigus_mud", () -> new MudBlock(mudProperties().mapColor(MapColor.TERRACOTTA_BLUE))),
            PACKED_FRIGUS_MUD = register("packed_frigus_mud", () -> new Block(packedMudProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_MUD_BRICKS = register("frigus_mud_bricks", () -> new Block(mudBrickProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_MUD_BRICK_STAIRS = register("frigus_mud_brick_stairs", () -> new StairBlock(FRIGUS_MUD_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.FRIGUS_MUD_BRICKS.get()))),
            FRIGUS_MUD_BRICK_SLAB = register("frigus_mud_brick_slab", () -> new SlabBlock(mudBrickProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_MUD_BRICK_WALL = register("frigus_mud_brick_wall", () -> new WallBlock(mudBrickProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            FRIGUS_SHORT_GRASS = register("frigus_short_grass", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.GLOW_LICHEN)));
    public static final DeferredBlock<Block>
            VIVIAN = register("vivian", () -> new FlowerBlock(MobEffects.INVISIBILITY, 3.5F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ))),
            WICKUL = register("wickul", () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 3.5F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ))),
            ICEFLOWER = register("iceflower", () -> new FlowerBlock(MobEffects.MOVEMENT_SLOWDOWN, 5.0F, plantProperties().mapColor(MapColor.COLOR_LIGHT_BLUE).offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLUESCHIST_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.ICE))
            .register(
                    "blueschist",
                    "cobbled_blueschist",
                    "chiseled_blueschist",
                    "polished_blueschist",
                    "blueschist_bricks",
                    "cracked_blueschist_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("blueschist_pillar")
            .done();
    public static final DeferredBlock<Block>
            BLUESCHIST_STAIRS = register("blueschist_stairs", () -> new StairBlock(BLUESCHIST_BLOCKS.get("blueschist").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST_BLOCKS.get("blueschist").get()))),
            FRIGUS_COBBLESTONE_STAIRS = register("cobbled_blueschist_stairs", () -> new StairBlock(BLUESCHIST_BLOCKS.get("cobbled_blueschist").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST_BLOCKS.get("cobbled_blueschist").get()))),
            POLISHED_BLUESCHIST_STAIRS = register("polished_blueschist_stairs", () -> new StairBlock(BLUESCHIST_BLOCKS.get("polished_blueschist").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST_BLOCKS.get("polished_blueschist").get()))),
            BLUESCHIST_BRICK_STAIRS = register("blueschist_brick_stairs", () -> new StairBlock(BLUESCHIST_BLOCKS.get("blueschist_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST_BLOCKS.get("blueschist_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLUESCHIST_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.ICE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "blueschist_slab",
                    "cobbled_blueschist_slab",
                    "polished_blueschist_slab",
                    "blueschist_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "blueschist_wall",
                    "cobbled_blueschist_wall",
                    "polished_blueschist_wall",
                    "blueschist_brick_wall")
            .done();
    public static final DeferredBlock<Block>
            BLUESCHIST_PRESSURE_PLATE = register("blueschist_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.BLUESCHIST, BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST_BLOCKS.get("blueschist").get()).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            BLUESCHIST_BUTTON = register("blueschist_button", () -> new ButtonBlock(CBlockSetTypes.BLUESCHIST, 20, BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUESCHIST_BLOCKS.get("blueschist").get()).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));

    /*
    Frigus Deepslate Blocks
     */

    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLUE_SHALE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))
            .register(
                    "blue_shale",
                    "cobbled_blue_shale",
                    "chiseled_blue_shale",
                    "polished_blue_shale",
                    "blue_shale_bricks",
                    "cracked_blue_shale_bricks",
                    "blue_shale_tiles")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("blue_shale_pillar")
            .done();
    public static final DeferredBlock<Block>
            BLUE_SHALE_STAIRS = register("blue_shale_stairs", () -> new StairBlock(BLUE_SHALE_BLOCKS.get("blue_shale").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale").get()))),
            COBBLED_BLUE_SHALE_STAIRS = register("cobbled_blue_shale_stairs", () -> new StairBlock(BLUE_SHALE_BLOCKS.get("cobbled_blue_shale").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUE_SHALE_BLOCKS.get("cobbled_blue_shale").get()))),
            POLISHED_BLUE_SHALE_STAIRS = register("polished_blue_shale_stairs", () -> new StairBlock(BLUE_SHALE_BLOCKS.get("polished_blue_shale").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUE_SHALE_BLOCKS.get("polished_blue_shale").get()))),
            BLUE_SHALE_BRICK_STAIRS = register("blue_shale_brick_stairs", () -> new StairBlock(BLUE_SHALE_BLOCKS.get("blue_shale_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_bricks").get()))),
            BLUE_SHALE_TILE_STAIRS = register("blue_shale_tile_stairs", () -> new StairBlock(BLUE_SHALE_BLOCKS.get("blue_shale_tiles").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLUE_SHALE_BLOCKS.get("blue_shale_tiles").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLUE_SHALE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            deepslateProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "blue_shale_slab",
                    "cobbled_blue_shale_slab",
                    "polished_blue_shale_slab",
                    "blue_shale_brick_slab",
                    "blue_shale_tile_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "blue_shale_wall",
                    "cobbled_blue_shale_wall",
                    "polished_blue_shale_wall",
                    "blue_shale_brick_wall",
                    "blue_shale_tile_wall")
            .done();

    /*
    Permafrost Blocks
     */

    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> PERMAFROST_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.QUARTZ))
            .register(
                    "permafrost",
                    "chiseled_permafrost",
                    "polished_permafrost",
                    "permafrost_bricks",
                    "cracked_permafrost_bricks",
                    "permafrost_tiles")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("permafrost_pillar")
            .done();
    public static final DeferredBlock<Block>
            PERMAFROST_STAIRS = register("permafrost_stairs", () -> new StairBlock(PERMAFROST_BLOCKS.get("permafrost").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_BLOCKS.get("permafrost").get()))),
            POLISHED_PERMAFROST_STAIRS = register("polished_permafrost_stairs", () -> new StairBlock(PERMAFROST_BLOCKS.get("polished_permafrost").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_BLOCKS.get("polished_permafrost").get()))),
            PERMAFROST_BRICK_STAIRS = register("permafrost_brick_stairs", () -> new StairBlock(PERMAFROST_BLOCKS.get("permafrost_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_BLOCKS.get("permafrost_bricks").get()))),
            PERMAFROST_TILE_STAIRS = register("permafrost_tile_stairs", () -> new StairBlock(PERMAFROST_BLOCKS.get("permafrost_tiles").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.PERMAFROST_BLOCKS.get("permafrost_tiles").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> PERMAFROST_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.QUARTZ))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "permafrost_slab",
                    "polished_permafrost_slab",
                    "permafrost_brick_slab",
                    "permafrost_tile_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "permafrost_wall",
                    "polished_permafrost_wall",
                    "permafrost_brick_wall",
                    "permafrost_tile_wall")
            .done();

    /*
    Karcass Stone
     */
    
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> KARCASS_STONE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
            .register(
                    "karcass_stone",
                    "karcass_cobblestone",
                    "chiseled_karcass_stone",
                    "polished_karcass_stone",
                    "karcass_stone_bricks",
                    "cracked_karcass_stone_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("karcass_stone_pillar")
            .done();
    public static final DeferredBlock<Block>
            KARCASS_STONE_STAIRS = register("karcass_stone_stairs", () -> new StairBlock(KARCASS_STONE_BLOCKS.get("karcass_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get()))),
            KARCASS_COBBLESTONE_STAIRS = register("karcass_cobblestone_stairs", () -> new StairBlock(KARCASS_STONE_BLOCKS.get("karcass_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get()))),
            POLISHED_KARCASS_STONE_STAIRS = register("polished_karcass_stone_stairs", () -> new StairBlock(KARCASS_STONE_BLOCKS.get("karcass_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get()))),
            KARCASS_STONE_BRICK_STAIRS = register("karcass_stone_brick_stairs", () -> new StairBlock(KARCASS_STONE_BLOCKS.get("karcass_stone").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> KARCASS_STONE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_LIGHT_BLUE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "karcass_stone_slab",
                    "karcass_cobblestone_slab",
                    "polished_karcass_stone_slab",
                    "karcass_stone_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "karcass_stone_wall",
                    "karcass_cobblestone_wall",
                    "polished_karcass_stone_wall",
                    "karcass_stone_brick_wall")
            .done();
    public static final DeferredBlock<Block>
            KARCASS_STONE_PRESSURE_PLATE = register("karcass_stone_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.KARCASS_STONE, BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get()).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            KARCASS_STONE_BUTTON = register("karcass_stone_button", () -> new ButtonBlock(CBlockSetTypes.KARCASS_STONE, 20, BlockBehaviour.Properties.ofFullCopy(CBlocks.KARCASS_STONE_BLOCKS.get("karcass_stone").get()).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));

    /*
    Ore Blocks
     */

    public static final DeferredBlock<Block>
            BLUESCHIST_COAL_ORE = register("blueschist_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_IRON_ORE = register("blueschist_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_COPPER_ORE = register("blueschist_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_GOLD_ORE = register("blueschist_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_REDSTONE_ORE = register("blueschist_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_EMERALD_ORE = register("blueschist_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_LAPIS_ORE = register("blueschist_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_DIAMOND_ORE = register("blueschist_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_LUTRUM_ORE = register("blueschist_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_OBDURIUM_ORE = register("blueschist_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), stoneOreProperties().mapColor(MapColor.ICE))),
            BLUESCHIST_MALUNITE_ORE = register("blueschist_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), stoneOreProperties().mapColor(MapColor.ICE))),

            BLUE_SHALE_COAL_ORE = register("blue_shale_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_IRON_ORE = register("blue_shale_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_COPPER_ORE = register("blue_shale_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_GOLD_ORE = register("blue_shale_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_REDSTONE_ORE = register("blue_shale_redstone_ore", () -> new RedStoneOreBlock(deepslateRedstoneOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_EMERALD_ORE = register("blue_shale_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_LAPIS_ORE = register("blue_shale_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_DIAMOND_ORE = register("blue_shale_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_LUTRUM_ORE = register("blue_shale_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_OBDURIUM_ORE = register("blue_shale_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            BLUE_SHALE_MALUNITE_ORE = register("blue_shale_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), deepslateOreProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),

            WATER_ICE_COAL_ORE = register("water_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_IRON_ORE = register("water_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_COPPER_ORE = register("water_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_GOLD_ORE = register("water_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_REDSTONE_ORE = register("water_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3.0F, 1.0F).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME))),
            WATER_ICE_EMERALD_ORE = register("water_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_LAPIS_ORE = register("water_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_DIAMOND_ORE = register("water_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_LUTRUM_ORE = register("water_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_OBDURIUM_ORE = register("water_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            WATER_ICE_MALUNITE_ORE = register("water_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F))),

            NITROGEN_ICE_COAL_ORE = register("nitrogen_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_IRON_ORE = register("nitrogen_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_COPPER_ORE = register("nitrogen_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_GOLD_ORE = register("nitrogen_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_REDSTONE_ORE = register("nitrogen_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3.0F, 1.0F).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_EMERALD_ORE = register("nitrogen_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_LAPIS_ORE = register("nitrogen_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_DIAMOND_ORE = register("nitrogen_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_LUTRUM_ORE = register("nitrogen_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_OBDURIUM_ORE = register("nitrogen_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),
            NITROGEN_ICE_MALUNITE_ORE = register("nitrogen_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F).mapColor(MapColor.SNOW))),

            OXYGEN_ICE_COAL_ORE = register("oxygen_ice_coal_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_IRON_ORE = register("oxygen_ice_iron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_COPPER_ORE = register("oxygen_ice_copper_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_GOLD_ORE = register("oxygen_ice_gold_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_REDSTONE_ORE = register("oxygen_ice_redstone_ore", () -> new RedStoneOreBlock(stoneRedstoneOreProperties().strength(3.0F, 1.0F).requiresCorrectToolForDrops().friction(0.85F).sound(SoundType.GLASS).instrument(NoteBlockInstrument.CHIME))),
            OXYGEN_ICE_EMERALD_ORE = register("oxygen_ice_emerald_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_LAPIS_ORE = register("oxygen_ice_lapis_ore", () -> new DropExperienceBlock(UniformInt.of(4, 8), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_DIAMOND_ORE = register("oxygen_ice_diamond_ore", () -> new DropExperienceBlock(UniformInt.of(5, 10), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_LUTRUM_ORE = register("oxygen_ice_lutrum_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_OBDURIUM_ORE = register("oxygen_ice_obdurium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), iceProperties().strength(3.0F, 1.0F))),
            OXYGEN_ICE_MALUNITE_ORE = register("oxygen_ice_malunite_ore", () -> new DropExperienceBlock(UniformInt.of(1, 4), iceProperties().strength(3.0F, 1.0F)));

    /*
    Ice Blocks
     */

    // Water
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties())
            .register(
                    "water_ice",
                    "cobbled_water_ice",
                    "water_ice_bricks",
                    "cracked_water_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("water_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            WATER_ICE_STAIRS = register("water_ice_stairs", () -> new StairBlock(WATER_ICE_BLOCKS.get("water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.WATER_ICE_BLOCKS.get("water_ice").get()))),
            COBBLED_WATER_ICE_STAIRS = register("cobbled_water_ice_stairs", () -> new StairBlock(WATER_ICE_BLOCKS.get("cobbled_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.WATER_ICE_BLOCKS.get("cobbled_water_ice").get()))),
            WATER_ICE_BRICK_STAIRS = register("water_ice_brick_stairs", () -> new StairBlock(WATER_ICE_BLOCKS.get("water_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.WATER_ICE_BLOCKS.get("water_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> WATER_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties())
            .setBlockFunction(SlabBlock::new)
            .register(
                    "water_ice_slab",
                    "cobbled_water_ice_slab",
                    "water_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "water_ice_wall",
                    "cobbled_water_ice_wall",
                    "water_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .register(
                    "tholin_poor_water_ice",
                    "tholin_poor_cobbled_water_ice",
                    "tholin_poor_water_ice_bricks",
                    "tholin_poor_cracked_water_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_water_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_POOR_WATER_ICE_STAIRS = register("tholin_poor_water_ice_stairs", () -> new StairBlock(THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice").get()))),
            THOLIN_POOR_COBBLED_WATER_ICE_STAIRS = register("tholin_poor_cobbled_water_ice_stairs", () -> new StairBlock(THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_cobbled_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_cobbled_water_ice").get()))),
            THOLIN_POOR_WATER_ICE_BRICK_STAIRS = register("tholin_poor_water_ice_brick_stairs", () -> new StairBlock(THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_WATER_ICE_BLOCKS.get("tholin_poor_water_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_WATER_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_water_ice_slab",
                    "tholin_poor_cobbled_water_ice_slab",
                    "tholin_poor_water_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_poor_water_ice_wall",
                    "tholin_poor_cobbled_water_ice_wall",
                    "tholin_poor_water_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_PINK))
            .register(
                    "tholin_rich_water_ice",
                    "tholin_rich_cobbled_water_ice",
                    "tholin_rich_water_ice_bricks",
                    "tholin_rich_cracked_water_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_water_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_RICH_WATER_ICE_STAIRS = register("tholin_rich_water_ice_stairs", () -> new StairBlock(THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice").get()))),
            THOLIN_RICH_COBBLED_WATER_ICE_STAIRS = register("tholin_rich_cobbled_water_ice_stairs", () -> new StairBlock(THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_cobbled_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_cobbled_water_ice").get()))),
            THOLIN_RICH_WATER_ICE_BRICK_STAIRS = register("tholin_rich_water_ice_brick_stairs", () -> new StairBlock(THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_WATER_ICE_BLOCKS.get("tholin_rich_water_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_WATER_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_PINK))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_water_ice_slab",
                    "tholin_rich_cobbled_water_ice_slab",
                    "tholin_rich_water_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_rich_water_ice_wall",
                    "tholin_rich_cobbled_water_ice_wall",
                    "tholin_rich_water_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLACK_WATER_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_BLACK))
            .register(
                    "black_water_ice",
                    "cobbled_black_water_ice",
                    "black_water_ice_bricks",
                    "cracked_black_water_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("black_water_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            BLACK_WATER_ICE_STAIRS = register("black_water_ice_stairs", () -> new StairBlock(BLACK_WATER_ICE_BLOCKS.get("black_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice").get()))),
            COBBLED_BLACK_WATER_ICE_STAIRS = register("cobbled_black_water_ice_stairs", () -> new StairBlock(BLACK_WATER_ICE_BLOCKS.get("cobbled_black_water_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLACK_WATER_ICE_BLOCKS.get("cobbled_black_water_ice").get()))),
            BLACK_WATER_ICE_BRICK_STAIRS = register("black_water_ice_brick_stairs", () -> new StairBlock(BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.BLACK_WATER_ICE_BLOCKS.get("black_water_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> BLACK_WATER_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_BLACK))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "black_water_ice_slab",
                    "cobbled_black_water_ice_slab",
                    "black_water_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "black_water_ice_wall",
                    "cobbled_black_water_ice_wall",
                    "black_water_ice_brick_wall")
            .done();

    // Methane
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> METHANE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties())
            .register(
                    "methane_ice",
                    "cobbled_methane_ice",
                    "methane_ice_bricks",
                    "cracked_methane_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("methane_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            METHANE_ICE_STAIRS = register("methane_ice_stairs", () -> new StairBlock(METHANE_ICE_BLOCKS.get("methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice").get()))),
            COBBLED_METHANE_ICE_STAIRS = register("cobbled_methane_ice_stairs", () -> new StairBlock(METHANE_ICE_BLOCKS.get("cobbled_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.METHANE_ICE_BLOCKS.get("cobbled_methane_ice").get()))),
            METHANE_ICE_BRICK_STAIRS = register("methane_ice_brick_stairs", () -> new StairBlock(METHANE_ICE_BLOCKS.get("methane_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.METHANE_ICE_BLOCKS.get("methane_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> METHANE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties())
            .setBlockFunction(SlabBlock::new)
            .register(
                    "methane_ice_slab",
                    "cobbled_methane_ice_slab",
                    "methane_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "methane_ice_wall",
                    "cobbled_methane_ice_wall",
                    "methane_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_METHANE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .register(
                    "tholin_poor_methane_ice",
                    "tholin_poor_cobbled_methane_ice",
                    "tholin_poor_methane_ice_bricks",
                    "tholin_poor_cracked_methane_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_methane_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_POOR_METHANE_ICE_STAIRS = register("tholin_poor_methane_ice_stairs", () -> new StairBlock(THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice").get()))),
            THOLIN_POOR_COBBLED_METHANE_ICE_STAIRS = register("tholin_poor_cobbled_methane_ice_stairs", () -> new StairBlock(THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_cobbled_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_cobbled_methane_ice").get()))),
            THOLIN_POOR_METHANE_ICE_BRICK_STAIRS = register("tholin_poor_methane_ice_brick_stairs", () -> new StairBlock(THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_METHANE_ICE_BLOCKS.get("tholin_poor_methane_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_METHANE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_methane_ice_slab",
                    "tholin_poor_cobbled_methane_ice_slab",
                    "tholin_poor_methane_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_poor_methane_ice_wall",
                    "tholin_poor_cobbled_methane_ice_wall",
                    "tholin_poor_methane_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_METHANE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_RED))
            .register(
                    "tholin_rich_methane_ice",
                    "tholin_rich_cobbled_methane_ice",
                    "tholin_rich_methane_ice_bricks",
                    "tholin_rich_cracked_methane_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_methane_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_RICH_METHANE_ICE_STAIRS = register("tholin_rich_methane_ice_stairs", () -> new StairBlock(THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice").get()))),
            THOLIN_RICH_COBBLED_METHANE_ICE_STAIRS = register("tholin_rich_cobbled_methane_ice_stairs", () -> new StairBlock(THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_cobbled_methane_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_cobbled_methane_ice").get()))),
            THOLIN_RICH_METHANE_ICE_BRICK_STAIRS = register("tholin_rich_methane_ice_brick_stairs", () -> new StairBlock(THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_METHANE_ICE_BLOCKS.get("tholin_rich_methane_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_METHANE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.COLOR_RED))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_methane_ice_slab",
                    "tholin_rich_cobbled_methane_ice_slab",
                    "tholin_rich_methane_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_rich_methane_ice_wall",
                    "tholin_rich_cobbled_methane_ice_wall",
                    "tholin_rich_methane_ice_brick_wall")
            .done();

    // Carbon Dioxide
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CARBON_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.QUARTZ))
            .register(
                    "carbon_dioxide_ice",
                    "cobbled_carbon_dioxide_ice",
                    "carbon_dioxide_ice_bricks",
                    "cracked_carbon_dioxide_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("carbon_dioxide_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            CARBON_DIOXIDE_ICE_STAIRS = register("carbon_dioxide_ice_stairs", () -> new StairBlock(CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice").get()))),
            COBBLED_CARBON_DIOXIDE_ICE_STAIRS = register("cobbled_carbon_dioxide_ice_stairs", () -> new StairBlock(CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("cobbled_carbon_dioxide_ice").get()))),
            CARBON_DIOXIDE_ICE_BRICK_STAIRS = register("carbon_dioxide_ice_brick_stairs", () -> new StairBlock(CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CARBON_DIOXIDE_ICE_BLOCKS.get("carbon_dioxide_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.QUARTZ))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "carbon_dioxide_ice_slab",
                    "cobbled_carbon_dioxide_ice_slab",
                    "carbon_dioxide_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "carbon_dioxide_ice_wall",
                    "cobbled_carbon_dioxide_ice_wall",
                    "carbon_dioxide_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.METAL))
            .register(
                    "tholin_poor_carbon_dioxide_ice",
                    "tholin_poor_cobbled_carbon_dioxide_ice",
                    "tholin_poor_carbon_dioxide_ice_bricks",
                    "tholin_poor_cracked_carbon_dioxide_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_carbon_dioxide_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_POOR_CARBON_DIOXIDE_ICE_STAIRS = register("tholin_poor_carbon_dioxide_ice_stairs", () -> new StairBlock(THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice").get()))),
            THOLIN_POOR_COBBLED_CARBON_DIOXIDE_ICE_STAIRS = register("tholin_poor_cobbled_carbon_dioxide_ice_stairs", () -> new StairBlock(THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_cobbled_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_cobbled_carbon_dioxide_ice").get()))),
            THOLIN_POOR_CARBON_DIOXIDE_ICE_BRICK_STAIRS = register("tholin_poor_carbon_dioxide_ice_brick_stairs", () -> new StairBlock(THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_poor_carbon_dioxide_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.METAL))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_carbon_dioxide_ice_slab",
                    "tholin_poor_cobbled_carbon_dioxide_ice_slab",
                    "tholin_poor_carbon_dioxide_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_poor_carbon_dioxide_ice_wall",
                    "tholin_poor_cobbled_carbon_dioxide_ice_wall",
                    "tholin_poor_carbon_dioxide_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.STONE))
            .register(
                    "tholin_rich_carbon_dioxide_ice",
                    "tholin_rich_cobbled_carbon_dioxide_ice",
                    "tholin_rich_carbon_dioxide_ice_bricks",
                    "tholin_rich_cracked_carbon_dioxide_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_carbon_dioxide_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_RICH_CARBON_DIOXIDE_ICE_STAIRS = register("tholin_rich_carbon_dioxide_ice_stairs", () -> new StairBlock(THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice").get()))),
            THOLIN_RICH_COBBLED_CARBON_DIOXIDE_ICE_STAIRS = register("tholin_rich_cobbled_carbon_dioxide_ice_stairs", () -> new StairBlock(THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_cobbled_carbon_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_cobbled_carbon_dioxide_ice").get()))),
            THOLIN_RICH_CARBON_DIOXIDE_ICE_BRICK_STAIRS = register("tholin_rich_carbon_dioxide_ice_brick_stairs", () -> new StairBlock(THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS.get("tholin_rich_carbon_dioxide_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_CARBON_DIOXIDE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.STONE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_carbon_dioxide_ice_slab",
                    "tholin_rich_cobbled_carbon_dioxide_ice_slab",
                    "tholin_rich_carbon_dioxide_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_rich_carbon_dioxide_ice_wall",
                    "tholin_rich_cobbled_carbon_dioxide_ice_wall",
                    "tholin_rich_carbon_dioxide_ice_brick_wall")
            .done();

    // Ammonia
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> AMMONIA_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties())
            .register(
                    "ammonia_ice",
                    "cobbled_ammonia_ice",
                    "ammonia_ice_bricks",
                    "cracked_ammonia_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("ammonia_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            AMMONIA_ICE_STAIRS = register("ammonia_ice_stairs", () -> new StairBlock(AMMONIA_ICE_BLOCKS.get("ammonia_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice").get()))),
            COBBLED_AMMONIA_ICE_STAIRS = register("cobbled_ammonia_ice_stairs", () -> new StairBlock(AMMONIA_ICE_BLOCKS.get("cobbled_ammonia_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.AMMONIA_ICE_BLOCKS.get("cobbled_ammonia_ice").get()))),
            AMMONIA_ICE_BRICK_STAIRS = register("ammonia_ice_brick_stairs", () -> new StairBlock(AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.AMMONIA_ICE_BLOCKS.get("ammonia_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> AMMONIA_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties())
            .setBlockFunction(SlabBlock::new)
            .register(
                    "ammonia_ice_slab",
                    "cobbled_ammonia_ice_slab",
                    "ammonia_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "ammonia_ice_wall",
                    "cobbled_ammonia_ice_wall",
                    "ammonia_ice_brick_wall")
            .done();

    // Nitrogen
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.SNOW))
            .register(
                    "nitrogen_ice",
                    "cobbled_nitrogen_ice",
                    "nitrogen_ice_bricks",
                    "cracked_nitrogen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("nitrogen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            NITROGEN_ICE_STAIRS = register("nitrogen_ice_stairs", () -> new StairBlock(NITROGEN_ICE_BLOCKS.get("nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice").get()))),
            COBBLED_NITROGEN_ICE_STAIRS = register("cobbled_nitrogen_ice_stairs", () -> new StairBlock(NITROGEN_ICE_BLOCKS.get("cobbled_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.NITROGEN_ICE_BLOCKS.get("cobbled_nitrogen_ice").get()))),
            NITROGEN_ICE_BRICK_STAIRS = register("nitrogen_ice_brick_stairs", () -> new StairBlock(NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.NITROGEN_ICE_BLOCKS.get("nitrogen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> NITROGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.SNOW))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "nitrogen_ice_slab",
                    "cobbled_nitrogen_ice_slab",
                    "nitrogen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "nitrogen_ice_wall",
                    "cobbled_nitrogen_ice_wall",
                    "nitrogen_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .register(
                    "tholin_poor_nitrogen_ice",
                    "tholin_poor_cobbled_nitrogen_ice",
                    "tholin_poor_nitrogen_ice_bricks",
                    "tholin_poor_cracked_nitrogen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_poor_nitrogen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_POOR_NITROGEN_ICE_STAIRS = register("tholin_poor_nitrogen_ice_stairs", () -> new StairBlock(THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice").get()))),
            THOLIN_POOR_COBBLED_NITROGEN_ICE_STAIRS = register("tholin_poor_cobbled_nitrogen_ice_stairs", () -> new StairBlock(THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_cobbled_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_cobbled_nitrogen_ice").get()))),
            THOLIN_POOR_NITROGEN_ICE_BRICK_STAIRS = register("tholin_poor_nitrogen_ice_brick_stairs", () -> new StairBlock(THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_POOR_NITROGEN_ICE_BLOCKS.get("tholin_poor_nitrogen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_POOR_NITROGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_WHITE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_poor_nitrogen_ice_slab",
                    "tholin_poor_cobbled_nitrogen_ice_slab",
                    "tholin_poor_nitrogen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_poor_nitrogen_ice_wall",
                    "tholin_poor_cobbled_nitrogen_ice_wall",
                    "tholin_poor_nitrogen_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_RED))
            .register(
                    "tholin_rich_nitrogen_ice",
                    "tholin_rich_cobbled_nitrogen_ice",
                    "tholin_rich_nitrogen_ice_bricks",
                    "tholin_rich_cracked_nitrogen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("tholin_rich_nitrogen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            THOLIN_RICH_NITROGEN_ICE_STAIRS = register("tholin_rich_nitrogen_ice_stairs", () -> new StairBlock(THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice").get()))),
            THOLIN_RICH_COBBLED_NITROGEN_ICE_STAIRS = register("tholin_rich_cobbled_nitrogen_ice_stairs", () -> new StairBlock(THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_cobbled_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_cobbled_nitrogen_ice").get()))),
            THOLIN_RICH_NITROGEN_ICE_BRICK_STAIRS = register("tholin_rich_nitrogen_ice_brick_stairs", () -> new StairBlock(THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.THOLIN_RICH_NITROGEN_ICE_BLOCKS.get("tholin_rich_nitrogen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> THOLIN_RICH_NITROGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.TERRACOTTA_RED))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "tholin_rich_nitrogen_ice_slab",
                    "tholin_rich_cobbled_nitrogen_ice_slab",
                    "tholin_rich_nitrogen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "tholin_rich_nitrogen_ice_wall",
                    "tholin_rich_cobbled_nitrogen_ice_wall",
                    "tholin_rich_nitrogen_ice_brick_wall")
            .done();
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> RED_NITROGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.FIRE))
            .register(
                    "red_nitrogen_ice",
                    "cobbled_red_nitrogen_ice",
                    "red_nitrogen_ice_bricks",
                    "cracked_red_nitrogen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("red_nitrogen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            RED_NITROGEN_ICE_STAIRS = register("red_nitrogen_ice_stairs", () -> new StairBlock(RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice").get()))),
            COBBLED_RED_NITROGEN_ICE_STAIRS = register("cobbled_red_nitrogen_ice_stairs", () -> new StairBlock(RED_NITROGEN_ICE_BLOCKS.get("cobbled_red_nitrogen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("cobbled_red_nitrogen_ice").get()))),
            RED_NITROGEN_ICE_BRICK_STAIRS = register("red_nitrogen_ice_brick_stairs", () -> new StairBlock(RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.RED_NITROGEN_ICE_BLOCKS.get("red_nitrogen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> RED_NITROGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.FIRE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "red_nitrogen_ice_slab",
                    "cobbled_red_nitrogen_ice_slab",
                    "red_nitrogen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "red_nitrogen_ice_wall",
                    "cobbled_red_nitrogen_ice_wall",
                    "red_nitrogen_ice_brick_wall")
            .done();

    // Sulfur Dioxide
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SULFUR_DIOXIDE_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.SAND))
            .register(
                    "sulfur_dioxide_ice",
                    "cobbled_sulfur_dioxide_ice",
                    "sulfur_dioxide_ice_bricks",
                    "cracked_sulfur_dioxide_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("sulfur_dioxide_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            SULFUR_DIOXIDE_ICE_STAIRS = register("sulfur_dioxide_ice_stairs", () -> new StairBlock(SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice").get()))),
            COBBLED_SULFUR_DIOXIDE_ICE_STAIRS = register("cobbled_sulfur_dioxide_ice_stairs", () -> new StairBlock(SULFUR_DIOXIDE_ICE_BLOCKS.get("cobbled_sulfur_dioxide_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("cobbled_sulfur_dioxide_ice").get()))),
            SULFUR_DIOXIDE_ICE_BRICK_STAIRS = register("sulfur_dioxide_ice_brick_stairs", () -> new StairBlock(SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.SULFUR_DIOXIDE_ICE_BLOCKS.get("sulfur_dioxide_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> SULFUR_DIOXIDE_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties().mapColor(MapColor.SAND))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "sulfur_dioxide_ice_slab",
                    "cobbled_sulfur_dioxide_ice_slab",
                    "sulfur_dioxide_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "sulfur_dioxide_ice_wall",
                    "cobbled_sulfur_dioxide_ice_wall",
                    "sulfur_dioxide_ice_brick_wall")
            .done();

    // Oxygen
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> OXYGEN_ICE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties())
            .register(
                    "oxygen_ice",
                    "cobbled_oxygen_ice",
                    "oxygen_ice_bricks",
                    "cracked_oxygen_ice_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("oxygen_ice_pillar")
            .done();
    public static final DeferredBlock<Block>
            OXYGEN_ICE_STAIRS = register("oxygen_ice_stairs", () -> new StairBlock(OXYGEN_ICE_BLOCKS.get("oxygen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice").get()))),
            COBBLED_OXYGEN_ICE_STAIRS = register("cobbled_oxygen_ice_stairs", () -> new StairBlock(OXYGEN_ICE_BLOCKS.get("cobbled_oxygen_ice").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.OXYGEN_ICE_BLOCKS.get("cobbled_oxygen_ice").get()))),
            OXYGEN_ICE_BRICK_STAIRS = register("oxygen_ice_brick_stairs", () -> new StairBlock(OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.OXYGEN_ICE_BLOCKS.get("oxygen_ice_bricks").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> OXYGEN_ICE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            iceProperties())
            .setBlockFunction(SlabBlock::new)
            .register(
                    "oxygen_ice_slab",
                    "cobbled_oxygen_ice_slab",
                    "oxygen_ice_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "oxygen_ice_wall",
                    "cobbled_oxygen_ice_wall",
                    "oxygen_ice_brick_wall")
            .done();

    // Salt
    public static final DeferredBlock<Block>
            SALT_CRYSTAL_BLOCK = register("salt_crystal_block", () -> new Block(crystalProperties().mapColor(MapColor.QUARTZ))),
            SALT_DUST_BLOCK = register("salt_dust_block", () -> new ColoredFallingBlock(new ColorRGBA(0xDFCDDD), dustProperties().mapColor(MapColor.QUARTZ)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_SALT_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.QUARTZ))
            .register(
                    "cut_salt",
                    "chiseled_salt",
                    "polished_cut_salt",
                    "cut_salt_bricks",
                    "cracked_cut_salt_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("salt_pillar")
            .done();
    public static final DeferredBlock<Block>
            CUT_SALT_STAIRS = register("cut_salt_stairs", () -> new StairBlock(CUT_SALT_BLOCKS.get("cut_salt").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CUT_SALT_BLOCKS.get("cut_salt").get()))),
            POLISHED_CUT_SALT_STAIRS = register("polished_cut_salt_stairs", () -> new StairBlock(CUT_SALT_BLOCKS.get("cut_salt").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CUT_SALT_BLOCKS.get("cut_salt").get()))),
            CUT_SALT_BRICK_STAIRS = register("cut_salt_brick_stairs", () -> new StairBlock(CUT_SALT_BLOCKS.get("cut_salt").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CUT_SALT_BLOCKS.get("cut_salt").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_SALT_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.QUARTZ))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "cut_salt_slab",
                    "polished_cut_salt_slab",
                    "cut_salt_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "cut_salt_wall",
                    "polished_cut_salt_wall",
                    "cut_salt_brick_wall")
            .done();

    // Graphite
    public static final DeferredBlock<Block>
            GRAPHITE_CLUSTER = register("graphite_cluster", () -> new AmethystClusterBlock(7.0F, 3.0F, deepslateProperties().mapColor(MapColor.COLOR_BLACK))),
            GRAPHITE_CRYSTAL_BLOCK = register("graphite_crystal_block", () -> new Block(deepslateProperties().mapColor(MapColor.COLOR_BLACK))),
            GRAPHITE_DUST_BLOCK = register("graphite_dust_block", () -> new ColoredFallingBlock(new ColorRGBA(0x2D261B), dustProperties().mapColor(MapColor.COLOR_BLACK)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_GRAPHITE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_BLACK))
            .register(
                    "cut_graphite",
                    "chiseled_graphite",
                    "polished_cut_graphite",
                    "cut_graphite_bricks",
                    "cracked_cut_graphite_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("graphite_pillar")
            .done();
    public static final DeferredBlock<Block>
            CUT_GRAPHITE_STAIRS = register("cut_graphite_stairs", () -> new StairBlock(CUT_GRAPHITE_BLOCKS.get("cut_graphite").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite").get()))),
            POLISHED_CUT_GRAPHITE_STAIRS = register("polished_cut_graphite_stairs", () -> new StairBlock(CUT_GRAPHITE_BLOCKS.get("cut_graphite").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite").get()))),
            CUT_GRAPHITE_BRICK_STAIRS = register("cut_graphite_brick_stairs", () -> new StairBlock(CUT_GRAPHITE_BLOCKS.get("cut_graphite").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CUT_GRAPHITE_BLOCKS.get("cut_graphite").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_GRAPHITE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_BLACK))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "cut_graphite_slab",
                    "polished_cut_graphite_slab",
                    "cut_graphite_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "cut_graphite_wall",
                    "polished_cut_graphite_wall",
                    "cut_graphite_brick_wall")
            .done();

    // Sulfur
    public static final DeferredBlock<Block>
            SULFUR_CRYSTAL_BLOCK = register("sulfur_crystal_block", () -> new Block(crystalProperties().mapColor(MapColor.COLOR_YELLOW))),
            SULFUR_DUST_BLOCK = register("sulfur_dust_block", () -> new ColoredFallingBlock(new ColorRGBA(0xDFCDDD), dustProperties().mapColor(MapColor.COLOR_YELLOW)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_SULFUR_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_YELLOW))
            .register(
                    "cut_sulfur",
                    "chiseled_sulfur",
                    "polished_cut_sulfur",
                    "cut_sulfur_bricks",
                    "cracked_cut_sulfur_bricks")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("sulfur_pillar")
            .done();
    public static final DeferredBlock<Block>
            CUT_SULFUR_STAIRS = register("cut_sulfur_stairs", () -> new StairBlock(CUT_SULFUR_BLOCKS.get("cut_sulfur").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur").get()))),
            POLISHED_CUT_SULFUR_STAIRS = register("polished_cut_sulfur_stairs", () -> new StairBlock(CUT_SULFUR_BLOCKS.get("cut_sulfur").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur").get()))),
            CUT_SULFUR_BRICK_STAIRS = register("cut_sulfur_brick_stairs", () -> new StairBlock(CUT_SULFUR_BLOCKS.get("cut_sulfur").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.CUT_SULFUR_BLOCKS.get("cut_sulfur").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> CUT_SULFUR_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().mapColor(MapColor.COLOR_YELLOW))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "cut_sulfur_slab",
                    "polished_cut_sulfur_slab",
                    "cut_sulfur_brick_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "cut_sulfur_wall",
                    "polished_cut_sulfur_wall",
                    "cut_sulfur_brick_wall")
            .done();

    /*
    Karnis
     */

    public static final DeferredBlock<Block>
            TUMOR = register("tumor", () -> new AmethystClusterBlock(7.0F, 3.0F, BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).forceSolidOn().noOcclusion().sound(SoundType.HONEY_BLOCK).strength(0.2F, 0.2F).pushReaction(PushReaction.DESTROY).noCollission())),
            FLESH_BLOCK = register("flesh_block", () -> new MudBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).sound(SoundType.HONEY_BLOCK).strength(0.4F, 0.4F))),
            GRISTLED_FLESH = register("gristled_flesh", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS).strength(0.4F, 0.4F))),
            GRISTLE_BLOCK = register("gristle_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS).strength(0.1F, 0.1F))),
            SHORT_GRISTLES = register("short_gristles", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS))),
            TALL_GRISTLES = register("tall_gristles", () -> new TallGrassBlock(plantProperties().replaceable().offsetType(BlockBehaviour.OffsetType.XYZ).ignitedByLava().mapColor(MapColor.CRIMSON_HYPHAE).sound(SoundType.MOSS))),
            BRAINROCK = register("brainrock", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BEDROCK).mapColor(MapColor.RAW_IRON).sound(SoundType.HONEY_BLOCK))),
            BLOOD_VESSEL = register("blood_vessel", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_NYLIUM).sound(SoundType.HONEY_BLOCK).strength(0.4F, 0.4F)));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> GORESLATE_BLOCKS = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().sound(SoundType.CORAL_BLOCK).mapColor(MapColor.CRIMSON_HYPHAE))
            .register(
                    "goreslate",
                    "chiseled_goreslate",
                    "polished_goreslate",
                    "goreslate_bricks",
                    "goreslate_tiles")
            .setBlockFunction(RotatedPillarBlock::new)
            .register("goreslate_pillar")
            .done();
    public static final DeferredBlock<Block>
            GORESLATE_STAIRS = register("goreslate_stairs", () -> new StairBlock(GORESLATE_BLOCKS.get("goreslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_BLOCKS.get("goreslate").get()))),
            POLISHED_GORESLATE_STAIRS = register("polished_goreslate_stairs", () -> new StairBlock(GORESLATE_BLOCKS.get("polished_goreslate").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_BLOCKS.get("polished_goreslate").get()))),
            GORESLATE_BRICK_STAIRS = register("goreslate_brick_stairs", () -> new StairBlock(GORESLATE_BLOCKS.get("goreslate_bricks").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_BLOCKS.get("goreslate_bricks").get()))),
            GORESLATE_TILE_STAIRS = register("goreslate_tile_stairs", () -> new StairBlock(GORESLATE_BLOCKS.get("goreslate_tiles").get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(CBlocks.GORESLATE_BLOCKS.get("goreslate_tiles").get())));
    public static final DeferredHolders<Block, DeferredBlock<? extends Block>> GORESLATE_BLOCKS_CONTINUED = new RegolithBlockBuilder<>(
            RegolithNeoForge.wrapBlocks(BLOCKS),
            RegolithNeoForge.wrapItems(CItems.ITEMS),
            stoneProperties().sound(SoundType.CORAL_BLOCK).mapColor(MapColor.CRIMSON_HYPHAE))
            .setBlockFunction(SlabBlock::new)
            .register(
                    "goreslate_slab",
                    "polished_goreslate_slab",
                    "goreslate_brick_slab",
                    "goreslate_tile_slab")
            .setBlockFunction(WallBlock::new)
            .register(
                    "goreslate_wall",
                    "polished_goreslate_wall",
                    "goreslate_brick_wall",
                    "goreslate_tile_wall")
            .done();
    
    /*
    Raw Material Blocks
     */

    public static final DeferredBlock<Block>
            BRUMA_BLOCK = register("bruma_block", () -> new HayBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HAY_BLOCK).mapColor(MapColor.COLOR_BLUE).sound(SoundType.MOSS))),
            RAW_OBDURIUM_BLOCK = register("raw_obdurium_block", () -> new Block(rawBlockProperties().sound(SoundType.ANCIENT_DEBRIS).mapColor(MapColor.COLOR_PURPLE))),
            RAW_MALUNITE_BLOCK = register("raw_malunite_block", () -> new Block(rawBlockProperties().mapColor(MapColor.COLOR_GREEN))),
            RAW_LUTRUM_BLOCK = register("raw_lutrum_block", () -> new Block(rawBlockProperties().mapColor(MapColor.CLAY))),
            LUTRUM_AMALGAMATE_BLOCK = register("lutrum_amalgamate_block", () -> new Block(rawBlockProperties().sound(SoundType.ANCIENT_DEBRIS).mapColor(MapColor.COLOR_GRAY)));

    // Lutrum
    public static final DeferredBlock<Block>
            LUTRUM_BLOCK = register("lutrum_block", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_SHEET_METAL = register("lutrum_sheet_metal", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            CHISELED_LUTRUM = register("chiseled_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_GRATE = register("lutrum_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.CLAY))),
            LUTRUM_PLATING = register("lutrum_plating", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_STAIRS = register("lutrum_plating_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_SLAB = register("lutrum_plating_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_PLATING_PRESSURE_PLATE = register("lutrum_plating_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.UNAFFECTED, 20, lutrumProperties().mapColor(MapColor.CLAY).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            LUTRUM_PLATING_BUTTON = register("lutrum_plating_button", () -> new WeatheringCopperButtonBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.UNAFFECTED, 20, lutrumProperties().mapColor(MapColor.CLAY).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            LUTRUM_WINDOW = register("lutrum_window", () -> new WeatheringCopperTransparentBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            LUTRUM_PILLAR = register("lutrum_pillar", () -> new WeatheringCopperRotatedPillarBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_BARS = register("lutrum_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().mapColor(MapColor.CLAY))),
            LUTRUM_DOOR = register("lutrum_door", () -> new WeatheringCopperDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.UNAFFECTED, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.CLAY))),
            LUTRUM_TRAPDOOR = register("lutrum_trapdoor", () -> new WeatheringCopperTrapDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.CLAY))),
            LUTRUM_BULB = register("lutrum_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.CLAY))),
            EXPOSED_LUTRUM = register("exposed_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_SHEET_METAL = register("exposed_lutrum_sheet_metal", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_CHISELED_LUTRUM = register("exposed_chiseled_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_GRATE = register("exposed_lutrum_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING = register("exposed_lutrum_plating", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_STAIRS = register("exposed_lutrum_plating_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, EXPOSED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_SLAB = register("exposed_lutrum_plating_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE = register("exposed_lutrum_plating_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.EXPOSED, 30, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            EXPOSED_LUTRUM_PLATING_BUTTON = register("exposed_lutrum_plating_button", () -> new WeatheringCopperButtonBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.EXPOSED, 30, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            EXPOSED_LUTRUM_WINDOW = register("exposed_lutrum_window", () -> new WeatheringCopperTransparentBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            EXPOSED_LUTRUM_PILLAR = register("exposed_lutrum_pillar", () -> new WeatheringCopperRotatedPillarBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_BARS = register("exposed_lutrum_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_DOOR = register("exposed_lutrum_door", () -> new WeatheringCopperDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.EXPOSED, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_TRAPDOOR = register("exposed_lutrum_trapdoor", () -> new WeatheringCopperTrapDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            EXPOSED_LUTRUM_BULB = register("exposed_lutrum_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).lightLevel(litBlockEmission(14)))),
            WEATHERED_LUTRUM = register("weathered_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_SHEET_METAL = register("weathered_lutrum_sheet_metal", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_CHISELED_LUTRUM = register("weathered_chiseled_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_GRATE = register("weathered_lutrum_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING = register("weathered_lutrum_plating", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_STAIRS = register("weathered_lutrum_plating_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.WEATHERED, WEATHERED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_SLAB = register("weathered_lutrum_plating_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE = register("weathered_lutrum_plating_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.WEATHERED, 40, lutrumProperties().mapColor(MapColor.STONE).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WEATHERED_LUTRUM_PLATING_BUTTON = register("weathered_lutrum_plating_button", () -> new WeatheringCopperButtonBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.WEATHERED, 40, lutrumProperties().mapColor(MapColor.STONE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WEATHERED_LUTRUM_WINDOW = register("weathered_lutrum_window", () -> new WeatheringCopperTransparentBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WEATHERED_LUTRUM_PILLAR = register("weathered_lutrum_pillar", () -> new WeatheringCopperRotatedPillarBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_BARS = register("weathered_lutrum_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_DOOR = register("weathered_lutrum_door", () -> new WeatheringCopperDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.WEATHERED, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_TRAPDOOR = register("weathered_lutrum_trapdoor", () -> new WeatheringCopperTrapDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.STONE))),
            WEATHERED_LUTRUM_BULB = register("weathered_lutrum_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.STONE).lightLevel(litBlockEmission(13)))),
            OXIDIZED_LUTRUM = register("oxidized_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_SHEET_METAL = register("oxidized_lutrum_sheet_metal", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_CHISELED_LUTRUM = register("oxidized_chiseled_lutrum", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_GRATE = register("oxidized_lutrum_grate", () -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING = register("oxidized_lutrum_plating", () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_STAIRS = register("oxidized_lutrum_plating_stairs", () -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.OXIDIZED, OXIDIZED_LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_SLAB = register("oxidized_lutrum_plating_slab", () -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE = register("oxidized_lutrum_plating_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.OXIDIZED, 50, lutrumProperties().mapColor(MapColor.COLOR_GRAY).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            OXIDIZED_LUTRUM_PLATING_BUTTON = register("oxidized_lutrum_plating_button", () -> new WeatheringCopperButtonBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.OXIDIZED, 50, lutrumProperties().mapColor(MapColor.COLOR_GRAY).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            OXIDIZED_LUTRUM_WINDOW = register("oxidized_lutrum_window", () -> new WeatheringCopperTransparentBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            OXIDIZED_LUTRUM_PILLAR = register("oxidized_lutrum_pillar", () -> new WeatheringCopperRotatedPillarBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_BARS = register("oxidized_lutrum_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_DOOR = register("oxidized_lutrum_door", () -> new WeatheringCopperDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.OXIDIZED, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_TRAPDOOR = register("oxidized_lutrum_trapdoor", () -> new WeatheringCopperTrapDoorBlock(CBlockSetTypes.LUTRUM, WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.COLOR_GRAY))),
            OXIDIZED_LUTRUM_BULB = register("oxidized_lutrum_bulb", () -> new WeatheringCopperBulbBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.COLOR_GRAY).lightLevel(litBlockEmission(12))));
    public static final DeferredBlock<Block>
            WAXED_LUTRUM_BLOCK = register("waxed_lutrum_block", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_SHEET_METAL = register("waxed_lutrum_sheet_metal", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_CHISELED_LUTRUM = register("waxed_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_GRATE = register("waxed_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING = register("waxed_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_STAIRS = register("waxed_lutrum_plating_stairs", () -> new StairBlock(LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_SLAB = register("waxed_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_lutrum_plating_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.LUTRUM, lutrumProperties().mapColor(MapColor.CLAY).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_LUTRUM_PLATING_BUTTON = register("waxed_lutrum_plating_button", () -> new ButtonBlock(CBlockSetTypes.LUTRUM, 20, lutrumProperties().mapColor(MapColor.CLAY).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_LUTRUM_WINDOW = register("waxed_lutrum_window", () -> new TransparentBlock(lutrumProperties().mapColor(MapColor.CLAY).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WAXED_LUTRUM_PILLAR = register("waxed_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_BARS = register("waxed_lutrum_bars", () -> new IronBarsBlock(lutrumProperties().mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_DOOR = register("waxed_lutrum_door", () -> new DoorBlock(CBlockSetTypes.LUTRUM, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_TRAPDOOR = register("waxed_lutrum_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.LUTRUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.CLAY))),
            WAXED_LUTRUM_BULB = register("waxed_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.CLAY))),
            WAXED_EXPOSED_LUTRUM = register("waxed_exposed_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_SHEET_METAL = register("waxed_exposed_lutrum_sheet_metal", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_CHISELED_LUTRUM = register("waxed_exposed_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_GRATE = register("waxed_exposed_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING = register("waxed_exposed_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_STAIRS = register("waxed_exposed_lutrum_plating_stairs", () -> new StairBlock(LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_SLAB = register("waxed_exposed_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_exposed_lutrum_plating_pressure_plate", () -> new ConfigurablePressurePlateBlock(CBlockSetTypes.LUTRUM, 30, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_EXPOSED_LUTRUM_PLATING_BUTTON = register("waxed_exposed_lutrum_plating_button", () -> new ButtonBlock(CBlockSetTypes.LUTRUM, 30, lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_EXPOSED_LUTRUM_WINDOW = register("waxed_exposed_lutrum_window", () -> new TransparentBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WAXED_EXPOSED_LUTRUM_PILLAR = register("waxed_exposed_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_BARS = register("waxed_exposed_lutrum_bars", () -> new IronBarsBlock(lutrumProperties().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_DOOR = register("waxed_exposed_lutrum_door", () -> new DoorBlock(CBlockSetTypes.LUTRUM, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_TRAPDOOR = register("waxed_exposed_lutrum_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.LUTRUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE))),
            WAXED_EXPOSED_LUTRUM_BULB = register("waxed_exposed_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).lightLevel(litBlockEmission(14)))),
            WAXED_WEATHERED_LUTRUM = register("waxed_weathered_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_SHEET_METAL = register("waxed_weathered_lutrum_sheet_metal", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_CHISELED_LUTRUM = register("waxed_weathered_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_GRATE = register("waxed_weathered_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING = register("waxed_weathered_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_STAIRS = register("waxed_weathered_lutrum_plating_stairs", () -> new StairBlock(LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_SLAB = register("waxed_weathered_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_weathered_lutrum_plating_pressure_plate", () -> new ConfigurablePressurePlateBlock(CBlockSetTypes.LUTRUM, 40, lutrumProperties().mapColor(MapColor.STONE).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_WEATHERED_LUTRUM_PLATING_BUTTON = register("waxed_weathered_lutrum_plating_button", () -> new ButtonBlock(CBlockSetTypes.LUTRUM, 40, lutrumProperties().mapColor(MapColor.STONE).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_WEATHERED_LUTRUM_WINDOW = register("waxed_weathered_lutrum_window", () -> new TransparentBlock(lutrumProperties().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WAXED_WEATHERED_LUTRUM_PILLAR = register("waxed_weathered_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_BARS = register("waxed_weathered_lutrum_bars", () -> new IronBarsBlock(lutrumProperties().mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_DOOR = register("waxed_weathered_lutrum_door", () -> new DoorBlock(CBlockSetTypes.LUTRUM, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_TRAPDOOR = register("waxed_weathered_lutrum_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.LUTRUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.STONE))),
            WAXED_WEATHERED_LUTRUM_BULB = register("waxed_weathered_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.STONE).lightLevel(litBlockEmission(13)))),
            WAXED_OXIDIZED_LUTRUM = register("waxed_oxidized_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_SHEET_METAL = register("waxed_oxidized_lutrum_sheet_metal", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_CHISELED_LUTRUM = register("waxed_oxidized_chiseled_lutrum", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_GRATE = register("waxed_oxidized_lutrum_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING = register("waxed_oxidized_lutrum_plating", () -> new Block(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_STAIRS = register("waxed_oxidized_lutrum_plating_stairs", () -> new StairBlock(LUTRUM_PLATING.get().defaultBlockState(), lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_SLAB = register("waxed_oxidized_lutrum_plating_slab", () -> new SlabBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_PRESSURE_PLATE = register("waxed_oxidized_lutrum_plating_pressure_plate", () -> new ConfigurablePressurePlateBlock(CBlockSetTypes.LUTRUM, 50, lutrumProperties().mapColor(MapColor.COLOR_GRAY).forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_OXIDIZED_LUTRUM_PLATING_BUTTON = register("waxed_oxidized_lutrum_plating_button", () -> new ButtonBlock(CBlockSetTypes.LUTRUM, 50, lutrumProperties().mapColor(MapColor.COLOR_GRAY).noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            WAXED_OXIDIZED_LUTRUM_WINDOW = register("waxed_oxidized_lutrum_window", () -> new TransparentBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.COPPER_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            WAXED_OXIDIZED_LUTRUM_PILLAR = register("waxed_oxidized_lutrum_pillar", () -> new RotatedPillarBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_BARS = register("waxed_oxidized_lutrum_bars", () -> new IronBarsBlock(lutrumProperties().mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_DOOR = register("waxed_oxidized_lutrum_door", () -> new DoorBlock(CBlockSetTypes.LUTRUM, lutrumProperties().noOcclusion().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_TRAPDOOR = register("waxed_oxidized_lutrum_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.LUTRUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.COLOR_GRAY))),
            WAXED_OXIDIZED_LUTRUM_BULB = register("waxed_oxidized_lutrum_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.COLOR_GRAY).lightLevel(litBlockEmission(12))));

    // Obdurium
    public static final DeferredBlock<Block>
            OBDURIUM_BLOCK = register("obdurium_block", () -> new Block(obduriumProperties())),
            OBDURIUM_SHEET_METAL = register("obdurium_sheet_metal", () -> new Block(obduriumProperties())),
            OBDURIUM_GRATE = register("obdurium_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_PURPLE).strength(8.0F, 6000.0F).sound(CSoundTypes.NETHERITE_GRATE))),
            OBDURIUM_PLATING = register("obdurium_plating", () -> new Block(obduriumProperties())),
            OBDURIUM_PLATING_STAIRS = register("obdurium_plating_stairs", () -> new StairBlock(OBDURIUM_PLATING.get().defaultBlockState(), obduriumProperties())),
            OBDURIUM_PLATING_SLAB = register("obdurium_plating_slab", () -> new SlabBlock(obduriumProperties())),
            OBDURIUM_PLATING_PRESSURE_PLATE = register("obdurium_plating_pressure_plate", () -> new ConfigurablePressurePlateBlock(CBlockSetTypes.OBDURIUM, 60, obduriumProperties().forceSolidOn().noCollission().strength(2.0F, 6000.0F).pushReaction(PushReaction.DESTROY))),
            OBDURIUM_PLATING_BUTTON = register("obdurium_plating_button", () -> new ButtonBlock(CBlockSetTypes.OBDURIUM, 60, obduriumProperties().noCollission().strength(2.0F, 6000.0F).pushReaction(PushReaction.DESTROY))),
            OBDURIUM_WINDOW = register("obdurium_window", () -> new TransparentBlock(obduriumProperties().instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.NETHERITE_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            OBDURIUM_PILLAR = register("obdurium_pillar", () -> new RotatedPillarBlock(obduriumProperties())),
            OBDURIUM_BARS = register("obdurium_bars", () -> new IronBarsBlock(obduriumProperties())),
            OBDURIUM_DOOR = register("obdurium_door", () -> new DoorBlock(CBlockSetTypes.OBDURIUM, obduriumProperties().noOcclusion().pushReaction(PushReaction.DESTROY))),
            OBDURIUM_TRAPDOOR = register("obdurium_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.OBDURIUM, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.COLOR_PURPLE).strength(8.0F, 6000.0F).sound(SoundType.NETHERITE_BLOCK))),
            OBDURIUM_BULB = register("obdurium_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).mapColor(MapColor.COLOR_PURPLE).strength(8.0F, 6000.0F).sound(CSoundTypes.NETHERITE_BULB)));

    // Malunite
    public static final DeferredBlock<Block>
            MALUNITE_BLOCK = register("malunite_block", () -> new Block(maluniteProperties())),
            MALUNITE_SHEET_METAL = register("malunite_sheet_metal", () -> new Block(maluniteProperties())),
            MALUNITE_GRATE = register("malunite_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).sound(CSoundTypes.METAL_GRATE).mapColor(MapColor.COLOR_GREEN))),
            MALUNITE_PLATING = register("malunite_plating", () -> new Block(maluniteProperties())),
            MALUNITE_PLATING_STAIRS = register("malunite_plating_stairs", () -> new StairBlock(MALUNITE_PLATING.get().defaultBlockState(), maluniteProperties())),
            MALUNITE_PLATING_SLAB = register("malunite_plating_slab", () -> new SlabBlock(maluniteProperties())),
            MALUNITE_PLATING_PRESSURE_PLATE = register("malunite_plating_pressure_plate", () -> new PressurePlateBlock(CBlockSetTypes.MALUNITE, maluniteProperties().forceSolidOn().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            MALUNITE_PLATING_BUTTON = register("malunite_plating_button", () -> new ButtonBlock(CBlockSetTypes.MALUNITE, 20, maluniteProperties().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY))),
            MALUNITE_WINDOW = register("malunite_window", () -> new TransparentBlock(obduriumProperties().instrument(NoteBlockInstrument.HAT).sound(CSoundTypes.METAL_WINDOW).noOcclusion().isValidSpawn(Blocks::never).isRedstoneConductor((state, getter, pos) -> false).isSuffocating((state, getter, pos) -> false).isViewBlocking((state, getter, pos) -> false))),
            MALUNITE_PILLAR = register("malunite_pillar", () -> new RotatedPillarBlock(maluniteProperties())),
            MALUNITE_BARS = register("malunite_bars", () -> new IronBarsBlock(maluniteProperties())),
            MALUNITE_DOOR = register("malunite_door", () -> new DoorBlock(CBlockSetTypes.MALUNITE, maluniteProperties().noOcclusion().pushReaction(PushReaction.DESTROY))),
            MALUNITE_TRAPDOOR = register("malunite_trapdoor", () -> new TrapDoorBlock(CBlockSetTypes.MALUNITE, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.COLOR_GREEN))),
            MALUNITE_BULB = register("malunite_bulb", () -> new CopperBulbBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BULB).sound(CSoundTypes.METAL_BULB).mapColor(MapColor.COLOR_GREEN)));

    /*
    Potted Plants
     */

    public static final DeferredBlock<Block>
            POTTED_MAYURA_SAPLING = BLOCKS.register("potted_mayura_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, MAYURA_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_SPRUCE_SAPLING))),
            POTTED_GRIMWOOD_SAPLING = BLOCKS.register("potted_grimwood_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GRIMWOOD_SAPLING, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_SPRUCE_SAPLING))),
            POTTED_VIVIAN = BLOCKS.register("potted_vivian", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, VIVIAN, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY))),
            POTTED_WICKUL = BLOCKS.register("potted_wickul", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, WICKUL, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY))),
            POTTED_ICEFLOWER = BLOCKS.register("potted_iceflower", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ICEFLOWER, BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY)));

    /*
    Common Properties
     */

    private static BlockBehaviour.Properties iceProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_ICE)
                .strength(1.5F, 1.5F)
                .requiresCorrectToolForDrops()
                .friction(0.85F);
    }
    private static BlockBehaviour.Properties plantProperties() {
        return BlockBehaviour.Properties.of()
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .pushReaction(PushReaction.DESTROY);
    }
    private static BlockBehaviour.Properties grassProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.GRASS_BLOCK);
    }
    private static BlockBehaviour.Properties dirtProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT);
    }
    private static BlockBehaviour.Properties pathProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT_PATH);
    }
    private static BlockBehaviour.Properties farmlandProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.FARMLAND);
    }
    private static BlockBehaviour.Properties mudProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.MUD);
    }
    private static BlockBehaviour.Properties stoneProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.STONE);
    }
    private static BlockBehaviour.Properties packedMudProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD);
    }
    private static BlockBehaviour.Properties mudBrickProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS);
    }
    private static BlockBehaviour.Properties deepslateProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE);
    }
    private static BlockBehaviour.Properties stoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE);
    }
    private static BlockBehaviour.Properties stoneRedstoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE);
    }
    private static BlockBehaviour.Properties deepslateOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE);
    }
    private static BlockBehaviour.Properties deepslateRedstoneOreProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE);
    }
    private static BlockBehaviour.Properties crystalProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.AMETHYST)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 1.5F);
    }
    private static BlockBehaviour.Properties compressedDustProperties() {
        return BlockBehaviour.Properties.of()
                .sound(SoundType.DEEPSLATE)
                .instrument(NoteBlockInstrument.CHIME)
                .requiresCorrectToolForDrops()
                .strength(2.0F, 2.0F);
    }
    private static BlockBehaviour.Properties dustProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.SAND);
    }
    private static BlockBehaviour.Properties rawBlockProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK);
    }
    private static BlockBehaviour.Properties obduriumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_PURPLE)
                .requiresCorrectToolForDrops()
                .strength(8.0F, 6000.0F)
                .sound(SoundType.NETHERITE_BLOCK);
    }
    private static BlockBehaviour.Properties maluniteProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_GREEN)
                .requiresCorrectToolForDrops()
                .strength(4.0F, 6.0F)
                .sound(SoundType.METAL);
    }
    private static BlockBehaviour.Properties lutrumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_CYAN)
                .requiresCorrectToolForDrops()
                .strength(3.0F, 6.0F)
                .sound(SoundType.COPPER);
    }
    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return block -> block.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
    // Automatically Register Block Items
    private static <T extends Block> DeferredBlock<T> register(String id, Supplier<T> block) {
        var registeredBlock = BLOCKS.register(id, block);
        CItems.ITEMS.registerSimpleBlockItem(registeredBlock);
        return registeredBlock;
    }
}