class A {
	static int a=10;
	static int b=20;
	int x=30;
	int y=40;

	public static void main(String[] args) {
		System.out.println("main");

		A a1=new A();
		A a2=new A();
		A a3=new A();
        
		
		System.out.println(a1.a);      System.out.println(a1.x);
	   	System.out.println(a2.a);      System.out.println(a2.x);
		System.out.println(a3.a);      System.out.println(a3.x);
        a1.a=55;  a1.x=65;

		System.out.println(a1.b);      System.out.println(a1.y);
	   	System.out.println(a2.b);      System.out.println(a2.y);
		System.out.println(a3.b);      System.out.println(a3.y);  
		a1.b=45;  a1.y=35;
	}
}

    
