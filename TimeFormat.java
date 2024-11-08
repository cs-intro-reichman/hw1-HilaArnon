// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {

	/*
	 * Fifth Program (30 points)
	 * The TimeFormat program gets a time input that uses the 24-hour hh:mm format,
	 * and prints the time using the 12-hour AM/PM format.
	 * 12:00 is also PM 
	 * % TimeFormat 10:15
	 * 10:15 AM
	 * % TimeFormat 17:08
	 * 5:08 PM
	 * % TimeFormat 00:00
	 * 0:00 AM
	 */

	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		boolean checkPM = false, check0 = false;

		// Checking PM and 00:00
		if (hours >= 13 && hours <= 23) { // PM
			hours -= 12;
			checkPM = true;
		} else if (hours == 12) {
			checkPM = true;
		} else if (hours == 0 && minutes == 0) { // 0:00
			check0 = true;
		}

		// Checking the minutes
		String newMinutes;
		if (minutes < 10) {
			newMinutes = "0" + String.valueOf(minutes);
		} else {
			newMinutes = String.valueOf(minutes);
		}

		// output
		if (check0) {
			if (checkPM) { // PM
				System.out.print(hours + ":" + newMinutes + " PM");
			} else { // AM
				System.out.print(hours + ":" + newMinutes + " AM");
			}
		} else { // 0:00
			System.out.print("0:00 AM");
		}
	}
}