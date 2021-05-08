package discover.entity;

import discover.client.renderer.tuckerEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;


public class entityCreateClient {



    public static void createClientEntity() {
        EntityRendererRegistry.INSTANCE.register(entityCreate.TUCKER, (dispatcher, context) -> {
            return new tuckerEntityRenderer(dispatcher);
        });
    }


}
