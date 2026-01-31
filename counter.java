class counterdemo {

    static String commonpath = "24070122";
    static int count = 1;

    String name;
    double prn;

    counterdemo(String n, double p) {
        name = n;
        prn = p;
    }

    void show() {
        System.out.println("student " + count);
        System.out.println("name: " + name);
        System.out.println("prn: " + commonpath + prn);
        count++;
    }

    public static void main(String args[]) {

        counterdemo s1 = new counterdemo("sanchit", 167);
        counterdemo s2 = new counterdemo("rahul", 168);

        s1.show();
        s2.show();
    }
}
