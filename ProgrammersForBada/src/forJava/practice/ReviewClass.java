package forJava.practice;

import java.util.Arrays;
import java.util.Stack;

public class ReviewClass {

	public static void main(String[] args) {
		ReviewClass rc = new ReviewClass();
		// 첫 문자가 대문자, 그 외의 알파벳은 소문자인 문자열
		// 첫 문자가 알파벳이 아닌 경우, 이어지는 알파벳은 소문자로. 
		// 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수 완성하기
		String test1 = "3people unFollowed me";
		String test2 = "for the last week";
		System.out.println(rc.jadenCase(test1));
//		System.out.println(rc.jadenCase(test2));
		
	}
	
	private String jadenCase(String s) {
		String answer = "";
		
		String[] strAry = s.split("");
		boolean flag = true;
		
		for(String str : strAry) {
			if(str.equals(" ")) {
				flag = true;
				answer += str;
				continue; // continue => 다음 for문 조건으로 이동. 
			}
			
			if(flag) {
				str = str.toUpperCase();
				flag = false;
			}else {
				str = str.toLowerCase();
			}
			answer += str;
		}
		return answer;
	}
	
	private String maxAndMin(String s) {
		// 1. 첫 번째 방식 => 배열의 형식으로 만든다음, Arrays.sort() 메서드 사용하기
		String[] ary = s.split(" ");
		int[] intAry = new int[ary.length];
		int count = 0;
		for(String n : ary) {
			intAry[count++] = Integer.parseInt(n);
		}
		
		Arrays.sort(intAry);
		
		String answer = intAry[0] + " " + intAry[intAry.length-1];
		return answer;
	}
	
	
	private int useStack(String s) {
		// stack을 이용해서 풀어보기
		char[] ary = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(char c : ary) {
			if(stack.size() > 0) {
				if(stack.peek() == c) {
					stack.pop();
				} else {
					stack.push(c);
				}
			} else {
				stack.push(c);
			}
		}
		
		return ( stack.size() == 0) ? 1 : 0;
		// return stack.isEmpty() ? 1 : 0  표현으로도 가능.
	}
	
	
}