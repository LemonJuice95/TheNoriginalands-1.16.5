package org.chinafir.noriginalands;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.chinafir.noriginalands.utils.Reference;
import org.chinafir.noriginalands.utils.RegistryHandler;

@Mod(Reference.MODID)
@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheNoriginalands {
    public TheNoriginalands() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        RegistryHandler.deferredRegisters(modBus);
    }
}
