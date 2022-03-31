package com.rayrindu.jwe.villager;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.rayrindu.jwe.JweMod;
import com.rayrindu.jwe.item.JweModItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModProfessions {
    public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS, JweMod.MOD_ID);

    public static final RegistryObject<VillagerProfession> ARCHAEOLOGIST = PROFESSIONS.register("archaeologist",
            () -> new VillagerProfession("archaeologist", ModPoiTypes.ARCHAEOLOGIST_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_LEATHERWORKER));
     // TRADE LISTS
    public static void fillTradeData() {
         // WOODWORKER TRADES
        VillagerTrades.ItemListing[] archaeologistLevel1 = new VillagerTrades.ItemListing[]{
                new VillagerTrades.EmeraldForItems(Blocks.STONE.asItem() ,6,16,2),
                new VillagerTrades.ItemsForEmeralds(JweModItems.AMBER.get(), 1, 6, 16, 1),
                new VillagerTrades.EmeraldForItems(Items.BONE,6,16,2),
                new VillagerTrades.ItemsForEmeralds(JweModItems.TROWEL.get(), 1, 6, 16, 1),
        };
        VillagerTrades.ItemListing[] archaeologistLevel2 = new VillagerTrades.ItemListing[]{
                new VillagerTrades.EmeraldForItems(JweModItems.AMBER_WITH_MOSQUITO.get(),6,16,10),
                new VillagerTrades.ItemsForEmeralds(Items.LAPIS_LAZULI, 1, 6, 16, 5),
                new VillagerTrades.EmeraldForItems(Blocks.LANTERN.asItem(),6,16,10),
                new VillagerTrades.ItemsForEmeralds(Items.GUNPOWDER, 1, 6, 16, 5),
        };
        VillagerTrades.ItemListing[] archaeologistLevel3 = new VillagerTrades.ItemListing[]{
                new VillagerTrades.EmeraldForItems(Items.ACACIA_SAPLING,6,16,20),
                new VillagerTrades.ItemsForEmeralds(Items.ACACIA_LOG, 1, 6, 16, 10),
                new VillagerTrades.EmeraldForItems(Items.JUNGLE_SAPLING,6,16,20),
                new VillagerTrades.ItemsForEmeralds(Items.JUNGLE_LOG, 1, 6, 16, 10),
        };
        VillagerTrades.ItemListing[] archaeologistLevel4 = new VillagerTrades.ItemListing[]{
                new VillagerTrades.ItemsForEmeralds(Items.WARPED_STEM, 1, 6, 16, 15),
                new VillagerTrades.ItemsForEmeralds(Items.CRIMSON_STEM, 1, 6, 16, 15),
        };/**
        VillagerTrades.ItemListing[] archaeologistLevel5 = new VillagerTrades.ItemListing[]{
                new VillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_AXE, 12, 3, 15, 0.2F),
                new VillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_HOE, 12, 3, 15, 0.2F)

        };**/
        VillagerTrades.TRADES.put(ARCHAEOLOGIST.get(),toIntMap(ImmutableMap.of(1,archaeologistLevel1,2,archaeologistLevel2,3,archaeologistLevel3,4,archaeologistLevel4)));
    }

    private static Int2ObjectMap<VillagerTrades.ItemListing[]> toIntMap(ImmutableMap<Integer, VillagerTrades.ItemListing[]> p_221238_0_) {
        return new Int2ObjectOpenHashMap<>(p_221238_0_);
    }
}