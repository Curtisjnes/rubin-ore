package com.example.rubinore;


import com.example.rubinore.RubinItem.RubinItemInit;
import com.example.rubinore.Rubinblock.Rubinblock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RubinOreMain.MODID)
public class RubinOreMain
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "rubinore";

    public RubinOreMain() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);
        RubinItemInit.ITEMS.register(modEventBus);
        Rubinblock.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}
