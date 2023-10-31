package level1;

import java.util.Arrays;

public class TEST14 {
    public int[] solution(int n, int m) {
    	 int[] answer = new int[2];

         // 최대공약수 계산
         answer[0] = gcd(n, m);
         // 최소공배수 계산
         answer[1] = lcm(n, m);

         return answer;
    }
    // 최대공약수를 계산하는 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    // 최소공배수를 계산하는 함수
    public static int lcm(int a, int b) {

        return a * b / gcd(a, b);
    }

	public static void main(String[] args) {
		int a = 3;
		int b = 12;
		
		TEST14 TEST14 = new TEST14();
		int[] n = TEST14.solution(a,b);
		System.out.println(Arrays.toString(n));
	}
}