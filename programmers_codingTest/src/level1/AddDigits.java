package level1;

public class AddDigits {
	public int solution(int n) {
		int answer = 0;
		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		int num1 = 123;
		AddDigits AddDigits = new AddDigits();
		int n = AddDigits.solution(num1);
		System.out.println(n);
	}
}
