class person{
    String name;

void display(){
    System.out.println("Name: " + name);
}
public static void main(String []args){
    person p = new person();
    p.name = "Sanchit";
    p.display();
}
}