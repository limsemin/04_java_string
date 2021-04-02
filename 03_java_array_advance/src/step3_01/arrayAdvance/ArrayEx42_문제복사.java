package step3_01.arrayAdvance;

import java.util.Scanner;

// #오목

public class ArrayEx42_문제복사 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int omokSize =10;
		int [][]omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		
		};
		int p1x  = 0;
		int p2x  = 0;
		int p1y	 = 0;
		int p2y	 = 0;
		int turn = 0;
		int win  = 0;
		
		while(true) {
			System.out.println("\n");
			System.out.println("------------오목게임------------");
			System.out.print("");
			System.out.print("  ");
			for(int i = 0; i<omokSize; i++) {
				System.out.print(i+"  ");
			}
			System.out.println();  
			for(int i = 0; i<omokSize; i++) {
				System.out.print(i+" ");
				for(int j=0; j<omokSize; j++) {
					System.out.print(omok[i][j]+"  ");
				}
				System.out.println();
			}
			if(win == 1) {
				System.out.println("1번승리");
				break;
			}
			if(win == 2) {
				System.out.println("2번승리");
				break;
			}
			
			
			
			if(turn % 2 ==0) {
				System.out.println();
				System.out.println("★★★★★★★★★★P1차례★★★★★★★★★★");
				System.out.print("p1 X좌표 입력: ");
				p1x = scan.nextInt();
				System.out.print("p1 Y좌표 입력: ");
				p1y = scan.nextInt();
				if(omok[p1x][p1y] == 0) {
					omok[p1x][p1y] = 1;
					// turn = turn + 1;
					// turn += 1;
					turn++;
				}
			}
			
			else if(turn % 2 ==1) {
				System.out.println();
				System.out.println("★★★★★★★★★★P2차례★★★★★★★★★★");
				System.out.print("p2 X좌표 입력: ");
				p2x = scan.nextInt();
				System.out.print("p2 Y좌표 입력: ");
				p2y = scan.nextInt();
				if(omok[p2x][p2y] ==0) {
					omok[p2x][p2y]=2;
					turn++;
				}
			}
			//가로축 
			for(int i=0; i<omokSize-4; i++) {
				for(int j=0; j<omokSize; j++) {
					if(omok[i][j] == 1 && omok[i][j + 1] == 1 && omok[i][j + 2] == 1 && omok[i][j + 3] == 1 && omok[i][j + 4] == 1)win= 1;
					if(omok[i][j] == 2 && omok[i][j + 1] == 2 && omok[i][j + 2] == 2 && omok[i][j + 3] == 2 && omok[i][j + 4] == 2)win= 2;
					
				}
			}
			//세로축
			for(int i=0; i<omokSize-4; i++) {
				for(int j=0; j<omokSize;j++) {
					if(omok[i][j] == 1 && omok[i + 1][j] == 1 && omok[i + 2][j] == 1 && omok[i + 3][j] == 1 && omok[i + 4][j]== 1)win= 1;
					if(omok[i][j] == 2 && omok[i + 1][j] == 2 && omok[i + 2][j] == 2 && omok[i + 3][j] == 2 && omok[i + 4][j]== 2)win= 2;
				
				}	
			}
			//대각선
			for(int i=0; i<omokSize-4; i++) {
				for(int j=0; j<omokSize-4; j++) {
					if (omok[i][j] == 1 && omok[i + 1][j + 1] == 1 && omok[i + 2][j + 2] == 1 && omok[i + 3][j + 3] == 1 && omok[i + 4][j + 4] == 1) win= 1;
					if (omok[i][j] == 2 && omok[i + 1][j + 1] == 2 && omok[i + 2][j + 2] == 2 && omok[i + 3][j + 3] == 2 && omok[i + 4][j + 4] == 2) win= 2;
					
				}
			}
			for(int i=9; i<omokSize-7; i++) {
				for(int j=0; j<omokSize -4; j++) {
					if(omok[i][j] == 1 && omok[i - 1][j + 1] == 1 && omok[i - 2][j + 2] == 1 && omok[i - 3][j + 3] == 1 && omok[i - 4][j + 4] == 1) win =1;
					if(omok[i][j] == 2 && omok[i - 1][j + 1] == 2 && omok[i - 2][j + 2] == 2 && omok[i - 3][j + 3] == 2 && omok[i - 4][j + 4] == 1) win =2;
						
					
				}
			}
		}
		scan.close();
		
		
		
		
		
		}
		
	}



