package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx40_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = null;
		int elementCnt = 0;
		
		while(true) {
			for (int i = 0; i < elementCnt; i++) {
				System.out.println(scores[i]);
			}
				
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(elementCnt ==0) {
					scores = new int[elementCnt +1];
				}//{ }
			else if(elementCnt > 0) {
				int[]temp = scores;
				scores = new int[elementCnt + 1];
				//{}1칸의 링크를 temp에게 맡아둠 + {} 
			for(int i=0; i<temp.length; i++) {
				scores[i] = temp[i];
				// temp에 맡겨둔 링크를 가져오기
			}
				temp =null; //맡겨뒀던 temp를 삭제
			}
				System.out.print("값 추가입력 : ");
				int tot = scan.nextInt();
				scores[elementCnt] = tot; // 늘어난 {}을 스코어에 합한다 {} {} 
				elementCnt++;
			}
			else if (sel == 2) {
				System.out.println("삭제할 인덱스 입력"); 
				int deleteIndex = scan.nextInt(); //삭제할 인덱스의 변수를 지정
				if(elementCnt -1 < deleteIndex || deleteIndex < 0) {
				//요소에서 -1을 한 값보다 삭제할 인덱스가 더 크거나 또한 삭제할 인덱스가 0보다 작을수가 없다
				System.out.println("Index를 삭제할 수 없습니다");
				continue;//
				}
				
				if(elementCnt == 1) {
					scores = null; //스코어의 값을 삭제한다
				}
				else if(elementCnt > 1) {
					int[]temp =scores;
						scores = new int [elementCnt -1];
				for(int i=0; i<temp.length; i++) {
					scores[i] = temp[i];
				}
					temp = null;
				}
				
				
				
				
			}
			else if (sel == 3) {}
			else if (sel == 4) {}
			else if (sel == 0) {
				break;
			}
		}



	}

}
