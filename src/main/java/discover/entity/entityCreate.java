package discover.entity;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static discover.Discover.nameSpace;

public class entityCreate{


    public static final EntityType<tuckerEntity> TUCKER = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(nameSpace, "tucker"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, tuckerEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );


    public static void createEntity(){
        //Tucker Attributes
        FabricDefaultAttributeRegistry.register(TUCKER, tuckerEntity.createMobAttributes());
    }

}
