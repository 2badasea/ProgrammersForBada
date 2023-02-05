package forJava.level1;

/*
 * 하샤드 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class HashadNumber {

	public boolean solution(int x) {
		int temp = x;
		int sum = 0;
		while (x > 0) {
			sum += x % 10;
			x = x / 10;
		}
		System.out.println("sum의 합: " + sum);

		return (temp % sum) == 0 ? true : false;
	}

	public static void main(String[] args) {
		HashadNumber hn = new HashadNumber();
		System.out.println(hn.solution(10)); // true
		System.out.println(hn.solution(13)); // false
	}
}

/*
 * String[] temp = String.valueOf(num).split("");
 * 
 * int sum = 0; for (String s : temp) { sum += Integer.parseInt(s); }
 * 
 * if (num % sum == 0) { return true; } else { return false; } }
 */
