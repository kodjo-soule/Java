public class MToString {
  String name;
  String address;
  int age;

  MToString(String name, String address, int age){
    this.name = name;
    this.address = address;
    this.age = age;
  }

  //surcharger la méthode toString()
  public String toString(){
    return name+" "+address+" "+age;
  }

  public static void main(String args[]){
    MToString p1 = new MToString("Alex", "Paris", 18);
    MToString p2 = new MToString("Bob", "Lile", 25);

    //le compilateur appel ici p1.toString()
    System.out.println(p1); 
    System.out.println(p2); 
    
  }
}