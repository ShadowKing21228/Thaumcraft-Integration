package com.shadowking21.tc_integraton.DirectIntegrations;

import com.shadowking21.tc_integraton.Utils.ItemUtils;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class ImmersivePetroleumCompat {
    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        String ip = "immersivepetroleum";
        AspectEventProxy register = event.register;
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(ip, "material", 0), new AspectList().add(Aspect.EARTH, 3).add(Aspect.ENTROPY, 3).add(Aspect.BEAST, 3));
    }
}
