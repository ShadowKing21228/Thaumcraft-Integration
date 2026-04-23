package com.shadowking21.tc_integraton.integration.direct;

import com.shadowking21.tc_integraton.utils.AspectRegister;
import com.shadowking21.tc_integraton.utils.ItemUtils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class AstralSorceryCompat extends CompatClass {

    @Override
    protected String getModId() {
        return "astralsorcery";
    }

    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        AspectEventProxy register = event.register;
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "blockblackmarble")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.ENERGY, 1).add(Aspect.FIRE, 1).add(Aspect.ORDER, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcraftingcomponent", 3), new AspectList().add(Aspect.CRYSTAL, 5).add(Aspect.SENSES, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcraftingcomponent", 4), new AspectList().add(Aspect.CRYSTAL, 3).add(Aspect.SENSES, 3).add(Aspect.SENSES, 3).add(Aspect.LIGHT, 3).add(Aspect.ENERGY, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemusabledust", 0), new AspectList().add(Aspect.LIGHT, 3).add(Aspect.SENSES, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemusabledust", 1), new AspectList().add(Aspect.SENSES, 5).add(Aspect.ENTROPY, 5).add(Aspect.DEATH, 5).add(Aspect.FIRE, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcraftingcomponent", 5), new AspectList().add(Aspect.MIND, 2).add(Aspect.SENSES, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemconstellationpaper", 0), new AspectList().add(Aspect.MIND, 5).add(Aspect.DARKNESS, 5).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "iteminfusedglass", 0), new AspectList().add(Aspect.CRYSTAL, 25).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemrockcrystalsimple", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.ORDER, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcelestialcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemexchangewand", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.TOOL, 10).add(Aspect.EARTH, 10).add(Aspect.EXCHANGE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemperkseal", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.METAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcrystalsword", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.AVERSION, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcrystalpickaxe", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.TOOL, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcrystalshovel", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.TOOL, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcrystalaxe", 0), new AspectList().add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.TOOL, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemchargedcrystalsword", 0), new AspectList().add(Aspect.AVERSION, 25).add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.ENERGY, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemchargedcrystalpickaxe", 0), new AspectList().add(Aspect.TOOL, 25).add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.ENERGY, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemchargedcrystalshovel", 0), new AspectList().add(Aspect.TOOL, 25).add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.ENERGY, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemchargedcrystalaxe", 0), new AspectList().add(Aspect.TOOL, 25).add(Aspect.CRYSTAL, 15).add(Aspect.ORDER, 15).add(Aspect.ENERGY, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemgrapplewand", 0), new AspectList().add(Aspect.MOTION, 20).add(Aspect.ELDRITCH, 20).add(Aspect.EARTH, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcoloredlens", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.FIRE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcoloredlens", 1), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.ENTROPY, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcoloredlens", 2), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.PLANT, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcoloredlens", 3), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.AVERSION, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcoloredlens", 4), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.LIFE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcoloredlens", 5), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.MOTION, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcoloredlens", 6), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.SOUL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemknowledgeshare", 0), new AspectList().add(Aspect.MIND, 25).add(Aspect.SENSES, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemshiftingstar", 0), new AspectList().add(Aspect.LIGHT, 20).add(Aspect.DARKNESS, 20).add(Aspect.ORDER, 10).add(Aspect.SENSES, 10).add(Aspect.EXCHANGE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemskyresonator", 0), new AspectList().add(Aspect.EARTH, 10).add(Aspect.METAL, 10).add(Aspect.LIGHT, 10).add(Aspect.CRYSTAL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemtunedrockcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.ORDER, 10).add(Aspect.AURA, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemtunedcelestialcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10).add(Aspect.AURA, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemarchitectwand", 0), new AspectList().add(Aspect.EARTH, 10).add(Aspect.METAL, 10).add(Aspect.SENSES, 5).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockritualpedestal", 0), new AspectList().add(Aspect.EARTH, 30).add(Aspect.ORDER, 20).add(Aspect.METAL, 10).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockaltar", 0), new AspectList().add(Aspect.EARTH, 20).add(Aspect.CRAFT, 10).add(Aspect.ORDER, 5).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockaltar", 2), new AspectList().add(Aspect.EARTH, 20).add(Aspect.METAL, 20).add(Aspect.CRAFT, 20).add(Aspect.ORDER, 15).add(Aspect.CRYSTAL, 10).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockaltar", 3), new AspectList().add(Aspect.CRAFT, 30).add(Aspect.EARTH, 25).add(Aspect.METAL, 25).add(Aspect.ORDER, 20).add(Aspect.CRYSTAL, 20).add(Aspect.LIGHT, 20).add(Aspect.DARKNESS, 20));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockaltar", 1), new AspectList().add(Aspect.EARTH, 20).add(Aspect.CRAFT, 15).add(Aspect.ORDER, 10).add(Aspect.LIGHT, 5).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockcollectorcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 20).add(Aspect.ORDER, 20).add(Aspect.AURA, 20).add(Aspect.LIGHT, 10).add(Aspect.ENERGY, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockcelestialcollectorcrystal", 0), new AspectList().add(Aspect.CRYSTAL, 20).add(Aspect.ORDER, 20).add(Aspect.AURA, 20).add(Aspect.LIGHT, 20).add(Aspect.DARKNESS, 20).add(Aspect.ENERGY, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockmachine", 1), new AspectList().add(Aspect.EARTH, 10).add(Aspect.CRAFT, 5).add(Aspect.ENTROPY, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockobservatory", 0), new AspectList().add(Aspect.METAL, 40).add(Aspect.EARTH, 25).add(Aspect.CRYSTAL, 25).add(Aspect.SENSES, 20).add(Aspect.LIGHT, 15).add(Aspect.DARKNESS, 15));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockattunementaltar", 0), new AspectList().add(Aspect.EARTH, 20).add(Aspect.METAL, 15).add(Aspect.CRYSTAL, 15).add(Aspect.AURA, 15).add(Aspect.ORDER, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockbore", 0), new AspectList().add(Aspect.EARTH, 25).add(Aspect.METAL, 25).add(Aspect.LIGHT, 20).add(Aspect.PLANT, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockchalice", 0), new AspectList().add(Aspect.METAL, 25).add(Aspect.CRYSTAL, 20).add(Aspect.LIGHT, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemenchantmentamulet", 0), new AspectList().add(Aspect.METAL, 30).add(Aspect.CRYSTAL, 20).add(Aspect.AURA, 20).add(Aspect.LIGHT, 10).add(Aspect.DARKNESS, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemilluminationwand", 0), new AspectList().add(Aspect.CRYSTAL, 20).add(Aspect.LIGHT, 20).add(Aspect.SENSES, 20).add(Aspect.ORDER, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemsextant", 0), new AspectList().add(Aspect.SENSES, 10).add(Aspect.MIND, 10).add(Aspect.CRYSTAL, 10).add(Aspect.METAL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemlinkingtool", 0), new AspectList().add(Aspect.PLANT, 20).add(Aspect.CRYSTAL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemhandtelescope", 0), new AspectList().add(Aspect.SENSES, 10).add(Aspect.PLANT, 5).add(Aspect.METAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockcelestialgateway", 0), new AspectList().add(Aspect.METAL, 25).add(Aspect.DARKNESS, 20).add(Aspect.CRYSTAL, 20).add(Aspect.MOTION, 10).add(Aspect.EARTH, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockmapdrawingtable", 0), new AspectList().add(Aspect.PLANT, 20).add(Aspect.LIGHT, 15).add(Aspect.SENSES, 15).add(Aspect.MAGIC, 10).add(Aspect.EARTH, 10).add(Aspect.METAL, 20));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockcustomore", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.ORDER, 10).add(Aspect.EARTH, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockstarlightinfuser", 0), new AspectList().add(Aspect.EARTH, 25).add(Aspect.LIGHT, 20).add(Aspect.MAGIC, 10).add(Aspect.METAL, 10).add(Aspect.ORDER, 10).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockworldilluminator", 0), new AspectList().add(Aspect.LIGHT, 10).add(Aspect.AURA, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockwell", 0), new AspectList().add(Aspect.EARTH, 10).add(Aspect.ENTROPY, 10).add(Aspect.WATER, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockattunementrelay", 0), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockinfusedwood", 0), new AspectList().add(Aspect.PLANT, 3).add(Aspect.LIGHT, 3).add(Aspect.MAGIC, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockinfusedwood", 1), new AspectList().add(Aspect.PLANT, 3).add(Aspect.LIGHT, 3).add(Aspect.MAGIC, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockinfusedwood", 5), new AspectList().add(Aspect.PLANT, 3).add(Aspect.LIGHT, 3).add(Aspect.SENSES, 3).add(Aspect.MAGIC, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockinfusedwood", 6), new AspectList().add(Aspect.PLANT, 5).add(Aspect.LIGHT, 5).add(Aspect.MAGIC, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockcustomflower", 0), new AspectList().add(Aspect.PLANT, 5).add(Aspect.SENSES, 5).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockprism", 0), new AspectList().add(Aspect.CRYSTAL, 25).add(Aspect.METAL, 20).add(Aspect.LIGHT, 20).add(Aspect.ORDER, 10).add(Aspect.EARTH, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blocktreebacon", 0), new AspectList().add(Aspect.PLANT, 25).add(Aspect.LIFE, 10).add(Aspect.EARTH, 10).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockrituallink", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.METAL, 10).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blocklens", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.LIGHT, 10).add(Aspect.EXCHANGE, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockborehead", 0), new AspectList().add(Aspect.EARTH, 25).add(Aspect.CRYSTAL, 20).add(Aspect.METAL, 20).add(Aspect.ORDER, 10).add(Aspect.ENTROPY, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockborehead", 1), new AspectList().add(Aspect.EARTH, 25).add(Aspect.CRYSTAL, 20).add(Aspect.METAL, 20).add(Aspect.ORDER, 10).add(Aspect.SENSES, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockmachine", 0), new AspectList().add(Aspect.SENSES, 20).add(Aspect.PLANT, 10).add(Aspect.METAL, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemperkgem", 0), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.WATER, 10).add(Aspect.EARTH, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemperkgem", 1), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.FIRE, 10).add(Aspect.LIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemperkgem", 2), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.MOTION, 10).add(Aspect.FLIGHT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockgemcrystals", 0), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockgemcrystals", 1), new AspectList().add(Aspect.EARTH, 5).add(Aspect.CRYSTAL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockgemcrystals", 2), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.WATER, 10).add(Aspect.EARTH, 10));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockgemcrystals", 3), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.FIRE, 10).add(Aspect.LIGHT, 5).add(Aspect.EARTH, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockgemcrystals", 4), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.MOTION, 10).add(Aspect.FLIGHT, 5).add(Aspect.EARTH, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "itemcape", 0), new AspectList().add(Aspect.BEAST, 30).add(Aspect.METAL, 30).add(Aspect.PROTECT, 28).add(Aspect.LIGHT, 25).add(Aspect.DARKNESS, 25).add(Aspect.MAGIC, 25));
        AspectRegister.registerFluidAspect(register, "astralsorcery.liquidstarlight", new AspectList().add(Aspect.WATER, 10).add(Aspect.LIGHT, 10));
        int b = 3;
        for (int a = 0; a < 5; a++)
        {
            register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "blockcelestialcrystals", a), new AspectList().add(Aspect.CRYSTAL, b).add(Aspect.LIGHT, b).add(Aspect.DARKNESS, b));
            b += 3;
        }









    }
}
