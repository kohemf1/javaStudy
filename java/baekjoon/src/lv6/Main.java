package lv6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0; 
		
		for(int i = 0; i < arr.length+1; i++) {
			
			sum += i;
			
		}
		System.out.println(sum);
	}

}
