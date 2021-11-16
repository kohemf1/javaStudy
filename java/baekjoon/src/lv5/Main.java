package lv5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		//N개의 정수가 주어진다. 
//		//이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//		
//		int N;
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt();
//		
//		int[] arr = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			arr[i] = sc.nextInt();
//		}
//		sc.close();
//		Arrays.sort(arr);
//		System.out.println(arr[0]+" "+arr[N-1]);
		
		// 9개의 자연수가 주어질때 최댓값을 찾고 최댓값이 몇번째 수인지 구하여라
		
		//int n;
		Scanner sc = new Scanner(System.in);
		//n = sc.nextInt();
		
		int n = 9;
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		for(int value : arr) {
			count++;
			
			if(value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.print(max +"\n"+index);		
		
	}

}
