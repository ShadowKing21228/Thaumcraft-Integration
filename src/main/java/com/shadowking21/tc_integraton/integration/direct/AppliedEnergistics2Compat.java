package com.shadowking21.tc_integraton.integration.direct;

import com.shadowking21.tc_integraton.utils.ItemUtils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class AppliedEnergistics2Compat extends CompatClass{

    @Override
    protected String getModId() {
        return "appliedenergistics2";
    }

    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        AspectEventProxy register = event.register;
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "certus_quartz_wrench")), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.SENSES, 10).add(Aspect.TOOL, 5));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "nether_quartz_wrench")), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.TOOL, 5));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "charged_quartz_ore")), new AspectList().add(Aspect.CRYSTAL, 5).add(Aspect.SENSES, 5).add(Aspect.ENERGY, 5).add(Aspect.EARTH, 5));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "portable_cell")), new AspectList().add(Aspect.VOID, 30).add(Aspect.CRYSTAL, 25).add(Aspect.METAL, 25).add(Aspect.SENSES, 25).add(Aspect.ENERGY, 25));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "network_tool")), new AspectList().add(Aspect.CRYSTAL, 25).add(Aspect.METAL, 25).add(Aspect.SENSES, 25).add(Aspect.TOOL, 20).add(Aspect.CRAFT, 20));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "charged_staff")), new AspectList().add(Aspect.METAL, 15).add(Aspect.AVERSION, 10).add(Aspect.CRYSTAL, 5).add(Aspect.ENERGY, 5));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "sky_stone_block")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.ELDRITCH, 1));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "smooth_sky_stone_block")), new AspectList().add(Aspect.EARTH, 5).add(Aspect.ELDRITCH, 1).add(Aspect.ORDER, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 20), new AspectList().add(Aspect.CRAFT, 10).add(Aspect.EXCHANGE, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 18), new AspectList().add(Aspect.CRAFT, 5).add(Aspect.METAL, 5).add(Aspect.DESIRE, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 17), new AspectList().add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.CRAFT, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 16), new AspectList().add(Aspect.CRAFT, 5).add(Aspect.CRYSTAL, 5).add(Aspect.SENSES, 5).add(Aspect.ORDER, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 23), new AspectList().add(Aspect.CRAFT, 20).add(Aspect.CRYSTAL, 5).add(Aspect.SENSES, 5).add(Aspect.ORDER, 5).add(Aspect.ENERGY, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 22), new AspectList().add(Aspect.CRAFT, 20).add(Aspect.METAL, 5).add(Aspect.DESIRE, 5).add(Aspect.ENERGY, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 24), new AspectList().add(Aspect.CRAFT, 20).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.ENERGY, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 1), new AspectList().add(Aspect.CRYSTAL, 5).add(Aspect.SENSES, 5).add(Aspect.ENERGY, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 47), new AspectList().add(Aspect.VOID, 256).add(Aspect.FLUX, 256).add(Aspect.ENTROPY, 256));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 48), new AspectList().add(Aspect.VOID, 128).add(Aspect.FLUX, 128).add(Aspect.ENTROPY, 128).add(Aspect.MOTION, 16).add(Aspect.ELDRITCH, 8));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 6), new AspectList().add(Aspect.ALCHEMY, 10).add(Aspect.EXCHANGE, 10));
        int[] pressmass = {13, 14, 15, 19};
        for (int i : pressmass) {
            register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", i), new AspectList().add(Aspect.METAL, 30).add(Aspect.VOID, 10));
        }
    }
}
