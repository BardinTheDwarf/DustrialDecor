package blueduck.dustrial.dustrialdecor.registry;

import blueduck.dustrial.dustrialdecor.DustrialDecorMod;
import blueduck.dustrial.dustrialdecor.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DustrialBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, DustrialDecorMod.MODID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, DustrialDecorMod.MODID);


    public static final RegistryObject<Block> PADDED_BLOCK = BLOCKS.register("padded_block", () -> new PaddedBlock(Block.Properties.create(Material.WOOL, MaterialColor.WHITE_TERRACOTTA).sound(SoundType.CLOTH).hardnessAndResistance(1F, 1F).harvestLevel(0)));
    public static final RegistryObject<Item> PADDED_BLOCK_ITEM = ITEMS.register("padded_block", () -> new BlockItem(PADDED_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> MINI_PADDED_BLOCK = BLOCKS.register("mini_padded_block", () -> new PaddedBlock(Block.Properties.from(PADDED_BLOCK.get())));
    public static final RegistryObject<Item> MINI_PADDED_BLOCK_ITEM = ITEMS.register("mini_padded_block", () -> new BlockItem(MINI_PADDED_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> PADDED_TRAPDOOR = BLOCKS.register("padded_trapdoor", () -> new DustrialTrapDoor(Block.Properties.from(Blocks.IRON_BLOCK).sound(SoundType.CLOTH)));
    public static final RegistryObject<Item> PADDED_TRAPDOOR_ITEM = ITEMS.register("padded_trapdoor", () -> new BlockItem(PADDED_TRAPDOOR.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> PADDED_DOOR = BLOCKS.register("padded_door", () -> new DustrialDoor(Block.Properties.from(PADDED_TRAPDOOR.get())));
    public static final RegistryObject<Item> PADDED_DOOR_ITEM = ITEMS.register("padded_door", () -> new BlockItem(PADDED_DOOR.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Block> CHAIN_LINK_FENCE = BLOCKS.register("chain_link_fence", () -> new DustrialPane(Block.Properties.from(Blocks.IRON_BARS).sound(SoundType.SCAFFOLDING), true, false));
    public static final RegistryObject<Item> CHAIN_LINK_FENCE_ITEM = ITEMS.register("chain_link_fence", () -> new BlockItem(CHAIN_LINK_FENCE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> BARBED_CHAIN_LINK_FENCE = BLOCKS.register("barbed_chain_link_fence", () -> new DustrialPane(Block.Properties.from(Blocks.IRON_BARS).sound(SoundType.SCAFFOLDING), true, true));
    public static final RegistryObject<Item> BARBED_CHAIN_LINK_FENCE_ITEM = ITEMS.register("barbed_chain_link_fence", () -> new BlockItem(BARBED_CHAIN_LINK_FENCE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> BARBED_IRON_BARS = BLOCKS.register("barbed_iron_bars", () -> new DustrialPane(Block.Properties.from(Blocks.IRON_BARS).sound(SoundType.METAL), false, true));
    public static final RegistryObject<Item> BARBED_IRON_BARS_ITEM = ITEMS.register("barbed_iron_bars", () -> new BlockItem(BARBED_IRON_BARS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> CHAIN_TRAPDOOR = BLOCKS.register("chain_trapdoor", () -> new DustrialTrapDoor(Block.Properties.create(Material.ROCK).hardnessAndResistance(1F, 1F).sound(SoundType.SCAFFOLDING)));
    public static final RegistryObject<Item> CHAIN_TRAPDOOR_ITEM = ITEMS.register("chain_trapdoor", () -> new BlockItem(CHAIN_TRAPDOOR.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Block> CHAIN_DOOR = BLOCKS.register("chain_door", () -> new DustrialDoor(Block.Properties.from(CHAIN_TRAPDOOR.get())));
    public static final RegistryObject<Item> CHAIN_DOOR_ITEM = ITEMS.register("chain_door", () -> new BlockItem(CHAIN_DOOR.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Block> INDUSTRIAL_IRON_BLOCK = BLOCKS.register("industrial_iron_block", () -> new Block(Block.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Item> INDUSTRIAL_IRON_BLOCK_ITEM = ITEMS.register("industrial_iron_block", () -> new BlockItem(INDUSTRIAL_IRON_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> INDUSTRIAL_IRON_PILLAR_BLOCK = BLOCKS.register("industrial_iron_pillar", () -> new RotatedPillarBlock(Block.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Item> INDUSTRIAL_IRON_PILLAR_BLOCK_ITEM = ITEMS.register("industrial_iron_pillar", () -> new BlockItem(INDUSTRIAL_IRON_PILLAR_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> BOLTED_INDUSTRIAL_IRON_BLOCK = BLOCKS.register("bolted_industrial_iron_block", () -> new Block(Block.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Item> BOLTED_INDUSTRIAL_IRON_BLOCK_ITEM = ITEMS.register("bolted_industrial_iron_block", () -> new BlockItem(BOLTED_INDUSTRIAL_IRON_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> INDUSTRIAL_IRON_TRAPDOOR = BLOCKS.register("industrial_iron_trapdoor", () -> new DustrialTrapDoor(Block.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Item> INDUSTRIAL_IRON_TRAPDOOR_ITEM = ITEMS.register("industrial_iron_trapdoor", () -> new BlockItem(INDUSTRIAL_IRON_TRAPDOOR.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Block> INDUSTRIAL_IRON_DOOR = BLOCKS.register("industrial_iron_door", () -> new DustrialDoor(Block.Properties.from(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Item> INDUSTRIAL_IRON_DOOR_ITEM = ITEMS.register("industrial_iron_door", () -> new BlockItem(INDUSTRIAL_IRON_DOOR.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> SHEET_METAL = ITEMS.register("sheet_metal", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Block> SHEET_METAL_PLATING = BLOCKS.register("sheet_metal_plating", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> SHEET_METAL_PLATING_ITEM = ITEMS.register("sheet_metal_plating", () -> new BlockItem(SHEET_METAL_PLATING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> SHEET_METAL_PANELING = BLOCKS.register("sheet_metal_paneling", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> SHEET_METAL_PANELING_ITEM = ITEMS.register("sheet_metal_paneling", () -> new BlockItem(SHEET_METAL_PANELING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> SHEET_METAL_SIDING = BLOCKS.register("sheet_metal_siding", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> SHEET_METAL_SIDING_ITEM = ITEMS.register("sheet_metal_siding", () -> new BlockItem(SHEET_METAL_SIDING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> SHEET_METAL_WALLING = BLOCKS.register("sheet_metal_walling", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> SHEET_METAL_WALLING_ITEM = ITEMS.register("sheet_metal_walling", () -> new BlockItem(SHEET_METAL_WALLING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> SHEET_METAL_TREADING = BLOCKS.register("sheet_metal_treading", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    //public static final RegistryObject<Item> SHEET_METAL_TREADING_ITEM = ITEMS.register("sheet_metal_treading", () -> new BlockItem(SHEET_METAL_TREADING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> SHEET_METAL_TRAPDOOR = BLOCKS.register("sheet_metal_trapdoor", () -> new DustrialTrapDoor(Block.Properties.create(Material.ROCK).hardnessAndResistance(1F, 1F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> SHEET_METAL_TRAPDOOR_ITEM = ITEMS.register("sheet_metal_trapdoor", () -> new BlockItem(SHEET_METAL_TRAPDOOR.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Block> SHEET_METAL_DOOR = BLOCKS.register("sheet_metal_door", () -> new DustrialDoor(Block.Properties.from(SHEET_METAL_TRAPDOOR.get())));
    public static final RegistryObject<Item> SHEET_METAL_DOOR_ITEM = ITEMS.register("sheet_metal_door", () -> new BlockItem(SHEET_METAL_DOOR.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> RUSTY_SHEET_METAL = ITEMS.register("rusty_sheet_metal", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Block> RUSTY_SHEET_METAL_PLATING = BLOCKS.register("rusty_sheet_metal_plating", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> RUSTY_SHEET_METAL_PLATING_ITEM = ITEMS.register("rusty_sheet_metal_plating", () -> new BlockItem(RUSTY_SHEET_METAL_PLATING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> RUSTY_SHEET_METAL_PANELING = BLOCKS.register("rusty_sheet_metal_paneling", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> RUSTY_SHEET_METAL_PANELING_ITEM = ITEMS.register("rusty_sheet_metal_paneling", () -> new BlockItem(RUSTY_SHEET_METAL_PANELING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> RUSTY_SHEET_METAL_SIDING = BLOCKS.register("rusty_sheet_metal_siding", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> RUSTY_SHEET_METAL_SIDING_ITEM = ITEMS.register("rusty_sheet_metal_siding", () -> new BlockItem(RUSTY_SHEET_METAL_SIDING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> RUSTY_SHEET_METAL_WALLING = BLOCKS.register("rusty_sheet_metal_walling", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> RUSTY_SHEET_METAL_WALLING_ITEM = ITEMS.register("rusty_sheet_metal_walling", () -> new BlockItem(RUSTY_SHEET_METAL_WALLING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> RUSTY_SHEET_METAL_TREADING = BLOCKS.register("rusty_sheet_metal_treading", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.5F).sound(SoundType.METAL)));
    //public static final RegistryObject<Item> RUSTY_SHEET_METAL_TREADING_ITEM = ITEMS.register("rusty_sheet_metal_treading", () -> new BlockItem(RUSTY_SHEET_METAL_TREADING.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> RUSTY_SHEET_METAL_TRAPDOOR = BLOCKS.register("rusty_sheet_metal_trapdoor", () -> new DustrialTrapDoor(Block.Properties.create(Material.ROCK).hardnessAndResistance(1F, 1F).sound(SoundType.METAL)));
    public static final RegistryObject<Item> RUSTY_SHEET_METAL_TRAPDOOR_ITEM = ITEMS.register("rusty_sheet_metal_trapdoor", () -> new BlockItem(RUSTY_SHEET_METAL_TRAPDOOR.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Block> RUSTY_SHEET_METAL_DOOR = BLOCKS.register("rusty_sheet_metal_door", () -> new DustrialDoor(Block.Properties.from(SHEET_METAL_TRAPDOOR.get())));
    public static final RegistryObject<Item> RUSTY_SHEET_METAL_DOOR_ITEM = ITEMS.register("rusty_sheet_metal_door", () -> new BlockItem(RUSTY_SHEET_METAL_DOOR.get(), new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Block> CINDER_BLOCK = BLOCKS.register("cinder_block", () -> new CinderBlock(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Item> CINDER_BLOCK_ITEM = ITEMS.register("cinder_block", () -> new BlockItem(CINDER_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> POLISHED_CINDER_BLOCK = BLOCKS.register("polished_cinder_block", () -> new CinderBlock(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Item> POLISHED_CINDER_BLOCK_ITEM = ITEMS.register("polished_cinder_block", () -> new BlockItem(POLISHED_CINDER_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<Block> CINDER_BRICKS = BLOCKS.register("cinder_bricks", () -> new Block(Block.Properties.from(Blocks.STONE)));
    public static final RegistryObject<Item> CINDER_BRICKS_ITEM = ITEMS.register("cinder_bricks", () -> new BlockItem(CINDER_BRICKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));


    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
