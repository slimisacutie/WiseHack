package org.minecraft.wise.api.value;

//import me.skitttyy.kami.api.gui.component.IComponent;

import java.util.function.Consumer;

public class Value<Type> {
    String name;
    String tag;
    Type min;
    Type max;
    String[] modes;
    boolean active = true;
    //IComponent component;
    Consumer<Value<Type>> action;
    boolean enabled;
    Type value;
    public int index;

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
        if (action != null) {
            action.accept(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

//    public IComponent getComponent() {
//        return component;
//    }
//
//    public void setComponent(IComponent component) {
//        this.component = component;
//    }

    public Type getMin() {
        return min;
    }

    public void setMin(Type min) {
        this.min = min;
    }

    public Type getMax() {
        return max;
    }

    public void setMax(Type max) {
        this.max = max;
    }

    public String[] getModes() {
        return modes;
    }

    public void setModes(String[] modes) {
        this.modes = modes;
    }

    public Consumer<Value<Type>> getAction() {
        return action;
    }

    public void setAction(Consumer<Value<Type>> action) {
        this.action = action;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}