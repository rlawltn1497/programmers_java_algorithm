package level1;

public class FlipNaturalNumbersIntoArray {
    public int[] solution(long n) {
    	String temp = Long.toString(n);
        int[] answer = new int[temp.length()];
        int tempNum = 0;
        for(int i = temp.length()-1; i >= 0; i--) {
        	char a = temp.charAt(i);
        	int intValue = Character.getNumericValue(a);
        	answer[tempNum] = intValue;
        	tempNum++;
        }
        return answer;
    }

	public static void main(String[] args) {
		long num1 = 12345;
//		int num2 = 12;
		FlipNaturalNumbersIntoArray FlipNaturalNumbersIntoArray = new FlipNaturalNumbersIntoArray();
		int[] n = FlipNaturalNumbersIntoArray.solution(num1);
		for (int i : n) {
			System.out.println(i);
		}
	}
}
