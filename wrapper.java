import java.util.*;

class wrapperdemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter float value: ");
        float f = sc.nextFloat();

        Float obj = f;   // wrapper class object

        int num = obj.intValue();   // converting float to int

        System.out.println("integer value is: " + num);
    }
}
