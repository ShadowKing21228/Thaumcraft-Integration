package com.shadowking21.tc_integraton;

import com.shadowking21.tc_integraton.DirectIntegrations.*;
import com.shadowking21.tc_integraton.Items.Clusters;
import com.shadowking21.tc_integraton.OreDicts.OreDicts;
import com.shadowking21.tc_integraton.Utils.ClusterProcessing;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
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

    @Mod.EventBusSubscriber(modid = MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            if (!Loader.isModLoaded("jaopca")) {
                event.getRegistry().registerAll(
                        Clusters.clusterAluminum,
                        Clusters.clusterArdite,
                        Clusters.clusterCobalt,
                        Clusters.clusterArlemite,
                        Clusters.clusterIridium,
                        Clusters.clusterNetherite,
                        Clusters.clusterNickel,
                        Clusters.clusterOsmium,
                        Clusters.clusterPlatinum,
                        Clusters.clusterRealmite,
                        Clusters.clusterRupee,
                        Clusters.clusterAstralStarmetal
                );
            }
            else if (Loader.isModLoaded("divinerpg"))
            {
                event.getRegistry().registerAll(
                        Clusters.clusterArlemite,
                        Clusters.clusterNetherite,
                        Clusters.clusterRealmite,
                        Clusters.clusterRupee
                );
            }
        }

        @SubscribeEvent
        @SideOnly(Side.CLIENT)
        public static void registerModels(ModelRegistryEvent event) {
            if (!Loader.isModLoaded("jaopca")) {
                registerModel(Clusters.clusterAluminum);
                registerModel(Clusters.clusterArdite);
                registerModel(Clusters.clusterCobalt);
                registerModel(Clusters.clusterArlemite);
                registerModel(Clusters.clusterIridium);
                registerModel(Clusters.clusterNetherite);
                registerModel(Clusters.clusterNickel);
                registerModel(Clusters.clusterOsmium);
                registerModel(Clusters.clusterPlatinum);
                registerModel(Clusters.clusterRealmite);
                registerModel(Clusters.clusterRupee);
                registerModel(Clusters.clusterAstralStarmetal);
            }
            else if (Loader.isModLoaded("divinerpg"))
            {
                registerModel(Clusters.clusterArlemite);
                registerModel(Clusters.clusterNetherite);
                registerModel(Clusters.clusterRealmite);
                registerModel(Clusters.clusterRupee);
            }
        }

        @SideOnly(Side.CLIENT)
        private static void registerModel(Item item) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }

    @GameRegistry.ObjectHolder(MODID)
    public static class Items {
        public static final Item clusterAluminum = null;
        public static final Item clusterArdite = null;
        public static final Item clusterCobalt = null;
        public static final Item clusterArlemite = null;
        public static final Item clusterIridium = null;
        public static final Item clusterNetherite = null;
        public static final Item clusterNickel = null;
        public static final Item clusterOsmium = null;
        public static final Item clusterPlatinum = null;
        public static final Item clusterRealmite = null;
        public static final Item clusterRupee = null;
        public static final Item clusterAstralStarmetal = null;
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        SmeltingBonus.SmeltBonus();
        Clusters.oreDictClusters();
        if (!Loader.isModLoaded("jaopca")) ClusterProcessing.clusterProcessing(ClusterProcessing.Material);
            else ClusterProcessing.clusterProcessing(ClusterProcessing.jaopcaMaterial);
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
