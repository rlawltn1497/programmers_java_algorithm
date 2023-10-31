package level1;


public class TEST2 {
	public String solution(String phone_number) {
		String answer = "";
		int num = phone_number.length();
        String maskedPart = "*".repeat(num - 4);
        String lastFourDigits = phone_number.substring(num - 4);
        return maskedPart + lastFourDigits;
	}

	public static void main(String[] args) {
		String str = "01033334444";
		TEST2 TEST2 = new TEST2();
		String n = TEST2.solution(str);
		System.out.println(n);

	}
}