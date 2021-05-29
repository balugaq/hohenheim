package dev.tweep.hohenheim.util;

import lombok.NonNull;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.Block;
import org.bukkit.util.Vector;

public final class HLaser {

    private static final double MAX_STEPS_LASER = 100;
    private static final double STEP_PER_BLOCK = 0.5;

    /**
     * @param loc       Starting laser location
     * @param direction Direction the laser is going to face
     * @return The first {@link Block} the laser hits, null if it exc
     */
    public static Block spawnLaser(@NonNull Location loc, @NonNull Vector direction) {
        int iterations = 0;
        Location particleLoc = loc.clone();
        Vector step = direction.clone().normalize().multiply(STEP_PER_BLOCK);
        while (particleLoc.getBlock().getType() == Material.AIR || iterations > MAX_STEPS_LASER) {
            particleLoc.add(step);
            particleLoc.getWorld().spawnParticle(Particle.REDSTONE, particleLoc, 0, 1, 0, 1, 1);
            iterations++;
        }
        if (iterations < MAX_STEPS_LASER) {
            return particleLoc.getBlock();
        } else {
            return null;
        }
    }
}
