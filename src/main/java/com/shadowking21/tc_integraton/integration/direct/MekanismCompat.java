package com.shadowking21.tc_integraton.integration.direct;

import com.shadowking21.tc_integraton.utils.ItemUtils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class MekanismCompat extends CompatClass {

    @Override
    protected String getModId() {
        return "mekanism";
    }

    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        AspectEventProxy register = event.register;
        System.out.println("[Thaumcraft Integration] Mekanism Support is on!");
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "enrichedalloy")), new AspectList().add(Aspect.METAL, 10).add(Aspect.ENERGY, 10));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "reinforcedalloy")), new AspectList().add(Aspect.METAL, 10).add(Aspect.ENERGY, 10).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "atomicalloy")), new AspectList().add(Aspect.METAL, 20).add(Aspect.ENERGY, 10).add(Aspect.CRYSTAL, 10).add(Aspect.DESIRE, 10).add(Aspect.DARKNESS, 10).add(Aspect.FIRE, 5));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "controlcircuit")), new AspectList().add(Aspect.METAL, 10).add(Aspect.ENERGY, 10).add(Aspect.ALCHEMY, 5));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "substrate")), new AspectList().add(Aspect.EXCHANGE, 5).add(Aspect.ALCHEMY, 5));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "polyethene")), new AspectList().add(Aspect.EXCHANGE, 10).add(Aspect.ALCHEMY, 10).add(Aspect.CRAFT, 5));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "atomicdisassembler")), new AspectList().add(Aspect.METAL, 85).add(Aspect.ENERGY, 50).add(Aspect.TOOL, 25).add(Aspect.DARKNESS, 20).add(Aspect.DESIRE, 10));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "hohlraum")), new AspectList().add(Aspect.METAL, 20).add(Aspect.DESIRE, 10).add(Aspect.VOID, 10));
    }
}
