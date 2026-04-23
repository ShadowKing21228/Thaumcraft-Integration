package com.shadowking21.tc_integraton.integration.direct;

import com.shadowking21.tc_integraton.utils.ItemUtils;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class ImmersivePetroleumCompat extends CompatClass {

    @Override
    protected String getModId() {
        return "immersivepetroleum";
    }

    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        AspectEventProxy register = event.register;
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "material", 0), new AspectList().add(Aspect.EARTH, 3).add(Aspect.ENTROPY, 3).add(Aspect.BEAST, 3));
    }
}
