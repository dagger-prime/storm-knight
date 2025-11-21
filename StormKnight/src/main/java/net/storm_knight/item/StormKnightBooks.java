package net.stormknight.item;

import net.minecraft.util.Identifier;
import net.spell_engine.api.item.SpellBooks;
import net.stormknight.StormKnightMod;

import java.util.List;

/**
 * Registers the Storm Knight skill book(s).
 */
public class StormKnightBooks {
    public static void register() {
        // If you want multiple “tiers”, add more names here.
        var books = List.of("storm_knight");
        for (var name : books) {
            SpellBooks.createAndRegister(Identifier.of(StormKnightMod.ID, name),
                    StormKnightMod.GROUP_KEY);
        }
    }
}
