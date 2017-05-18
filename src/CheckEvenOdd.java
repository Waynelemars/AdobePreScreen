public class CheckEvenOdd {

	final String odd = "odd";
	final String eventhree = "eventhree";
	final String three = "three";

	//check is the number is even number
	public boolean isEven(int num) {
		boolean result = num % 2 == 0 ? true : false;
		return result;

	}

	//check if the number can be divided by three
	public boolean isDivisiblebyThree(int num) {
		boolean result = num % 3 == 0 ? true : false;
		return result;
	}

	//Read an array of integers and print out the result based on the conditions.
	public void detectNumber(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {

			int num = a[i];
			// case 1: num is even number. If num is even number and can be divided by three, print eventhree. Otherwise, print num.
			if (isEven(num)) {

				System.out.println(isDivisiblebyThree(num) == true ? eventhree : num);

			// case 2: num is odd number. If num is odd number and can be divided by three, print odd. Otherwise, print num.
			} else {
				System.out.println(isDivisiblebyThree(num) == true ? three : odd);
			}

		}
	}
}