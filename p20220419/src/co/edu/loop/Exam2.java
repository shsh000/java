package co.edu.loop;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {

		// 1. 최소, 최대 값 구하기
		// => 스캐너 사용하여 3개 받기/최대값, 최소값을 구해보는 반복문
		Scanner sc = new Scanner(System.in);
		int first, second, third, max, min;
		System.out.println("데이터 입력 1");
		first = sc.nextInt();
		System.out.println("데이터 입력 2");
		second = sc.nextInt();
		System.out.println("데이터 입력 3");
		third = sc.nextInt();

		max = first; // min 구하는 방법
		if(max < second) {
			max = second;
		}
		if(max < third) {
			max = third;
		}

		// 2. 두 주사위를 던졌을때 주사위 합이 6인 데이터 출력
		// => 두 주사위 -> 데이터 2개 -> 합이 6
		for (int i = 0; i <= 100; i++) {
			int randomValue = (int) (Math.random() * 6) + 1;
			int randomValue2 = (int) (Math.random() * 6) + 1;
			if (randomValue + randomValue2 == 6) {
				System.out.println("주사위 : " + randomValue + "," + randomValue2 + "=" +(randomValue+randomValue2));
			}

			// 3. 피보나치 수열
			// => while문 사용(while(value<50)) -> 예시 1, 2, 3, 5, 8, 13
			int num1 = 1;
			int num2 = 2;
			int num3 = 0;
			while (num3 < 50) {
				num3 = num1 + num2;
				System.out.println(num1 + "," + num2 + "=" + num3);
				num1 = num2;
				num2 = num3;
			}

		}

	}
}
