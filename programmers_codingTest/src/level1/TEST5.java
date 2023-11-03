package level1;


public class TEST5 {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length % 2 == 0) {
        	answer = s.charAt((length/2)-1)+""+s.charAt(length/2);
        } else {
        	answer = s.charAt(length/2)+"";

        }
        return answer;
    }

	public static void main(String[] args) {
		// String str = "qwer";
		String str1 = "abcde";
		TEST5 TEST5 = new TEST5();
		String n = TEST5.solution(str1);  
			System.out.println(n);	
	}
}