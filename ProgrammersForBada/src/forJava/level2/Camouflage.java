package forJava.level2;

import java.util.HashMap;

/*
 * 위장 (해시) 
 * 스파이가 가진 의상들이 담긴 2차원 배열 clothes => 서로 다른 옷의 조합의 수를 return 시키기.
 * https://school.programmers.co.kr/learn/courses/30/lessons/42578
 */
public class Camouflage {
	// 2차원 배열 => 행에는 의상의 종류/ 의상의 이름  String[종류][이름] clothes
	// 의상의 수는 1개 이상 30개이하
	// 같은 이름을 가진 의상은 존재하지 않음.
	// 모든 원소는 문자열로 이루어짐
	// 모든 문자열의 길이는 1이상 20이하인 자연수이고, 알파벳 소문자 또는 '_'로만 이루어져 있음.
	// 스파이는 하루에 최소 한 개의 의상은 입는다. 
	
	// 1. 이중 for문 => 중복 제외, 행이 중복이라도 열도 중복되어서는 안 되고, 각 행에서는 한 개씩만 pick 
	// 2. HashMap을 사용한 이유? 어떤 점에서 편해서? => key:value형태로 쪼개서, 조합을 구하기에 편리.
	// 3. 문제 구조를 이해하지 못 햇ㅇ므. 
	public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String,Integer> map = new HashMap<>();
        for(String[] clothe : clothes){
            String type = clothe[1]; 
            map.put(type, map.getOrDefault(type, 1) + 1);
        }
        
        for(String key : map.keySet()){
            answer *= map.get(key);
        }
        
        answer--;
        return answer;
	}
}
