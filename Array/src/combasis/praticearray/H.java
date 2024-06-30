package combasis.praticearray;

public class H {
	public static String hoursPassed(String t1, String t2) {

		int[] time1 = parseTime(t1);
		int[] time2 = parseTime(t2);

		int hours1 = time1[0];
		int hours2 = time2[0];

		if (time1[2] == 1 && hours1 != 12) {
			hours1 += 12;
		} else if (time1[2] == 0 && hours1 == 12) {
			hours1 = 0;
		}

		if (time2[2] == 1 && hours2 != 12) {
			hours2 += 12;
		} else if (time2[2] == 0 && hours2 == 12) {
			hours2 = 0;
		}

		int hoursDifference = hours2 - hours1;

		if (hoursDifference < 0) {
			hoursDifference += 24;
		}

		return hoursDifference + " hours";
	}

	public static int[] parseTime(String time) {

		String[] parts = time.split("[: ]");
		int hours = Integer.parseInt(parts[0]);
		int minutes = Integer.parseInt(parts[1]);
		int period = parts[2].equals("AM") ? 0 : 1;

		return new int[] { hours, minutes, period };
	}

	public static void main(String[] args) {
		System.out.println(hoursPassed("3:00 AM", "9:00 AM"));
		System.out.println(hoursPassed("1:00 PM", "2:00 PM"));
	}

}
