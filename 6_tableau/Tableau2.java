public class Tableau2{
    public static int tab1[] = {102, 222, 343, 444, 239 } ;
    
    public static void main(String[] args){
        affiche(tab1);
        System.out.println("");
        rechercheTab(22) ;
    }
    public static void affiche(int[] tab1){
        for(int i=0 ; i<tab1.length ; i++){
            System.out.print(tab1[i]+ "\t");
        }
    }
    public static void rechercheTab (int nbre){
        Boolean vrai = false ;
        for(int i=0 ; i<tab1.length ; i++){
            if ( tab1[i] == nbre) {
                vrai = true ;
            }
        }
        if (vrai){
            System.out.println(nbre + " appartient au tableau") ;
        }else{
            System.out.println(nbre + " n'appartient pas au tableau") ;
        }
    }
}