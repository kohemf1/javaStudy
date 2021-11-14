package lv4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//두 정수 A와 B를 입력받은 다음, 
		//A+B를 출력하는 프로그램을 작성하시오.
		
//		int a;
//		int b;
//		Scanner sc = new Scanner(System.in);		
//		while(true) {
//			
//			a = sc.nextInt();
//			b = sc.nextInt();
//			if(a == 0 && b==0) {
//				break;
//			}
//			System.out.println(a+b);
//		}
		
//		int a;
//		int b;
//		Scanner sc = new Scanner(System.in);		
//		while(sc.hasNextInt()) {
//			
//			a = sc.nextInt();
//			b = sc.nextInt();
//			System.out.println(a+b);
//		}		
//		sc.close();
//		
		
		// https://www.acmicpc.net/problem/1110 
		// 백준 1110번 문제풀이
		

		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		sc.close();
		
		int cnt=0;
		int result = a;
		
		while(true) {
			
			a = ((a%10)*10)+(((a/10)+(a%10))%10);
			cnt++;
			
			if(a == result) {
				break;
			}
			
		}
		System.out.println(cnt);
		
		
	}

}
