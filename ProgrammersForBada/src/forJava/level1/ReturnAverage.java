package forJava.level1;
import java.util.*;

/*
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수.
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */
public class ReturnAverage {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		double result = solution(arr);
		System.out.println("평균은 : " + result);
	}
	
	static double solution(int[] arr) {
		// 이번에는 향상된 for문 사용해보기. 
		double sum = 0;  
		for(int in : arr) {
			sum += in;
		}
		double returnValue = sum/arr.length;
		
		
		return returnValue;
	}
}
