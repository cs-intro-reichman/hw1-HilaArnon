// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {

	/*
	 * Fourth Program (30 points) - can't use if and else
	 * This program generates three random integers in the range [0,lim),
	 * where the lim input is an integer greater than 0.
	 * The program then prints the generated numbers followed by the same numbers in
	 * ascending order.
	 * % java Ascend 100
	 * 91 3 38
	 * 3 38 91
	 */

	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int num1 = (int) (Math.random() * lim);
		int num2 = (int) (Math.random() * lim);
		int num3 = (int) (Math.random() * lim);
		System.out.println(num1 + " " + num2 + " " + num3);

		int max = Math.max(num1, num2);
		max = Math.max(max, num3);
		int min = Math.min(num1, num2);
		min = Math.min(min, num3);
		int middle = num1 + num2 + num3 - (max + min);
		System.out.print(min + " " + middle + " " + max);
	}
}