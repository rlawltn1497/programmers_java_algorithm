package level1;

public class TheSidesOfPAndYInString {
    boolean solution(String s) {
        boolean answer = true;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < s.length(); i++) {
        	if("p".equals(String.valueOf(s.charAt(i)).toLowerCase())) {
        		count1++;
        	} else if ("y".equals(String.valueOf(s.charAt(i)).toLowerCase())) {
        		count2++;
        	}
        }
        if (count1 != count2) {
        	answer = false;
        }

        return answer;
    }

	public static void main(String[] args) {
		String s = "pPoooyY";
		String s1 = "pyY";
		TheSidesOfPAndYInString TheSidesOfPAndYInString = new TheSidesOfPAndYInString();
		boolean n = TheSidesOfPAndYInString.solution(s);
		System.out.println(n);
	}
}
