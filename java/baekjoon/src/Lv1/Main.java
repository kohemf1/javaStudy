package Lv1;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		
		// Hello World! 출력
//		System.out.println("Hello World!"); // 
//		
//		
//		//두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
//		System.out.println("강한친구 대한육군");
//		System.out.println("강한친구 대한육군");
		
		// 고양이 출력
//		System.out.println("\\    /\\");
//		System.out.println(" )  ( ') ");
//		System.out.println("(  /  )");
//		System.out.println(" \\(__)|");
		
		// 개 출력
//		System.out.println("|\\_/|");
//		System.out.println("|q p|   /}");
//		System.out.println("( 0 )\"\"\"\\");
//		System.out.println("|\"^\"`    |");
//		System.out.println("||_/=\\\\__|");
		
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
//		Scanner sc = new Scanner(System.in);
//		int a;
//		int b;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		System.out.println(a+b);
		
		//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//		
//		Scanner sc = new Scanner(System.in);
//		int a;
//		int b;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		System.out.println(a-b);
		
		//두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
//		Scanner sc = new Scanner(System.in);
//		int a;
//		int b;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		System.out.println(a*b);		
//		
		//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//		Scanner sc = new Scanner(System.in);
//		double a;
//		double b;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		System.out.println(a/b);
		
		//두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), 
		//A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		
//		int a,b;
//		Scanner sc = new Scanner(System.in);
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
		
		
		//(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		//(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		//세 수 A, B, C가 주어졌을 때, 
		//위의 네 가지 값을 구하는 프로그램을 작성하시오.
		
//		int a,b,c;
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		System.out.println((a+b)%c);
//		System.out.println(((a%c) + (b%c))%c);
//		System.out.println((a*b)%c);
//		System.out.println(((a%c) * (b%c))%c);
//		
		
		//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//				472	(1)
//			x	385	(2)
//				2360(3)
//			   3776	(4)
//			  1416	(5)
//			  181720(6)
		//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
		//(3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a * (b%10));
		System.out.println(a * (b%100/10));
		System.out.println(a * (b/100));
		System.out.println(a * b);
	
	}
		
}
