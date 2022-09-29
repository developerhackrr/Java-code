class E {
	static int a=10;

	void m1() {
		System.out.println("m1");
	}
	public static void main(String[] args) {
		System.out.println("main");

		System.out.println(a);
		//m1();  //CE: non-static method m1() cannot be referenced from a static context

		A a1=new A();
		a1.m1();

		System.out.println(a1.a);
		//System.out.println(A.a);
	}
}