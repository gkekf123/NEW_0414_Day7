package day07_0414;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {

		
		
		/* 
		 * 1. 1~9까지 절대 중복되지 않는 숫자를 추출
		 * 	arr를 랜덤하게 10번 섞어준다
		 * 	0~2번째 값을 새로운 배열로 옮겨 담는다.
		 */
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 1; i <= 10; i++) {
			int a = (int)(Math.random() * 9);
			int b = (int)(Math.random() * 9);
			
			int temp = 0;
			
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		int [] arr1  = new int[3];
		
		for(int i = 0; i <arr1.length; i ++) {
			arr1[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
	}

}
