package discover.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static discover.Discover.nameSpace;

public class itemsCreate {


    //make item objects
    public static final breadly BREADLY = new breadly(new FabricItemSettings().rarity(Rarity.EPIC).group(ItemGroup.SEARCH));
    public static final Item HARD_BOILED_EGG = new Item(new FabricItemSettings().group(ItemGroup.SEARCH).
            food(new FoodComponent.Builder().hunger(4).saturationModifier(6).build()));


    public static final SpawnEggItem ENDER_DRAGON_SPAWN_EGG = new SpawnEggItem(
            EntityType.ENDER_DRAGON, 0xD837FF, 0x000000, new FabricItemSettings().group(ItemGroup.MISC).fireproof());
    public static final SpawnEggItem WITHER_SPAWN_EGG = new SpawnEggItem(
            EntityType.WITHER, 0xFFFFFF, 0x000000, new FabricItemSettings().group(ItemGroup.MISC).fireproof());
    public static final SpawnEggItem ILLUSIONER_SPAWN_EGG = new SpawnEggItem(
            EntityType.ILLUSIONER, 0x0C3B67, 0x626667, new FabricItemSettings().group(ItemGroup.MISC));
    public static final SpawnEggItem GIANT_SPAWN_EGG = new SpawnEggItem(
            EntityType.GIANT, 0x00A6A6, 0x5F7B50, new FabricItemSettings().group(ItemGroup.MISC));
    public static final SpawnEggItem SPAWN_SPAWN_EGG = new SpawnEggItem(
            EntityType.LIGHTNING_BOLT, 0xFFFFFF, 0xFFFFFF, new FabricItemSettings().group(ItemGroup.MISC));


    //add items to registry
    public static  void createItems(){
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "breadly"), BREADLY);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "hard_boiled_egg"), HARD_BOILED_EGG);


        Registry.register(Registry.ITEM, new Identifier(nameSpace, "ender_dragon_spawn_egg"), ENDER_DRAGON_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "wither_spawn_egg"), WITHER_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "illusioner_spawn_egg"), ILLUSIONER_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "giant_spawn_egg"), GIANT_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(nameSpace, "spawn_spawn_egg"), SPAWN_SPAWN_EGG);
    }
}
