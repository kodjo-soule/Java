public class Main{
    public static void main(String[] args){
        Vehicle Vehicle = new Vehicle();
        Vehicle electric = new ElectricVehicle();
        Vehicle hybrid = new HybridVehicle();
        //Calls
        Vehicle.start();
        Vehicle.resource();

        electric.start();
        electric.resource();

        hybrid.start();
        hybrid.resource();
    }
}
class Vehicle{
    public void start(){
        System.out.println("Starting") ;
    }
    public void resource(){
        System.out.println("I use petrol") ;
    }
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