public class Main{
    public static void main(String[] args){
        
        Vehicle electric = new ElectricVehicle();
        Vehicle hybrid = new HybridVehicle();
        //Calls
        // Vehicle.start();
        // Vehicle.resource();

        electric.start();
        electric.resource();

        hybrid.start();
        hybrid.resource();
    }
}
abstract class Vehicle{
    public void start(){
        System.out.println("Starting") ;
    }
    abstract void resource();
}
class ElectricVehicle extends Vehicle{
    public void resource(){
        System.out.println("I use electric") ;
    }
}
class HybridVehicle extends Vehicle{
    public void resource(){
        System.out.println("I use both petrol and electricity") ;
    }
}