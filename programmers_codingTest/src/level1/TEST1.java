package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST1 {
	public Integer[] solution(int[] arr, int divisor) {
		Integer[] answer = {};
		 ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				numbers.add(arr[i]);
			}
		}
		if(numbers.isEmpty()) {
			answer = new Integer[1];
			answer[0] = -1;
		} else {
			answer = numbers.toArray(new Integer[numbers.size()]);
			Arrays.sort(answer);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 9, 7, 10 };
		int num = 5;
		TEST1 TEST1 = new TEST1();
		Integer[] n = TEST1.solution(arr, num);
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
}