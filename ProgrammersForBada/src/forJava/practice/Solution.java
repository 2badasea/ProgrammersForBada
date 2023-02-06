package forJava.practice;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	// n개의 숫자들 사이의 최소공배수 구하기
	public int solution(int[] intAry) {
		int answer = 0;
		
		// 두 수의 최소고배수는, 두 수의 곱 / 최대공약수. 
		answer = intAry[0];
		for(int i = 1; i<intAry.length; i++) {
			answer = (answer * intAry[i]) / gcd(answer,intAry[i]);
		}
		return  answer;
	}
	
	int gcd(int a, int b) {
		int x = Math.max(a, b);
		int y = Math.min(a, b);
		int r = x%y;
		
		if(x%y == 0) return y;
		return gcd(y, r); 
	}
	
	
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] test = {2,6,8,14};
		System.out.println(sol.solution(test));
	}
}
