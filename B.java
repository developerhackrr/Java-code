class B {
	static int a=10;

	static void m1() {
	   System.out.println("m1");
	}

	public static void main(String[] args) {
		System.out.println("main");

		System.out.println(a);
		m1();
	}
}