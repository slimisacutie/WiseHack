package org.minecraft.wise.api.event;

import org.minecraft.wise.api.event.bus.Event;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec3d;

public class MoveEvent extends Event {
    private final MovementType type;
    private double x, y, z;

    public MoveEvent(MovementType type, Vec3d movement) {
        this.type = type;
        this.x = movement.getX();
        this.y = movement.getY();
        this.z = movement.getZ();
    }

    public MovementType getType() {
        return type;
    }

    public Vec3d getMovement() {
        return new Vec3d(x, y, z);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
