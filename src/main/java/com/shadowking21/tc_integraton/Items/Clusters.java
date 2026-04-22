package com.shadowking21.tc_integraton.Items;

import com.shadowking21.tc_integraton.Utils.ClusterProcessing;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.common.lib.CreativeTabThaumcraft;

import java.lang.reflect.Field;

public class Clusters {

    public static Item clusterAluminum = new Item()
            .setUnlocalizedName("cluster.aluminum")
            .setRegistryName("tc_integration", "cluster_aluminum")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterArdite = new Item()
            .setUnlocalizedName("cluster.ardite")
            .setRegistryName("tc_integration", "cluster_ardite")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterArlemite = new Item()
            .setUnlocalizedName("cluster.arlemite")
            .setRegistryName("tc_integration", "cluster_arlemite")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterCobalt = new Item()
            .setUnlocalizedName("cluster.cobalt")
            .setRegistryName("tc_integration", "cluster_cobalt")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterIridium = new Item()
            .setUnlocalizedName("cluster.iridium")
            .setRegistryName("tc_integration", "cluster_iridium")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterNetherite = new Item()
            .setUnlocalizedName("cluster.netherite")
            .setRegistryName("tc_integration", "cluster_netherite")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterNickel = new Item()
            .setUnlocalizedName("cluster.nickel")
            .setRegistryName("tc_integration", "cluster_nickel")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterOsmium = new Item()
            .setUnlocalizedName("cluster.osmium")
            .setRegistryName("tc_integration", "cluster_osmium")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterPlatinum = new Item()
            .setUnlocalizedName("cluster.platinum")
            .setRegistryName("tc_integration", "cluster_platinum")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterRealmite = new Item()
            .setUnlocalizedName("cluster.realmite")
            .setRegistryName("tc_integration", "cluster_realmite")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterRupee = new Item()
            .setUnlocalizedName("cluster.rupee")
            .setRegistryName("tc_integration", "cluster_rupee")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);
    public static Item clusterAstralStarmetal = new Item()
            .setUnlocalizedName("cluster.astralstarmetal")
            .setRegistryName("tc_integration", "cluster_astralstarmetal")
            .setMaxStackSize(64)
            .setCreativeTab(CreativeTabThaumcraft.MISC);

    public static void oreDictClusters()
    {
        String cluster;
        if (!Loader.isModLoaded("jaopca")) {
            for (int a = 0; ClusterProcessing.Material.length > a; a++) {
                cluster = "cluster" + ClusterProcessing.Material[a];
                try {
                    Field field = Clusters.class.getDeclaredField(cluster);
                    Item value = (Item) field.get(null);
                    ItemStack valuestack = new ItemStack(value, 1);
                    OreDictionary.registerOre(cluster, valuestack);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        else
        {
            for (int a = 0; ClusterProcessing.jaopcaMaterial.length > a; a++) {
                cluster = "cluster" + ClusterProcessing.jaopcaMaterial[a];
                try {
                    Field field = Clusters.class.getDeclaredField(cluster);
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
