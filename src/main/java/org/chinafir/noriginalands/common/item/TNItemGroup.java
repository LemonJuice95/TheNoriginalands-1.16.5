package org.chinafir.noriginalands.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class TNItemGroup extends ItemGroup {
    public TNItemGroup() {
        super("noriginalands_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.AIR);
    }
}
