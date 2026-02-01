class demo{
    demo(){
        this("default constructor");
    }
    demo(String msg){
        System.out.println(msg);
    }
}
public class constructor{
    public static void main(String args[]){
        new demo();
    }
}