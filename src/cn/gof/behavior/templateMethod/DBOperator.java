package cn.gof.behavior.templateMethod;

public abstract class DBOperator {
    public void connDB() {
        System.out.println("默认方式连接数据库");
    }
    public void openDB(){
        System.out.println("打开数据库");
    }
    public void useDB(){
        System.out.println("使用数据库");
    }
    public void closeDB(){
        System.out.println("关闭数据库");
    }
    public void process(){
        connDB();
        openDB();
        useDB();
        closeDB();
    }
}
