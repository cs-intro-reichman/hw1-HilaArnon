// Splits a restaurant bill evenly among three diners.
public class Bill3 {

	/*
	 * First Program (10 points)
	 * The Bill3 program splits a restaurant bill equally among three diners.
	 * The program reads four inputs, supplied as command-line arguments(args).
	 * The program should handle the first three inputs as strings, and the fourth
	 * as an int value.
	 * The program divides this value by 3 (rounded up) and prints an output
	 * message.
	 * % java Bill3 Ron Lisa Dan 100
	 * Dear Dan, Lisa, and Ron: pay 34.0 Shekels each.
	 */

	public static void main(String[] args) {
		String name1 = args[0], name2 = args[1], name3 = args[2];
		int number = Integer.parseInt(args[3]);
		double avg = Math.ceil(number / 3.0);
		System.out.println("Dear " + name1 + ", " + name2 + ", and " + name3 +
				": pay " + avg + " Shekels each.");
	}

}