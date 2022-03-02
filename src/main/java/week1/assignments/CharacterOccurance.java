package week1.assignments;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		char input = 'e';
		char charGet;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			charGet = str.charAt(i);
			if (charGet == input) {
				count++;
			}

		}
		System.out.println("Number of 'e' in 'welcome to chennai' " + count);
	}

}