package lenshu2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Practice1 {

	public static void main(String[] args) throws IOException {

		/*
		 * 1.문장을 10번 출력하기 2.구구단 2단을 출력하기 3.2의 거듭제곱을 출력하기 4.1~10까지의 합을 구하는 프로그램 5.사용자가
		 * 입력한 n단을 역순으로 출력하는 프로그램 6.1~500까지 짝수의 합 구하기 7.양의 정수 n 이하인 k의 배수를 모두 찾아 출력하는
		 * 프로그램 8.구구단 2~9단 모두 출력하기 9.크거나, 같거나, 작거나 알려주는 프로그램 10.시간에 따라 달라지는 랜덤 숫자 출력 함수
		 */

		// 1.문장을 10번 출력하기
		for (int i = 0; i < 10; i++) {
			System.out.println("문장" + (i + 1) + "회 출력");
		}
		// 2.구구단 2단을 출력하기
		int a = 2;
		int b;
		for (int i = 1; i <= 9; i++) {
			b = a * i;
			System.out.println(a + " x " + i + " = " + b);
		}
		// 3.2의 거듭제곱을 출력하기
		// 2 1 = 2, 2 2 = 4, 2 3 = 8, 2 4 16
		int c = 2;
		for (int i = 0; i < 10; i++) {
			c *= 2;
			System.out.println("2의 " + (i + 1) + "승은 " + c);
		}
		// 4.1~10까지의 합을 구하는 프로그램
		int d = 0;
		for (int i = 1; i <= 10; i++) {
			d = d + i;
		}
		System.out.println("1~10의 합은 " + d);
		// 5.사용자가 입력한 n단을 역순으로 출력하는 프로그램
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("역순으로 출력할 수 입력(1~9)");
		int f = Integer.parseInt(br.readLine());
		for (int i = 9; i > 0; i--) {
			int g = f * i;
			System.out.println(f + " * " + i + " = " + g);
		}
		// 6.1~500까지 짝수의 합 구하기
		int h = 0;
		for (int i = 0; i < 500; i++) {
			if (i % 2 == 0) {
				h = h + i;
			}
		}
		System.out.println("1~500 짝수의 합 " + h);
		// 7.양의 정수 n 이하인 k의 배수를 모두 찾아 출력하는 프로그램
		System.out.print("양의 정수 n 이하 n 입력");
		int j = Integer.parseInt(br.readLine());
		System.out.print("k의 배수 k 입력");
		int k = Integer.parseInt(br.readLine());
		int l = 0;
		boolean m = true;
		while (m) {
			l = l + k;
			System.out.println(l);
			if (l > j) {
				m = false;
			}
		}

		// 8.구구단 2~9단 모두 출력하기
		int n;
		for (int i = 2; i <= 9; i++) {
			for (int i2 = 1; i2 <= 9; i2++) {
				n = i * i2;
				System.out.println(i + "x" + i2 + "=" + n);
			}
		}

		// 9.크거나, 같거나, 작거나 알려주는 프로그램
		System.out.println("수 입력 1");
		int o = Integer.parseInt(br.readLine());
		System.out.println("수 입력 2");
		int p = Integer.parseInt(br.readLine());
		if (o == p) {
			System.out.println("같습니다");
		} else if (o < p) {
			System.out.println(o + "이(가)" + p + "보다 작습니다");

		} else if (o > p) {
			System.out.println(o + "이(가)" + p + "보다 큽니다");

		}

		// 10.시간에 따라 달라지는 랜덤 숫자 출력 함수
		Date r = new Date();
		System.out.println("현재시간 : " + r);
		System.out.println((int) Math.random());
		
		/*
		 * 8번 문제 마지막 비교 후 연산을 한번 덜 되게 하려면 어떻게 해야하는가?
		 * 
		 * 10번 BufferedReader로 문자열을 받은 걸 문자로 변환하고 
		 * 그 문자를 조건문에 넣어서 true면 
		 * 이 문자를 아스키코드와 비교해서 sysout을 출력할 수 있는가?
		 * */

	}

}
