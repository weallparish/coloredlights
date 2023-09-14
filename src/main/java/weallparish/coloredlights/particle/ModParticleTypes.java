package weallparish.coloredlights.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import weallparish.coloredlights.ColoredLightMod;

public class ModParticleTypes {
    public static final DefaultParticleType LIME_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType RED_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType WHITE_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType BLACK_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType MAGENTA_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType YELLOW_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType GREEN_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType CYAN_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType BLUE_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType PURPLE_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType PINK_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType LIGHT_GRAY_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType GRAY_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType BROWN_FLAME = FabricParticleTypes.simple();

    public static void registerModParticles() {
        ColoredLightMod.LOGGER.info("Register ModParticles for " + ColoredLightMod.MOD_ID);

        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "lime_flame"), LIME_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "red_flame"), RED_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "white_flame"), WHITE_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "black_flame"), BLACK_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "magenta_flame"), MAGENTA_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "yellow_flame"), YELLOW_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "green_flame"), GREEN_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "cyan_flame"), CYAN_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "blue_flame"), BLUE_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "purple_flame"), PURPLE_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "pink_flame"), PINK_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "light_gray_flame"), LIGHT_GRAY_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "gray_flame"), GRAY_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(ColoredLightMod.MOD_ID, "brown_flame"), BROWN_FLAME);

    }

}
