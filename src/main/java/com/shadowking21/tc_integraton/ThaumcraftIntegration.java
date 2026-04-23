package com.shadowking21.tc_integraton;

import com.shadowking21.tc_integraton.DirectIntegrations.*;
import com.shadowking21.tc_integraton.OreDicts.OreDicts;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ThaumcraftIntegration.MODID, name = ThaumcraftIntegration.NAME, version = ThaumcraftIntegration.VERSION)
public class ThaumcraftIntegration
{
    public static final String MODID = "tc_integration";
    public static final String NAME = "Thaumcraft Integration";
    public static final String VERSION = "1.3-1.12.2";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        SmeltingBonus.SmeltBonus();
        MinecraftForge.EVENT_BUS.register(new OreDicts());
        if (Loader.isModLoaded("mekanism")) MinecraftForge.EVENT_BUS.register(new MekanismCompat());
        if (Loader.isModLoaded("witherskelefix")) MinecraftForge.EVENT_BUS.register(new WitherSkeletonFixCompat());
        if (Loader.isModLoaded("appliedenergistics2")) MinecraftForge.EVENT_BUS.register(new AppliedEnergistics2Compat());
        if (Loader.isModLoaded("bloodmagic")) MinecraftForge.EVENT_BUS.register(new BloodMagicCompat());
        if (Loader.isModLoaded("astralsorcery")) MinecraftForge.EVENT_BUS.register(new AstralSorceryCompat());
        if (Loader.isModLoaded("immersiveengineering")) MinecraftForge.EVENT_BUS.register(new ImmersiveEngineeringCompat());
        if (Loader.isModLoaded("immersivepetroleum")) MinecraftForge.EVENT_BUS.register(new ImmersivePetroleumCompat());
    }
}
