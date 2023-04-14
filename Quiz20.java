package day07_0414;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int [] arr = new int[n];
//		int max = -1000000;
//		int min = 1000000;
//		
//		for(int i = 0; i < n; i++) {
//			arr[n] = sc.nextInt();
//			
//			
//			if(max < arr[n]) {
//				max = arr[n];
//			}
//			if(min > arr[i]) {
//				min = arr[n];
//			}
//			
//		}	
//		System.out.println("최솟값 : "  + min + " 최댓값 : " + max);
		
		
		int a = sc.nextInt();
		int[] arr = new int[a];	//크기가 a인 배열
		
		int i = 0;
		while(i < arr.length) {
			arr[i] = sc.nextInt();
			i++;
		}
		//최소 최대 결정
		int min = arr[0];
		int max = arr[0];
		
		i = 0;
		while(i < arr.length) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
			i++;
		}
		System.out.println("최댓값 : " + max + " 최솟값 : " + min);
		
		
	}

}
