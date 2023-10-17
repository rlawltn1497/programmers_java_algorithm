package level1;


public class ColatzGuess {
    public int solution(long num) {
        int answer = 0;
        while(num != 1) {
        	if(answer == 500) {
        		return -1; // 500번 초과시 -1 반환하고 메서드 종료
        	}
        	if(num % 2 == 0) {
        		num /= 2;
        		answer++;
        		continue;
        	}
        	if(num % 2 == 1) {
        		num = (num*3)+1;
        		answer++;
        		continue;
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
//		int a = 16;
		int a = 626331;
		ColatzGuess ColatzGuess = new ColatzGuess();
		int n = ColatzGuess.solution(a);
		System.out.println(n);
	}
}
