class outerclass {

    int x = 10;

    class innerclass {
        void show() {
            System.out.println("value of x is: " + x);
        }
    }

    public static void main(String args[]) {

        outerclass obj = new outerclass();

        outerclass.innerclass in = obj.new innerclass();

        in.show();
    }
}
