package io.github.addoncommunity.galactifun.base.aliens;

import io.github.addoncommunity.galactifun.api.alien.Alien;
import io.github.addoncommunity.galactifun.api.universe.world.CelestialWorld;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

import javax.annotation.Nonnull;

/**
 * A class for an alien creeper
 *
 * @author GallowsDove
 * @author Mooy1
 */
public final class MutantCreeper extends Alien {

    public MutantCreeper(@Nonnull CelestialWorld... worlds) {
        super("MUTANT_CREEPER", "Mutant Creeper", EntityType.CREEPER, 40, 40, worlds);
    }

    @Override
    public void onSpawn(@Nonnull LivingEntity spawned) {
        Creeper spawnedCreeper = (Creeper) spawned;
        spawnedCreeper.setPowered(true);
    }

}
