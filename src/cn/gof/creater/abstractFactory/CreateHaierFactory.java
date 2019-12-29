package cn.gof.creater.abstractFactory;

public class CreateHaierFactory implements Factory {
    @Override
    public TV createTV() {
        return new HaierTV();
    }

    @Override
    public Phone createPhone() {
        return new HaierPhone();
    }
}
