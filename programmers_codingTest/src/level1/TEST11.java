package level1;


public class TEST11 {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (containsNonDigit(s)) {
        	answer = false;
        }
        
        return answer;
    }
    
    private static boolean containsNonDigit(String input) {
    	
    	if (input.length() == 4 || input.length() == 6) {
    	
        // 문자열의 각 문자에 대해 반복
        for (char c : input.toCharArray()) {
            // 해당 문자가 숫자가 아니라면 true 반환
            if (!Character.isDigit(c)) {
                return true;
            }
        }
        // 모든 문자가 숫자라면 false 반환
    	} else {
    		return true;
    	}
        return false;
    }

	public static void main(String[] args) {
		String s = "a234";
		String s1 = "12341a";
		
		TEST11 TEST11 = new TEST11();
		boolean n = TEST11.solution(s1);
		System.out.println(n);
	}
}