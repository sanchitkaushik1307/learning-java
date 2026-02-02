class parent {

    void display() {
        System.out.println("this is parent method");
    }
}

class child extends parent {

    void show() {
        super.display();   // calling parent method
        System.out.println("this is child method");
    }

    public static void main(String args[]) {

        child obj = new child();
        obj.show();
    }
}
