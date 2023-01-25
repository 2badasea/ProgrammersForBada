package forJava.level1;
import java.util.*;

/*
 * 정수 제곱근 판별
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */
public class IntegerSquareRootJudge {
	static Scanner scn = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int n = scn.nextInt();
		System.out.println( (int) Math.pow(n, 3));
	}
	
	public long solution(long n) {
		if( Math.pow((int) Math.sqrt(n), 2) == n) {
			return (long) Math.pow(Math.sqrt(n) + 1, 2);
		} 
		
		return -1;
	}
	
}
