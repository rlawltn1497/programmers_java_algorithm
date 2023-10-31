package level1;

import java.util.Arrays;

public class TEST16 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i : d) {
        	sum += i;
        	if(sum <= budget) {
        		answer++;
        	} else {
        		break;
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		TEST16 TEST16 = new TEST16();
		int n = TEST16.solution(d, budget);
		System.out.println(n);
	}
}