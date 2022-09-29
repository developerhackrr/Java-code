class MultipleMethodsParameter {
       static void m1() {
            System.out.println("m1 no-param");
        }
    
        static void m1(int a) {
            System.out.println("m1 int-param");
        }
        static void m1(String s) {
            System.out.println("m1 String-param");
        }
    
    
    public static void main(String[] args) {
        System.out.println("main");
          m1();
          m1(5);
          m1("HK");
    }
}