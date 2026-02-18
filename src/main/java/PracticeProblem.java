import java.util.Scanner;

/**
	* File: Class Work
	* Author: Peter Zheng
	* Date Created: February 18, 2026
	* Date Last Modified: February 18, 2026
	*/



import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		char a;
		a = 'a';
		System.out.println(a);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word: ");

		char a;
		
		word = input.nextLine();
		a = word.charAt(2);

		System.out.println(a);
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);

		String newword;
		System.out.print("Input a word: ");
		newword = input.nextLine();

		char a;

		a = newword.charAt(1);

		System.out.println("The second character user entered was: " + a);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		Integer num;

		num = input.nextInt();
		System.out.println("Your number plus 1 is: " + (num + 1));

	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a letter: ");
		String letter;

		letter = input.nextLine();
		char l;
		l = letter.charAt(0);

		System.out.print("Input another letter: ");
		String letter2;
		letter2 = input.nextLine();
		char i;
		i = letter2.charAt(0);
		System.out.println(l + i);
		
	}

}
