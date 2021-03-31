package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx38_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[][] apt = { { 101, 102, 103 }, { 201, 202, 203 }, { 301, 302, 303 } };

		int[][] pay = { { 1000, 2100, 1300 }, { 4100, 2000, 1000 }, { 3000, 1600, 800 } };

		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		
		for (int i = 0; i < 3; i++) {
			int tot = 0;
			for (int j = 0; j < 3; j++) {
				tot += pay[i][j];
			}
			System.out.println((i + 1) + ".층의 관리비 = " + tot + "원");
		}

		
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예 2) 입력 : 202 관리비 출력 : 2000
		
		System.out.print("호 입력 : ");
		int ho = scan.nextInt();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ho) {
					System.out.println(ho + "의 관리비 = " + pay[i][j] + "원");
				}
			}
		}

		
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		
		int maxNum = pay[0][0];
		int idx1 = 0, idx2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (maxNum < pay[i][j]) {
					maxNum = pay[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("가장 많이 나온 집(" + apt[idx1][idx2] + ")");

		int minNum = pay[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (minNum > pay[i][j]) {
					minNum = pay[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("가장 적게 나온 집(" + apt[idx1][idx2] + ")");

		
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		System.out.print("호1 입력 : ");
		int ho1 = scan.nextInt();
		System.out.print("호2 입력 : ");
		int ho2 = scan.nextInt();

		int idx1_i = 0, idx1_j = 0;
		int idx2_i = 0, idx2_j = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ho1) {
					idx1_i = i;
					idx1_j = j;
				}
				if (apt[i][j] == ho2) {
					idx2_i = i;
					idx2_j = j;
				}
			}
		}

		int temp = pay[idx1_i][idx1_j];
		pay[idx1_i][idx1_j] = pay[idx2_i][idx2_j];
		pay[idx2_i][idx2_j] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}


	}

}
