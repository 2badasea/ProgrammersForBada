package forJava.practice;
import java.util.*;


public class Solution {
	
	public int solution(int n) {
		int answer = 0;
		
		int before  = Integer.bitCount(n);
		int compare = 0;
		while(true) {
			n++;
			compare = Integer.bitCount(n);
			if(before == compare) {
				answer = n;
				break;
			}
			
		}
		return answer;
	}
}


