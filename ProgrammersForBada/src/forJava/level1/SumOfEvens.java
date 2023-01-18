package forJava.level1;

import java.util.*;

/*
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성.
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
public class SumOfEvens {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// n은 0이상 3000이하의 정수
		// n의 약수의 특징 => 1. 0으로 나누어 떨어진다. 2. 끝까지 루핑을 돌 필요가 있는지
		int retry;	
		do {
			int sum = 0;	// 합계를 더할 값. 
			
			System.out.println("n을 입력하세요");
			int n = scn.nextInt(); 
			for(int i = 1; i<= n/2; i++) {
				if(n % i == 0){
					sum += i;
				}
			}
			sum += n;
			System.out.println("정수 n의 모든 약수들의 합: " + sum);
			System.out.println("다시 하시겠어요? 1. 예  0. 아니오");
			retry = scn.nextInt();
		}while(retry != 0);
	}
}
