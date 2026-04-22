package com.shadowking21.tc_integraton.DirectIntegrations;

import com.shadowking21.tc_integraton.Utils.ItemUtils;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class ImmersiveEngineeringCompat {
    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        String ie = "immersiveengineering";
        AspectEventProxy register = event.register;
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(ie, "tool", 0), new AspectList().add(Aspect.METAL, 15).add(Aspect.TOOL, 5).add(Aspect.BEAST, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(ie, "tool", 1), new AspectList().add(Aspect.METAL, 15).add(Aspect.TOOL, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(ie, "material", 4), new AspectList().add(Aspect.PLANT, 3).add(Aspect.CRAFT, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(ie, "material", 26), new AspectList().add(Aspect.METAL, 5).add(Aspect.CRYSTAL, 3).add(Aspect.ENERGY, 3).add(Aspect.MECHANISM, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(ie, "material", 27), new AspectList().add(Aspect.METAL, 15).add(Aspect.ENERGY, 10).add(Aspect.MECHANISM, 10).add(Aspect.CRYSTAL, 5).add(Aspect.EXCHANGE, 3));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(ie, "graphite_electrode", 0), new AspectList().add(Aspect.FIRE, 70).add(Aspect.ENERGY, 70));
        for (int i = 0; i < 7; i++) {
            register.registerObjectTag(ItemUtils.getRegisteredItemStack(ie, "mold", i), new AspectList().add(Aspect.METAL, 40).add(Aspect.ORDER, 15).add(Aspect.VOID, 5));
        }
    }
}
