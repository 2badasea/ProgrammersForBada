package forJava.practice;
import java.util.*;


public class Solution {
	// 주어진 자연수를 뒤집어 배열로 만들기
	public int[] solution(long n) {
		int[] answer = {};
		
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		sb = sb.reverse();
		answer = new int[sb.length()];
		String[] sAry = sb.toString().split("");
		for(int i = 0; i<sAry.length; i++) {
			answer[i] = Integer.parseInt(sAry[i]) ;
		}
		
		
		return answer;
	}
}


