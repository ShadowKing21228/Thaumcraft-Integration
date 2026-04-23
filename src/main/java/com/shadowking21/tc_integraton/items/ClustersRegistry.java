package com.shadowking21.tc_integraton.items;

import com.shadowking21.tc_integraton.ThaumcraftIntegration;
import com.shadowking21.tc_integraton.utils.ClusterProcessing;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.common.lib.CreativeTabThaumcraft;

import java.lang.reflect.Field;

public class ClustersRegistry {
    
    public static Item clusterAluminum = new Item()
            .setUnlocalizedName("cluster.aluminum")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_aluminum")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterArdite = new Item()
            .setUnlocalizedName("cluster.ardite")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_ardite")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterArlemite = new Item()
            .setUnlocalizedName("cluster.arlemite")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_arlemite")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterCobalt = new Item()
            .setUnlocalizedName("cluster.cobalt")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_cobalt")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterIridium = new Item()
            .setUnlocalizedName("cluster.iridium")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_iridium")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterNetherite = new Item()
            .setUnlocalizedName("cluster.netherite")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_netherite")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterNickel = new Item()
            .setUnlocalizedName("cluster.nickel")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_nickel")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterOsmium = new Item()
            .setUnlocalizedName("cluster.osmium")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_osmium")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterPlatinum = new Item()
            .setUnlocalizedName("cluster.platinum")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_platinum")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterRealmite = new Item()
            .setUnlocalizedName("cluster.realmite")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_realmite")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterRupee = new Item()
            .setUnlocalizedName("cluster.rupee")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_rupee")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static Item clusterAstralStarmetal = new Item()
            .setUnlocalizedName("cluster.astralstarmetal")
            .setRegistryName(ThaumcraftIntegration.MODID, "cluster_astralstarmetal")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {

        if (!Loader.isModLoaded("jaopca"))
            event.getRegistry().registerAll(
                    clusterAluminum,
                    clusterArdite,
                    clusterNickel,
                    clusterCobalt,
                    clusterIridium,
                    clusterOsmium,
                    clusterPlatinum
            );

        if (Loader.isModLoaded("divinerpg"))
            event.getRegistry().registerAll(
                    clusterArlemite,
                    clusterRealmite,
                    clusterRupee,
                    clusterNetherite
            );

        if (Loader.isModLoaded("astralsorcery"))
            event.getRegistry().register(
                    clusterAstralStarmetal
            );
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerClusterModels(ModelRegistryEvent event) {

        if (!Loader.isModLoaded("jaopca"))
        {
            registerModel(clusterAluminum);
            registerModel(clusterArdite);
            registerModel(clusterNickel);
            registerModel(clusterCobalt);
            registerModel(clusterIridium);
            registerModel(clusterOsmium);
            registerModel(clusterPlatinum);
        }

        if (Loader.isModLoaded("divinerpg"))
        {
            registerModel(clusterArlemite);
            registerModel(clusterRealmite);
            registerModel(clusterRupee);
            registerModel(clusterNetherite);
        }

        if (Loader.isModLoaded("astralsorcery")) {
            registerModel(clusterAstralStarmetal);
        }

    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void oreDictClusters()
    {
        String cluster;
        if (!Loader.isModLoaded("jaopca")) {
            for (int a = 0; ClusterProcessing.Material.length > a; a++) {
                cluster = "cluster" + ClusterProcessing.Material[a];
                try {
                    Field field = ClustersRegistry.class.getDeclaredField(cluster);
                    Item value = (Item) field.get(null);
                    ItemStack valuestack = new ItemStack(value, 1);
                    OreDictionary.registerOre(cluster, valuestack);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        else if (Loader.isModLoaded("divinerpg"))
        {
            for (int a = 0; ClusterProcessing.drpgMaterial.length > a; a++) {
                cluster = "cluster" + ClusterProcessing.drpgMaterial[a];
                try {
                    Field field = ClustersRegistry.class.getDeclaredField(cluster);
                    Item value = (Item) field.get(null);
                    ItemStack valuestack = new ItemStack(value, 1);
                    OreDictionary.registerOre(cluster, valuestack);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
