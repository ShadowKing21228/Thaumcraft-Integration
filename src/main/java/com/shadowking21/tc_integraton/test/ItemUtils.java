package com.shadowking21.tc_integraton.test;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.*;

public class ItemUtils {
    public static Map<String, List<String>> ITEMSLIST = new HashMap<>();

    public static List<ItemStack> getItems(){
        List<ItemStack> ITEM_LIST = new ArrayList<>();
        for (Map.Entry<String, List<String>> items : ITEMSLIST.entrySet()) {
            for (String path : items.getValue()) {
                Item item = getRegisteredItem(items.getKey(), path);
                if(item != null) ITEM_LIST.add(new ItemStack(item));
            }
        }
        return ITEM_LIST;
    }


    public static void addItems(String[] items){
        addItems(Arrays.asList(items));
    }

    public static void addItems(Collection<String> items){
        for (String item : items) {
            String name = "";
            String path = "";
            boolean d1 = false;
            for (int i = 0; i < item.length(); i++) {
                char chr = item.charAt(i);
                if(chr == ':'){
                    d1 = true;
                    continue;
                }
                if(d1){
                    name += chr;
                } else {
                    path += chr;
                }
            }
            addItem(name,path);
        }
    }
    public static @Nullable Item addItems(String items){
            StringBuilder name = new StringBuilder();
            StringBuilder path = new StringBuilder();
            boolean d1 = false;
            for (int i = 0; i < items.length(); i++) {
                char chr = items.charAt(i);
                if(chr == ':'){
                    d1 = true;
                }
                else {
                    if(d1){
                        name.append(chr);
                    } else {
                        path.append(chr);
                    }
                }
            }
            return getRegisteredItem(name.toString(), path.toString());
    }

    public static void addItem(String modID, String path){
        putToList(modID, path);
    }

    protected static void putToList(String modID, String path){
        if(ITEMSLIST.containsKey(modID)){
            List<String> item = ITEMSLIST.get(modID);
            item.add(path);
            ITEMSLIST.put(modID,item);
        } else {
            ITEMSLIST.put(modID,Arrays.asList(path));
        }
    }

    public static Item getRegisteredItem(String name, String path) {
        Item item = Item.REGISTRY.getObject(new ResourceLocation(name, path));
        if(item == null) {
            return null;
        }
        return item;
    }
    public static ItemStack getRegisteredItemStack(String name, String path, int meta)
    {
        Item item = Item.REGISTRY.getObject(new ResourceLocation(name, path));
        if(item == null) {
            return null;
        }
        ItemStack itemstack = new ItemStack(item, 1, meta);
        return itemstack;
    }
    public static String[] splitObjectName(String toSplit, String MODID)
    {
        String[] astring = new String[] {MODID, toSplit};
        int i = toSplit.indexOf(58);

        if (i >= 0)
        {
            astring[1] = toSplit.substring(i + 1, toSplit.length());

            if (i > 1)
            {
                astring[0] = toSplit.substring(0, i);
            }
        }

        return astring;
    }
}