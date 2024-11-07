// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	/*
	 * Fifth Program (30 points)
	 * The TimeFormat program gets a time input that uses the 24-hour hh:mm format,
	 * and prints the time using the 12-hour AM/PM format.
	 * 12:00 is also PM (from GitHub...)
	 * % TimeFormat 10:15
	 * 10:15 AM
	 * % TimeFormat 17:08
	 * 5:08 PM
	 * % TimeFormat 00:00
	 * 0:00 AM
	 */

	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0].
		//
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit.
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		// Replace this comment with the rest of your code
	}
}