class A {
    static void m1(A a) {
        System.out.println("hi");
    }
    public static void main(String[] args) {
        System.out.println("A main");
    }
} 

class B {
    public static void main(String[] args) {
        System.out.println("B main");
        A.m1(new A());
        A a1 = new A();
    }
}