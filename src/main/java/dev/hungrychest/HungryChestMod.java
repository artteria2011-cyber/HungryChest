package dev.hungrychest;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class HungryChestMod implements ModInitializer {
    public static final String MOD_ID = "hungry_chest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hungry Chest is waking up!");
        LOGGER.info("Milestone 0.1.0: project bootstrap. Chest hunger mechanics are next.");
    }
}
