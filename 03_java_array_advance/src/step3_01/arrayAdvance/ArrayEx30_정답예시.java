package step3_01.arrayAdvance;

import java.util.Scanner;

/*
 * # ATM[4단계] : 전체 기능구현
 * 
 * 1. 회원가입
 * . acc와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . acc 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . acc와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

public class ArrayEx30_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arAcc = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int usrCnt = 0;
		int identifier = -1;
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while (true) {
			
			System.out.println("[회원 수 : " + usrCnt + "명]");
			for (int i=0; i<usrCnt; i++) {
				System.out.println(arAcc[i] + ":" + arPw[i] + "(" + arMoney[i] + "원)");
			}
			System.out.println("-----------------");
			System.out.print("[접속자] : ");
			if (identifier == -1) {
				System.out.println("없음");
			}
			else {
				System.out.println(arAcc[identifier]);
			}
			System.out.println("-----------------");
			
			System.out.println(menu);
			
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				if (usrCnt == 5) {
					System.out.println("회원가입은 5명까지만 가능합니다.");
					continue;
				}
				
				System.out.print("[가입]Acc 입력 : ");
				int myAcc = scan.nextInt();
				
				int check = 1;
				for (int i=0; i<usrCnt; i++) {
					if (arAcc[i] == myAcc) {
						check = -1;
					}
				}
				
				if (check == -1) {
					System.out.println("Acc가 중복됩니다.");
				}
				else {
					
					System.out.print("[가입]PW 입력 : ");
					int myPw = scan.nextInt();
					
					arAcc[usrCnt] = myAcc;
					arPw[usrCnt] = myPw;
					arMoney[usrCnt] = 1000;
					usrCnt += 1;
					System.out.println("[메세지]가입을 축하합니다.");
				}
			}
			else if(sel == 2) {
				if(identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}else {
					for(int i=identifier; i<usrCnt-1; i++) {
						arAcc[i] = arAcc[i + 1];
						arPw[i] = arPw[i + 1];
                        arMoney[i] = arMoney[i + 1];
					}
					usrCnt--;
					System.out.println("[메세지]탈퇴되었습니다. 이용해주셔서 감사합니다.");
					
					identifier = -1;		// 탈퇴와 동시에 로그아웃
				}
			}
			else if(sel == 3) {
				if(identifier == -1) {
					System.out.print("[로그인]Acc 입력 : ");
					int myAcc = scan.nextInt();
					System.out.print("[로그인]PW 입력 : ");
					int myPw = scan.nextInt();
					
					int check = -1;
					for (int i=0; i<usrCnt; i++) {
						if (arAcc[i] == myAcc && arPw[i] == myPw) {
							check = i;
						}
					}
					
					if (check == -1) {
						System.out.println("[메세지]Acc와 PW를 확인해주세요.");
					}
					else {
						identifier = check;
						System.out.println("[메세지]" + arAcc[identifier] + "님, 환영합니다.");
					}
				}
				else {
					System.out.println("[메세지]현재 " + arAcc[identifier] + "님이 로그인 중입니다.");
				}
			}
			else if (sel == 4) {
				if (identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
				else {
					identifier = -1;
					System.out.println("[메세지]로그아웃 되었습니다.");
				}
			}
			else if (sel == 5) {
				if (identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
				else {
					System.out.print("[입금]입금할 금액을 입력하세요 : ");
					int money = scan.nextInt();
					
					arMoney[identifier] += money;
					System.out.println("[메세지]입금을 완료하였습니다.");
				}
			}
			else if (sel == 6) {
				
				if (identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
				else {
					System.out.println("[이체]계좌번호를 입력하세요 : ");
					int account = scan.nextInt();
					
					int check = -1;
					for (int i=0; i<usrCnt; i++) {
						if (arAcc[i] == account) {
							check = i;
						}
					}
					
					if (check == -1) {
						System.out.println("[메세지]계좌번호를 확인해주세요.");
						continue;
					}
					
					System.out.print("[이체]이체할 금액을 입력하세요 : ");
					int money = scan.nextInt();
					
					if (arMoney[identifier] >= money) {
						arMoney[identifier] -= money;
						arMoney[check] += money;
						System.out.println("[메세지]이체를 완료하였습니다.");
					}
					else {
						System.out.println("[메세지]잔액이 부족합니다.");
					}
				}
			}
			else if (sel == 7) {
				if (identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
				else {
					System.out.println("고객님의 잔액은 " + arMoney[identifier] + "원 입니다.");
				}
			}
			else if (sel == 0) {
				break;
			}
		}


	}

}
