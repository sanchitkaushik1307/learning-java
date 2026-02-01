class animal{
    void eat(){
        System.out.println("this animal eats food");
    }
}
class dog extends animal{
    void eat(){
        super.eat();
        System.out.println("this dog barks");
    }
}
public class inheritance{
    public static void main(String args[]){
        dog d=new dog();
        d.eat();
    }
}