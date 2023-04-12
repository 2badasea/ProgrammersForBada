package forJava.level2;

import java.util.Arrays;

/*
 * 귤 고르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476
 */
public class ChooseOrange {
	
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // 배열을 생성해서 각 인덱스에 +1을 해주는 방식
        int[] tempAry = new int[tangerine.length + 1];
        for(int i = 0; i<tangerine.length; i++) {
        	tempAry[tangerine[i]]++;
        }
        
        Arrays.sort(tempAry);
        
        int sum = 0;
        for(int i =tempAry.length -1; i>=0; i--) {
        	if(tempAry[i] <= k- sum || tempAry[i] != 0) {
        		sum += tempAry[i];
        		answer++;
        		if(sum == k) {
        			break;
        		}
        	}else {
        		return 1;
        	}
        }
        return answer;
    }
	
	
	public static void main(String[] args) {
		int testK = 6;
		int[] testAry = {1, 3, 2, 5, 4, 5, 2, 3};  // 3
		System.out.println(ChooseOrange.solution(testK, testAry));
		
		int testK2 = 4;
		int[] testAry2 = {1, 3, 2, 5, 4, 5, 2, 3}; // 2
		System.out.println(ChooseOrange.solution(testK2, testAry2));
		
		int testK3 = 2;
		int[] testAry3 = {1, 1, 1, 1, 2, 2, 2, 3}; // 1
		System.out.println(ChooseOrange.solution(testK3, testAry3));
	}
}
