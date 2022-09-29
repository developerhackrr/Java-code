class A {
    static void m1() {
        System.out.println("A m1");
    }
    void m2() {
        System.out.println("A m2");
    }
}

class B {
    static void m1() {
        System.out.println("B m1");
    }
    void m1() {
        System.out.println("B m2");
    }
}

class C {
    static void m1() {
        System.out.println("B m1");
    }
    void m1() {
        System.out.println("B m2");
    }
    
    public static void main(String[] args) {
        System.out.println("B main");
        
        
        A.m1();
        B.m1();
        m1();
        
        
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        
        a1.m2();
        b1.m2();
        c1.m2();
    }
}