package com.shadowking21.tc_integraton.integration.direct;

import com.shadowking21.tc_integraton.utils.ItemUtils;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectEventProxy;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.AspectRegistryEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WizardryCompat extends CompatClass {

    @Override
    protected String getModId() {
        return "ebwizardry";
    }

    private final List<String> ELEMENTS = new ArrayList<>();
    {
        ELEMENTS.add("");
        ELEMENTS.add("fire_");
        ELEMENTS.add("ice_");
        ELEMENTS.add("lightning_");
        ELEMENTS.add("necromancy_");
        ELEMENTS.add("earth_");
        ELEMENTS.add("sorcery_");
        ELEMENTS.add("healing_");
    }

    private final List<String> GRADES = new ArrayList<>();
    {
        GRADES.add("novice_");
        GRADES.add("apprentice_");
        GRADES.add("advanced_");
        GRADES.add("master_");
    }

    private final Map<String, Integer> GRADE_MULTIPLIER = new HashMap<>();
    {
        GRADE_MULTIPLIER.put("novice_", 1);
        GRADE_MULTIPLIER.put("apprentice_", 2);
        GRADE_MULTIPLIER.put("advanced_", 3);
        GRADE_MULTIPLIER.put("master_", 4);
    }

    private final Map<String, AspectList> ELEMENT_ASPECT = new HashMap<>();
    {
        ELEMENT_ASPECT.put("", new AspectList());
        ELEMENT_ASPECT.put("fire_", new AspectList().add(Aspect.FIRE, 5));
        ELEMENT_ASPECT.put("ice_", new AspectList().add(Aspect.COLD, 5));
        ELEMENT_ASPECT.put("lightning_", new AspectList().add(Aspect.ENERGY, 5));
        ELEMENT_ASPECT.put("necromancy_", new AspectList().add(Aspect.UNDEAD, 5));
        ELEMENT_ASPECT.put("earth_", new AspectList().add(Aspect.EARTH, 5));
        ELEMENT_ASPECT.put("sorcery_", new AspectList().add(Aspect.AURA, 5));
        ELEMENT_ASPECT.put("healing_", new AspectList().add(Aspect.LIFE, 5));
    }

    private final AspectList WAND_DEFAULT_ASPECTS = new AspectList().add(Aspect.MAGIC, 5).add(Aspect.TOOL, 3).add(Aspect.METAL, 1);

    @SubscribeEvent
    public void aspectRegistrationEvent(AspectRegistryEvent event) {
        AspectEventProxy register = event.register;

        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "magic_crystal")), new AspectList().add(Aspect.CRYSTAL, 3).add(Aspect.MAGIC, 1));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "magic_crystal", 1), new AspectList().add(Aspect.CRYSTAL, 3).add(Aspect.MAGIC, 1).add(Aspect.FIRE, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "magic_crystal", 2), new AspectList().add(Aspect.CRYSTAL, 3).add(Aspect.MAGIC, 1).add(Aspect.COLD, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "magic_crystal", 3), new AspectList().add(Aspect.CRYSTAL, 3).add(Aspect.MAGIC, 1).add(Aspect.ENERGY, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "magic_crystal", 4), new AspectList().add(Aspect.CRYSTAL, 3).add(Aspect.MAGIC, 1).add(Aspect.DARKNESS, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "magic_crystal", 5), new AspectList().add(Aspect.CRYSTAL, 3).add(Aspect.MAGIC, 1).add(Aspect.LIFE, 5));
        register.registerObjectTag(ItemUtils.getRegisteredItemStack(modId, "magic_crystal", 6), new AspectList().add(Aspect.CRYSTAL, 3).add(Aspect.MAGIC, 1).add(Aspect.AURA, 5));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "grand_crystal")), new AspectList().add(Aspect.CRYSTAL, 20).add(Aspect.MAGIC, 15));

        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "crystal_flower")), new AspectList().add(Aspect.PLANT, 3).add(Aspect.SENSES, 3).add(Aspect.CRYSTAL, 1).add(Aspect.MAGIC, 1));

        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "oak_bookshelf")), new AspectList().add(Aspect.PLANT, 20).add(Aspect.MIND, 15).add(Aspect.MAGIC, 10));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "spruce_bookshelf")), new AspectList().add(Aspect.PLANT, 20).add(Aspect.MIND, 15).add(Aspect.MAGIC, 10));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "birch_bookshelf")), new AspectList().add(Aspect.PLANT, 20).add(Aspect.MIND, 15).add(Aspect.MAGIC, 10));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "jungle_bookshelf")), new AspectList().add(Aspect.PLANT, 20).add(Aspect.MIND, 15).add(Aspect.MAGIC, 10));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "acacia_bookshelf")), new AspectList().add(Aspect.PLANT, 20).add(Aspect.MIND, 15).add(Aspect.MAGIC, 10));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "dark_oak_bookshelf")), new AspectList().add(Aspect.PLANT, 20).add(Aspect.MIND, 15).add(Aspect.MAGIC, 10));

        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "oak_lectern")), new AspectList().add(Aspect.PLANT, 25).add(Aspect.MIND, 20).add(Aspect.MAGIC, 20));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "spruce_lectern")), new AspectList().add(Aspect.PLANT, 25).add(Aspect.MIND, 20).add(Aspect.MAGIC, 20));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "birch_lectern")), new AspectList().add(Aspect.PLANT, 25).add(Aspect.MIND, 20).add(Aspect.MAGIC, 20));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "jungle_lectern")), new AspectList().add(Aspect.PLANT, 25).add(Aspect.MIND, 20).add(Aspect.MAGIC, 20));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "acacia_lectern")), new AspectList().add(Aspect.PLANT, 25).add(Aspect.MIND, 20).add(Aspect.MAGIC, 20));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "dark_oak_lectern")), new AspectList().add(Aspect.PLANT, 25).add(Aspect.MIND, 20).add(Aspect.MAGIC, 20));

        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "spell_book")), new AspectList().add(Aspect.MIND, 5).add(Aspect.MAGIC, 5).add(Aspect.BEAST, 3).add(Aspect.PLANT, 1));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "ruined_spell_book")), new AspectList().add(Aspect.ENTROPY, 5).add(Aspect.MIND, 3).add(Aspect.MAGIC, 3).add(Aspect.BEAST, 1));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "blank_scroll")), new AspectList().add(Aspect.MIND, 3).add(Aspect.BEAST, 3).add(Aspect.VOID, 1));
        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "scroll")), new AspectList().add(Aspect.MIND, 3).add(Aspect.BEAST, 3).add(Aspect.MAGIC, 3));

        register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, "magic_wand")), new AspectList().add(Aspect.MAGIC, 5).add(Aspect.TOOL, 3).add(Aspect.METAL, 1));

        for (String element : ELEMENTS) {
            for (String grade : GRADES) {
                if (element.isEmpty() && grade.equals("novice_")) continue;

                String wandName = grade + element + "wand";
                AspectList wandAspects = new AspectList().add(ELEMENT_ASPECT.get(element)).add(WAND_DEFAULT_ASPECTS);
                wandAspects = ItemUtils.MultiplyAspectList(wandAspects, GRADE_MULTIPLIER.get(grade));
                register.registerObjectTag(new ItemStack(ItemUtils.getRegisteredItem(modId, wandName)), wandAspects);
            }
        }


    }

}
