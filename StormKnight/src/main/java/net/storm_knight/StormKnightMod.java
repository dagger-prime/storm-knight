package net.stormknight;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stormknight.item.StormKnightBooks;

/**
 * Storm Knight class spellbook + spells mod.
 * No Wizards / RPG Series identifiers, no custom villagers/armors/etc.
 */
public class StormKnightMod {
    public static final String ID = "storm_knight";

    public static final RegistryKey<ItemGroup> GROUP_KEY =
            RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(ID, "generic"));

    public static void init() {
        // Register your spell book(s)
        StormKnightBooks.register();

        // Creative tab registration
        Registry.register(
                Registries.ITEM_GROUP,
                GROUP_KEY,
                FabricItemGroup.builder()
                        .displayName(Text.translatable("itemGroup." + ID + ".generic"))
                        .icon(() -> new ItemStack(Registries.ITEM.get(Identifier.of(ID, "storm_knight"))))
                        .entries((displayContext, entries) -> {
                            entries.add(Registries.ITEM.get(Identifier.of(ID, "storm_knight")));
                        })
                        .build()
        );
    }
}

