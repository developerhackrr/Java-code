class A {
    public static void main(int[] args) {
        System.out.println("A main(int[])");
    }
    public static void main(String[] args) {
        System.out.println("A main(String[])");
        main(new int[0]);
        main("Hari");
    }
    public static void main(String args) {
        System.out.println("A main(String)");
    }
}