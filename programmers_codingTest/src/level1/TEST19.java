package level1;


public class TEST19 {
    public int solution(String t, String p) {
        int answer = 0;
        long number = Long.parseLong(p);
        
        int chunkSize = p.length();
        long length = t.length();
        
        for (int i = 0; i < length - chunkSize + 1; i++) {
            String chunk = t.substring(i, i + chunkSize);
            if(Long.parseLong(chunk) <= number) {
            	answer++;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		String s = "10203";	
		String s1 = "15";

		TEST19 TEST19 = new TEST19();
		int n = TEST19.solution(s, s1);
		System.out.println(n);
	}
}