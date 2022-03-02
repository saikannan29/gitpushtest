package week1.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "$$ Welcome to 2nd class of Automation";
		int letters = 0, space = 0, numbers = 0, specialChar = 0;
		char charGet;
		boolean letter, spaceStatus, numberStatus;
		for (int i = 0; i < input.length(); i++) {
			charGet = input.charAt(i);
			letter = Character.isLetter(charGet);
			spaceStatus = Character.isSpaceChar(charGet);
			numberStatus = Character.isDigit(charGet);
			if (letter == true) {
				letters++;
			} else if (spaceStatus == true) {
				space++;
			} else if (numberStatus == true) {
				numbers++;
			} else {
				specialChar++;
			}
		}
		System.out.println("Number of letters are " + letters);
		System.out.println("Number of white space are " + space);
		System.out.println("Number of numbers are " + numbers);
		System.out.println("Number of special characters are " + specialChar);
	}

}