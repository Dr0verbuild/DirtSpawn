package discover.client.model;

import discover.entity.tuckerEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class tuckerEntityModel extends EntityModel<tuckerEntity> {

    private final ModelPart base;

    public tuckerEntityModel() {
        base = new ModelPart(this, 0, 0);
        base.addCuboid(-6, -6, -6, 12, 12, 12);

        this.textureHeight = 64;
        this.textureWidth = 64;
    }

    @Override
    public void setAngles(tuckerEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        //TODO Tucker animation
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        // translate model down
        matrices.translate(0, 1.125, 0);

        // render cube
        base.render(matrices, vertices, light, overlay);
    }
}
