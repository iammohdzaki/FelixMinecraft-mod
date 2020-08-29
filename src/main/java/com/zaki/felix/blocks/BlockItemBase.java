package com.zaki.felix.blocks;

import com.zaki.felix.Felix;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block,new Item.Properties().group(Felix.TAB));
    }
}
