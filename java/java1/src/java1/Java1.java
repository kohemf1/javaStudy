package java1;

import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		
		// 구구단 만들기
		
//		for(int i = 1; i < 10; i++)	{
//			for(int j = 1; j < 10; j++) {
//				System.out.println
//				(i + "단 :" + i + " * " + j + " = " + i*j);
//				
//			}
//		}
		
		System.out.println("출력할 단 입력 : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int j = 1; j < 10; j++ ) {
			System.out.println
			(i + "단 :" + i + " * " + j + " = " + i*j);
		}
		
	}

	
}
