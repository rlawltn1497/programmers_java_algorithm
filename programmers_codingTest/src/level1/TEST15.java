package level1;


public class TEST15 {
    public int solution(int n) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int remainder = n % 3;
            result.insert(0, remainder); // 나머지를 결과의 앞에 추가
            n /= 3; // 몫으로 갱신
        }

        // 만약 결과가 비어 있다면 입력이 0이었던 것이므로 "0" 반환
        String s = result.length() > 0 ? result.toString() : "0";
        String s1 = reverseWithStringBuilder(s);
        
        int decimal = 0;
        int power = 0;

        // 문자열을 뒤에서부터 읽어가면서 10진수로 변환
        for (int i = s1.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(s1.charAt(i));
            decimal += digit * Math.pow(3, power);
            power++;
        }
        
        return decimal;
    }
    
    public static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }

	public static void main(String[] args) {
		int a = 45;
		int b = 125;
		
		TEST15 TEST15 = new TEST15();
		int n = TEST15.solution(a);
		System.out.println(n);
	}
}