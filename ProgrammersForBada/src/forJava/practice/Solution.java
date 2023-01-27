package forJava.practice;
import java.util.*;

import forJava.level2.DeletingCouple;


public class Solution {
	
	// toCharArray(), peek() 메서드를 활용해서 비교할 것. 
	public int solution(String s) {
		int answer = -1;
		
		char[] c = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i<c.length; i++) {
			if(stack.isEmpty()) {
				stack.push(c[i]);
			} else {
				if( stack.peek() == c[i]) {
					stack.pop();
				}else {
					stack.push(c[i]);
				}
			}
		}
		
		answer = stack.isEmpty() ? 1 : 0;

		return answer;
	}
	
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("baabaa")); 
		
		byte[] bytes = "baabaa".getBytes();
		System.out.println(bytes.length);
		for(byte i : bytes) {
			System.out.println("i: " + i);
		}
	}
}


