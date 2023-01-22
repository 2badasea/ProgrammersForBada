package forJava.level2;

import java.util.*;

public class Sample {
	
	public static void main(String[] args) {
		System.out.println("Test");
	}
	
	private static int solution(String[][] clothes) {
		int answer = 1;
		
		// (아이템 이름, 아이템의 카테고리) => 형식으로 구성된 2차원 배열 파라미터.
		// 옷을 입는 모든 경우의 수, 최소 의상 한 개씩 입음. 서로 다른 조합의 수.
		HashMap<String, Integer> map = new HashMap<>();
		
		// 넘어온 2차원 배열을 반복문을 통해서 map 구조에 넣어야 한다. 카테고리와 아이템 이름으로. 
		for(String[] clothe : clothes) {
			// 행 단위로 데이터를 받는다.
			String type = clothe[1]; 
			map.put(type, map.getOrDefault(type, 1) + 1);
		}
		
        // 지금 answer는 조합을 고려하지 않았다. 단순히 몇 번 넣었는지. 
        // key(type)별의 갯수를 모두 곱해야 한다.
		for(String key :  map.keySet()){
			answer *= map.get(key);
		}
		
		answer = answer -1; 
		
		
		return answer ;
	}
}
