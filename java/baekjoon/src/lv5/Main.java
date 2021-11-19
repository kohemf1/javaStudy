package lv5;

import java.util.Arrays;
import java.util.HashSet;
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
//		Arrays.sort(arr); // 배열을 오름차순으로 정렬
//		System.out.println(arr[0]+" "+arr[N-1]);
		
//		// 9개의 자연수가 주어질때 최댓값을 찾고 최댓값이 몇번째 수인지 구하여라
//		
//		//int n;
//		Scanner sc = new Scanner(System.in);
//		//n = sc.nextInt();
//		
//		int n = 9;
//		
//		int[] arr = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		
//		int count = 0;
//		int max = 0;
//		int index = 0;
//		
//		for(int value : arr) {
//		// arr 배열에서 차례대로 value에 값을 넣겠다.
//		count++;
//			
//			if(value > max) {
//				max = value;
//				index = count;
//			}
//		}
//		
//		System.out.print(max +"\n"+index);		
		
//		//세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에
//		//0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//		//예를 들어 A = 150, B = 266, C = 427 이라면 
//		//A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
//		//계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int value = (sc.nextInt() * sc.nextInt()*sc.nextInt());
//		String num = Integer.toString(value);
//		
//		for(int i = 0; i < 10; i++) {
//			int count = 0;
//			for(int j =0; j < num.length(); j++ ) {
//				if((num.charAt(j)-'0') == i) {
//					count++;
//				}
//			}
//			sc.close();
//			System.out.println(count);
//		}
			
//		//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
//		//예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//		//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
//		//그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> remain = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			remain.add(sc.nextInt()%42);
		}
		sc.close();
		System.out.println(remain.size());
		
		
		
	}

}
