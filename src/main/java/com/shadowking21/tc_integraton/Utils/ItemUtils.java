package com.shadowking21.tc_integraton.Utils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.*;

public class ItemUtils {
    public static final Map<String, List<String>> ITEMSLIST = new HashMap<>();

    public static List<ItemStack> getItems() {
        List<ItemStack> itemList = new ArrayList<>();
        for (Map.Entry<String, List<String>> items : ITEMSLIST.entrySet()) {
            String modId = items.getKey();
            for (String path : items.getValue()) {
                Item item = getRegisteredItem(modId, path);
                if (item != null) {
                    itemList.add(new ItemStack(item));
                }
            }
        }
        return itemList;
    }


    public static void addItems(String[] items) {
        addItems(Arrays.asList(items));
    }

    public static void addItems(Collection<String> items) {
        for (String item : items) {
            String[] split = splitObjectName(item, "");
            if (split[0].isEmpty() || split[1].isEmpty()) {
                continue;
            }
            addItem(split[0], split[1]);
        }
    }

    public static @Nullable Item addItems(String items) {
        String[] split = splitObjectName(items, "");
        if (split[0].isEmpty() || split[1].isEmpty()) {
            return null;
        }
        return getRegisteredItem(split[0], split[1]);
    }

    public static void addItem(String modID, String path) {
        putToList(modID, path);
    }

    protected static void putToList(String modID, String path) {
        ITEMSLIST.computeIfAbsent(modID, key -> new ArrayList<>()).add(path);
    }

    public static Item getRegisteredItem(String name, String path) {
        return Item.REGISTRY.getObject(new ResourceLocation(name, path));
    }

    public static ItemStack getRegisteredItemStack(String name, String path, int meta) {
        Item item = Item.REGISTRY.getObject(new ResourceLocation(name, path));
        if (item == null) {
            return null;
        }
        return new ItemStack(item, 1, meta);
    }

    public static String[] splitObjectName(String toSplit, String MODID) {
        String[] astring = new String[]{MODID, toSplit};
        int i = toSplit.indexOf(58);

        if (i >= 0) {
            astring[1] = toSplit.substring(i + 1, toSplit.length());

            if (i > 1) {
                astring[0] = toSplit.substring(0, i);
            }
        }

        return astring;
    }

}
