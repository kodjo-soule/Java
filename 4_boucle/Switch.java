import java.util.Scanner ;
public class Switch{
    enum Direction {
        north, east, south, west
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter direction : ");
        String direction = sc.nextLine() ;
          switch (direction) {
            case "north":
                System.out.println("You are heading north");
                break;
            case "east":
                System.out.println("You are heading east");
                break;
            case "south":
                System.out.println("You are heading south");
                break;
            case "west":
                System.out.println("You are heading west");
                break;
        }

    }
}