package level1;

public class TEST17 {
	public String solution(String s) {
		String answer = "";
		String[] array = s.split("");
		int cnt = 0;
		
		for(String ss : array) {
			cnt = ss.contains(" ") ? 0 : ++cnt;
			System.out.println("cnt : " + cnt);
			answer += cnt%2 == 1 ? ss.toUpperCase() : ss.toLowerCase();
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String s = "try hello      world";
		String s1 = "avvvb";

		TEST17 TEST17 = new TEST17();
		String n = TEST17.solution(s);
		System.out.println(n);
	}
}