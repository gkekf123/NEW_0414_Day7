package day07_0414;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {

		/* 
		 * 금액의 동전 - 
		 * 금액 X가 주어졌을 때, 큰 금액부터 거슬러서 몇개가 나와야 하는지 출력
		 * 예시)
		 */
		
		int[] arr = {1000, 500, 100, 50, 10};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액>");
		int money = sc.nextInt();
		
		for(int i = 0; i<arr.length; i++ ) {
		System.out.println(arr[i] +  "원: " + money / arr[i] );
		money %= arr[i];	//나머지 저장
		}
		
		
	}

}
