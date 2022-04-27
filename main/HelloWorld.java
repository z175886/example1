package main;
public class HelloWorld{
	
	/**
	 * 
	 * @param input
	 * @return input+1
	 */
	public static int numberPlusOne(int input) {
		return input+1;
	
	}
	
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println(numberPlusOne(3));
	}
}