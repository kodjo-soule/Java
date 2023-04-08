import java.util.ArrayList ;

class ArrayList1{
    public static void main(String[] args){
        ArrayList<String> maListe = new ArrayList<String>();
        maListe.add("Element 1");
        maListe.add("Element 34");
        maListe.add("Element 35");
        
        maListe.add("Element 2");
        maListe.add("Element 36");
        maListe.add("Element 37");

        maListe.add("Element 3");
        maListe.add("Element 31");
        maListe.add("Element 31");
        maListe.add("Element 32");
        maListe.add("Element 33");
        
        System.out.println("------------------------");
        System.out.println(maListe);
        System.out.println("------------------------");
        System.out.println(maListe.get(0)); // affiche "élément 1"
        System.out.println(maListe.get(1)); // affiche "élément 2"
        System.out.println(maListe.get(2)); // affiche "élément 3"
        System.out.println("--------------Printing----------");
        for (int i = 0; i < maListe.size(); i++) {
            System.out.println(maListe.get(i));
        }
        System.out.println("------------------------");
        maListe.remove(1); // supprime l'élément à l'indice 1 ("élément 2")
        System.out.println("------------------------");
        System.out.println(maListe);
        System.out.println("------------------------");
        maListe.clear();
        System.out.println("------------------------");
        System.out.println(maListe);




    }
}