package cn.gof.creater.factoryMethod;

public class Client {

    public static void main(String[] args) {

        TVFactory factory = new HaierTVFactory();
        TV tv = factory.produceTV();
        tv.play();
    }
}
