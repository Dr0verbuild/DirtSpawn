package discover;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static discover.Discover.nameSpace;

public class createSoundEffects {

    public static final Identifier brad_scream = new Identifier(nameSpace + ":brad_scream");
    public static SoundEvent BRAD_SCREAM = new SoundEvent(brad_scream);

    public static void soundEffectCreate(){
        Registry.register(Registry.SOUND_EVENT, brad_scream, BRAD_SCREAM);
    }

}
