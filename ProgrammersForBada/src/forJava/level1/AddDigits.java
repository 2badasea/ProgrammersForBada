package forJava.level1;
import java.util.*;

/*
 * 자연수 N이 주어지면, N의 각 자리의 수를 합한 결과를 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class AddDigits {
	
	public static void main(String[] args) {
			
		System.out.println("첫 번째: " + solution(123));
		System.out.println("두 번째: " + solution(1442));
		System.out.println("세 번째: " + solution(61));
	}
	
	static int solution(int n) {
		int answer = 0;
		
		do {
			answer += n%10;
			n /= 10;
		}while(n!=0);
		
		return answer;
	}
}
