package level1;

public class FindTheAverage {
	public double solution(int[] arr) {
		double answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer / arr.length;
	}

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4 };
//		int[] num1 = {5,5};
		FindTheAverage FindTheAverage = new FindTheAverage();
		double n = FindTheAverage.solution(num1);
		System.out.println(n);
	}
}
