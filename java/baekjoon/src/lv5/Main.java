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
		
//		Scanner sc = new Scanner(System.in);
//		
//		HashSet<Integer> remain = new HashSet<>();
//		
//		for(int i = 0; i < 10; i++) {
//			remain.add(sc.nextInt()%42);
//		}
//		sc.close();
//		System.out.println(remain.size());
//		
		
//		//세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
//		//일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//
//		//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 
//		//수학점수는 50/70*100이 되어 71.43점이 된다.
//
//		//세준이의 성적을 위의 방법대로 새로 계산했을 때, 
//		//새로운 평균을 구하는 프로그램을 작성하시오.
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		double[] arr = new double[n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = sc.nextDouble();
//		}
//		sc.close();
//		
//		double sum=0;
//		Arrays.sort(arr);
//		for(int i = 0; i < n; i++) {
//			sum += ((arr[i]/arr[n-1])*100);
//		}
//		System.out.println(sum/n);
		
		//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
		//O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
		//문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
		//예를 들어, 10번 문제의 점수는 3이 된다.
		//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		
	}

}
