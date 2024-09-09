package NumberProgram;

public class SwapTwoNumber {

	// swap two number with the help of third variable
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c;
		System.out.println("Before swap number is " + a + " " + b);

		c = a;
		a = b;
		b = c;

		System.out.println("After swap number is " + a + " " + b);

	}

}
