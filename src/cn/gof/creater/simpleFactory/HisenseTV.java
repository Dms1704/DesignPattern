package cn.gof.creater.simpleFactory;

public class HisenseTV implements TV {
    @Override
    public void play() {
        System.out.println("我是HisenseTV!");
    }
}
