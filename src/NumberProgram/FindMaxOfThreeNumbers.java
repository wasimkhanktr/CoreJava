package NumberProgram;

public class FindMaxOfThreeNumbers {

	public static void main(String[] args) {
		int a=5,b=6,c=7;
		
		System.out.println("Numbers are "+a+","+b+" and "+c);
		
//		find max
		if(a>b && a>c)
			System.out.println(a+" is Greater");
		else if(b>c)
			System.out.println(b+" is Greater");
		else
			System.out.println(c+" is Greater");
	}

}
