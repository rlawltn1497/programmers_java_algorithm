package level1;


public class TEST6 {
    public String solution(int n) {
        String answer = "";
        String su = "수";
        String pack = "박";
        for(int i = 1; i <= n; i++) {
        	if(i%2!=0) {
        		answer+=su;        		
        	} else {
        		answer+=pack;
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		TEST6 TEST6 = new TEST6();
		String n = TEST6.solution(n2);  
			System.out.println(n);	
	}
}