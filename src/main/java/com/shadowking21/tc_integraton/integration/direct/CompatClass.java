package com.shadowking21.tc_integraton.integration.direct;

import thaumcraft.api.aspects.AspectRegistryEvent;

public abstract class CompatClass {

    protected CompatClass() {
        modId = getModId();
    }

    public String modId;

    protected abstract String getModId();

    @SuppressWarnings("unused")
    public abstract void aspectRegistrationEvent(AspectRegistryEvent event);
}
