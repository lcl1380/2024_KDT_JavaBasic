package day01;

public class Identifier_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코드 컨벤션 관련 내용 찾아보기
		int age = 21;
		int AgE = 23;
		
		// 자바의 식별자 이름은 대소문자를 구분함
		System.out.println(age);
		System.out.println(AgE);
		
		// 식별자 이름은 숫자로 시작할 수 없음
		int number9 = 9;
		//int 9number = 10;
		
		// 식별자 사이에 공백이 존재할 수 없음
		int birthday = 1228;
		//int birth day = 1228;
		int birth_day = 1228;
		
		// 키워드(예약어, 주황색으로 잡히는 것들)는 식별자로 사용 불가함
		//int static = 50;
		
	}

}
