package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String 가입id = "root"; //db
		String 가입pw = "pass";
		
		String 로그인id = JOptionPane.showInputDialog("아이디 입력"); //직접입력
		String 로그인pw = JOptionPane.showInputDialog("패스워드 입력");;//String은 부품(class)
		
		if (가입id.equals(로그인id) && 가입pw.equals(로그인pw)) { //and연산자 : &% : 여러 조건이 모두 true일때
												  //전체 논리적인 판단을 true라고 판단하는 경우
			System.out.println("로그인ok");
		}else {
			System.out.println("로그인 not");
			}
		}
	}


