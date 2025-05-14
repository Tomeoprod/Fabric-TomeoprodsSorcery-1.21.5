package net.tomeoprod.tomeoprodssorcery;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ESSENCE_BELT = registerItem("essence_belt", new Item(new Item.Settings()));
    public static final Item GOLD_ESSENCE_BELT = registerItem("gold_essence_belt", new Item(new Item.Settings()));
    public static final Item DIAMOND_ESSENCE_BELT = registerItem("diamond_essence_belt", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TomeoprodsSorcery.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TomeoprodsSorcery.LOGGER.info("Registering Mod Items for " + TomeoprodsSorcery.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(ESSENCE_BELT);
            entries.add(GOLD_ESSENCE_BELT);
            entries.add(DIAMOND_ESSENCE_BELT);
        });
    }
}
