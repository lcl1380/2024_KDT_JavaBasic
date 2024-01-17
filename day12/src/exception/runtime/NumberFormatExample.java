package exception.runtime;

public class NumberFormatExample {
    public static void main(String[] args) {
	String a = "35";
	String b = "21";
	System.out.println(a+b);
	
	// String -> int 변환
	int i = Integer.parseInt(a); // 문자 삼오(35)를 숫자 35(삼십오)로 변환
	int j = Integer.parseInt(b); // 문자 삼오(35)를 숫자 35(삼십오)로 변환
	System.out.println(i + j);
    }
}
