package cn.gof.structure.bridge;

public class Red implements Color {

    @Override
    public void bePrint(String penType, String name) {
        System.out.println("画笔类型:" + penType + ", name:" + name);
    }
}
