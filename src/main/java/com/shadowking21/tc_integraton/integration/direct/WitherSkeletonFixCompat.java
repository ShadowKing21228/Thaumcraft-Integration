package com.shadowking21.tc_integraton.integration.direct;

import com.shadowking21.tc_integraton.utils.ItemUtils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

public class WitherSkeletonFixCompat extends CompatClass {

    @Override
    protected String getModId() {
        return "witherskelefix";
    }

    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event)
    {
        AspectEventProxy register = event.register;
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "fragment")), new AspectList().add(Aspect.DEATH, 1).add(Aspect.SOUL, 1).add(Aspect.UNDEAD, 1));
    }
}
