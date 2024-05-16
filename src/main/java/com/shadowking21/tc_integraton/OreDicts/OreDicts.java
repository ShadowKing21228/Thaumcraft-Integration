package com.shadowking21.tc_integraton.OreDicts;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;
public class OreDicts {
    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        AspectEventProxy register = event.register;
        //register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem("minecraft", "gold_ingot")), new AspectList().add(Aspect.METAL, 100));
        register.registerObjectTag("dustSulfur", (new AspectList()).add(Aspect.FIRE, 5).add(Aspect.ENERGY, 5));
        register.registerObjectTag("dustElectrum", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENERGY, 5).add(Aspect.DESIRE, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("ingotElectrum", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENERGY, 5).add(Aspect.DESIRE, 5));
        register.registerObjectTag("nuggetElectrum", (new AspectList()).add(Aspect.METAL, 1));
        register.registerObjectTag("fuelCoke", (new AspectList()).add(Aspect.FIRE, 15).add(Aspect.ENERGY, 15));
        register.registerObjectTag("dustCoke", (new AspectList()).add(Aspect.FIRE, 15).add(Aspect.ENERGY, 15).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("ingotHOPGraphite", (new AspectList()).add(Aspect.FIRE, 30).add(Aspect.ENERGY, 30));
        register.registerObjectTag("dustHOPGraphite", (new AspectList()).add(Aspect.FIRE, 30).add(Aspect.ENERGY, 30).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("ingotAluminum", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.AIR, 5));
        register.registerObjectTag("dustAluminum", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.AIR, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("ingotMithril", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.MAGIC, 5));
        register.registerObjectTag("dustMithril", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.MAGIC, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetMithril", (new AspectList()).add(Aspect.METAL, 1));
        register.registerObjectTag("ingotInvar", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EARTH, 5));
        register.registerObjectTag("dustInvar", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EARTH, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetInvar", (new AspectList()).add(Aspect.METAL, 1));
        register.registerObjectTag("ingotOsmium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ALCHEMY, 5));
        register.registerObjectTag("dustOsmium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ALCHEMY, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetOsmium", (new AspectList()).add(Aspect.METAL, 1));
        register.registerObjectTag("ingotIridium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.CRYSTAL, 10));
        register.registerObjectTag("dustIridium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.CRYSTAL, 10).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetIridium", (new AspectList()).add(Aspect.METAL, 1).add(Aspect.CRYSTAL, 1));
        register.registerObjectTag("ingotPlatinum", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.CRYSTAL, 5).add(Aspect.DESIRE, 5));
        register.registerObjectTag("dustPlatinum", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.CRYSTAL, 5).add(Aspect.DESIRE, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetPlatinum", (new AspectList()).add(Aspect.METAL, 1));
        register.registerObjectTag("ingotRefinedGlowstone", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.SENSES, 10));
        register.registerObjectTag("nuggetRefinedGlowstone", (new AspectList()).add(Aspect.METAL, 1).add(Aspect.LIGHT, 1).add(Aspect.SENSES, 1));
        register.registerObjectTag("ingotRefinedObsidian", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.DARKNESS, 10).add(Aspect.FIRE, 5).add(Aspect.ENERGY, 1));
        register.registerObjectTag("nuggetRefinedObsidian", (new AspectList()).add(Aspect.METAL, 1).add(Aspect.DARKNESS, 1));
        register.registerObjectTag("dustRefinedObsidian", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.DARKNESS, 10).add(Aspect.FIRE, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("ingotConstantan", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FLIGHT, 5));
        register.registerObjectTag("dustConstantan", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FLIGHT, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetConstantan", (new AspectList()).add(Aspect.METAL, 1));
        register.registerObjectTag("ingotNickel", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("dustNickel", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.MECHANISM, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetNickel", (new AspectList()).add(Aspect.METAL, 1));
        register.registerObjectTag("ingotEnderium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ELDRITCH, 10).add(Aspect.EXCHANGE, 5));
        register.registerObjectTag("dustEnderium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ELDRITCH, 10).add(Aspect.EXCHANGE, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetEnderium", (new AspectList()).add(Aspect.METAL, 1).add(Aspect.ELDRITCH, 1));
        register.registerObjectTag("ingotLumium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.LIGHT, 5).add(Aspect.ENERGY, 5));
        register.registerObjectTag("dustLumium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.LIGHT, 5).add(Aspect.ENERGY, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetLumium", (new AspectList()).add(Aspect.METAL, 1));
        register.registerObjectTag("ingotSignalum", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENERGY, 10).add(Aspect.MOTION, 5));
        register.registerObjectTag("dustSignalum", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.ENERGY, 10).add(Aspect.MOTION, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetSignalum", (new AspectList()).add(Aspect.METAL, 1).add(Aspect.ENERGY, 1));
        register.registerObjectTag("dustObsidian", (new AspectList()).add(Aspect.EARTH, 5).add(Aspect.FIRE, 5).add(Aspect.DARKNESS, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("crystalCertusQuartz", (new AspectList()).add(Aspect.CRYSTAL, 5).add(Aspect.SENSES, 5));
        register.registerObjectTag("crystalPureCertusQuartz", (new AspectList()).add(Aspect.CRYSTAL, 5).add(Aspect.SENSES, 5).add(Aspect.ORDER, 5));
        register.registerObjectTag("crystalFluix", (new AspectList()).add(Aspect.CRYSTAL, 5).add(Aspect.ENERGY, 5));
        register.registerObjectTag("crystalPureFluix", (new AspectList()).add(Aspect.CRYSTAL, 5).add(Aspect.ENERGY, 5).add(Aspect.ORDER, 5));
        register.registerObjectTag("ingotCosmicNeutronium", (new AspectList()).add(Aspect.VOID, 50).add(Aspect.METAL, 1));
        register.registerObjectTag("ingotAstralStarmetal", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag("ingotInfinity", (new AspectList()).add(Aspect.AIR, 250).add(Aspect.FIRE, 250).add(Aspect.EARTH, 250).add(Aspect.WATER, 250).add(Aspect.ENTROPY, 250).add(Aspect.ORDER, 250));
        register.registerObjectTag("ingotEndSteel", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FIRE, 10).add(Aspect.EARTH, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag("ingotConstructionAlloy", (new AspectList()).add(Aspect.METAL, 25));
        register.registerObjectTag("ingotDraconiumAwakened", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FIRE, 10).add(Aspect.DARKNESS, 10).add(Aspect.LIFE, 10));
        register.registerObjectTag("ingotDraconium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FIRE, 5).add(Aspect.DARKNESS, 5));
        register.registerObjectTag("essenceInsanium", (new AspectList()).add(Aspect.PLANT, 25).add(Aspect.BEAST, 25).add(Aspect.ENERGY, 32));
        register.registerObjectTag("ingotArdite", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.FIRE, 10).add(Aspect.EARTH, 10));
        register.registerObjectTag("ingotCobalt", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.TOOL, 10).add(Aspect.EXCHANGE, 5));
        register.registerObjectTag("essenceIntermedium", (new AspectList()).add(Aspect.PLANT, 5).add(Aspect.BEAST, 5).add(Aspect.ENERGY, 4));
        register.registerObjectTag("essenceSuperium", (new AspectList()).add(Aspect.PLANT, 10).add(Aspect.BEAST, 10).add(Aspect.ENERGY, 8));
        register.registerObjectTag("essenceSupremium", (new AspectList()).add(Aspect.PLANT, 15).add(Aspect.BEAST, 15).add(Aspect.ENERGY, 16));
        register.registerObjectTag("ingotBaseEssence", (new AspectList()).add(Aspect.METAL, 5).add(Aspect.CRYSTAL, 5).add(Aspect.ORDER, 3).add(Aspect.SENSES, 3));
        register.registerObjectTag("essenceInferium", (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.BEAST, 2).add(Aspect.ENERGY, 1));
        register.registerObjectTag("essencePrudentium", (new AspectList()).add(Aspect.PLANT, 3).add(Aspect.BEAST, 3).add(Aspect.ENERGY, 2));
        register.registerObjectTag("ingotManyullyn", (new AspectList()).add(Aspect.METAL, 15).add(Aspect.EXCHANGE, 10).add(Aspect.EARTH, 10).add(Aspect.DESIRE, 5));
        register.registerObjectTag("ingotKnightslime", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.WATER, 5).add(Aspect.LIFE, 5).add(Aspect.ALCHEMY, 5));
        register.registerObjectTag("ingotPigiron", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EXCHANGE, 10).add(Aspect.EARTH, 10).add(Aspect.DESIRE, 5));
        register.registerObjectTag("ingotAlubrass", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.EXCHANGE, 5).add(Aspect.TOOL, 5));
        register.registerObjectTag("nuggetCosmicNeutronium", (new AspectList()).add(Aspect.VOID, 25));
        register.registerObjectTag("dustAstralStarmetal", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("nuggetConstructionAlloy", (new AspectList()).add(Aspect.METAL, 2));
        register.registerObjectTag("nuggetEndSteel", (new AspectList()).add(Aspect.METAL, 1).add(Aspect.FIRE, 1).add(Aspect.EARTH, 1).add(Aspect.DARKNESS, 1));
        register.registerObjectTag("shardProsperity", (new AspectList()).add(Aspect.CRYSTAL, 3).add(Aspect.ORDER, 1).add(Aspect.SENSES, 1));
        register.registerObjectTag("ingotSoulium", (new AspectList()).add(Aspect.METAL, 10).add(Aspect.SOUL, 10).add(Aspect.EARTH, 5));
        register.registerObjectTag("ingotGraphite", (new AspectList()).add(Aspect.METAL, 5).add(Aspect.FIRE, 5).add(Aspect.ENERGY, 5));
        register.registerObjectTag("dustGraphite", (new AspectList()).add(Aspect.METAL, 5).add(Aspect.FIRE, 5).add(Aspect.ENERGY, 5).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("dustFluix", (new AspectList()).add(Aspect.ENERGY, 5).add(Aspect.CRYSTAL, 3).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("dustCertusQuartz", (new AspectList()).add(Aspect.SENSES, 5).add(Aspect.CRYSTAL, 3).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("dustQuartz", (new AspectList()).add(Aspect.CRYSTAL, 3).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("dustNetherQuartz", (new AspectList()).add(Aspect.CRYSTAL, 3).add(Aspect.ENTROPY, 1));
        register.registerObjectTag("dustBedrock", (new AspectList()).add(Aspect.ENTROPY, 30).add(Aspect.VOID, 10).add(Aspect.EARTH, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag("gearWood", (new AspectList()).add(Aspect.MECHANISM, 5).add(Aspect.PLANT, 5));
        register.registerObjectTag("gearAluminum", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.AIR, 15).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("gearNickel", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.MECHANISM, 20));
        register.registerObjectTag("gearPlatinum", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.CRYSTAL, 15).add(Aspect.DESIRE, 15).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("gearIridium", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.CRYSTAL, 30).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("gearMithril", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.MAGIC, 15).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("gearConstantan", (new AspectList()).add(Aspect.FLIGHT, 15).add(Aspect.AIR, 15).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("gearElectrum", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.ENERGY, 15).add(Aspect.DESIRE, 15).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("gearInvar", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.EARTH, 15).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("gearSignalum", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.ENERGY, 15).add(Aspect.MOTION, 15).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("gearLumium", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.LIGHT, 15).add(Aspect.ENERGY, 15).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("gearEnderium", (new AspectList()).add(Aspect.METAL, 30).add(Aspect.ELDRITCH, 30).add(Aspect.EXCHANGE, 15).add(Aspect.MECHANISM, 5));
        register.registerObjectTag("dustSaltpeter", (new AspectList()).add(Aspect.AIR, 5).add(Aspect.EARTH, 5));
        register.registerObjectTag("gemZanite", (new AspectList()).add(Aspect.CRYSTAL, 5).add(Aspect.AIR, 5));
        register.registerObjectTag("blockEnchantedGravitite", (new AspectList()).add(Aspect.CRYSTAL, 10).add(Aspect.FLIGHT, 10).add(Aspect.AIR, 10).add(Aspect.MOTION, 10));
        register.registerObjectTag("oreZanite", (new AspectList()).add(Aspect.EARTH, 10).add(Aspect.CRYSTAL, 5).add(Aspect.AIR, 5));
        register.registerObjectTag("oreGravitite", (new AspectList()).add(Aspect.EARTH, 15).add(Aspect.CRYSTAL, 10).add(Aspect.FLIGHT, 10).add(Aspect.AIR, 10).add(Aspect.MOTION, 10));
    }
}