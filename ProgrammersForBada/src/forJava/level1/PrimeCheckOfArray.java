package forJava.level1;
import java.util.*;

/*
 * 소수만들기 => 배열에서 임의의 3개의 합이 소수가 되는 경우의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12977
 */
public class PrimeCheckOfArray {
	
	public static void main(String[] args) {
		// Math.random() 메서드는 0.0~1.0 사이의 범위에 속하는 double형 수를 반환.
		int answer = 0;
		int arySize =  (int) (Math.random()*10 + 1);
		int[] ary = new int[arySize];
		// 배열 요소 채우기 
		for(int i = 0; i<arySize; i++) {
			ary[i] = (int) (Math.random()* 15 + 1);
		}
		
		for(int m = 0; m<ary.length; m++) {
			for(int n = m+1; n<ary.length; n++) {
				for(int o = n+1; o<ary.length; o++) {
					if(m != n && m!= o && n!= o) {
						System.out.println("m:"+m +", n: " +n +", o: " +o);
						int k = ary[m] + ary[n] + ary[o];
						if(isPrimeNumber(k)) {
							System.out.println("이때 k:" + k);
							answer ++;
						}
					}
				}
			}
		}
		System.out.println("총 갯수: " + answer);
	}
	
	static boolean isPrimeNumber(int sum) {
			for(int cnt = 2; cnt<= (int) Math.sqrt(sum); cnt++) {
				if(sum % cnt == 0) {
					return false;
				}
			}
			return true;
	}
}
