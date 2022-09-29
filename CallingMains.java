class A {
    public static void main(String[] args) {
        System.out.println("A main");
    }
}

class B {
    public static void main(String[] args) {
        System.out.println("B main");
        A.main(new String[0]);
        A.main(args);
        //classname.main( new String[0/+ve integer]);
    }
}