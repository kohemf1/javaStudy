package lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
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
		
//		int n;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = 1; i < n+1; i++) {
//			sum += i;
//			
//		}
//		
//		System.out.println(sum);
//		
		//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
		//다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		//String s = br.readLine();
//		//StringTokenizer st = new StringTokenizer(s);		
//		//int T = Integer.parseInt(st.nextToken());
//		StringTokenizer st;
//		int T = Integer.parseInt(br.readLine());
//		for(int i=0; i<T; i++) {
//			st = new  StringTokenizer(br.readLine());
//			bw.write((Integer.parseInt(st.nextToken())
//					+Integer.parseInt(st.nextToken()))+"\n");
//		}
//		bw.close();
		
		//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		
//		int N;
//		Scanner sc = new Scanner(System.in);
//		
//		N = sc.nextInt();
//		
//		for(int i=1; i < N+1; i++) {
//			System.out.println(i);
//		}
		
		//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//		int N;
//		Scanner sc = new Scanner(System.in);
//		
//		N = sc.nextInt();
//		
//		for(int i=N; i > 0; i--) {
//			System.out.println(i);
//		}
			
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
		
//		int T;
//		Scanner sc = new Scanner(System.in);
//		
//		T = sc.nextInt();
//		for(int i=1; i < T+1; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			System.out.println("Case #" + i +": "+ (a+b));
//		}		
		//첫째 줄에 테스트 케이스의 개수 T가 주어진다.

		//각 테스트 케이스는 한 줄로 이루어져 있으며, 
		//각 줄에 A와 B가 주어진다. (0 < A, B < 10
		
//		int T;
//		Scanner sc = new Scanner(System.in);
//		
//		T = sc.nextInt();
//		for(int i=1; i < T+1; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			System.out.println("Case #" + i +": "+ a + " + " + b + " = "+ (a+b));
//		
//			
//		}
		
		
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//		
//		int a;
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		
//		for(int i=1; i <= a; i++ ) {
//			
//			for(int k = a-i; k>0; k--) {
//				System.out.print(" ");
//			}
//			
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		
		//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
		//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < a; i++) {
			int c = sc.nextInt();
			if(c < b) {
				sb.append(c+" ");
			}
		}
		System.out.println(sb);
	}
	
}
