package com.veronika.advanced.pattern.behavioral.template_method;

public abstract class HouseTemplate {
    public final void buildHouse(){
        buildWalls();
        buildWindows();
        buildRoof();
    }
    public abstract void buildWalls();
    public abstract void buildWindows();
    public abstract void buildRoof();
}
