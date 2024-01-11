package day02;

public class IntegerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a, b, c 모두 Type mismatch 에러가 발생함 :
		
		//int의 범위: -128~127
		//범위안에 존재하긴 한데short 측에서 존재안함
		//int가 표현할 수 있는 범위를 벗어남 : 매직넘버에 문제가 존재함. : 숫자 뒤에 L 붙여서 long 표시해주면 오류 해결됨
		
		byte a = 127;
		short b = 32767; 
		int c = 2147483647;
		
	}

}
