class parent{
    parent(){
        System.out.println("this is parent class constructor");
    }
}
class child extends parent{
    child(){
        super();
        System.out.println("this is child class constructor");
    }
}
public class constructorr{
    public static void main(String args[]){
        new child();
    }
}