class student{
    String name;
    student(String name){
        this.name=name;
}
void display(){
    System.out.println("name"+this.name);
}
}
public class examplee{
    public static void main(String args[]){
        student s=new student(name:"sanchit");
        s.display();
    }
}
