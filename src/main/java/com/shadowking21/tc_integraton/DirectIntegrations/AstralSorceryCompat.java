package com.shadowking21.tc_integraton.DirectIntegrations;

import com.shadowking21.tc_integraton.Utils.AspectRegister;
import com.shadowking21.tc_integraton.Utils.ItemUtils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class AstralSorceryCompat {

    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        String as = "astralsorcery";
        AspectEventProxy register = event.register;
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(as, "blockblackmarble")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.ENERGY, 1).add(Aspect.FIRE, 1).add(Aspect.ORDER, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcraftingcomponent", 3), new AspectList().add(Aspect.CRYSTAL, 5).add(Aspect.SENSES, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcraftingcomponent", 4), new AspectList().add(Aspect.CRYSTAL, 3).add(Aspect.SENSES, 3).add(Aspect.SENSES, 3).add(Aspect.LIGHT, 3).add(Aspect.ENERGY, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemusabledust", 0), new AspectList().add(Aspect.LIGHT, 3).add(Aspect.SENSES, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemusabledust", 1), new AspectList().add(Aspect.SENSES, 5).add(Aspect.ENTROPY, 5).add(Aspect.DEATH, 5).add(Aspect.FIRE, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcraftingcomponent", 5), new AspectList().add(Aspect.MIND, 2).add(Aspect.SENSES, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemconstellationpaper", 0), new AspectList().add(Aspect.MIND, 5).add(Aspect.DARKNESS, 5).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "iteminfusedglass", 0), new AspectList().add(Aspect.CRYSTAL, 25).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemrockcrystalsimple", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.ORDER, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcelestialcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemexchangewand", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.TOOL, 10).add(Aspect.EARTH, 10).add(Aspect.EXCHANGE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemperkseal", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.METAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcrystalsword", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.AVERSION, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcrystalpickaxe", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.TOOL, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcrystalshovel", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.TOOL, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcrystalaxe", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.TOOL, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemchargedcrystalsword", 0), new AspectList().add(Aspect.AVERSION, 25).add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.ENERGY, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemchargedcrystalpickaxe", 0), new AspectList().add(Aspect.TOOL, 25).add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.ENERGY, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemchargedcrystalshovel", 0), new AspectList().add(Aspect.TOOL, 25).add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.ENERGY, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemchargedcrystalaxe", 0), new AspectList().add(Aspect.TOOL, 25).add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.ENERGY, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemgrapplewand", 0), new AspectList().add(Aspect.MOTION, 20).add(Aspect.ELDRITCH, 20).add(Aspect.EARTH, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcoloredlens", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.FIRE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcoloredlens", 1), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.ENTROPY, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcoloredlens", 2), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.PLANT, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcoloredlens", 3), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.AVERSION, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcoloredlens", 4), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.LIFE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcoloredlens", 5), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.MOTION, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcoloredlens", 6), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.SOUL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemknowledgeshare", 0), new AspectList().add(Aspect.MIND, 25).add(Aspect.SENSES, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemshiftingstar", 0), new AspectList().add(Aspect.LIGHT, 20).add(Aspect.DARKNESS, 20).add(Aspect.ORDER, 10).add(Aspect.SENSES, 10).add(Aspect.EXCHANGE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemskyresonator", 0), new AspectList().add(Aspect.EARTH, 10).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.CRYSTAL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemtunedrockcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.ORDER, 10).add(Aspect.AURA, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemtunedcelestialcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10).add(Aspect.AURA, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemarchitectwand", 0), new AspectList().add(Aspect.EARTH, 10).add(Aspect.METAL, 10).add(Aspect.SENSES, 5).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockritualpedestal", 0), new AspectList().add(Aspect.EARTH, 30).add(Aspect.ORDER, 20).add(Aspect.METAL, 10).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockaltar", 0), new AspectList().add(Aspect.EARTH, 20).add(Aspect.CRAFT, 10).add(Aspect.ORDER, 5).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockaltar", 2), new AspectList().add(Aspect.EARTH, 20).add(Aspect.METAL, 20).add(Aspect.CRAFT, 20).add(Aspect.ORDER, 15).add(Aspect.CRYSTAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockaltar", 3), new AspectList().add(Aspect.CRAFT, 30).add(Aspect.EARTH, 25).add(Aspect.METAL, 25).add(Aspect.ORDER, 20).add(Aspect.CRYSTAL, 20).add(Aspect.LIGHT, 20).add(Aspect.DARKNESS, 20));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockaltar", 1), new AspectList().add(Aspect.EARTH, 20).add(Aspect.CRAFT, 15).add(Aspect.ORDER, 10).add(Aspect.LIGHT, 5).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockcollectorcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 20).add(Aspect.ORDER, 20).add(Aspect.AURA, 20).add(Aspect.LIGHT, 10).add(Aspect.ENERGY, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockcelestialcollectorcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 20).add(Aspect.ORDER, 20).add(Aspect.AURA, 20).add(Aspect.LIGHT, 20).add(Aspect.DARKNESS, 20).add(Aspect.ENERGY, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockmachine", 1), new AspectList().add(Aspect.EARTH, 10).add(Aspect.CRAFT, 5).add(Aspect.ENTROPY, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockobservatory", 0), new AspectList().add(Aspect.METAL, 40).add(Aspect.EARTH, 25).add(Aspect.CRYSTAL, 25).add(Aspect.SENSES, 20).add(Aspect.LIGHT, 15).add(Aspect.DARKNESS, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockattunementaltar", 0), new AspectList().add(Aspect.EARTH, 20).add(Aspect.METAL, 15).add(Aspect.CRYSTAL, 15).add(Aspect.AURA, 15).add(Aspect.ORDER, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockbore", 0), new AspectList().add(Aspect.EARTH, 25).add(Aspect.METAL, 25).add(Aspect.LIGHT, 20).add(Aspect.PLANT, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockchalice", 0), new AspectList().add(Aspect.METAL, 25).add(Aspect.CRYSTAL, 20).add(Aspect.LIGHT, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemenchantmentamulet", 0), new AspectList().add(Aspect.METAL, 30).add(Aspect.CRYSTAL, 20).add(Aspect.AURA, 20).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemilluminationwand", 0), new AspectList().add(Aspect.CRYSTAL, 20).add(Aspect.LIGHT, 20).add(Aspect.SENSES, 20).add(Aspect.ORDER, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemsextant", 0), new AspectList().add(Aspect.SENSES, 10).add(Aspect.MIND, 10).add(Aspect.CRYSTAL, 10).add(Aspect.METAL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemlinkingtool", 0), new AspectList().add(Aspect.PLANT, 20).add(Aspect.CRYSTAL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemhandtelescope", 0), new AspectList().add(Aspect.SENSES, 10).add(Aspect.PLANT, 5).add(Aspect.METAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockcelestialgateway", 0), new AspectList().add(Aspect.METAL, 25).add(Aspect.DARKNESS, 20).add(Aspect.CRYSTAL, 20).add(Aspect.MOTION, 10).add(Aspect.EARTH, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockmapdrawingtable", 0), new AspectList().add(Aspect.PLANT, 20).add(Aspect.LIGHT, 15).add(Aspect.SENSES, 15).add(Aspect.MAGIC, 10).add(Aspect.EARTH, 10).add(Aspect.METAL, 20));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockcustomore", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.ORDER, 10).add(Aspect.EARTH, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockstarlightinfuser", 0), new AspectList().add(Aspect.EARTH, 25).add(Aspect.LIGHT, 20).add(Aspect.MAGIC, 10).add(Aspect.METAL, 10).add(Aspect.ORDER, 10).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockworldilluminator", 0), new AspectList().add(Aspect.LIGHT, 10).add(Aspect.AURA, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockwell", 0), new AspectList().add(Aspect.EARTH, 10).add(Aspect.ENTROPY, 10).add(Aspect.WATER, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockattunementrelay", 0), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockinfusedwood", 0), new AspectList().add(Aspect.PLANT, 3).add(Aspect.LIGHT, 3).add(Aspect.MAGIC, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockinfusedwood", 1), new AspectList().add(Aspect.PLANT, 3).add(Aspect.LIGHT, 3).add(Aspect.MAGIC, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockinfusedwood", 5), new AspectList().add(Aspect.PLANT, 3).add(Aspect.LIGHT, 3).add(Aspect.SENSES, 3).add(Aspect.MAGIC, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockinfusedwood", 6), new AspectList().add(Aspect.PLANT, 5).add(Aspect.LIGHT, 5).add(Aspect.MAGIC, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockcustomflower", 0), new AspectList().add(Aspect.PLANT, 5).add(Aspect.SENSES, 5).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockprism", 0), new AspectList().add(Aspect.CRYSTAL, 25).add(Aspect.METAL, 20).add(Aspect.LIGHT, 20).add(Aspect.ORDER, 10).add(Aspect.EARTH, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blocktreebacon", 0), new AspectList().add(Aspect.PLANT, 25).add(Aspect.LIFE, 10).add(Aspect.EARTH, 10).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockrituallink", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.METAL, 10).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blocklens", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.LIGHT, 10).add(Aspect.EXCHANGE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockborehead", 0), new AspectList().add(Aspect.EARTH, 25).add(Aspect.CRYSTAL, 20).add(Aspect.METAL, 20).add(Aspect.ORDER, 10).add(Aspect.ENTROPY, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockborehead", 1), new AspectList().add(Aspect.EARTH, 25).add(Aspect.CRYSTAL, 20).add(Aspect.METAL, 20).add(Aspect.ORDER, 10).add(Aspect.SENSES, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockmachine", 0), new AspectList().add(Aspect.SENSES, 20).add(Aspect.PLANT, 10).add(Aspect.METAL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemperkgem", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.WATER, 10).add(Aspect.EARTH, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemperkgem", 1), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.FIRE, 10).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemperkgem", 2), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.MOTION, 10).add(Aspect.FLIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockgemcrystals", 0), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockgemcrystals", 1), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockgemcrystals", 2), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.WATER, 10).add(Aspect.EARTH, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockgemcrystals", 3), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.FIRE, 10).add(Aspect.LIGHT, 5).add(Aspect.EARTH, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockgemcrystals", 4), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.MOTION, 10).add(Aspect.FLIGHT, 5).add(Aspect.EARTH, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "itemcape", 0), new AspectList().add(Aspect.BEAST, 30).add(Aspect.METAL, 30).add(Aspect.PROTECT, 28).add(Aspect.LIGHT, 25).add(Aspect.DARKNESS, 25).add(Aspect.MAGIC, 25));
        AspectRegister.registerFluidAspect(register, "astralsorcery.liquidstarlight", new AspectList().add(Aspect.WATER, 10).add(Aspect.LIGHT, 10));
        int b = 3;
        for (int a = 0; a < 5; a++)
        {
            register.registerObjectTag(ItemUtils.getRegisteredItemStack(as, "blockcelestialcrystals", a), new AspectList().add(Aspect.CRYSTAL, b).add(Aspect.LIGHT, b).add(Aspect.DARKNESS, b));
            b += 3;
        }









    }
}
