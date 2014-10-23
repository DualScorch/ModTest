package com.scorch.testmod.configuration;


import net.minecraftforge.common.config.Configuration;
import org.lwjgl.Sys;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Load config
        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;
        try
        {
            configuration.load();

            configValue = configuration.get("Cool Guy Thingy", "configValue", true, "Example").getBoolean();
        }

        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();

        }
        System.out.println("ModTest Config:" + (configValue));
    }
}
