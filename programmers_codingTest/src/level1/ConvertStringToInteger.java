package level1;

public class ConvertStringToInteger {
	public int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);
		return answer;
	}

	public static void main(String[] args) {
		String num1 = "-1234";
//		String num2 = "9515";
		ConvertStringToInteger ConvertStringToInteger = new ConvertStringToInteger();
		int n = ConvertStringToInteger.solution(num1);
		System.out.println(n);
	}
}
