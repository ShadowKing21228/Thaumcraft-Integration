package com.shadowking21.tc_integraton;

import com.shadowking21.tc_integraton.integration.OreDicts;
import com.shadowking21.tc_integraton.integration.direct.*;
import com.shadowking21.tc_integraton.items.ClustersRegistry;
import com.shadowking21.tc_integraton.utils.ClusterProcessing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thaumcraft.api.ThaumcraftApi;

@Mod(modid = ThaumcraftIntegration.MODID, name = ThaumcraftIntegration.NAME, version = ThaumcraftIntegration.VERSION)
public class ThaumcraftIntegration
{
    public static final String MODID = "tc_integration";

    public static final String NAME = "Thaumcraft Integration";

    public static final String VERSION = "1.4.1-1.12.2";

    //private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new ClustersRegistry());
        //logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new OreDicts());

        ClustersRegistry.oreDictClusters();
        SmeltingBonus.SmeltBonus();
        ClusterProcessing.init();

        registerCompat(new MekanismCompat());
        registerCompat(new WitherSkeletonFixCompat());
        registerCompat(new AppliedEnergistics2Compat());
        registerCompat(new BloodMagicCompat());
        registerCompat(new AstralSorceryCompat());
        registerCompat(new ImmersiveEngineeringCompat());
        registerCompat(new ImmersivePetroleumCompat());
        registerCompat(new WizardryCompat());

        ThaumcraftApi.registerResearchLocation(new ResourceLocation(MODID, "research/alchemy"));
    }

    private void registerCompat(CompatClass clazz)
    {
        if (Loader.isModLoaded(clazz.modId)) {
            MinecraftForge.EVENT_BUS.register(clazz);
        }
    }
}
