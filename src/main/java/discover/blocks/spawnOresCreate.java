package discover.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import static discover.Discover.nameSpace;


public class spawnOresCreate {

    //settings to apply to all the ores
    static FabricBlockSettings OreSettings = FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.GRAVEL).strength(1.0f,5.0f).breakByTool(FabricToolTags.SHOVELS);

    //make block objects
    public static final Block ORE_BAT = new Block(OreSettings);
    public static final Block ORE_BLAZE = new Block(OreSettings);
    public static final Block ORE_CAT = new Block(OreSettings);
    public static final Block ORE_CAVE_SPIDER = new Block(OreSettings);
    public static final Block ORE_CHICKEN = new Block(OreSettings);
    public static final Block ORE_COD = new Block(OreSettings);
    public static final Block ORE_COW = new Block(OreSettings);
    public static final Block ORE_CREEPER = new Block(OreSettings);
    public static final Block ORE_DOLPHIN = new Block(OreSettings);
    public static final Block ORE_DONKEY = new Block(OreSettings);
    public static final Block ORE_DROWNED = new Block(OreSettings);
    public static final Block ORE_ELDER_GUARDIAN = new Block(OreSettings);
    public static final Block ORE_ENDERMAN = new Block(OreSettings);
    public static final Block ORE_ENDERMITE = new Block(OreSettings);
    public static final Block ORE_EVOKER = new Block(OreSettings);
    public static final Block ORE_FOX = new Block(OreSettings);
    public static final Block ORE_GHAST = new Block(OreSettings);
    public static final Block ORE_GUARDIAN = new Block(OreSettings);
    public static final Block ORE_HOGLIN = new Block(OreSettings);
    public static final Block ORE_HORSE = new Block(OreSettings);
    public static final Block ORE_HUSK = new Block(OreSettings);
    public static final Block ORE_LLAMA = new Block(OreSettings);
    public static final Block ORE_MAGMA_CUBE = new Block(OreSettings);
    public static final Block ORE_MOOSHROOM = new Block(OreSettings);
    public static final Block ORE_MULE = new Block(OreSettings);
    public static final Block ORE_OCELOT = new Block(OreSettings);
    public static final Block ORE_PANDA = new Block(OreSettings);
    public static final Block ORE_PARROT = new Block(OreSettings);
    public static final Block ORE_PHANTOM = new Block(OreSettings);
    public static final Block ORE_PIG = new Block(OreSettings);
    public static final Block ORE_PIGLIN = new Block(OreSettings);
    public static final Block ORE_PIGLIN_BRUTE = new Block(OreSettings);
    public static final Block ORE_PILLAGER = new Block(OreSettings);
    public static final Block ORE_POLAR_BEAR = new Block(OreSettings);
    public static final Block ORE_PUFFERFISH = new Block(OreSettings);
    public static final Block ORE_RABBIT = new Block(OreSettings);
    public static final Block ORE_RAVAGER = new Block(OreSettings);
    public static final Block ORE_SALMON = new Block(OreSettings);
    public static final Block ORE_SHEEP = new Block(OreSettings);
    public static final Block ORE_SHULKER = new Block(OreSettings);
    public static final Block ORE_SILVERFISH = new Block(OreSettings);
    public static final Block ORE_SKELETON = new Block(OreSettings);
    public static final Block ORE_SKELETON_HORSE = new Block(OreSettings);
    public static final Block ORE_SLIME = new Block(OreSettings);
    public static final Block ORE_SPAWN = new Block(OreSettings);
    public static final Block ORE_SPAWN_OVERWORLD_0 = new Block(OreSettings);
    public static final Block ORE_SPAWN_NETHER = new Block(OreSettings);
    public static final Block ORE_SPAWN_END = new Block(OreSettings);
    public static final Block ORE_SPIDER = new Block(OreSettings);
    public static final Block ORE_SQUID = new Block(OreSettings);
    public static final Block ORE_STRAY = new Block(OreSettings);
    public static final Block ORE_STRIDER = new Block(OreSettings);
    public static final Block ORE_TRADER_LLAMA = new Block(OreSettings);
    public static final Block ORE_TROPICAL_FISH = new Block(OreSettings);
    public static final Block ORE_TURTLE = new Block(OreSettings);
    public static final Block ORE_VEX = new Block(OreSettings);
    public static final Block ORE_VILLAGER = new Block(OreSettings);
    public static final Block ORE_VINDICATOR = new Block(OreSettings);
    public static final Block ORE_WANDERING_TRADER = new Block(OreSettings);
    public static final Block ORE_WITCH = new Block(OreSettings);
    public static final Block ORE_WITHER = new Block(OreSettings);
    public static final Block ORE_WITHER_SKELETON = new Block(OreSettings);
    public static final Block ORE_WOLF = new Block(OreSettings);
    public static final Block ORE_ZOGLIN = new Block(OreSettings);
    public static final Block ORE_ZOMBIE = new Block(OreSettings);
    public static final Block ORE_ZOMBIE_HORSE = new Block(OreSettings);
    public static final Block ORE_ZOMBIE_VILLAGER = new Block(OreSettings);
    public static final Block ORE_ZOMBIFIED_PIGLIN = new Block(OreSettings);
    public static final Block ORE_BEE = new Block(OreSettings);
    public static final Block ORE_ENDER_DRAGON = new Block(OreSettings);
    public static final Block ORE_ILLUSIONER = new Block(OreSettings);
    public static final Block ORE_GIANT = new Block(OreSettings);


    //add blocks to registry. For each block, also add it as an item
    public static final void createBlocks() {

        //bat ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_bat"), ORE_BAT);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_bat"), new BlockItem(ORE_BAT, new FabricItemSettings().group(ItemGroup.SEARCH)));
//blaze ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_blaze"), ORE_BLAZE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_blaze"), new BlockItem(ORE_BLAZE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//cat ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_cat"), ORE_CAT);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_cat"), new BlockItem(ORE_CAT, new FabricItemSettings().group(ItemGroup.SEARCH)));
//cave_spider ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_cave_spider"), ORE_CAVE_SPIDER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_cave_spider"), new BlockItem(ORE_CAVE_SPIDER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//chicken ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_chicken"), ORE_CHICKEN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_chicken"), new BlockItem(ORE_CHICKEN, new FabricItemSettings().group(ItemGroup.SEARCH)));
//cod ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_cod"), ORE_COD);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_cod"), new BlockItem(ORE_COD, new FabricItemSettings().group(ItemGroup.SEARCH)));
//cow ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_cow"), ORE_COW);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_cow"), new BlockItem(ORE_COW, new FabricItemSettings().group(ItemGroup.SEARCH)));
//creeper ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_creeper"), ORE_CREEPER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_creeper"), new BlockItem(ORE_CREEPER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//dolphin ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_dolphin"), ORE_DOLPHIN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_dolphin"), new BlockItem(ORE_DOLPHIN, new FabricItemSettings().group(ItemGroup.SEARCH)));
//donkey ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_donkey"), ORE_DONKEY);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_donkey"), new BlockItem(ORE_DONKEY, new FabricItemSettings().group(ItemGroup.SEARCH)));
//drowned ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_drowned"), ORE_DROWNED);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_drowned"), new BlockItem(ORE_DROWNED, new FabricItemSettings().group(ItemGroup.SEARCH)));
//elder_guardian ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_elder_guardian"), ORE_ELDER_GUARDIAN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_elder_guardian"), new BlockItem(ORE_ELDER_GUARDIAN, new FabricItemSettings().group(ItemGroup.SEARCH)));
//enderman ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_enderman"), ORE_ENDERMAN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_enderman"), new BlockItem(ORE_ENDERMAN, new FabricItemSettings().group(ItemGroup.SEARCH)));
//endermite ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_endermite"), ORE_ENDERMITE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_endermite"), new BlockItem(ORE_ENDERMITE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//evoker ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_evoker"), ORE_EVOKER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_evoker"), new BlockItem(ORE_EVOKER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//fox ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_fox"), ORE_FOX);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_fox"), new BlockItem(ORE_FOX, new FabricItemSettings().group(ItemGroup.SEARCH)));
//ghast ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_ghast"), ORE_GHAST);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_ghast"), new BlockItem(ORE_GHAST, new FabricItemSettings().group(ItemGroup.SEARCH)));
//guardian ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_guardian"), ORE_GUARDIAN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_guardian"), new BlockItem(ORE_GUARDIAN, new FabricItemSettings().group(ItemGroup.SEARCH)));
//hoglin ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_hoglin"), ORE_HOGLIN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_hoglin"), new BlockItem(ORE_HOGLIN, new FabricItemSettings().group(ItemGroup.SEARCH)));
//horse ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_horse"), ORE_HORSE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_horse"), new BlockItem(ORE_HORSE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//husk ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_husk"), ORE_HUSK);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_husk"), new BlockItem(ORE_HUSK, new FabricItemSettings().group(ItemGroup.SEARCH)));
//llama ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_llama"), ORE_LLAMA);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_llama"), new BlockItem(ORE_LLAMA, new FabricItemSettings().group(ItemGroup.SEARCH)));
//magma_cube ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_magma_cube"), ORE_MAGMA_CUBE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_magma_cube"), new BlockItem(ORE_MAGMA_CUBE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//mooshroom ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_mooshroom"), ORE_MOOSHROOM);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_mooshroom"), new BlockItem(ORE_MOOSHROOM, new FabricItemSettings().group(ItemGroup.SEARCH)));
//mule ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_mule"), ORE_MULE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_mule"), new BlockItem(ORE_MULE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//ocelot ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_ocelot"), ORE_OCELOT);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_ocelot"), new BlockItem(ORE_OCELOT, new FabricItemSettings().group(ItemGroup.SEARCH)));
//panda ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_panda"), ORE_PANDA);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_panda"), new BlockItem(ORE_PANDA, new FabricItemSettings().group(ItemGroup.SEARCH)));
//parrot ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_parrot"), ORE_PARROT);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_parrot"), new BlockItem(ORE_PARROT, new FabricItemSettings().group(ItemGroup.SEARCH)));
//phantom ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_phantom"), ORE_PHANTOM);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_phantom"), new BlockItem(ORE_PHANTOM, new FabricItemSettings().group(ItemGroup.SEARCH)));
//pig ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_pig"), ORE_PIG);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_pig"), new BlockItem(ORE_PIG, new FabricItemSettings().group(ItemGroup.SEARCH)));
//piglin ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_piglin"), ORE_PIGLIN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_piglin"), new BlockItem(ORE_PIGLIN, new FabricItemSettings().group(ItemGroup.SEARCH)));
//piglin_brute ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_piglin_brute"), ORE_PIGLIN_BRUTE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_piglin_brute"), new BlockItem(ORE_PIGLIN_BRUTE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//pillager ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_pillager"), ORE_PILLAGER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_pillager"), new BlockItem(ORE_PILLAGER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//polar_bear ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_polar_bear"), ORE_POLAR_BEAR);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_polar_bear"), new BlockItem(ORE_POLAR_BEAR, new FabricItemSettings().group(ItemGroup.SEARCH)));
//pufferfish ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_pufferfish"), ORE_PUFFERFISH);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_pufferfish"), new BlockItem(ORE_PUFFERFISH, new FabricItemSettings().group(ItemGroup.SEARCH)));
//rabbit ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_rabbit"), ORE_RABBIT);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_rabbit"), new BlockItem(ORE_RABBIT, new FabricItemSettings().group(ItemGroup.SEARCH)));
//ravager ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_ravager"), ORE_RAVAGER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_ravager"), new BlockItem(ORE_RAVAGER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//salmon ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_salmon"), ORE_SALMON);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_salmon"), new BlockItem(ORE_SALMON, new FabricItemSettings().group(ItemGroup.SEARCH)));
//sheep ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_sheep"), ORE_SHEEP);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_sheep"), new BlockItem(ORE_SHEEP, new FabricItemSettings().group(ItemGroup.SEARCH)));
//shulker ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_shulker"), ORE_SHULKER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_shulker"), new BlockItem(ORE_SHULKER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//silverfish ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_silverfish"), ORE_SILVERFISH);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_silverfish"), new BlockItem(ORE_SILVERFISH, new FabricItemSettings().group(ItemGroup.SEARCH)));
//skeleton ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_skeleton"), ORE_SKELETON);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_skeleton"), new BlockItem(ORE_SKELETON, new FabricItemSettings().group(ItemGroup.SEARCH)));
//skeleton_horse ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_skeleton_horse"), ORE_SKELETON_HORSE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_skeleton_horse"), new BlockItem(ORE_SKELETON_HORSE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//slime ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_slime"), ORE_SLIME);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_slime"), new BlockItem(ORE_SLIME, new FabricItemSettings().group(ItemGroup.SEARCH)));

        //spawn ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_spawn"), ORE_SPAWN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_spawn"), new BlockItem(ORE_SPAWN, new FabricItemSettings().group(ItemGroup.SEARCH).fireproof()));

        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_spawn_overworld_0"), ORE_SPAWN_OVERWORLD_0);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_spawn_overworld_0"), new BlockItem(ORE_SPAWN_OVERWORLD_0, new FabricItemSettings().group(ItemGroup.SEARCH).fireproof()));

        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_spawn_nether"), ORE_SPAWN_NETHER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_spawn_nether"), new BlockItem(ORE_SPAWN_NETHER, new FabricItemSettings().group(ItemGroup.SEARCH).fireproof()));

        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_spawn_end"), ORE_SPAWN_END);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_spawn_end"), new BlockItem(ORE_SPAWN_END, new FabricItemSettings().group(ItemGroup.SEARCH).fireproof()));


        //spider ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_spider"), ORE_SPIDER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_spider"), new BlockItem(ORE_SPIDER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//squid ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_squid"), ORE_SQUID);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_squid"), new BlockItem(ORE_SQUID, new FabricItemSettings().group(ItemGroup.SEARCH)));
//stray ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_stray"), ORE_STRAY);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_stray"), new BlockItem(ORE_STRAY, new FabricItemSettings().group(ItemGroup.SEARCH)));
//strider ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_strider"), ORE_STRIDER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_strider"), new BlockItem(ORE_STRIDER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//trader_llama ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_trader_llama"), ORE_TRADER_LLAMA);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_trader_llama"), new BlockItem(ORE_TRADER_LLAMA, new FabricItemSettings().group(ItemGroup.SEARCH)));
//tropical_fish ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_tropical_fish"), ORE_TROPICAL_FISH);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_tropical_fish"), new BlockItem(ORE_TROPICAL_FISH, new FabricItemSettings().group(ItemGroup.SEARCH)));
//turtle ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_turtle"), ORE_TURTLE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_turtle"), new BlockItem(ORE_TURTLE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//vex ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_vex"), ORE_VEX);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_vex"), new BlockItem(ORE_VEX, new FabricItemSettings().group(ItemGroup.SEARCH)));
//villager ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_villager"), ORE_VILLAGER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_villager"), new BlockItem(ORE_VILLAGER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//vindicator ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_vindicator"), ORE_VINDICATOR);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_vindicator"), new BlockItem(ORE_VINDICATOR, new FabricItemSettings().group(ItemGroup.SEARCH)));
//wandering_trader ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_wandering_trader"), ORE_WANDERING_TRADER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_wandering_trader"), new BlockItem(ORE_WANDERING_TRADER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//witch ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_witch"), ORE_WITCH);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_witch"), new BlockItem(ORE_WITCH, new FabricItemSettings().group(ItemGroup.SEARCH)));
//wither ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_wither"), ORE_WITHER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_wither"), new BlockItem(ORE_WITHER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//wither_skeleton ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_wither_skeleton"), ORE_WITHER_SKELETON);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_wither_skeleton"), new BlockItem(ORE_WITHER_SKELETON, new FabricItemSettings().group(ItemGroup.SEARCH)));
//wolf ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_wolf"), ORE_WOLF);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_wolf"), new BlockItem(ORE_WOLF, new FabricItemSettings().group(ItemGroup.SEARCH)));
//zoglin ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_zoglin"), ORE_ZOGLIN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_zoglin"), new BlockItem(ORE_ZOGLIN, new FabricItemSettings().group(ItemGroup.SEARCH)));
//zombie ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_zombie"), ORE_ZOMBIE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_zombie"), new BlockItem(ORE_ZOMBIE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//zombie_horse ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_zombie_horse"), ORE_ZOMBIE_HORSE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_zombie_horse"), new BlockItem(ORE_ZOMBIE_HORSE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//zombie_villager ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_zombie_villager"), ORE_ZOMBIE_VILLAGER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_zombie_villager"), new BlockItem(ORE_ZOMBIE_VILLAGER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//zombified_piglin ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_zombified_piglin"), ORE_ZOMBIFIED_PIGLIN);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_zombified_piglin"), new BlockItem(ORE_ZOMBIFIED_PIGLIN, new FabricItemSettings().group(ItemGroup.SEARCH)));
//bee ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_bee"), ORE_BEE);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_bee"), new BlockItem(ORE_BEE, new FabricItemSettings().group(ItemGroup.SEARCH)));
//ender_dragon ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_ender_dragon"), ORE_ENDER_DRAGON);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_ender_dragon"), new BlockItem(ORE_ENDER_DRAGON, new FabricItemSettings().group(ItemGroup.SEARCH)));
//illusioner ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_illusioner"), ORE_ILLUSIONER);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_illusioner"), new BlockItem(ORE_ILLUSIONER, new FabricItemSettings().group(ItemGroup.SEARCH)));
//giant ore
        Registry.register(Registry.BLOCK, new Identifier(nameSpace, "ore_giant"), ORE_GIANT);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ore_giant"), new BlockItem(ORE_GIANT, new FabricItemSettings().group(ItemGroup.SEARCH)));

    }
}