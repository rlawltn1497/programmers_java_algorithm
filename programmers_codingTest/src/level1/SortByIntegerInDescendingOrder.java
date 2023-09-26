package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SortByIntegerInDescendingOrder {
	public long solution(long n) {
		long answer = 0;
		int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
		Integer[] arr3 = Arrays.stream(digits).boxed().toArray(Integer[]::new);
		Arrays.sort(arr3, Collections.reverseOrder());
		for (int num : arr3) {
			answer = answer * 10 + num;
		}
		return answer;
	}

	public static void main(String[] args) {
		int a = 118749733;
//		int b = 5;
		SortByIntegerInDescendingOrder SortByIntegerInDescendingOrder = new SortByIntegerInDescendingOrder();
		long n = SortByIntegerInDescendingOrder.solution(a);
		System.out.println(n);
	}
}
