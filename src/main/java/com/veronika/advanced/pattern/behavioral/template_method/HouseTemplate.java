package com.veronika.advanced.pattern.behavioral.template_method;

public abstract class HouseTemplate {
    public final void builtHouse(){
        builtWalls();
        builtWindows();
        builtRoof();
    }
    public abstract void builtWalls();
    public abstract void builtWindows();
    public abstract void builtRoof();
}
