package discover;

import discover.blocks.spawnOresCreate;
import discover.entity.entityCreate;
import discover.items.itemsCreate;
import net.fabricmc.api.ModInitializer;

import static discover.createSoundEffects.soundEffectCreate;


public class Discover implements ModInitializer {

	//Be careful changing nameSpace. Json names, folder names, and png names and such remain unaffected. Just changing this will break stuff.
	public static final String nameSpace = "discover";

	public void onInitialize() {



		itemsCreate.createItems();

		spawnOresCreate.createBlocks();

		Generation.gen();

		soundEffectCreate();

		new tabGroups();
	}
}
