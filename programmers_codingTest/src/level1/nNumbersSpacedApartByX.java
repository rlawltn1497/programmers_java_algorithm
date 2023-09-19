package level1;

public class nNumbersSpacedApartByX {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        answer[0] = x;
        for(int i = 1; i < n; i ++) {
        	answer[i] = answer[i-1] + x;
        }
        return answer;
    }

	public static void main(String[] args) {
		int num1 = -4; 
		int num2 = 2;
		nNumbersSpacedApartByX nNumbersSpacedApartByX = new nNumbersSpacedApartByX();
		long[] n = nNumbersSpacedApartByX.solution(num1,num2);
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);			
		}
	}
}
