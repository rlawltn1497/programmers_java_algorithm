package level1;

public class DetermineIntegerSquareRoot {
	public long solution(long n) {
		long answer = 0;
		Double sqrt = Math.sqrt(n);
		if (sqrt == sqrt.intValue()) {
			sqrt++;
			answer = (long) Math.pow(sqrt, 2);
		} else {
			answer = -1;
		}
		return answer;
	}

	public static void main(String[] args) {
		int a = 3;
//		int b = 5;
		DetermineIntegerSquareRoot DetermineIntegerSquareRoot = new DetermineIntegerSquareRoot();
		long n = DetermineIntegerSquareRoot.solution(a);
		System.out.println(n);
	}
}
