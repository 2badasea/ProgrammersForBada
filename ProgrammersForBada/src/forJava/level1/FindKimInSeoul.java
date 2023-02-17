package forJava.level1;

/*
 * 서울에서 김서방 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */
public class FindKimInSeoul {

	public String solution(String[] seoul) {
		int count = 0;
		for(String name : seoul) {
			if(name.equals("Kim")) {
				break;
			}
			count++;
		}
		return "김서방은 " + count + "에 있다";
	}

	public static void main(String[] args) {
		FindKimInSeoul fk = new FindKimInSeoul();
		String[] example1 = {"Jane", "Kim"};
		System.out.println(fk.solution(example1)); // "김서방은 1에 있다";
	}

}
