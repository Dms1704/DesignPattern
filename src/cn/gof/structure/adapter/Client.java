package cn.gof.structure.adapter;

public class Client {
    public static void main(String[] args) {
        TV tv = new TVRequestAdapter();
        tv.request();
    }
}
