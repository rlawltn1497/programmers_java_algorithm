package level1;

public class TEST12 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int rows = arr1.length;
		int cols = arr1[0].length;
		int[][] answer = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };
		TEST12 TEST12 = new TEST12();
		int[][] n = TEST12.solution(arr1, arr2);
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println(); // 각 행을 출력한 후 개행
		}
	}
}