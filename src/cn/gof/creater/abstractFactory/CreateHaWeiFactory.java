package cn.gof.creater.abstractFactory;

public class CreateHaWeiFactory implements Factory {
    @Override
    public TV createTV() {
        return new HaWeiTV();
    }

    @Override
    public Phone createPhone() {
        return new HaWeiPhone();
    }
}
