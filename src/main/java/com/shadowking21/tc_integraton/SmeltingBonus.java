package com.shadowking21.tc_integraton;

import com.shadowking21.tc_integraton.test.ItemUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;
import thaumcraft.api.ThaumcraftApi;

import java.util.List;

public class SmeltingBonus {

    public static void SmeltBonus()
    {
        System.out.println("[Thaumcraft Integration] Adding Smelting Bonus!");
        String[] oreDict = {"Nickel", "Iridium", "Aluminum", "Platinum", "Mithril", "Diamond", "Uranium", "Osmium", "Emerald", "Rupee", "Arlemite", "Realmite"};
        String nugget = "nugget";
        int a = 0;
        int b = oreDict.length;
        while (a < b) {
            String OredictNugget = nugget + oreDict[a];
            List<ItemStack> ItemStackList = OreDictionary.getOres(OredictNugget);
            if (!ItemStackList.isEmpty()) {
                String OredictOre = "ore" + oreDict[a];
                ItemStack outputNugget = ItemStackList.get(0);
                ThaumcraftApi.addSmeltingBonus(OredictOre, outputNugget);
            }
            a = a + 1;
        }
        if (Loader.isModLoaded("astralsorcery"))
        {
            ItemStack Input1 = new ItemStack(ItemUtils.getRegisteredItem("astralsorcery", "itemcraftingcomponent"), 1, 2);
            ThaumcraftApi.addSmeltingBonus("oreAstralStarmetal", Input1, 0.1f);
            ThaumcraftApi.addSmeltingBonus("oreAquamarine", new ItemStack(ItemUtils.getRegisteredItem("astralsorcery", "itemcraftingcomponent")));
        }
        if (Loader.isModLoaded("divinerpg"))
        {
            String[] DivineOreDict = {"Eden", "Apalachia", "Wildwood", "Skythern", "Mortum"};
            for (int c = 0;c < DivineOreDict.length ; c++) {
                String InputDivine = "ore" + DivineOreDict[c];
                String OutputOreDict = "fragments" + DivineOreDict[c];
                List<ItemStack> OutputDivine = OreDictionary.getOres(OutputOreDict);
                ThaumcraftApi.addSmeltingBonus(InputDivine, OutputDivine.get(0));
            }
            ThaumcraftApi.addSmeltingBonus("oreNetherite", new ItemStack(ItemUtils.getRegisteredItem("divinerpg", "netherite_nugget")));
            ThaumcraftApi.addSmeltingBonus("oreBloodgem", new ItemStack(ItemUtils.getRegisteredItem("divinerpg", "bloodgem")), 0.1f);
        }
    }
}
