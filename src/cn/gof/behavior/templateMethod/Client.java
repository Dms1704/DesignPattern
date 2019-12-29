package cn.gof.behavior.templateMethod;

public class Client {
    public static void main(String[] args) {
        DBOperator operator = new MysqlDBOperator();
        operator.process();
    }
}
