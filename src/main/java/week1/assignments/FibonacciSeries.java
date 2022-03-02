package week1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 1;
		System.out.println(value1);
		System.out.println(value2);
		for (int i = 1; i <=5 ; i++) {
			int answer = value1 + value2;
			System.out.println(answer);
			value2 = value1;
			value1 = answer;
		}
	}
}
