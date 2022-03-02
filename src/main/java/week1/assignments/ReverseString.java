package week1.assignments;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am a software tester";
		String[] words = input.split("\\s");

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			if (i != 0) {
				if ((i % 2) == 0) {
					sb.append(" ");
					sb.append(words[i]);
				} else {
					StringBuffer revsb = new StringBuffer();
					sb.append(" ");
					revsb.append(words[i]);
					revsb.reverse();
					sb.append(revsb);
				}
			} else {
				sb.append(words[i]);
			}
		}
		System.out.println(sb);

	}

}