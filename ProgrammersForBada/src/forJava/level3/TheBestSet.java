package forJava.level3;

import java.util.Arrays;
import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12938
public class TheBestSet {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		TheBestSet tbs = new TheBestSet();
		
		int n = 3;
		int s = 13;
		tbs.solution(n,s);
		tbs.solution2(n,s);
		scn.close();
	}
	
	int[] solution(int n, int s) {
		int[] answer = new int[n];
		
		if(n > s) {
			answer = new int[]{-1};
			return answer;
		}
		
		for(int i =0; i<answer.length; i++) {
			answer[i] = s/n;
		}
		
		for(int i = 0; i< s%n; i++) {
			answer[i]++;
		}
		
		Arrays.sort(answer);
		return answer;
 	}
	
	
	int[] solution2(int n, int s) {
        int[] answer = new int[n];
        if(n > s) {
			answer = new int[]{-1};
            return answer;
		}
        
		for(int i =0; i<n; i++) {
			answer[i] = s/n;
		}
		
		int r = s%n;
		
		for(int i = 0; i<r; i++) {
			answer[answer.length -1 -i]++;
		}
		return answer;
	}
}
