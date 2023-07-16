package forJava.practice;

import java.util.*;

public class ReviewClass {

	public static void main(String[] args) {
		ReviewClass rc = new ReviewClass();
		System.out.println(rc.solution(5, 24));
	}

	public String solution(int a, int b) {
		int year = 2016;
		boolean 윤년 = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0) ? true : false;
		System.out.println(윤년);
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (윤년)
			days[1] = 29;

		int allDays = 0;
		if (a > 1) {
			for (int i = 0; i < a - 1; i++) {
				allDays += days[i];
			}
			allDays = allDays + b - 1;
		} else {
			allDays = b - 1;
		}

		String[] dates = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };

		return dates[allDays % 7];
	}
}