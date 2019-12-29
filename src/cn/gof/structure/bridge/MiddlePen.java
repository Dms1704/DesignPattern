package cn.gof.structure.bridge;

public class MiddlePen extends Pen {
    @Override
    public void draw(String name) {
        color.bePrint("middle", name);
    }
}
