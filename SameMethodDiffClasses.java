class D {
    static void m1() {
        System.out.println("D m1");
   }
}

class E {
    static void m1() {
        System.out.println("B m1");
    }
    public static void main(String[] args) {
        System.out.println("B main");
        m1();
        D.m1();
    }
}