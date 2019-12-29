package cn.gof.behavior.templateMethod;

public class OracleDBOperator extends DBOperator {
    @Override
    public void connDB(){
        System.out.println("使用oracle连接数据库");
    }
}
