package cn.gof.creater.simpleFactory;

public class TVFactory {

    public static TV produceTV(String brand){

            if(brand.equalsIgnoreCase("HaierTV"))
            {
                return new HaierTV();       //根据参数创建具体产品
            }
            else if(brand.equalsIgnoreCase("HisenseTV"))
            {
                return new HisenseTV();   //根据参数创建具体产品
            }
        return null;
    }

}
