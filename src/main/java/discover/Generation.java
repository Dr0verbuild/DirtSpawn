package discover;

import discover.blocks.spawnOresCreate;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static discover.Discover.nameSpace;
import static net.fabricmc.fabric.api.biome.v1.BiomeModifications.addFeature;
import static net.fabricmc.fabric.api.biome.v1.BiomeSelectors.*;

public class Generation {

    //Spawn Ores Generation Config:
    static int veinSize = 3;
    static int repeatCount = 20; // number of veins per chunk


    //bat ore
    public static ConfiguredFeature<?, ?> ORE_BAT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.GRAVEL), spawnOresCreate.ORE_BAT.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //blaze ore
    public static ConfiguredFeature<?, ?> ORE_BLAZE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_BLAZE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //cat ore
    public static ConfiguredFeature<?, ?> ORE_CAT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_CAT.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //cave_spider ore
    public static ConfiguredFeature<?, ?> ORE_CAVE_SPIDER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.GRAVEL), spawnOresCreate.ORE_CAVE_SPIDER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //chicken ore
    public static ConfiguredFeature<?, ?> ORE_CHICKEN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_CHICKEN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //cod ore
    public static ConfiguredFeature<?, ?> ORE_COD_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_COD.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //cow ore
    public static ConfiguredFeature<?, ?> ORE_COW_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_COW.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //creeper ore
    public static ConfiguredFeature<?, ?> ORE_CREEPER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_CREEPER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //dolphin ore
    public static ConfiguredFeature<?, ?> ORE_DOLPHIN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SAND), spawnOresCreate.ORE_DOLPHIN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //donkey ore
    public static ConfiguredFeature<?, ?> ORE_DONKEY_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_DONKEY.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //drowned ore
    public static ConfiguredFeature<?, ?> ORE_DROWNED_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SAND), spawnOresCreate.ORE_DROWNED.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //elder_guardian ore
    public static ConfiguredFeature<?, ?> ORE_ELDER_GUARDIAN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SAND), spawnOresCreate.ORE_ELDER_GUARDIAN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //enderman ore
    public static ConfiguredFeature<?, ?> ORE_ENDERMAN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), spawnOresCreate.ORE_ENDERMAN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //endermite ore
    public static ConfiguredFeature<?, ?> ORE_ENDERMITE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), spawnOresCreate.ORE_ENDERMITE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //evoker ore
    public static ConfiguredFeature<?, ?> ORE_EVOKER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_EVOKER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //fox ore
    public static ConfiguredFeature<?, ?> ORE_FOX_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_FOX.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //ghast ore
    public static ConfiguredFeature<?, ?> ORE_GHAST_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_GHAST.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //guardian ore
    public static ConfiguredFeature<?, ?> ORE_GUARDIAN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SAND), spawnOresCreate.ORE_GUARDIAN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //hoglin ore
    public static ConfiguredFeature<?, ?> ORE_HOGLIN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_HOGLIN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //horse ore
    public static ConfiguredFeature<?, ?> ORE_HORSE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_HORSE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //husk ore
    public static ConfiguredFeature<?, ?> ORE_HUSK_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_HUSK.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //llama ore
    public static ConfiguredFeature<?, ?> ORE_LLAMA_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_LLAMA.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //magma_cube ore
    public static ConfiguredFeature<?, ?> ORE_MAGMA_CUBE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_MAGMA_CUBE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //mooshroom ore
    public static ConfiguredFeature<?, ?> ORE_MOOSHROOM_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_MOOSHROOM.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //mule ore
    public static ConfiguredFeature<?, ?> ORE_MULE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_MULE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //ocelot ore
    public static ConfiguredFeature<?, ?> ORE_OCELOT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_OCELOT.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //panda ore
    public static ConfiguredFeature<?, ?> ORE_PANDA_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_PANDA.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //parrot ore
    public static ConfiguredFeature<?, ?> ORE_PARROT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_PARROT.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //phantom ore
    public static ConfiguredFeature<?, ?> ORE_PHANTOM_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_PHANTOM.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //pig ore
    public static ConfiguredFeature<?, ?> ORE_PIG_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_PIG.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //piglin ore
    public static ConfiguredFeature<?, ?> ORE_PIGLIN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_PIGLIN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //piglin_brute ore
    public static ConfiguredFeature<?, ?> ORE_PIGLIN_BRUTE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_PIGLIN_BRUTE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //pillager ore
    public static ConfiguredFeature<?, ?> ORE_PILLAGER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_PILLAGER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //polar_bear ore
    public static ConfiguredFeature<?, ?> ORE_POLAR_BEAR_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_POLAR_BEAR.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //pufferfish ore
    public static ConfiguredFeature<?, ?> ORE_PUFFERFISH_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_PUFFERFISH.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //rabbit ore
    public static ConfiguredFeature<?, ?> ORE_RABBIT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_RABBIT.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //ravager ore
    public static ConfiguredFeature<?, ?> ORE_RAVAGER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_RAVAGER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //salmon ore
    public static ConfiguredFeature<?, ?> ORE_SALMON_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_SALMON.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //sheep ore
    public static ConfiguredFeature<?, ?> ORE_SHEEP_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_SHEEP.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //shulker ore
    public static ConfiguredFeature<?, ?> ORE_SHULKER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), spawnOresCreate.ORE_SHULKER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //silverfish ore
    public static ConfiguredFeature<?, ?> ORE_SILVERFISH_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.GRAVEL), spawnOresCreate.ORE_SILVERFISH.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //skeleton ore
    public static ConfiguredFeature<?, ?> ORE_SKELETON_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_SKELETON.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //skeleton_horse ore
    public static ConfiguredFeature<?, ?> ORE_SKELETON_HORSE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_SKELETON_HORSE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //slime ore
    public static ConfiguredFeature<?, ?> ORE_SLIME_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_SLIME.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //TODO spawn ore
    public static ConfiguredFeature<?, ?> ORE_SPAWN_OVERWORLD_0 = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.GRAVEL), spawnOresCreate.ORE_SPAWN_OVERWORLD_0.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    public static ConfiguredFeature<?, ?> ORE_SPAWN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_SPAWN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    public static ConfiguredFeature<?, ?> ORE_SPAWN_NETHER = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_SPAWN_NETHER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    public static ConfiguredFeature<?, ?> ORE_SPAWN_END = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), spawnOresCreate.ORE_SPAWN_END.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);

    //spider ore
    public static ConfiguredFeature<?, ?> ORE_SPIDER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_SPIDER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //squid ore
    public static ConfiguredFeature<?, ?> ORE_SQUID_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SAND), spawnOresCreate.ORE_SQUID.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //stray ore
    public static ConfiguredFeature<?, ?> ORE_STRAY_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_STRAY.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //strider ore
    public static ConfiguredFeature<?, ?> ORE_STRIDER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_STRIDER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //trader_llama ore
    public static ConfiguredFeature<?, ?> ORE_TRADER_LLAMA_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_TRADER_LLAMA.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //tropical_fish ore
    public static ConfiguredFeature<?, ?> ORE_TROPICAL_FISH_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SAND), spawnOresCreate.ORE_TROPICAL_FISH.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //turtle ore
    public static ConfiguredFeature<?, ?> ORE_TURTLE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SAND), spawnOresCreate.ORE_TURTLE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //vex ore
    public static ConfiguredFeature<?, ?> ORE_VEX_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_VEX.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //villager ore
    public static ConfiguredFeature<?, ?> ORE_VILLAGER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_VILLAGER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //vindicator ore
    public static ConfiguredFeature<?, ?> ORE_VINDICATOR_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_VINDICATOR.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //wandering_trader ore
    public static ConfiguredFeature<?, ?> ORE_WANDERING_TRADER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_WANDERING_TRADER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //witch ore
    public static ConfiguredFeature<?, ?> ORE_WITCH_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_WITCH.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //wither ore
    public static ConfiguredFeature<?, ?> ORE_WITHER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), spawnOresCreate.ORE_WITHER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //wither_skeleton ore
    public static ConfiguredFeature<?, ?> ORE_WITHER_SKELETON_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_WITHER_SKELETON.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //wolf ore
    public static ConfiguredFeature<?, ?> ORE_WOLF_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_WOLF.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //zoglin ore
    public static ConfiguredFeature<?, ?> ORE_ZOGLIN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_ZOGLIN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //zombie ore
    public static ConfiguredFeature<?, ?> ORE_ZOMBIE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_ZOMBIE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //zombie_horse ore
    public static ConfiguredFeature<?, ?> ORE_ZOMBIE_HORSE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), spawnOresCreate.ORE_ZOMBIE_HORSE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //zombie_villager ore
    public static ConfiguredFeature<?, ?> ORE_ZOMBIE_VILLAGER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_ZOMBIE_VILLAGER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //zombified_piglin ore
    public static ConfiguredFeature<?, ?> ORE_ZOMBIFIED_PIGLIN_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.SOUL_SOIL), spawnOresCreate.ORE_ZOMBIFIED_PIGLIN.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //bee ore
    public static ConfiguredFeature<?, ?> ORE_BEE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.DIRT), spawnOresCreate.ORE_BEE.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //ender_dragon ore
    public static ConfiguredFeature<?, ?> ORE_ENDER_DRAGON_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), spawnOresCreate.ORE_ENDER_DRAGON.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //illusioner ore
    public static ConfiguredFeature<?, ?> ORE_ILLUSIONER_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), spawnOresCreate.ORE_ILLUSIONER.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);
    //giant ore
    public static ConfiguredFeature<?, ?> ORE_GIANT_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), spawnOresCreate.ORE_GIANT.getDefaultState(), veinSize)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 256))).spreadHorizontally().repeat(repeatCount);



    public static void gen(){

        //bat ore
        RegistryKey<ConfiguredFeature<?, ?>> oreBatOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_bat_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreBatOverworld.getValue(), ORE_BAT_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreBatOverworld);
        //blaze ore
        RegistryKey<ConfiguredFeature<?, ?>> oreBlazeOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_blaze_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreBlazeOverworld.getValue(), ORE_BLAZE_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreBlazeOverworld);
        //cat ore
        RegistryKey<ConfiguredFeature<?, ?>> oreCatOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_cat_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCatOverworld.getValue(), ORE_CAT_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCatOverworld);
        //cave_spider ore
        RegistryKey<ConfiguredFeature<?, ?>> oreCave_spiderOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_cave_spider_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCave_spiderOverworld.getValue(), ORE_CAVE_SPIDER_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCave_spiderOverworld);
        //chicken ore
        RegistryKey<ConfiguredFeature<?, ?>> oreChickenOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_chicken_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreChickenOverworld.getValue(), ORE_CHICKEN_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreChickenOverworld);
        //cod ore
        RegistryKey<ConfiguredFeature<?, ?>> oreCodOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_cod_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCodOverworld.getValue(), ORE_COD_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCodOverworld);
        //cow ore
        RegistryKey<ConfiguredFeature<?, ?>> oreCowOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_cow_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCowOverworld.getValue(), ORE_COW_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCowOverworld);
        //creeper ore
        RegistryKey<ConfiguredFeature<?, ?>> oreCreeperOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_creeper_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCreeperOverworld.getValue(), ORE_CREEPER_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreCreeperOverworld);
        //dolphin ore
        RegistryKey<ConfiguredFeature<?, ?>> oreDolphinOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_dolphin_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDolphinOverworld.getValue(), ORE_DOLPHIN_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDolphinOverworld);
        //donkey ore
        RegistryKey<ConfiguredFeature<?, ?>> oreDonkeyOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_donkey_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDonkeyOverworld.getValue(), ORE_DONKEY_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDonkeyOverworld);
        //drowned ore
        RegistryKey<ConfiguredFeature<?, ?>> oreDrownedOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_drowned_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreDrownedOverworld.getValue(), ORE_DROWNED_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreDrownedOverworld);
        //elder_guardian ore
        RegistryKey<ConfiguredFeature<?, ?>> oreElder_guardianOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_elder_guardian_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreElder_guardianOverworld.getValue(), ORE_ELDER_GUARDIAN_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreElder_guardianOverworld);
        //enderman ore
        RegistryKey<ConfiguredFeature<?, ?>> oreEndermanOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_enderman_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreEndermanOverworld.getValue(), ORE_ENDERMAN_OVERWORLD);
        addFeature(foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreEndermanOverworld);
        //endermite ore
        RegistryKey<ConfiguredFeature<?, ?>> oreEndermiteOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_endermite_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreEndermiteOverworld.getValue(), ORE_ENDERMITE_OVERWORLD);
        addFeature(foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreEndermiteOverworld);
        //evoker ore
        RegistryKey<ConfiguredFeature<?, ?>> oreEvokerOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_evoker_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreEvokerOverworld.getValue(), ORE_EVOKER_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreEvokerOverworld);
        //fox ore
        RegistryKey<ConfiguredFeature<?, ?>> oreFoxOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_fox_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreFoxOverworld.getValue(), ORE_FOX_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreFoxOverworld);
        //ghast ore
        RegistryKey<ConfiguredFeature<?, ?>> oreGhastOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_ghast_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreGhastOverworld.getValue(), ORE_GHAST_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreGhastOverworld);
        //guardian ore
        RegistryKey<ConfiguredFeature<?, ?>> oreGuardianOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_guardian_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreGuardianOverworld.getValue(), ORE_GUARDIAN_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreGuardianOverworld);
        //hoglin ore
        RegistryKey<ConfiguredFeature<?, ?>> oreHoglinOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_hoglin_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreHoglinOverworld.getValue(), ORE_HOGLIN_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreHoglinOverworld);
        //horse ore
        RegistryKey<ConfiguredFeature<?, ?>> oreHorseOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_horse_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreHorseOverworld.getValue(), ORE_HORSE_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreHorseOverworld);
        //husk ore
        RegistryKey<ConfiguredFeature<?, ?>> oreHuskOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_husk_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreHuskOverworld.getValue(), ORE_HUSK_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreHuskOverworld);
        //llama ore
        RegistryKey<ConfiguredFeature<?, ?>> oreLlamaOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_llama_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLlamaOverworld.getValue(), ORE_LLAMA_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreLlamaOverworld);
        //magma_cube ore
        RegistryKey<ConfiguredFeature<?, ?>> oreMagma_cubeOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_magma_cube_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMagma_cubeOverworld.getValue(), ORE_MAGMA_CUBE_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreMagma_cubeOverworld);
        //mooshroom ore
        RegistryKey<ConfiguredFeature<?, ?>> oreMooshroomOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_mooshroom_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMooshroomOverworld.getValue(), ORE_MOOSHROOM_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreMooshroomOverworld);
        //mule ore
        RegistryKey<ConfiguredFeature<?, ?>> oreMuleOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_mule_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreMuleOverworld.getValue(), ORE_MULE_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreMuleOverworld);
        //ocelot ore
        RegistryKey<ConfiguredFeature<?, ?>> oreOcelotOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_ocelot_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreOcelotOverworld.getValue(), ORE_OCELOT_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreOcelotOverworld);
        //panda ore
        RegistryKey<ConfiguredFeature<?, ?>> orePandaOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_panda_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePandaOverworld.getValue(), ORE_PANDA_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePandaOverworld);
        //parrot ore
        RegistryKey<ConfiguredFeature<?, ?>> oreParrotOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_parrot_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreParrotOverworld.getValue(), ORE_PARROT_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreParrotOverworld);
        //phantom ore
        RegistryKey<ConfiguredFeature<?, ?>> orePhantomOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_phantom_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePhantomOverworld.getValue(), ORE_PHANTOM_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePhantomOverworld);
        //pig ore
        RegistryKey<ConfiguredFeature<?, ?>> orePigOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_pig_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePigOverworld.getValue(), ORE_PIG_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePigOverworld);
        //piglin ore
        RegistryKey<ConfiguredFeature<?, ?>> orePiglinOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_piglin_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePiglinOverworld.getValue(), ORE_PIGLIN_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, orePiglinOverworld);
        //piglin_brute ore
        RegistryKey<ConfiguredFeature<?, ?>> orePiglin_bruteOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_piglin_brute_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePiglin_bruteOverworld.getValue(), ORE_PIGLIN_BRUTE_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, orePiglin_bruteOverworld);
        //pillager ore
        RegistryKey<ConfiguredFeature<?, ?>> orePillagerOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_pillager_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePillagerOverworld.getValue(), ORE_PILLAGER_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePillagerOverworld);
        //polar_bear ore
        RegistryKey<ConfiguredFeature<?, ?>> orePolar_bearOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_polar_bear_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePolar_bearOverworld.getValue(), ORE_POLAR_BEAR_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePolar_bearOverworld);
        //pufferfish ore
        RegistryKey<ConfiguredFeature<?, ?>> orePufferfishOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_pufferfish_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePufferfishOverworld.getValue(), ORE_PUFFERFISH_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePufferfishOverworld);
        //rabbit ore
        RegistryKey<ConfiguredFeature<?, ?>> oreRabbitOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_rabbit_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRabbitOverworld.getValue(), ORE_RABBIT_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreRabbitOverworld);
        //ravager ore
        RegistryKey<ConfiguredFeature<?, ?>> oreRavagerOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_ravager_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreRavagerOverworld.getValue(), ORE_RAVAGER_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreRavagerOverworld);
        //salmon ore
        RegistryKey<ConfiguredFeature<?, ?>> oreSalmonOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_salmon_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSalmonOverworld.getValue(), ORE_SALMON_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSalmonOverworld);
        //sheep ore
        RegistryKey<ConfiguredFeature<?, ?>> oreSheepOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_sheep_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSheepOverworld.getValue(), ORE_SHEEP_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSheepOverworld);
        //shulker ore
        RegistryKey<ConfiguredFeature<?, ?>> oreShulkerOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_shulker_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreShulkerOverworld.getValue(), ORE_SHULKER_OVERWORLD);
        addFeature(foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreShulkerOverworld);
        //silverfish ore
        RegistryKey<ConfiguredFeature<?, ?>> oreSilverfishOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_silverfish_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverfishOverworld.getValue(), ORE_SILVERFISH_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverfishOverworld);
        //skeleton ore
        RegistryKey<ConfiguredFeature<?, ?>> oreSkeletonOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_skeleton_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSkeletonOverworld.getValue(), ORE_SKELETON_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSkeletonOverworld);
        //skeleton_horse ore
        RegistryKey<ConfiguredFeature<?, ?>> oreSkeleton_horseOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_skeleton_horse_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSkeleton_horseOverworld.getValue(), ORE_SKELETON_HORSE_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSkeleton_horseOverworld);
        //slime ore
        RegistryKey<ConfiguredFeature<?, ?>> oreSlimeOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_slime_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSlimeOverworld.getValue(), ORE_SLIME_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSlimeOverworld);

        //spawn ore
        RegistryKey<ConfiguredFeature<?, ?>> oreSpawnOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_spawn_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSpawnOverworld.getValue(), ORE_SPAWN_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSpawnOverworld);

        RegistryKey<ConfiguredFeature<?, ?>> oreSpawnOverworld0 = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_spawn_overworld_0"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSpawnOverworld0.getValue(), ORE_SPAWN_OVERWORLD_0);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSpawnOverworld0);

        RegistryKey<ConfiguredFeature<?, ?>> oreSpawnNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_spawn_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSpawnNether.getValue(), ORE_SPAWN_NETHER);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreSpawnNether);

        RegistryKey<ConfiguredFeature<?, ?>> oreSpawnEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_spawn_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSpawnEnd.getValue(), ORE_SPAWN_END);
        addFeature(foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreSpawnEnd);

        //spider ore
        RegistryKey<ConfiguredFeature<?, ?>> oreSpiderOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_spider_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSpiderOverworld.getValue(), ORE_SPIDER_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSpiderOverworld);
        //squid ore
        RegistryKey<ConfiguredFeature<?, ?>> oreSquidOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_squid_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSquidOverworld.getValue(), ORE_SQUID_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSquidOverworld);
        //stray ore
        RegistryKey<ConfiguredFeature<?, ?>> oreStrayOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_stray_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreStrayOverworld.getValue(), ORE_STRAY_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreStrayOverworld);
        //strider ore
        RegistryKey<ConfiguredFeature<?, ?>> oreStriderOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_strider_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreStriderOverworld.getValue(), ORE_STRIDER_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreStriderOverworld);
        //trader_llama ore
        RegistryKey<ConfiguredFeature<?, ?>> oreTrader_llamaOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_trader_llama_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTrader_llamaOverworld.getValue(), ORE_TRADER_LLAMA_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTrader_llamaOverworld);
        //tropical_fish ore
        RegistryKey<ConfiguredFeature<?, ?>> oreTropical_fishOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_tropical_fish_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTropical_fishOverworld.getValue(), ORE_TROPICAL_FISH_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTropical_fishOverworld);
        //turtle ore
        RegistryKey<ConfiguredFeature<?, ?>> oreTurtleOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_turtle_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTurtleOverworld.getValue(), ORE_TURTLE_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTurtleOverworld);
        //vex ore
        RegistryKey<ConfiguredFeature<?, ?>> oreVexOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_vex_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreVexOverworld.getValue(), ORE_VEX_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreVexOverworld);
        //villager ore
        RegistryKey<ConfiguredFeature<?, ?>> oreVillagerOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_villager_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreVillagerOverworld.getValue(), ORE_VILLAGER_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreVillagerOverworld);
        //vindicator ore
        RegistryKey<ConfiguredFeature<?, ?>> oreVindicatorOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_vindicator_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreVindicatorOverworld.getValue(), ORE_VINDICATOR_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreVindicatorOverworld);
        //wandering_trader ore
        RegistryKey<ConfiguredFeature<?, ?>> oreWandering_traderOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_wandering_trader_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWandering_traderOverworld.getValue(), ORE_WANDERING_TRADER_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreWandering_traderOverworld);
        //witch ore
        RegistryKey<ConfiguredFeature<?, ?>> oreWitchOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_witch_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWitchOverworld.getValue(), ORE_WITCH_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreWitchOverworld);
        //wither ore
        RegistryKey<ConfiguredFeature<?, ?>> oreWitherOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_wither_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWitherOverworld.getValue(), ORE_WITHER_OVERWORLD);
        addFeature(foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreWitherOverworld);
        //wither_skeleton ore
        RegistryKey<ConfiguredFeature<?, ?>> oreWither_skeletonOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_wither_skeleton_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWither_skeletonOverworld.getValue(), ORE_WITHER_SKELETON_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreWither_skeletonOverworld);
        //wolf ore
        RegistryKey<ConfiguredFeature<?, ?>> oreWolfOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_wolf_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWolfOverworld.getValue(), ORE_WOLF_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreWolfOverworld);
        //zoglin ore
        RegistryKey<ConfiguredFeature<?, ?>> oreZoglinOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_zoglin_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreZoglinOverworld.getValue(), ORE_ZOGLIN_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreZoglinOverworld);
        //zombie ore
        RegistryKey<ConfiguredFeature<?, ?>> oreZombieOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_zombie_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreZombieOverworld.getValue(), ORE_ZOMBIE_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreZombieOverworld);
        //zombie_horse ore
        RegistryKey<ConfiguredFeature<?, ?>> oreZombie_horseOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_zombie_horse_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreZombie_horseOverworld.getValue(), ORE_ZOMBIE_HORSE_OVERWORLD);
        addFeature(foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreZombie_horseOverworld);
        //zombie_villager ore
        RegistryKey<ConfiguredFeature<?, ?>> oreZombie_villagerOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_zombie_villager_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreZombie_villagerOverworld.getValue(), ORE_ZOMBIE_VILLAGER_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreZombie_villagerOverworld);
        //zombified_piglin ore
        RegistryKey<ConfiguredFeature<?, ?>> oreZombified_piglinOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_zombified_piglin_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreZombified_piglinOverworld.getValue(), ORE_ZOMBIFIED_PIGLIN_OVERWORLD);
        addFeature(foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreZombified_piglinOverworld);
        //bee ore
        RegistryKey<ConfiguredFeature<?, ?>> oreBeeOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_bee_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreBeeOverworld.getValue(), ORE_BEE_OVERWORLD);
        addFeature(foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreBeeOverworld);
        //ender_dragon ore
        RegistryKey<ConfiguredFeature<?, ?>> oreEnder_dragonOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_ender_dragon_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreEnder_dragonOverworld.getValue(), ORE_ENDER_DRAGON_OVERWORLD);
        addFeature(foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreEnder_dragonOverworld);
        //illusioner ore
        RegistryKey<ConfiguredFeature<?, ?>> oreIllusionerOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_illusioner_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreIllusionerOverworld.getValue(), ORE_ILLUSIONER_OVERWORLD);
        addFeature(foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreIllusionerOverworld);
        //giant ore
        RegistryKey<ConfiguredFeature<?, ?>> oreGiantOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(nameSpace, "ore_giant_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreGiantOverworld.getValue(), ORE_GIANT_OVERWORLD);
        addFeature(foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreGiantOverworld);
        //TODO Note that names that have more than one word are not capitalized properly in oreMobnameOverworld


    }

}
