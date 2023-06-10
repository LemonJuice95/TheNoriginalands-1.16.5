package org.chinafir.noriginalands.utils;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import org.chinafir.noriginalands.common.item.TNItemRegister;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
    public static void deferredRegisters(IEventBus bus) {
        TNItemRegister.ITEMS.register(bus);
    }
}