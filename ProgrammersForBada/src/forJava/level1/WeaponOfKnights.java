package forJava.level1;

public class WeaponOfKnights {

	public static void main(String[] args) {
		WeaponOfKnights wk = new WeaponOfKnights();
		int result1 = wk.solution(5, 3, 2);
		System.out.println("예상 10, 결과 " + result1);
		int result2 = wk.solution(10, 3	, 2);
		System.out.println("예상 21, 결과 " + result2);
	}
//	public int solution(int number, int limit, int power) {
//		int answer = 0;
//		for(int i = 1; i<=number; i++) {
//			// 마지막 약수인 자기 자신 1개를 미리 count
//			int total = 1;
//			for(int j = 1; j<=i/2; j++) {
//				if(i%j == 0) {
//					total++;
//				}
//				if(total>limit) {
//					total = power;
//					break;
//				}
//			}
//			answer += total;
//		}
//		return answer;
//	}
	
	public int solution(int number, int limit, int power) {
		int answer = 0;
		for(int i = 1; i<=number; i++) {
			answer += calDiviors(i) > limit ? power : calDiviors(i);
		}
		return answer;
	}
	
	static int calDiviors(int num) {
		int total = 0;
		for(int i = 1; i<=Math.sqrt(num); i++) {
			if(num % i ==0) {
				if(i == Math.sqrt(num)) {
					total++;
				}else {
					total += 2;
				}
			}
		}
		return total;
	}
	
}
