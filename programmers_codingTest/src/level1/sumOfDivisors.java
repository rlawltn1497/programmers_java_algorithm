package level1;


public class sumOfDivisors {
		public int solution(int n) {
			int answer = 0;
			for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
					answer+=i;
				}
			}
			return answer;
		}
	
	public static void main(String[] args) {
		int num1 = 12;
		sumOfDivisors sumOfDivisors = new sumOfDivisors();
		int n = sumOfDivisors.solution(num1);
		System.out.println(n);		
	}
}
