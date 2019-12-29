package cn.gof.creater.abstractFactory;

public class Client {
    public static void main(String[] args) {
        TV haweiTV = new CreateHaWeiFactory().createTV();
        Phone haierPhone = new CreateHaierFactory().createPhone();
        haierPhone.describtion();
        haweiTV.describtion();
        TV haierTV = new CreateHaierFactory().createTV();
        haierTV.describtion();
    }
}


