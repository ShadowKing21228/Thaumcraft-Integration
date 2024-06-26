package com.shadowking21.tc_integraton;

import com.shadowking21.tc_integraton.DirectIntegrations.AppliedEnergistics2Compat;
import com.shadowking21.tc_integraton.DirectIntegrations.WitherSkeletonFixCompat;
import com.shadowking21.tc_integraton.OreDicts.OreDicts;
import com.shadowking21.tc_integraton.DirectIntegrations.MekanismCompat;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = thaumcraft_integration.MODID, name = thaumcraft_integration.NAME, version = thaumcraft_integration.VERSION)
public class thaumcraft_integration
{
    public static final String MODID = "tc_integration";
    public static final String NAME = "Thaumcraft Integration";
    public static final String VERSION = "0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //FMLInterModComms.sendMessage("Thaumcraft Integration", "nativeCluster","15,0,25016,16,2.0");
        SmeltingBonus.SmeltBonus();
        MinecraftForge.EVENT_BUS.register(new OreDicts());
        if (Loader.isModLoaded("mekanism")) MinecraftForge.EVENT_BUS.register(new MekanismCompat());
        if (Loader.isModLoaded("witherskelefix")) MinecraftForge.EVENT_BUS.register(new WitherSkeletonFixCompat());
        if (Loader.isModLoaded("appliedenergistics2")) MinecraftForge.EVENT_BUS.register(new AppliedEnergistics2Compat());
    }
}
