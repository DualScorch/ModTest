package com.scorch.testmod;

import com.scorch.testmod.configuration.ConfigurationHandler;
import com.scorch.testmod.proxy.IProxy;
import com.scorch.testmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)
public class testmod

{

    @Mod.Instance(Reference.MOD_ID)
    public static testmod instance;

    @SidedProxy(clientSide = "com.scorch.testmod.proxy.ClientProxy", serverSide = "com.scorch.testmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
