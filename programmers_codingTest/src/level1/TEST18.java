package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TEST18 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
        	if(!map.containsKey(s.charAt(i))) {
        		answer[i] = -1;
        		map.put(s.charAt(i), i);
        	} else {
        		answer[i] = i - map.get(s.charAt(i));
        		map.put(s.charAt(i), i);
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		String s = "banana";
		// String s1 = "foobar";

		TEST18 TEST18 = new TEST18();
		int[] n = TEST18.solution(s);
		System.out.println(Arrays.toString(n));
	}
}