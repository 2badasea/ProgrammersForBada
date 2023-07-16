package forJava.level1;

public class ThreeMembers {

	public static void main(String[] args) {
		ThreeMembers tm = new ThreeMembers();
		int[] test1 = { -2, 3, 0, 2, -5};
		int[] test2 = { -3, -2, -1, 0, 1, 2, 3};
		int[] test3 = { -1, 1, -1, 1 };
		System.out.println(tm.solution(test1)); // 2
		System.out.println(tm.solution(test2));	// 2	
		System.out.println(tm.solution(test3));	// 5
	}
	
	public int solution(int[] number) {
        // 삼총사를 만들 수 있는 경우의 수
		int answer = 0;
		
		int sum = 0;
		for(int i = 0; i< number.length-2; i++) {
			for(int j = i + 1; j<number.length-1; j++){
				for(int k = j + 1; k<number.length; k++) {
					sum = number[i] +  number[j] + number[k];
					if(sum == 0) {
						answer++;
					}
				}
			}
		}
        return answer;
    }
}
