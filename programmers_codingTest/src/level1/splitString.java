package level1;

public class splitString {
    public int solution(String s) {
        int result = 0;
        int xCount = 0;
        int nonXCount = 0;
        int startIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(startIndex)) {
                xCount++;
            } else {
                nonXCount++;
            }

            if (xCount == nonXCount) {
            	startIndex = i + 1;
                result++;
                xCount = 0;
                nonXCount = 0;
            }
        }

        return result;
    }

	public static void main(String[] args) {
		String a = "aabbaabb";
//		String a = "banana";
//		String a = "abracadabra";
//		String a = "aaabbaccccabba";
		splitString splitString = new splitString();
		int n = splitString.solution(a);
		System.out.println(n);
	}
}
