package net.nathan.nathansbiomes.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.nathan.nathansbiomes.NathansBiomes;

public class ModEffects {

    public static final StatusEffect PENGUINS_GRACE_EFFECT = new PenguinsGraceEffect(StatusEffectCategory.BENEFICIAL, 0xffffff);
    public static final RegistryEntry<StatusEffect> PENGUINS_GRACE = registerStatusEffect("penguins_grace", PENGUINS_GRACE_EFFECT);

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        RegistryKey<StatusEffect> registryKey = RegistryKey.of(Registries.STATUS_EFFECT.getKey(), Identifier.of(NathansBiomes.MOD_ID, name));
        Registry.register(Registries.STATUS_EFFECT, registryKey, statusEffect);
        return Registries.STATUS_EFFECT.getEntry(registryKey).orElseThrow(() -> new IllegalStateException("StatusEffect " + name + " not found."));
    }

    public static void registerEffects() {
        NathansBiomes.LOGGER.info("Registering Mod Effects for " + NathansBiomes.MOD_ID);
    }
}