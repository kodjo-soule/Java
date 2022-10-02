public class TableauMain{
    public static void main(String[] args){
        int[] tab1 ={1, 34, 45} ;
        String tab2[] ={"chaaine1", "chaine2"};
        for(int i=0 ; i< tab1.length ; i++){
            System.out.println(tab1[i]);
        }
        for(int t : tab1){
            System.out.println(t);
        }
    }
}