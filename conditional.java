import java.util.*;
public class conditional{
    public static void main(String args[]){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        age = sc.nextInt();
        if(age>18){
            System.out.println("adult : drive,vote");
        }
        else{
            System.out.println("not adult");
        }
    }
}