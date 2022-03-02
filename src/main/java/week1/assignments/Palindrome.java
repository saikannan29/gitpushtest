package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "madam";
		int length = input.length();
		int k = 0;
		for (int i = length - 1; i >= 0; i--) {

			char ch = input.charAt(i);
			char ch2 = input.charAt(k);
			k++;
			if (ch != ch2) {
				System.out.println(input + " is not a palindrome");
				break;
			} else {
				if (i == 0) {
					System.out.println(input + " is a palindrome");
				}
			}

		}

	}

}