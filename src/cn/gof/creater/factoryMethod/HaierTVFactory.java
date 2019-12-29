package cn.gof.creater.factoryMethod;

public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        return new HaierTV();
    }
}
