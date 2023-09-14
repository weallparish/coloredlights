package weallparish.coloredlights;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import weallparish.coloredlights.block.ModBlocks;
import weallparish.coloredlights.item.ModItems;
import weallparish.coloredlights.particle.ModParticleTypes;
import weallparish.coloredlights.util.ModTags;

public class ColoredLightMod implements ModInitializer {
	public static final String MOD_ID = "coloredlights";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModParticleTypes.registerModParticles();
	}
}