package level1;

public class FindANumberWhoseRemainderIs1 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int num1 = 10;
//		int num2 = 12;
		FindANumberWhoseRemainderIs1 FindANumberWhoseRemainderIs1 = new FindANumberWhoseRemainderIs1();
		int n = FindANumberWhoseRemainderIs1.solution(num1);
		System.out.println(n);
	}
}
