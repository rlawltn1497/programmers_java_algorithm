package level1;

import java.util.Arrays;
import java.util.Comparator;

public class TEST9 {
	public String solution(String s) {
		String sortedString = sortStringSeparately(s);
		System.out.println(sortedString);
		return sortedString;
	}

	public static String sortStringSeparately(String input) {
		// 문자열을 소문자와 대문자로 나누어 각각의 배열에 저장
		Character[] lowercaseArray = input.chars().filter(Character::isLowerCase).mapToObj(c -> (char) c)
				.toArray(Character[]::new);

		Character[] uppercaseArray = input.chars().filter(Character::isUpperCase).mapToObj(c -> (char) c)
				.toArray(Character[]::new);

		// 소문자 배열을 내림차순으로 정렬
		Arrays.sort(lowercaseArray, Comparator.reverseOrder());

		// 대문자 배열을 내림차순으로 정렬
		Arrays.sort(uppercaseArray, Comparator.reverseOrder());

		// 각 배열의 원소를 문자열로 변환하여 합치기
		StringBuilder result = new StringBuilder();
		for (char c : lowercaseArray) {
			result.append(c);
		}
		for (char c : uppercaseArray) {
			result.append(c);
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String str = "Zbcdefg";
		TEST9 TEST9 = new TEST9();
		String n = TEST9.solution(str);
		System.out.println(n);
	}
}