package day07_0414;

import day02_0407.Array;

public class ArrayBasic03 {

	public static void main(String[] args) {
		
		// 배열은 크기가 고정
		// 크기가 100인 배열에 1~100까지의 수를 저장
		
		int[] arr = new int[100]; 
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		//배열 요소의 문자열 합
		String str = " ";
		for(int i = 0; i<arr.length; i++) {
			str += arr[i] + " ";
		}
		System.out.println(str);
		
	}

}
