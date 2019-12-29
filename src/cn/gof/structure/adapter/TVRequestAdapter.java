package cn.gof.structure.adapter;

public class TVRequestAdapter extends PhoneAdaptee implements TV {

    @Override
    public void request() {
        call();
    }
}
