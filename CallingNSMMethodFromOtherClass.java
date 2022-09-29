class D {
    void m1() {
        System.out.println("D m1");
   }
}

class E {
    public static void main(String[] args) {
        System.out.println("B main");
        //D.m1();
        D a1 = new D();
        a1.m1();
    }
}