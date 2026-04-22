package com.shadowking21.tc_integraton.Utils;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;

public class AspectRegister {

    public static void registerFluidAspect(AspectEventProxy event, String fluidName, AspectList aspects) {
        Fluid fluid = FluidRegistry.getFluid(fluidName);
        if (fluid != null) {
            ItemStack emptyBucket = new ItemStack(Items.BUCKET);
            IFluidHandlerItem fluidHandler = emptyBucket.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
            if (fluidHandler != null) {
                FluidStack fluidStack = new FluidStack(fluid, Fluid.BUCKET_VOLUME);
                fluidHandler.fill(fluidStack, true);
                ItemStack filledBucket = fluidHandler.getContainer();

                event.registerObjectTag(filledBucket, new AspectList(new ItemStack(Items.BUCKET)).add(aspects));
            }
        }
    }

    //public static void register(AspectEventProxy event, String id, AspectList aspectlist) {
    //    Item a = ForgeRegistries.ITEMS.getValue(new ResourceLocation(id));
    //    if (a == null)
    //        return;
    //    event.registerObjectTag(a.getDefaultInstance(), aspectlist);
    //}
}
