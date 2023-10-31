package level1;

import java.util.Arrays;

public class TEST8 {
	public int solution(int left, int right) {
		int answer = 0;
        if (left > right) {
            // start가 end보다 크면 두 값을 교환
            int temp = left;
            left = right;
            right = temp;
        }

        int length = right - left + 1;
        int[] numbersArray = new int[length];

        for (int i = 0; i < length; i++) {
            numbersArray[i] = left + i;
        }
        System.out.println(Arrays.toString(numbersArray));
        
        for(int j = 0; j < numbersArray.length; j++) {
        	int count = 0;
        	 for (int k = 1; k <= numbersArray[j]; k++) {
                 if (numbersArray[j] % k == 0) {
                     count++;
                 }
             }
        	 System.out.println("count1 : " + count);
        	 if(count%2 == 0) {
        		 answer += numbersArray[j];
        	 } else {
        		 answer -= numbersArray[j];
        	 }
        	 System.out.println("answer : " + answer);
        }
        
		return answer;
	}

	public static void main(String[] args) {
		int n1 = 13;
		int n2 = 17;
		TEST8 TEST8 = new TEST8();
		int n = TEST8.solution(n1, n2);
		System.out.println(n);
	}
}