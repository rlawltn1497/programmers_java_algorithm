package level1;

public class FindKimSeobangInSeoul {
	public String solution(String[] seoul) {
		String answer = "";
		int x = 0;
		for (int i = 0; i < seoul.length; i++) {
			if ("Kim".equals(seoul[i])) {
				x = i;
				break;
			}
		}
		answer = "김서방은 " + x + "에 있다";
		return answer;
	}

	public static void main(String[] args) {
		String[] seoul = { "Jane", "sarang", "jisu", "Kim", "iron" };
		FindKimSeobangInSeoul FindKimSeobangInSeoul = new FindKimSeobangInSeoul();
		String n = FindKimSeobangInSeoul.solution(seoul);
		System.out.println(n);
	}
}
