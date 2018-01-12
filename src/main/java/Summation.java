/**
 * Examples of loop statements
 */
public class Summation {

	/**
	 * Write a method called sum. It will take two integers the starting
	 * number and the ending number. It will sum the numbers between these two values
	 * inclusively. Your method should handle one or both of the values being negative.
	 */

	public static int sumNumbers(int int1, int int2){
		int start = 0;
		int end = 0;
		int retVal = 0;

		if (int1 > int2){
			start = int2;
			end = int1;
		}
		else {
			start= int1;
			end = int2;
		}
		if (start<end){
			for (int i = start;i<=end;i++){
				retVal = retVal + i;
			}
		}
		return (retVal);
	}
}
