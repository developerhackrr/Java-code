class A {
	int a = 10;

	void m1() {
		System.out.println("m1");
	}

	public static void main(String[] args) {
		System.out.println("main");

		A a1=new A();
		A a2=new A();
		A a3=new A();

		a1.m1();
		a2.m1();
		a3.m1();
	}
}