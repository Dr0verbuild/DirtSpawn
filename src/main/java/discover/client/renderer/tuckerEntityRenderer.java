package discover.client.renderer;

import discover.client.model.tuckerEntityModel;
import discover.entity.tuckerEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static discover.Discover.nameSpace;

public class tuckerEntityRenderer extends MobEntityRenderer<tuckerEntity, tuckerEntityModel> {

    public tuckerEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new tuckerEntityModel(), 0.5f);
    }

    //TODO add textures
    @Override
    public Identifier getTexture(tuckerEntity entity) {
        return new Identifier(nameSpace, "textures/entity/tucker/tucker.png");
    }
}
