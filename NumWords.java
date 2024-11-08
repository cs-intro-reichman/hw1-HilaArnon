// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	/*
	 * Third Program (unknown points)
	 * The NumWords program gets a single integer input.
	 * It prints its value in terms of hundreds, tens, and ones. For example:
	 * % java NumWords 517
	 * 5 hundreds, 1 tens, and 7 ones.
	 */

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.print(num / 100 + " hundreds, "
						 + (num / 10) % 10 + " tens, and "
						 + num % 10 + " ones.");
	}
}