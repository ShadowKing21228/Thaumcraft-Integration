package com.shadowking21.tc_integraton.utils;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.common.lib.utils.Utils;

import java.util.List;

public class ClusterProcessing {

    public static final String[] Material = {"Aluminum", "Ardite", "Arlemite", "Cobalt", "Iridium", "Netherite", "Nickel", "Osmium", "Platinum", "Realmite", "Rupee", "AstralStarmetal"};

    public static final String[] drpgMaterial = {"Netherite", "Arlemite", "Realmite", "Rupee"};

    public static void clusterDrop(String string, ItemStack itemstack) {
        for (ItemStack itemStackOre : OreDictionary.getOres(string)) {
            Utils.addSpecialMiningResult(itemStackOre, itemstack, 1.0f);
        }
    }

    public static void clusterProcessing(String[] materials) {
        for (String material : materials) {
            String clusterMaterial = "cluster" + material;
            String ingotMaterial = "ingot" + material;
            String oreMaterial = "ore" + material;

            if (OreDictionary.doesOreNameExist(oreMaterial)
                    && OreDictionary.doesOreNameExist(ingotMaterial)
                    && OreDictionary.doesOreNameExist(clusterMaterial))
            {
                List<ItemStack> cluster = OreDictionary.getOres(clusterMaterial);
                List<ItemStack> ingot = OreDictionary.getOres(ingotMaterial);
                //List<ItemStack> ore = OreDictionary.getOres(oreMaterial);

                ItemStack clusterStack = cluster.get(0);
                clusterDrop(oreMaterial, clusterStack);

                ItemStack ingot2 = ingot.get(0).copy();
                ingot2.setCount(2);
                GameRegistry.addSmelting(clusterStack, ingot2, 1.0f);

                String resloc = "thaumcraft:metal_purification_" + material;
                CrucibleRecipe clusterRecipe = new CrucibleRecipe(
                        "METALPURIFICATION",
                        clusterStack,
                        oreMaterial,
                        new AspectList().add(Aspect.METAL, 5).add(Aspect.ORDER, 5)
                );
                ThaumcraftApi.addCrucibleRecipe(new ResourceLocation(resloc), clusterRecipe);
            }
        }
    }

    public static void init() {
        clusterProcessing(Material);
    }
}
