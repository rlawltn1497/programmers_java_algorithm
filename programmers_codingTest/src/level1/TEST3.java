package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST3 {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> arr1 = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i = 0; i < arr.length; i++) {
        	if(containsNumber(numbers, arr[i])) {
        		continue;
        	} else {
        		System.out.println(arr[i]);
        		arr1.add(arr[i]);
        	}
        }
        for (int number : arr1) {
        	answer += number;
        }
        return answer;
    }
    
    public static boolean containsNumber(int[] array, int target) {
        for (int number : array) {
            if (number == target) {
                return true; // 배열에 숫자가 포함되어 있음
            }
        }
        return false; // 배열에 숫자가 포함되어 있지 않음
    }

	public static void main(String[] args) {
		int[] arr = {5,8,4,0,6,7,9};
		TEST3 TEST3 = new TEST3();
		int n = TEST3.solution(arr);
		System.out.println(n);

	}
}