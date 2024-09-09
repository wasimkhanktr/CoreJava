package NumberProgram;;

public class SwapTwoNoWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		System.out.println("Before swap number is " + a + " " + b);
		
//		without 2rd variable there many rule mulple and add etc
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap number is " + a + " " + b);

	}

}
