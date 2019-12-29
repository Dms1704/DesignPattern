package cn.gof.creater.factoryMethod;

public class HisenseTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        return new HisenseTV();
    }
}
