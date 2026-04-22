package com.shadowking21.tc_integraton;

import com.shadowking21.tc_integraton.Utils.ClusterProcessing;
import com.shadowking21.tc_integraton.Utils.ItemUtils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;

import java.util.List;

public class SmeltingBonus {
    private static final String[] ORE_DICT_BONUS_MATERIALS = {
            "Nickel", "Iridium", "Aluminum", "Platinum", "Mithril", "Diamond", "Uranium", "Osmium",
            "Emerald", "Rupee", "Arlemite", "Realmite", "Cobalt", "Ardite"
    };
    private static final String[] DIVINE_ORE_DICT = {"Eden", "Apalachia", "Wildwood", "Skythern", "Mortum"};
    private static final String NUGGET_PREFIX = "nugget";

    public static void SmeltBonus() {
        System.out.println("[Thaumcraft Integration] Adding Smelting Bonus!");

        for (String material : ORE_DICT_BONUS_MATERIALS) {
            addSmeltingBonusFromOreDict("ore" + material, NUGGET_PREFIX + material);
        }

        if (!Loader.isModLoaded("jaopca")) {
            for (String s : ClusterProcessing.Material) {
                if ("AstralStarmetal".equals(s) || "Netherite".equals(s)) {
                    continue;
                }
                addSmeltingBonusFromOreDict("cluster" + s, NUGGET_PREFIX + s);
            }
        } else {
            for (String s : ClusterProcessing.jaopcaMaterial) {
                addSmeltingBonusFromOreDict("cluster" + s, NUGGET_PREFIX + s);
            }
        }

        if (Loader.isModLoaded("astralsorcery")) {
            ItemStack starmetalNugget = ItemUtils.getRegisteredItemStack("astralsorcery", "itemcraftingcomponent", 2);
            if (starmetalNugget != null) {
                ThaumcraftApi.addSmeltingBonus("oreAstralStarmetal", starmetalNugget, 0.1f);
                if (!Loader.isModLoaded("jaopca")) {
                    ThaumcraftApi.addSmeltingBonus("clusterAstralStarmetal", starmetalNugget, 0.1f);
                }
            }

            ItemStack aquamarineDrop = ItemUtils.getRegisteredItemStack("astralsorcery", "itemcraftingcomponent", 0);
            if (aquamarineDrop != null) {
                ThaumcraftApi.addSmeltingBonus("oreAquamarine", aquamarineDrop);
            }
        }

        if (Loader.isModLoaded("divinerpg")) {
            for (String divineMaterial : DIVINE_ORE_DICT) {
                addSmeltingBonusFromOreDict("ore" + divineMaterial, "fragments" + divineMaterial);
            }

            ItemStack netheriteNugget = ItemUtils.getRegisteredItemStack("divinerpg", "netherite_nugget", 0);
            if (netheriteNugget != null) {
                ThaumcraftApi.addSmeltingBonus("oreNetherite", netheriteNugget);
                ThaumcraftApi.addSmeltingBonus("clusterNetherite", netheriteNugget);
            }

            ItemStack bloodgem = ItemUtils.getRegisteredItemStack("divinerpg", "bloodgem", 0);
            if (bloodgem != null) {
                ThaumcraftApi.addSmeltingBonus("oreBloodgem", bloodgem, 0.1f);
            }
        }
    }

    private static void addSmeltingBonusFromOreDict(String inputOreDict, String outputOreDict) {
        List<ItemStack> outputStacks = OreDictionary.getOres(outputOreDict);
        if (!outputStacks.isEmpty()) {
            ThaumcraftApi.addSmeltingBonus(inputOreDict, outputStacks.get(0));
        }
    }
}
