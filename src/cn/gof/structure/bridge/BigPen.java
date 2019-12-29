package cn.gof.structure.bridge;

public class BigPen extends Pen {
    @Override
    public void draw(String name) {
        color.bePrint("big", name);
    }
}
