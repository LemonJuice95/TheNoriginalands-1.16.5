package org.chinafir.noriginalands.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.chinafir.noriginalands.utils.Reference;

public class TNItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    public static final RegistryObject<Item> RAW_IRON = ITEMS.register("raw_iron", () -> new TNItembase(new Item.Properties().tab(TNGroupRegister.tngroup)));
    public static final RegistryObject<Item> RAW_GOLD = ITEMS.register("raw_gold", () -> new TNItembase(new Item.Properties().tab(TNGroupRegister.tngroup)));

    public static final RegistryObject<Item> INDIGO_STEEL_INGOT = ITEMS.register("indigo_steel_ingot", () -> new TNItembase(new Item.Properties().tab(TNGroupRegister.tngroup)));
}
