class D {
   static void m1() {
        System.out.println("m1");
   }
}

class E {
    public static void main(String[] args) {
        System.out.println("B main");
        D.m1();
    }
}