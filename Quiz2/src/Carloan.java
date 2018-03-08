
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Carloan {
	
	
	public static void main(String[] args) {
		testMonthlyPayment();
		testTotalInterestPaid();
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Total price of car: ");
		double price = sc.nextInt();
		System.out.println("Down payment: ");
		double downpay = sc.nextInt();
		System.out.println("Length of loan: ");
		int months = sc.nextInt();
		System.out.println("Interest rate: ");
		double interest = sc.nextInt();
	
		double interestRate = interest / 100;
		double monthlyInterest = interestRate / 12.0;
		double loanAmount = price - downpay;
		System.out.println("The monthly payment is: " + monthlyPayment(loanAmount, monthlyInterest, months));
		System.out.println("The total interest paid is: " + totalInterestPaid(loanAmount, monthlyInterest, months));

		
		
	} //main
	
	public static double monthlyPayment(double loanAmount, double monthlyInterest, double months) {
		double value = ((loanAmount) *(monthlyInterest)) / (1 - Math.pow((1 + monthlyInterest) , - months));
		return value;
	}
	
	public static double totalInterestPaid(double loanAmount, double monthlyInterest, int months) {
		double value = (monthlyPayment(loanAmount, monthlyInterest, months) * months) - loanAmount;
		return value;
	}
	@Test
	static void testMonthlyPayment() {
		System.out.print("Testing monthlyPayment");
		Carloan testCar = new Carloan();
		assertEquals(743.65,testCar.monthlyPayment(35000, .10/12, 60),0.01);
	}

	@Test
	static void testTotalInterestPaid() {
		System.out.println(" ");
		System.out.print("Testing interestPaid");
		Carloan testCar = new Carloan();
		assertEquals(9618.79, testCar.totalInterestPaid(35000, .10/12, 60), 0.01);
	}
	
	
} //class 
