package cn.gof.structure.bridge;

public class Client {
    public static void main(String[] args) {
        Pen pen = new SmallPen();
        pen.setColor(new Red());
        pen.draw("dms");
    }
}
