package forJava.level2;

import java.util.Arrays;

// 귤 고르기
// https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class SelectOrange {

	public int solution(int k, int[] tangerine) {
		// 크기 별로 몇 개 있는지 정렬.
		int max1 = max(tangerine);
		System.out.println("배열 요소의 최대값: " + max1);
		int[] sizeSortAry = new int[max1 + 1];
//		int max = Arrays.stream(tangerine).max().getAsInt();
//		System.out.println("배열 요소의 최대값: " + max);
//		int[] sizeSortAry = new int[max + 1];

		for(int i = 0; i<tangerine.length; i++) {
			sizeSortAry[ tangerine[i]]++;
		}
		// 오름차순으로 정렬
		Arrays.sort(sizeSortAry);
		
		// k개를 선택
		int answer = 0;
		for(int i = sizeSortAry.length-1; i>=0; i--) {
			if( k == 0) break;
			
			if(sizeSortAry[i] <= k) {
				k -= sizeSortAry[i];
				answer++;
			}else {
				answer++;
				break;
			}
		}
		return answer;
	}
	
	public static int max(int[] array) {
	    int max = array[0]; // 배열의 첫 번째 요소를 최대값으로 초기화
	    for (int i = 1; i < array.length; i++) {
	        if (array[i] > max) {
	            max = array[i]; // 더 큰 값을 찾으면 최대값을 갱신
	        }
	    }
	    return max; // 최대값 반환
	}

	public static void main(String[] args) {
		SelectOrange so = new SelectOrange();
		int[] test1 = {1,3,2,5,4,5,2,3};
		System.out.println("답: " + so.solution(6, test1));  // 3
		int[] test2 = {1, 3, 2, 5, 4, 5, 2, 3};
		System.out.println("답: "  + so.solution(4, test2));  // 2
		int[] test3 = {1, 1, 1, 1, 2, 2, 2, 3}; 
		System.out.println("답: "  + so.solution(2, test3));  // 1
	}

}
