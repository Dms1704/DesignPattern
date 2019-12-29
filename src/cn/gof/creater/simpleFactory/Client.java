package cn.gof.creater.simpleFactory;

public class Client {
    public static void main(String[] args) {
        TV tv = TVFactory.produceTV("HisenseTV");
        tv.play();

        TV tv1 = TVFactory.produceTV("HaierTV");
        tv1.play();
    }
}


