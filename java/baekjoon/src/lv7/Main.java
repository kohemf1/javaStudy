package lv7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
//		//주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String a = sc.nextLine();
//		
//		int b = a.charAt(0);
//		
//		System.out.println(b);
//		
		
		//N개의 숫자가 공백 없이 쓰여있다. 
		//이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += num.charAt(i)-'0';//아스키코드값 반환떄문에 -0해준다
		}
		
		System.out.println(sum);
		
	}

}
