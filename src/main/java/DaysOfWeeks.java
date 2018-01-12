public class DaysOfWeeks {
	/*
	 * Write a method called dayOfTheWeek that takes in an integer representing the day of the week
	 * and returns a String with the name of that day. Uses switch statement in your method.
	 * The first day of the week is Sunday. There should be a default case that handles integers
	 * outside the range of 1 - 7.
	 */

		public static String dayOfTheWeek(int dayInt){
			String retVal;

			switch (dayInt) {
				case 1:
					retVal = "Sunday";
					break;
				case 2:
					retVal = "Monday";
					break;
				case 3:
					retVal = "Tuesday";
					break;
				case 4:
					retVal = "Wednesday";
					break;
				case 5:
					retVal = "Thursday";
					break;
				case 6:
					retVal = "Friday";
					break;
				case 7:
					retVal = "Saturday";
					break;
				default:
					retVal = "Invalid Entry";
					break;
			}
			return (retVal);
		}
}
