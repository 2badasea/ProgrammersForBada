package forJava.practice;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	// 다음 큰 숫자. 
	public int solution(int n) {
		int answer = 0;
		
		// 자바에서는 이진수 형태의 문자열로 변환해주는 toBinaryString() 메서드가 존재. 
		int cur = calBinary(n); 
		
		while(true) {
			n++;
			if(cur == calBinary(n)) {
				answer = n;
				break;
			}
		}
		return  answer;
	}
	
	private int calBinary(int m) {
		int count = 0;
		String binary = Integer.toBinaryString(m);
		for(int i =0; i<binary.length(); i++) {
			if(binary.charAt(i) == '1') {
				count++;
			}
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(78)); // 83
		System.out.println(sol.solution(15)); // 23
		
	}
}
