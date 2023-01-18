package forJava.level1;

import java.util.*;

/*
 * 문자열 다루기 기본 => 문자열s의 길이가 4혹은 6이고, 숫자로만 구성되어 있는지 확인하는 함수 생성
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */
public class HandleString {

	public static void main(String[] args) {
		String firstEx = "a1234"; // false 리턴
		String secondEx = "1234"; // true 리턴

		if (!solution(secondEx)) {
			System.out.println("false 리턴. ");
		} else {
			System.out.println("true");
		}
		
		
//		CharSequence a = "a";
//		System.out.println(firstEx.contains(a)); 
	}

	public static boolean solution(String s) {
		boolean answer = true;
		String numbers = "0123456789";
		System.out.println("s의 길이: " + s.length());
		if (s.length() != 4 && s.length() != 6) {
			answer = false;
		} else {
			for (int i = 0; i < s.length(); i++) {
				if( numbers.indexOf( s.charAt(i)) == -1) {
					answer = false;
					break;
				};
			}
		}
		return answer;
	}
}
