package discover;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static discover.Discover.nameSpace;
import static discover.blocks.spawnOresCreate.*;
import static discover.items.itemsCreate.*;

public class tabGroups {
    public static final ItemGroup DISCOVER_GROUP = FabricItemGroupBuilder.create(
            new Identifier(nameSpace, "group"))
            .icon(() -> new ItemStack(BREADLY.asItem()))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(BREADLY.asItem()));
                stacks.add(new ItemStack(HARD_BOILED_EGG.asItem()));


                stacks.add(new ItemStack(ORE_BAT.asItem()));
                stacks.add(new ItemStack(ORE_BLAZE.asItem()));
                stacks.add(new ItemStack(ORE_CAT.asItem()));
                stacks.add(new ItemStack(ORE_CAVE_SPIDER.asItem()));
                stacks.add(new ItemStack(ORE_CHICKEN.asItem()));
                stacks.add(new ItemStack(ORE_COD.asItem()));
                stacks.add(new ItemStack(ORE_COW.asItem()));
                stacks.add(new ItemStack(ORE_CREEPER.asItem()));
                stacks.add(new ItemStack(ORE_DOLPHIN.asItem()));
                stacks.add(new ItemStack(ORE_DONKEY.asItem()));
                stacks.add(new ItemStack(ORE_DROWNED.asItem()));
                stacks.add(new ItemStack(ORE_ELDER_GUARDIAN.asItem()));
                stacks.add(new ItemStack(ORE_ENDERMAN.asItem()));
                stacks.add(new ItemStack(ORE_ENDERMITE.asItem()));
                stacks.add(new ItemStack(ORE_EVOKER.asItem()));
                stacks.add(new ItemStack(ORE_FOX.asItem()));
                stacks.add(new ItemStack(ORE_GHAST.asItem()));
                stacks.add(new ItemStack(ORE_GUARDIAN.asItem()));
                stacks.add(new ItemStack(ORE_HOGLIN.asItem()));
                stacks.add(new ItemStack(ORE_HORSE.asItem()));
                stacks.add(new ItemStack(ORE_HUSK.asItem()));
                stacks.add(new ItemStack(ORE_LLAMA.asItem()));
                stacks.add(new ItemStack(ORE_MAGMA_CUBE.asItem()));
                stacks.add(new ItemStack(ORE_MOOSHROOM.asItem()));
                stacks.add(new ItemStack(ORE_MULE.asItem()));
                stacks.add(new ItemStack(ORE_OCELOT.asItem()));
                stacks.add(new ItemStack(ORE_PANDA.asItem()));
                stacks.add(new ItemStack(ORE_PARROT.asItem()));
                stacks.add(new ItemStack(ORE_PHANTOM.asItem()));
                stacks.add(new ItemStack(ORE_PIG.asItem()));
                stacks.add(new ItemStack(ORE_PIGLIN.asItem()));
                stacks.add(new ItemStack(ORE_PIGLIN_BRUTE.asItem()));
                stacks.add(new ItemStack(ORE_PILLAGER.asItem()));
                stacks.add(new ItemStack(ORE_POLAR_BEAR.asItem()));
                stacks.add(new ItemStack(ORE_PUFFERFISH.asItem()));
                stacks.add(new ItemStack(ORE_RABBIT.asItem()));
                stacks.add(new ItemStack(ORE_RAVAGER.asItem()));
                stacks.add(new ItemStack(ORE_SALMON.asItem()));
                stacks.add(new ItemStack(ORE_SHEEP.asItem()));
                stacks.add(new ItemStack(ORE_SHULKER.asItem()));
                stacks.add(new ItemStack(ORE_SILVERFISH.asItem()));
                stacks.add(new ItemStack(ORE_SKELETON.asItem()));
                stacks.add(new ItemStack(ORE_SKELETON_HORSE.asItem()));
                stacks.add(new ItemStack(ORE_SLIME.asItem()));
                stacks.add(new ItemStack(ORE_SPAWN.asItem()));
                stacks.add(new ItemStack(ORE_SPAWN_OVERWORLD_0.asItem()));
                stacks.add(new ItemStack(ORE_SPAWN_NETHER.asItem()));
                stacks.add(new ItemStack(ORE_SPAWN_END.asItem()));
                stacks.add(new ItemStack(ORE_SPIDER.asItem()));
                stacks.add(new ItemStack(ORE_SQUID.asItem()));
                stacks.add(new ItemStack(ORE_STRAY.asItem()));
                stacks.add(new ItemStack(ORE_STRIDER.asItem()));
                stacks.add(new ItemStack(ORE_TRADER_LLAMA.asItem()));
                stacks.add(new ItemStack(ORE_TROPICAL_FISH.asItem()));
                stacks.add(new ItemStack(ORE_TURTLE.asItem()));
                stacks.add(new ItemStack(ORE_VEX.asItem()));
                stacks.add(new ItemStack(ORE_VILLAGER.asItem()));
                stacks.add(new ItemStack(ORE_VINDICATOR.asItem()));
                stacks.add(new ItemStack(ORE_WANDERING_TRADER.asItem()));
                stacks.add(new ItemStack(ORE_WITCH.asItem()));
                stacks.add(new ItemStack(ORE_WITHER.asItem()));
                stacks.add(new ItemStack(ORE_WITHER_SKELETON.asItem()));
                stacks.add(new ItemStack(ORE_WOLF.asItem()));
                stacks.add(new ItemStack(ORE_ZOGLIN.asItem()));
                stacks.add(new ItemStack(ORE_ZOMBIE.asItem()));
                stacks.add(new ItemStack(ORE_ZOMBIE_HORSE.asItem()));
                stacks.add(new ItemStack(ORE_ZOMBIE_VILLAGER.asItem()));
                stacks.add(new ItemStack(ORE_ZOMBIFIED_PIGLIN.asItem()));
                stacks.add(new ItemStack(ORE_BEE.asItem()));
                stacks.add(new ItemStack(ORE_ENDER_DRAGON.asItem()));
                stacks.add(new ItemStack(ORE_ILLUSIONER.asItem()));
                stacks.add(new ItemStack(ORE_GIANT.asItem()));

            })
            .build();
}
