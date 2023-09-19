package level1;

public class evenAndOddNumbers {
	public String solution(int num) {
		String answer = "";
		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}

	public static void main(String[] args) {
		int num1 = 12;
		evenAndOddNumbers evenAndOddNumbers = new evenAndOddNumbers();
		String n = evenAndOddNumbers.solution(num1);
		System.out.println(n);
	}
}
