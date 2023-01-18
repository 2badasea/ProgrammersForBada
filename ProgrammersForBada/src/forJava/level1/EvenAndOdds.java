package forJava.level1;
import java.util.*;
/*
 * 짝수와 홀수 https://school.programmers.co.kr/learn/courses/30/lessons/12937
 */
public class EvenAndOdds {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 정수 num이 짝수일 경우 "Even" 반환, 홀수인 경우 Odd를 반환
		int retry;
		do {
			System.out.println("확인하고 싶은 숫자");
			int num = scn.nextInt();
			String result = (num % 2) == 0 ? "짝수입니다." : "홀수입니다.";
			System.out.println(result);
			System.out.println("다시 하시겠어요? 1. 네  2. 아니오");
			retry = scn.nextInt();
		}while(retry != 0);
		
		System.out.println("종료");
		
	}
}
