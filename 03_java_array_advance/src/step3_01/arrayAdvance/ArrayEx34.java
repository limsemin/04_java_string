package step3_01.arrayAdvance;

//2차원 배열

public class ArrayEx34 {

	public static void main(String[] args) {
		
		int arr[][] = new int[2][4];
		
		
		System.out.println("arr[0] : " + arr[0]);	//4개의 요소를 가진 배열의 주소값이 반환
		System.out.println("arr[1] : " + arr[1]);	//4개의 요소를 가진 배열의 주소값이 반환
		
		
		arr[0][0] =10;
		arr[0][1] =20;
		arr[0][2] =30;
		arr[0][3] =40;
				
		arr[1][0] =50;
		arr[1][1] =60;
		arr[1][2] =70;
		arr[1][3] =80;
		
		//arr[0] = {10, 20, 30, 40}
		//arr[1] = {50, 60, 70, 80}
		
		for(int i=0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		int[][] temp1 	=arr;			//2차원배열의 전체주소
		int[] temp2 	=arr[0];		//2차원 배열의 1행의 주소
		int temp3 		=arr[0][0];		//2차원 배열의 값
		
		for(int i=0; i< temp2.length; i++) {
			System.out.print(temp2[i] + " ");
		}
		
		

	}

}
