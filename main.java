class animal{
    void eat(){
        System.out.println("this animal eats food");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("this dog barks");
    }
}
public class main{
    public static void main(String args[]){
        dog d=new dog();
        d.bark();
        d.eat();
    }
}