package com.rayrindu.jwe.block;

import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.item.JweModItems;
import com.rayrindu.jwe.item.JweModTab;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class JweModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JweMod.MOD_ID);

    //Amber Ore
    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f), UniformInt.of(3, 7)), JweModTab.JWE_BLOCK_TAB);

    //Deepslate Amber Ore
    public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f), UniformInt.of(3, 7)), JweModTab.JWE_BLOCK_TAB);

    //Amber Block
    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f)), JweModTab.JWE_BLOCK_TAB);

    //Amber Bricks
    public static final RegistryObject<Block> AMBER_BRICKS = registerBlock("amber_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f)), JweModTab.JWE_BLOCK_TAB);

    //Amber Column
    public static final RegistryObject<Block> AMBER_COLUMN = registerBlock("amber_column",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f)), JweModTab.JWE_BLOCK_TAB);

    //Carved Amber Bricks
    public static final RegistryObject<Block> CARVED_AMBER_BRICKS = registerBlock("carved_amber_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f)), JweModTab.JWE_BLOCK_TAB);
    //Cultivator
    public static final RegistryObject<Block> CULTIVATOR = registerBlock("cultivator",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)
                    .strength(1f)), JweModTab.JWE_BLOCK_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return JweModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}