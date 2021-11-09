package lv3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 
		// 출력 형식에 맞춰서 출력하면 된다
		
//		int a;
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++ ) {
//			System.out.println(a +" * "+i+" = "+ a*i);
//		}
		
		
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		int a;
//		int b;
//		int T;
//		Scanner sc = new Scanner(System.in);
//
//		T = sc.nextInt();
//		
//		for(int i = 0; i < T; i++) {
//			a = sc.nextInt();
//			b = sc.nextInt();
//			System.out.println(a + b);
//		}
		
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i < n+1; i++) {
			sum += i;
			
		}
		
		System.out.println(sum);
	}
	
}
