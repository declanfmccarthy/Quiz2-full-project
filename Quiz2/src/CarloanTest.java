import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarloanTest {

	@Test
	void testMonthlyPayment() {
		System.out.print("Testing monthlyPayment");
		Carloan testCar = new Carloan();
		assertEquals(743.65,testCar.monthlyPayment(35000, .10/12, 60),0.01);
	}

	@Test
	void testTotalInterestPaid() {
		System.out.print("Testing interestPaid");
		Carloan testCar = new Carloan();
		assertEquals(9618.79, testCar.totalInterestPaid(35000, .10/12, 60), 0.01);
	}

}
