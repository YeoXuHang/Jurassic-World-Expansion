package com.rayrindu.jwe.item;

import com.rayrindu.jwe.block.JweModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class JweModTab {
    public static final CreativeModeTab JWE_TAB = new CreativeModeTab("jweitemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(JweModItems.AMBER.get());
        }
    };
    public static final CreativeModeTab JWE_BLOCK_TAB = new CreativeModeTab("jweblocktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(JweModBlocks.AMBER_ORE.get());
        }
    };
}

