import java.util.Scanner;

public class Calculator {

	public static int add(int a, int b){
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		return (double)a/(double)b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		int choice;

		System.out.println("THIS IS A SIMPLE CALCULATOR");
		System.out.print("Press '1' to add two numbers\nPress '2' to subtract two numbers\nPress '3' to multiply two numbers\nPress '4' to divide two numbers\nEnter '10100' without quotes to quit\n\nYour choice: ");

		choice = sc.nextInt();

		while(choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 10100) {

			System.out.print("Invalid choice, try again or enter '10100' to quit (without quotes)\nYour choice: ");
			choice = sc.nextInt();
		}

		
		if (choice != 10100) {

			System.out.print("Enter the numbers: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();

		}

		if (choice == 1)
			System.out.println("Sum is: " + add(num1, num2) + "\nThank you for using this calculator");

		else if (choice == 2)
			System.out.println("Difference is: " + subtract(num1, num2) + "\nThank you for using this calculator");

		else if (choice == 3)
			System.out.println("Product is: " + multiply(num1, num2) + "\nThank you for using this calculator");

		else if (choice == 4)
			System.out.println("Result of division is: " + divide(num1, num2) + "\nThank you for using this calculator");

		else if (choice == 10100)
			System.out.println("\n\n...Quitting...\nThank you for using this calculator");

		else
			System.out.println("Invalid Input");

	}

}
