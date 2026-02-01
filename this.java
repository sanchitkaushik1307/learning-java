class student{
    String name;
    student(string name){
        this.name=name;
}
void display(){
    System.out.println("name"+this.name);
}
}
public class this{
    public static void main(String args[]){
        student s=new student("sanchit");
        s.display();
    }
}
