class Example {
    static void m1() {
        System.out.println("m1");
    }
    static void m2() {
        System.out.println("m2");
        m1();
    }
    
    public static void main(String[] args){
        System.out.println("main");
        m2();
    }
}