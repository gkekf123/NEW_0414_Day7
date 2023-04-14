package day07_0414;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {

		//	배열(변수의 집합 or 데이터 타입)
		//	선  언  ->	 int[] arr;
		//	생  성  ->	 arr = new int[5]
		//	초 기 화 -> 	arr[0] = 1;	1을 배열 0번째 인덱스에 대입
		
		//1. 배열
			int[] arr;
		
		//2. 배열의 생성
			arr = new int[5];
		
		//3. 배열의 초기화
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			arr[4] = 50;
		
		//4. 배열의 모형을 문자열로 출력
			System.out.println(arr);	// 주소값(배열의 생성위치)
		
			System.out.println(Arrays.toString(arr));
		
		//5. 배열 값의 변경
			arr[2] = 100;
			System.out.println(Arrays.toString(arr));
		
		//6. 배열의 길이
			System.out.println("배열의 길이는 : " + arr.length);
		
		//7. 배열을 선언하는 다양한 방법
			//1st
			int[] arr2 = new int[3];
		
			//2st
			int [] arr3 = new int[] {1,2,3};
		
			//3st
			int[] arr4 = {1,2,3};
	
		//8. 배열은 초기값을 지정하지 않으면 기본값으로 자동초기화
		//int = 0, double = 0.0, String = null
		
	}

}
