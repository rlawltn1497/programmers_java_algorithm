package level1;

public class sumBetweenTwoIntegers {
	public long solution(int a, int b) {
		long answer = 0;
		int temp = 0;
		if (a == b) {
			return answer = a;
		}
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		answer = a;
		for (int i = 1; i < b - a; i++) {
			answer += a + i;
		}
		answer += b;
		return answer;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		sumBetweenTwoIntegers sumBetweenTwoIntegers = new sumBetweenTwoIntegers();
		long n = sumBetweenTwoIntegers.solution(a, b);
		System.out.println(n);
	}
}
