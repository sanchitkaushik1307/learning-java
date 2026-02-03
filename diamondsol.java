interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C");
    }
}

class diamondsol implements B, C {

    public void show() {
        System.out.println("D");
    }

    public static void main(String[] args) {
        diamondsol obj = new diamondsol();
        obj.show();
    }
}
