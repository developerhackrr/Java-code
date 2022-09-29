public class TargetJDK7 {
	public static void main(String[] args) {
		System.out.println("Hi");

		Runnable target =() -> {};
		//Cmd>javac TargetJDK7.java
		//It is compiled with the Jdk version you set in path.
		//Currently We Have Set Jdk17.So it is Compiled with Jdk17 and we will not get compile time error LE(Lambda Expression)code.


		//cmd>Javac -source 7 TargetJdk7.java
		//Because the option-sourc 1.7
		//here also this code is compiled with the Jdk 17 but we will get compile time error at LE code 
		//because of -source 1.7 option with this option we have requested Jdk17 compiler to compiler this code with Jdk7 features only.
		
	}
}