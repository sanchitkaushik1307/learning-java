class parent {

    int num = 50;

    parent() {
        System.out.println("parent constructor called");
    }
}

class child extends parent {

    int num = 100;

    child() {
        super();   
        System.out.println("child constructor called");
    }

    void show() {
        System.out.println("parent value using super: " + super.num);
        System.out.println("child value using this: " + this.num);
    }

    public static void main(String args[]) {

        child obj = new child();
        obj.show();
    }
}
