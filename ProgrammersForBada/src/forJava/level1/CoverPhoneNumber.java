package forJava.level1;

/*
 * 핸드폰 번호 가리기 (정답률 84%) 
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */
public class CoverPhoneNumber {

	public String solution(String phone_number) {

		char[] ary = phone_number.toCharArray();

		for (int i = 0; i < ary.length - 4; i++) {
			ary[i] = '*';
		}
		return String.valueOf(ary);
	}

	public static void main(String[] args) {
		CoverPhoneNumber cp = new CoverPhoneNumber();
		System.out.println(cp.solution("01033334444")); // "*******4444"
		System.out.println(cp.solution("027778888")); // "*****8888"
	
		String test = "01012345678"; 
		System.out.println( test.substring(test.length()-4));	// 5678
		System.out.println( test.substring(0, test.length()-4));  // 0101234
	}

}
