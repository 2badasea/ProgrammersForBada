package forJava.level1;

import java.util.Scanner;

/*
 * 직사각형 별찍기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12969
 */
public class SquareStar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scn.close();
	}
}
