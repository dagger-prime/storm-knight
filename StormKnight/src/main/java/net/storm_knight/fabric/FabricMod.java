package net.stormknight.fabric;

import net.fabricmc.api.ModInitializer;
import net.stormknight.StormKnightMod;

public class FabricMod implements ModInitializer {
    @Override
    public void onInitialize() {
        StormKnightMod.init();
    }
}
