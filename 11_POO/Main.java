public class Main{
    public static void main(String[] args){
        
        Vehicle electric = new ElectricVehicle();
        Vehicle hybrid = new HybridVehicle();
        Vehicle vehicleKodjo = new HybridVehicle(){
            @Override
            public void start(){
                System.out.println("Starting kodjo's car") ;
            }
        } ;
        //Calls
        // Vehicle.start();
        // Vehicle.resource();

        //electric.start();
        electric.resource();
        //vehicleKodjo.start();

        //hybrid.start();
        hybrid.resource();
        Color color = Color.Red ;
        System.out.println("Color : "+ color) ;
        System.out.println("Color : "+ Color.Blue) ; 
    }
}
abstract class Vehicle{
    public Vehicle(){
        start() ;
    }
    public void start(){
        System.out.println("Starting") ;
    }
    abstract void resource();
    public void difficulty(Difficulty difficulty){
        switch(difficulty){
            EASY : System.out.println("It is easy") ;break ;
        }
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
//Enumeration
enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}