package com.scorch.testmod.handler;


import com.scorch.testmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import org.lwjgl.Sys;

import java.io.File;

public class ConfigurationHandler

{
    public static Configuration configuration;
    public static boolean testValue = false;
    public static boolean isJakobCool = true;

    public static void init(File configFile) {
        //Load config
        if (configuration == null) {
            configuration = new Configuration(configFile);

            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }


    public static void loadConfiguration() {

        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Example");
        isJakobCool = configuration.getBoolean("Is Jakob The Best?", Configuration.CATEGORY_GENERAL, true, "This is a very easy question, is Jakob the best of them all");

        if (configuration.hasChanged()) {
            configuration.save();
        }

    }
}




