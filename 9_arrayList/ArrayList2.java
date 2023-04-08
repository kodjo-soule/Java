import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayList2 {
    public static void main(String[ ] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");
        
        Collections.sort(animals);
       
        System.out.println(animals);
        System.out.println("Maximum : "+ Collections.max(animals));
        System.out.println("Minimum : "+ Collections.min(animals));

        System.out.print("\n*********************iteration*******************************************\n");
        Iterator iterator = animals.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
