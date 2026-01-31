import java.util.*;

class methoddemo {

    static int a;
    int b;

    static void staticmethod() {
        System.out.println("static value: " + a);
    }

    void instancemethod() {
        System.out.println("instance value: " + b);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter static value: ");
        a = sc.nextInt();

        methoddemo obj = new methoddemo();

        System.out.print("enter instance value: ");
        obj.b = sc.nextInt();

        staticmethod();
        obj.instancemethod();
    }
}
