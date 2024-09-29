package net.nathan.barklings.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.nathan.barklings.BarklingsMain;

public class ModSounds {

    public static final SoundEvent HIDDEN_VOICES = registerSoundEvent("hidden_voices");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier identifier = new Identifier(BarklingsMain.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerSounds() {
        BarklingsMain.LOGGER.info("Registering Mod Sounds for " + BarklingsMain.MOD_ID);
    }
}