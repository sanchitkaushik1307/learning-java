import java.util.*;

class student {
    String name;
    String prn;
    String division;

    student(String n, String p, String d) {
        name = n;
        prn = p;
        division = d;
    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("prn: " + prn);
        System.out.println("division: " + division);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter name: ");
        String n = sc.nextLine();

        System.out.print("enter prn: ");
        String p = sc.nextLine();

        System.out.print("enter division: ");
        String d = sc.nextLine();

        student s = new student(n, p, d);
        s.display();
    }
}
