package com.shadowking21.tc_integraton.DirectIntegrations;

import com.shadowking21.tc_integraton.test.ItemUtils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class WitherSkeletonFixCompat {
    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        AspectEventProxy register = event.register;
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem("witherskelefix", "fragment")), new AspectList().add(Aspect.DEATH, 1).add(Aspect.SOUL, 1).add(Aspect.UNDEAD, 1));
    }
}
