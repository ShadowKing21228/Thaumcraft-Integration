package com.shadowking21.tc_integraton.Utils;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

import java.util.*;

public class AspectMetalProcessing {

    public static List<String> oreNameMetal = Arrays.asList("Iron", "Gold", "Aluminum", "Ardite", "Arlemite", "Cobalt", "Iridium", "Netherite", "Nickel", "Osmium", "Platinum", "Realmite",
            "Rupee", "AstralStarmetal", "Lead", "Enderium", "EnderiumBase", "Aquatic", "Draconium", "DraconiumAwakened", "ElectricalSteel", "Electrum", "ElectrumFlux", "IronCompressed",
            "PulsatingIron", "ConductiveIron", "Pigiron", "Stone", "Steel", "RefinedIron", "Tin", "EnergeticAlloy", "VibrantAlloy", "Lapis", "RedstoneAlloy", "DarkSteel", "Soularium", "EndSteel",
            "ConstructionAlloy", "BrickNetherGlazed", "Copper", "Bronze", "HOPGraphite", "Silver", "Uranium", "Constantan", "RefinedGlowstone", "RefinedObsidian", "BaseEssence", "Soulium", "Graphite",
            "Mithril", "Invar", "Signalum", "Lumium", "Manyullyn", "Knightslime", "Alubrass", "Diamond", "Emerald", "Redstone", "Cinnabar", "Wood", "Ender", "Osbsidian", "Silicon",
            "Desh", "Titanium", "MeteoricIron", "Coal");

    public static List<AspectList> MetalAspectList = Arrays.asList(
            (new AspectList()).add(Aspect.METAL, 15), // Iron 1
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.DESIRE, 10), // Gold2
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.AIR, 5), // Aluminum 3
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FIRE, 10).add(Aspect.EARTH, 10), // Ardite 4
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EARTH, 5), // Arlemite 5
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.TOOL, 10).add(Aspect.EXCHANGE, 5), // Cobalt 6
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.CRYSTAL, 10), // Iridium 7
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EARTH, 5).add(Aspect.FIRE, 5), // Netherite 8
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.MECHANISM, 5), // Nickel 9
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ALCHEMY, 5), // Osmium 10
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.CRYSTAL, 5).add(Aspect.DESIRE, 5), // Platinum11
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FIRE, 5), // Realmite12
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.WATER, 5), // Rupee13
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10), // AstralStarmetal14
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ORDER, 5), // Lead15
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ELDRITCH, 10).add(Aspect.EXCHANGE, 5), // Enderium16
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EXCHANGE, 10).add(Aspect.ELDRITCH, 5), // EnderiumBase17
            (new AspectList()).add(Aspect.WATER, 10).add(Aspect.METAL, 5), // Aquatic18
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.DARKNESS, 5), // Draconium19
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FIRE, 10).add(Aspect.DARKNESS, 10).add(Aspect.LIFE, 10), // DraconiumAwakened20
            (new AspectList()).add(Aspect.METAL, 15).add(Aspect.ORDER, 5).add(Aspect.ENERGY, 5), // ElectricalSteel21
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENERGY, 5).add(Aspect.DESIRE, 5), // Electum22
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENERGY, 10).add(Aspect.DESIRE, 5).add(Aspect.AURA, 5), // ElectumFlux23
            (new AspectList()).add(Aspect.METAL, 15).add(Aspect.VOID, 5), // IronCompressed24
            (new AspectList()).add(Aspect.METAL, 15).add(Aspect.MOTION, 15).add(Aspect.ELDRITCH, 10), // PulsatingIron25
            (new AspectList()).add(Aspect.METAL, 15).add(Aspect.ENERGY, 10), //ConductiveIron26
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EXCHANGE, 10).add(Aspect.EARTH, 10).add(Aspect.DESIRE, 5), //Pigiron27
            (new AspectList()).add(Aspect.EARTH, 5), //Stone28
            (new AspectList()).add(Aspect.METAL, 15).add(Aspect.ORDER, 5), //Steel29
            (new AspectList()).add(Aspect.METAL, 15).add(Aspect.FIRE, 5), // RefinedIron30
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.CRYSTAL, 5), //Tin31
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.ENERGY, 10).add(Aspect.DESIRE, 10).add(Aspect.SENSES, 5), //EnergeticAlloy32
            (new AspectList()).add(Aspect.MOTION, 15).add(Aspect.METAL, 10).add(Aspect.ELDRITCH, 10).add(Aspect.LIGHT, 10).add(Aspect.ENERGY, 10).add(Aspect.DESIRE, 10).add(Aspect.SENSES, 5), //VibrantAlloy33
            (new AspectList()).add(Aspect.SENSES, 5).add(Aspect.EARTH, 2).add(Aspect.DESIRE, 2), //Lapis34
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENERGY, 10).add(Aspect.EXCHANGE, 5), //Redstone Alloy35
            (new AspectList()).add(Aspect.METAL, 15).add(Aspect.FIRE, 15).add(Aspect.ENERGY, 10).add(Aspect.EARTH, 5).add(Aspect.DARKNESS, 5), //DarkSteel36
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.DESIRE, 10).add(Aspect.EARTH, 3).add(Aspect.SOUL, 3).add(Aspect.TRAP, 1), //Soularium37
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FIRE, 10).add(Aspect.EARTH, 10).add(Aspect.DARKNESS, 10), // EndSteel38
            (new AspectList()).add(Aspect.METAL, 20).add(Aspect.ORDER, 5), //ConstructionAlloy39
            (new AspectList()).add(Aspect.EARTH, 10).add(Aspect.WATER, 5).add(Aspect.FIRE, 3).add(Aspect.ALCHEMY, 3), // BrickNetherGlazed40
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EXCHANGE, 5), //Copper41
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.TOOL, 5), //Bronze42
            (new AspectList()).add(Aspect.FIRE, 30).add(Aspect.ENERGY, 30), //HOPGraphite43
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.DESIRE, 5), //Silver44
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENERGY, 5).add(Aspect.DEATH, 5), // Uranium45
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FLIGHT, 5), //Constantan46
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.DARKNESS, 10).add(Aspect.FIRE, 5).add(Aspect.ENERGY, 1), //RefinedObsidian 47
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.SENSES, 10), //RefinedGlowstone
            (new AspectList()).add(Aspect.METAL, 5).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 3).add(Aspect.SENSES, 3),// BaseEssence
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.SOUL, 10).add(Aspect.EARTH, 5), //Soulium
            (new AspectList()).add(Aspect.METAL, 5).add(Aspect.FIRE, 5).add(Aspect.ENERGY, 5), //Graphite
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.MAGIC, 5), //Mithril
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EARTH, 5), //Invar
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENERGY, 10).add(Aspect.MOTION, 5), //Signalum
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.LIGHT, 5).add(Aspect.ENERGY, 5), //Lumium
            (new AspectList()).add(Aspect.METAL, 15).add(Aspect.EXCHANGE, 10).add(Aspect.EARTH, 10).add(Aspect.DESIRE, 5), //Manyullyn
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.WATER, 5).add(Aspect.LIFE, 5).add(Aspect.ALCHEMY, 5), //Knightslime
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EXCHANGE, 5).add(Aspect.TOOL, 5), //Alubrass
            (new AspectList()).add(Aspect.CRYSTAL, 15).add(Aspect.DESIRE, 15), //Diamond
            (new AspectList()).add(Aspect.CRYSTAL, 15).add(Aspect.DESIRE, 10), //Emerald
            (new AspectList()).add(Aspect.ENERGY, 10), //Redstone
            (new AspectList()).add(Aspect.METAL, 5).add(Aspect.DEATH, 5), //Cinnabar
            (new AspectList()).add(Aspect.PLANT, 5), //Wood
            (new AspectList()).add(Aspect.MOTION, 15).add(Aspect.ELDRITCH, 10), //Ender
            (new AspectList()).add(Aspect.EARTH, 5).add(Aspect.FIRE, 5).add(Aspect.DARKNESS, 5), //Obsidian
            (new AspectList()).add(Aspect.CRAFT, 5).add(Aspect.EXCHANGE, 5), //Silicon
            (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENTROPY, 5), //Desh
            (new AspectList()).add(Aspect.METAL, 20).add(Aspect.PROTECT, 10).add(Aspect.MECHANISM, 5), //Titanium
            (new AspectList()).add(Aspect.METAL, 15).add(Aspect.ELDRITCH, 5), //MeteoricIron
            (new AspectList()).add(Aspect.ENERGY, 10).add(Aspect.FIRE, 10) // Coal
            //(new AspectList().add(Aspect.METAL, 10).add(Aspect.EARTH, 5),
    );

    public static void MainAspectMetalProcessing(AspectRegistryEvent event) {
        try {

            AspectEventProxy register = event.register;

            for (int i = 0; i < oreNameMetal.size(); i++) {
                String oreName = oreNameMetal.get(i);
                AspectList oreAspectList = new AspectList().add(MetalAspectList.get(i));

                List<Double> AspectNums = new ArrayList<>();
                List<Double> AspectRodNums = new ArrayList<>();
                List<Double> AspectNuggetNums = new ArrayList<>();
                List<Double> AspectBlockNums = new ArrayList<>();
                List<Double> AspectGearNums = new ArrayList<>();
                List<Double> AspectCoinNums = new ArrayList<>();
                List<Double> AspectCompressedNums = new ArrayList<>();
                List<Double> AspectSlabNums = new ArrayList<>();

                AspectList local1 = new AspectList();
                AspectList local2 = new AspectList();
                AspectList local3 = new AspectList();
                AspectList local4 = new AspectList();
                AspectList local5 = new AspectList();
                AspectList local6 = new AspectList();
                AspectList local7 = new AspectList();
                //if (oreName != "Uranium" & "Iron" & "Gold" & "Lead" & "Tin" & "Copper" & "Steel" & "Bronze" & "Silver" & "" & "" & "")

                register.registerObjectTag("item" + oreName, new AspectList().add(oreAspectList)); // ITEM
                register.registerObjectTag("ingot" + oreName, new AspectList().add(oreAspectList)); // INGOT
                register.registerObjectTag("gem" + oreName, new AspectList().add(oreAspectList).add(Aspect.CRYSTAL, 5)); // GEM
                register.registerObjectTag("crystal" + oreName, new AspectList().add(oreAspectList).add(Aspect.CRYSTAL, 5)); // CRYSTAL
                register.registerObjectTag("shard" + oreName, new AspectList().add(oreAspectList).add(Aspect.ALCHEMY, 1)); // SHARD
                register.registerObjectTag("clump" + oreName, new AspectList().add(oreAspectList).add(Aspect.EXCHANGE, 1)); // CLUMP
                register.registerObjectTag("plate" + oreName, new AspectList().add(oreAspectList)); // PLATE
                register.registerObjectTag("ore" + oreName, new AspectList().add(oreAspectList).add(Aspect.EARTH, 5)); // ORE
                register.registerObjectTag("cluster" + oreName, new AspectList().add(oreAspectList).add(Aspect.ORDER, 5).add(Aspect.EARTH, 5)); // CLUSTER
                register.registerObjectTag("dust" + oreName, new AspectList().add(oreAspectList).add(Aspect.ENTROPY, 1)); // DUST
                register.registerObjectTag("crushed" + oreName, new AspectList().add(oreAspectList).add(Aspect.EARTH, 1).add(Aspect.ENTROPY, 1)); // CRUSHED
                register.registerObjectTag("dustDirty" + oreName, new AspectList().add(oreAspectList).add(Aspect.EARTH, 1).add(Aspect.ENTROPY, 1)); // DUSTDIRTY
                register.registerObjectTag("crushedPurified" + oreName, new AspectList().add(oreAspectList).add(Aspect.ENTROPY, 1)); // CRUSHEDPURIFIED

                Set<Aspect> AspectMass = oreAspectList.aspects.keySet();
                List<Aspect> AspectMassFromMap = new ArrayList<>(AspectMass);

                for (Aspect oneAspect : AspectMassFromMap) {
                    AspectNums.add(Double.valueOf(oreAspectList.aspects.get(oneAspect)));
                }

                for (int j = 0; j < AspectMassFromMap.size(); j++) {
                    AspectRodNums.add(AspectNums.get(j) * 0.5 * 0.75);
                    AspectNuggetNums.add(AspectNums.get(j) * 0.1);
                    AspectBlockNums.add(AspectNums.get(j) * 9 * 0.75);
                    AspectGearNums.add(AspectNums.get(j) * 4 * 0.75);
                    AspectCoinNums.add(AspectNums.get(j) * 0.33 * 0.75);
                    AspectCompressedNums.add(AspectNums.get(j) * 2 * 0.75);
                    AspectSlabNums.add(AspectNums.get(j) * 4.5 * 0.75);

                    local1.add(AspectMassFromMap.get(j), (int) Math.round(AspectRodNums.get(j)));
                    local2.add(AspectMassFromMap.get(j), (int) Math.round(AspectNuggetNums.get(j)));
                    local3.add(AspectMassFromMap.get(j), (int) Math.round(AspectBlockNums.get(j)));
                    local4.add(AspectMassFromMap.get(j), (int) Math.round(AspectGearNums.get(j)));
                    local5.add(AspectMassFromMap.get(j), (int) Math.round(AspectCoinNums.get(j)));
                    local6.add(AspectMassFromMap.get(j), (int) Math.round(AspectCompressedNums.get(j)));
                    local7.add(AspectMassFromMap.get(j), (int) Math.round(AspectSlabNums.get(j)));
                }
                register.registerObjectTag("block" + oreName, local3); // BLOCK
                register.registerObjectTag("plateDense" + oreName, local3); // PLATEDENSE
                register.registerObjectTag("nugget" + oreName, local2); // NUGGET
                register.registerObjectTag("dustTiny" + oreName, new AspectList().add(local2).add(Aspect.ENTROPY, 1)); // DUSTTINY
                register.registerObjectTag("stick" + oreName, local1); // ROD or STICK
                register.registerObjectTag("rod" + oreName, local1); // ROD
                register.registerObjectTag("wire" + oreName, local1); // WIRE
                register.registerObjectTag("gear" + oreName, new AspectList().add(local4).add(Aspect.MECHANISM, 5)); // GEAR
                register.registerObjectTag("coin" + oreName, local5); // COIN
                register.registerObjectTag("compressed" + oreName, local6); // COMPRESSED
                register.registerObjectTag("slab" + oreName, local7); // SLAB
            }
        } catch (Exception e1){
            e1.printStackTrace();
        }
    }
}
