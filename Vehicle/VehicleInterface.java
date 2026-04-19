//定义一个接口，这里面分别有抽象，默认，静态三个方法。分别用来表示汽车的轮子数目，是否有证驾驶，可否鸣笛
public interface VehicleInterface {
    //定义一个抽象的方法，用来表示载具的轮子的个数。
    public abstract void Wheels();
   
    //定义一个默认的方法，用来表示载具是有证驾驶
    public default void Licence(){
        System.out.println("这个载具是合格的！");
    }
    
    //定义一个静态的方法，用来表示载具的一个特有功能：鸣笛
    public static void Whistle(){
        System.out.println("————————————鸣笛————————————");
    }
}
