public class Numbers {

	/*
	 * Write a method called isNumberNegPos that returns a String specifying
	 * if a number is positive, negative, or zero.
	 */

	public static String isNumberNegPos(int num){
		String retVal;

		if (num <0){
			retVal = "Negative";
		}
		else if (num >0){
			retVal = "Positive";
		}
		else{
			retVal = "Zero";
		}
	return (retVal);
	}

}
