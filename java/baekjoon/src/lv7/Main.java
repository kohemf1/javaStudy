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
		
//		//N개의 숫자가 공백 없이 쓰여있다. 
//		//이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		String num = sc.next();
//		int sum = 0;
//		
//		for(int i = 0; i < N; i++) {
//			sum += num.charAt(i)-'0';//아스키코드값 반환떄문에 -0해준다
//		}
//		
//		System.out.println(sum);
		
		//각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, 
		//... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

		//만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 
		//단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr = new int[26]; // 알파벳 26개
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = -1; // -1을 기본으로 둠
//		}
//		
//		String a = sc.nextLine();
//		for(int i = 0; i < a.length(); i++) {
//			
//			char b = a.charAt(i);
//					
//			if(arr[b - 'a'] == -1) {// 아스키 코드'a' or 97를빼준다
//				// 중복된 문자가 있을때 맨 처음걸로 출력하기 위해 if를 사용
//				// b가 a일때 arr[0] 은 알파벳 a 이고  기본값이 -1이기 때문에
//				// if문에 충족해지고 밑에를 활용하여 a자리에 i값이 들어가게된다.
//				arr[b - 'a'] = i;
//			}
//		}
//		
//		for(int val : arr) { // 배열출력
//			System.out.print(val + " ");
//		}
		
		
		// indexOf를 사용하면 더쉽게 풀수있음 풀어보기
		
//		Scanner sc = new Scanner(System.in);
//		
//		String a = sc.next();
//		for(char i = 'a'; i <='z'; i++) {
//			System.out.print(a.indexOf(i)+" ");
//			// indexof 함수는 문자열에서 특정 문자열을 찾고, 검색된 문자열이
//			// 첫번째로 나타나는 위치 index를 리턴
//			// 찾는 문자열이 없으면 -1 리턴 
//		}

		//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후
		//출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 
		//두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
		//S에는 QR Code "alphanumeric" 문자만 들어있다.

		//QR Code "alphanumeric" 문자는
		//0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt() ;
		String b;
		
		for(int i = 0; i < a; i++) {
			int num = sc.nextInt();
			b = sc.next();
			char c = b.charAt(0);
			
		}
		
		
	}

}
