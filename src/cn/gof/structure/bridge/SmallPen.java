package cn.gof.structure.bridge;

public class SmallPen extends Pen {
    @Override
    public void draw(String name) {
        /**
         * 还可以添加其他的代码
         */
        color.bePrint("small", name);
        /**
         * 还可以添加其他的代码
         */
    }
}
