package step3_01.arrayAdvance;

import java.util.Arrays;

// 배열의 주소

public class ArrayEx33 {
	
	public static void main(String[]args) {
		
		int[] arr = {12, 55, 34, 67 ,53};
		int[] temp = arr;
		System.out.println("arr : " +arr);
		System.out.println("temp : " +temp);
		System.out.println();
		
		
		arr[0] = 0;
		temp[1] =0;
		arr[2]	=0;
		temp[3]	=0;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		System.out.println();
	}
}
