package forJava.practice;

import java.util.Scanner;

public class ReviewClass {
	static Scanner scn = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// 문자열 내의 p와  y의 개수
		// p의 개수와 y의 개수가 같으면 true, 다르면 false를 리턴
		// 대소문자를 구분하지 않음
		String s1 = "pPoooyY";
		String s2 = "Pyy";
		
		ReviewClass rc = new ReviewClass();
		System.out.println("solution1");
		System.out.println("s1: " + rc.solution1(s1));
		System.out.println("s2: " + rc.solution1(s2));
		System.out.println("=========================");
		System.out.println("solution2");
		System.out.println("s1: " + rc.solution2(s1));
		System.out.println("s1: " + rc.solution2(s2));
	};
	
	// 1. 변수 한 개를 지정한 다음, 증감연산의 결과를 리턴시키기(최종 연산 결과가 0이면 true)
	boolean solution1(String s) {
		s = s.toLowerCase();
		
		int cnt = 0;
		for(int i = 0; i<s.length(); i++) {
			char c  = s.charAt(i);
			if(c == 'p') {
				cnt++;
			}else if(c == 'y') {
				cnt--;
			}
		}
		
		return cnt == 0 ? true : false;
	};
	
	// 2. 배열로 쪼개서 계산해보기
	boolean solution2(String s) {
		char[] chAry = s.toLowerCase().toCharArray();
		
		int cnt = 0;
		
		for(char c : chAry) {
			if( c == 'p') cnt++;
			if(c == 'y') cnt--;
		}
		return cnt == 0 ? true: false;
	}
}