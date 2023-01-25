package forJava.level1;
import java.util.*;

/*
 * x만큼 간격이 있는 n개의 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class NcountOfGapLikeX {

	public static void main(String[] args) {
		
	}
	
	public long[] solution(int x, int n) {
		long[] answer = new long[n];

		int cnt = 0; 
		
		do {
			answer[cnt] = (long) x*(cnt+1);
			cnt++;
		}while(cnt<n);
		
		return answer;
	}
			
		

}
