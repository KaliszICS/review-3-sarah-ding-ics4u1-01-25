import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String input = nextLine();
		System.out.println(input.charAt(0));
		//Write question 1 code here
		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean input = nextBoolean();
		System.out.println(!input);//Write question 2 code here
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int number = nextInt();
		System.out.println(number > 5);//Write question 3 code here
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double input = in.nextDouble();
		System.out.println(input >= -2 && input <= 2);
		 //Write question 4 code here
		
	}

	public static void q5() {
		Scanner in = new Scanner();
		System.out.print("In: ");
		String input = in.nextLine();
		System.out,println(input.equals("Hello World");
		//Write question 5 code here
		
	}
	

	public static void q6() {
		Scanner in new Scanner();
		System.out.print("In: ");
		int num1 = in.nextInt();
		System.out.print("In: ");
		int num2 = in.nextInt();
		System.out.println(num1 <= num2);
		//Write question 6 code here
		
	}

	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double num1 = in.nextDouble();
		System.out.print("In: ");
		double num2 = in.nextDouble();
		System.out.println(num1 > num2);

		//Write question 7 code here
		
	}

}
