import java.util.Scanner;
public class VehicleMain {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        CarInterfaceImpl car = new CarInterfaceImpl();
        BikeInterfaceImpl bike = new BikeInterfaceImpl();
        TricyclesInterfaceImpl tricycle = new TricyclesInterfaceImpl();

        System.out.println("你想知道哪一种载具的轮子数目？");
        String choice = scan.next();

        switch(choice){
            case "bike" :{bike.Wheels();bike.Licence();break;}
            case "car" :{car.Wheels();car.Licence();break;}
            case "tricycle" :{tricycle.Wheels();tricycle.Licence();break;}
            default : System.out.println("我们没有这种车！");System.exit(0);
        }

        
        
        
        VehicleInterface.Whistle();

        scan.close();
       }

}
