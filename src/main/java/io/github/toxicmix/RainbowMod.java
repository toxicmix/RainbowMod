package io.github.toxicmix;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.toxicmix.core.init.BlockInit;
import io.github.toxicmix.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RainbowMod.MOD_ID)
public class RainbowMod{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "rainbowmod";

    public RainbowMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
        
    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
    	
    	MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){

    }

}
