package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TEST4 {
    public int[] solution(int[] arr) {
    	if(arr.length == 1) {
    		arr[0] = -1;
    		return arr;
    	}
        int num = 999999999;

        for(int num1 : arr) {
        	if(num1 < num) {
        		num = num1;
        	}
        }

        List<Integer> numbersList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        removeNumber(numbersList, num);
        int[] numbersArray = numbersList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return numbersArray;
    }
    
    public static void removeNumber(List<Integer> list, int target) {
        list.remove(Integer.valueOf(target));
    }

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		TEST4 TEST4 = new TEST4();
		int[] n = TEST4.solution(arr);
		for(Integer num : n) {
			System.out.println(num);			
		}

	}
}