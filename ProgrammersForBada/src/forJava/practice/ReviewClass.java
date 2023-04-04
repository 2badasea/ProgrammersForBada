package forJava.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReviewClass {

	public static void main(String[] args) {
		// 문자열 내 p와 y의 개수
		// 대문자와 소문자가 섞여있는 문자열 s -> p의 개ㅜㅅ와 y의 개수가 같으면 true, 다르면 false를 리턴. 
		// 대소문자 구분 x 
		
		String test1 = "pPoooyY";
		String test2 = "Pyy";
		
		
		ReviewClass rc = new ReviewClass();
		System.out.println(rc.solution(test1)); 
		System.out.println(rc.solution(test2)); 
	}
	
	private boolean solution(String s) {
		int count = 0;
		s = s.toLowerCase();
		
		for(int i = 0; i<s.length(); i++) {
			if( s.charAt(i) == 'p') {
				count++;
			}else if( s.charAt(i) == 'y') {
				count--;
			}
		}
		
		return count == 0 ? true : false;
	}
	
	
}
