package com.zaki.felix.items;

import com.zaki.felix.Felix;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Felix.TAB));
    }

}
