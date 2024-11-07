// Computes the future value of a saving investment.
public class FVCalc {
	
	/*
	 * Second Program (10 points)
	 * This program computes the future value of a sum of money which is put in a
	 * saving
	 * account that earns interest over time. The relevant formula is:
	 * 𝑓𝑢𝑡𝑢𝑟𝑒𝑉𝑎𝑙𝑢𝑒 = 𝑐𝑢𝑟𝑟𝑒𝑛𝑡𝑉𝑎𝑙𝑢𝑒 ⋅ (1 + 𝑟𝑎𝑡𝑒) ^ n
	 * The program gets three inputs:
	 * currentValue is assumed to be a nonnegative integer.
	 * rate is assumed to be a percentage (an integer between 0 and 100, inclusive).
	 * n is assumed to be a nonnegative integer.
	 * % java FVCalc 100 10 2
	 * After 2 years, a $100 saved at 10.0% will yield $121
	 * % java FVCalc 250000 6 25
	 * After 25 years, a $250000 saved at 6.0% will yield $107296
	 */

	public static void main(String[] args) {
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int n = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow((1 + (rate)), n);
		System.out.print("After " + n + " year a $" + currentValue + " saved at "
						+ rate + "% will yield $" + (int) futureValue);
	}
}