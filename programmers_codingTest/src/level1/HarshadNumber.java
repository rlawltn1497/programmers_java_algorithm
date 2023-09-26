package level1;

import java.util.stream.Stream;

public class HarshadNumber {
	public boolean solution(int x) {
		boolean answer = true;
		int[] digits = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
		int num = 0;
		for (int i = 0; i < digits.length; i++) {
			num += digits[i];
		}
		if (x % num != 0) {
			answer = false;
		}
		return answer;
	}

	public static void main(String[] args) {
		int a = 10;
		HarshadNumber HarshadNumber = new HarshadNumber();
		boolean n = HarshadNumber.solution(a);
		System.out.println(n);
	}
}
