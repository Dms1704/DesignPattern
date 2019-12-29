package cn.gof.behavior.templateMethod;

public class MysqlDBOperator extends DBOperator {
    @Override
    public void connDB(){
        System.out.println("使用Mysql连接数据库");
    }
}
