package week1.assignments;

public class MissisngElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 3, 4, 6, 7, 8 };
		int lengthOfArray = input.length;
		for (int i = input[1]; i <= lengthOfArray; i++) {
			if (i != input[i - 1]) {
				System.out.println("Missing number is " + i);
				break;
			} else {
				if (i == lengthOfArray) {
					System.out.println("No missing numbers");
				}
			}
		}

	}

}