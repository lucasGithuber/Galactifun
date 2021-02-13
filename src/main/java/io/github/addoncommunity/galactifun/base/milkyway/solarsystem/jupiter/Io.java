package io.github.addoncommunity.galactifun.base.milkyway.solarsystem.jupiter;

import io.github.addoncommunity.galactifun.api.universe.attributes.DayCycle;
import io.github.addoncommunity.galactifun.api.universe.attributes.Gravity;
import io.github.addoncommunity.galactifun.api.universe.attributes.Orbit;
import io.github.addoncommunity.galactifun.api.universe.attributes.atmosphere.Atmosphere;
import io.github.addoncommunity.galactifun.api.universe.attributes.atmosphere.AtmosphereBuilder;
import io.github.addoncommunity.galactifun.api.universe.types.CelestialType;
import io.github.addoncommunity.galactifun.api.universe.world.SimpleAlienWorld;
import io.github.addoncommunity.galactifun.api.universe.world.populators.LakePopulator;
import io.github.addoncommunity.galactifun.api.universe.world.populators.VolcanoPopulator;
import io.github.addoncommunity.galactifun.core.util.ItemChoice;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.generator.BlockPopulator;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Random;

public final class Io extends SimpleAlienWorld {

    public Io() {
        super("&6Io", new Orbit(421_800L), CelestialType.TERRESTRIAL, new ItemChoice(Material.LAVA_BUCKET));
    }

    @Nonnull
    @Override
    protected DayCycle createDayCycle() {
        return new DayCycle(42);
    }

    @Nonnull
    @Override
    protected Atmosphere createAtmosphere() {
        return new AtmosphereBuilder().addStorm().addThunder().build();
    }

    @Nonnull
    @Override
    protected Gravity createGravity() {
        return new Gravity(1.796);
    }

    @Override
    protected long createSurfaceArea() {
        return 41_698_064L;
    }

    @Override
    public void getPopulators(@Nonnull List<BlockPopulator> populators) {
        populators.add(new VolcanoPopulator(115, Material.OBSIDIAN, Material.LAVA));
        populators.add(new LakePopulator(75, Material.LAVA));
    }

    @Nonnull
    @Override
    protected Material generateMaterial(@Nonnull Random random, int x, int y, int z, int top) {
        if (y > 75) {
            return Material.BLACKSTONE;
        } else {
            return Material.YELLOW_TERRACOTTA;
        }
    }

    @Nonnull
    @Override
    protected Biome getBiome() {
        return Biome.DESERT_HILLS;
    }

    @Override
    protected int getAverageHeight() {
        return 80;
    }

    @Override
    protected int getMaxDeviation() {
        return 45;
    }

    @Override
    protected double getScale() {
        return .02;
    }

    @Override
    protected double getFrequency() {
        return .3;
    }
}
