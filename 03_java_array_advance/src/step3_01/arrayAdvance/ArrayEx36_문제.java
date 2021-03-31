package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx36_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
				//System.out.println(arr[i][j]); = 10~90
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스1입력해주세요 : ");
		int indexNum1 = scan.nextInt();
		System.out.print("인덱스2입력해주세요 : ");
		int indexNum2 = scan.nextInt();
		System.out.println(arr[indexNum1][indexNum2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		int indx1 = 0;
		int indx2 = 0;
		
		System.out.print("값입력:");
		int sum =scan.nextInt();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == sum){
					indx1 = i;
					indx2 = j;
				}
			}
		}
			System.out.println("인덱스1출력 :" +indx1);
			System.out.println("인덱스2출력 :"+	indx2);
			arr[indx1][indx2] =scan.nextInt();		
		
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		// 문제 4) 값 2개를 입력받아 값 교체



		//숙제
	}
	
}
