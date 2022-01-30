import java.time.LocalDateTime;
import java.util.Scanner;

public class TalkingClock {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int hr, min;
		String  w;
		String words[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty",
				"Twenty one", "Twenty two", "Twenty three", "Twenty four", "Twenty five", "Twenty six", "Twenty seven",
				"Twenty eight", "Twenty nine" };
		System.out.println("Enter Hour");
		// hr = LocalDateTime.now().getHour();
		hr = in.nextInt();
		System.out.println("Enter Minutes");
		// min = LocalDateTime.now().getMinute();
		min = in.nextInt();
		if (hr > 12) {
			hr = hr - 12;
		}

		if ((hr >= 1 && hr <= 12) && (min >= 0 && min <= 59)) {

			if (hr == 12) // Storing "One" in 'w' if hr is 12
			{
				w = words[1];
			} else // Storing Next value of hour in 'w' if hour is between 1-11
			{
				w = words[hr + 1];
			}
			if (min == 0) {
				System.out.println("Time Entered - " + hr + " : " + min);
				System.out.println(words[hr] + " O' clock");
			} else if (min == 15) {
				System.out.println("Time Entered - " + hr + " : " + min);
				System.out.println("Quarter Past " + words[hr]);
			} else if (min == 30) {
				System.out.println("Time Entered - " + hr + " : " + min);
				System.out.println("Half Past " + words[hr]);
			} else if (min == 45) {
				System.out.println("Time Entered - " + hr + " : " + min);
				System.out.println("Quarter to " + w);
			} else if (min < 30) // Condition for minutes between 1-29
			{
				System.out.println("Time Entered - " + hr + " : " + min);
				System.out.println(words[min] + " past " + words[hr]);
			} else // Condition for minutes between 30-59
			{
				System.out.println("Time Entered - " + hr + " : " + min);
				System.out.println(words[60 - min] + " to " + w);
			}
		} // end of outer if statement
		else {
			System.out.println("Invalid Time Entered");
		}
	}

}
