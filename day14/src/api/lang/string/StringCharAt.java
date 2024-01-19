package api.lang.string;

public class StringCharAt {

    public static void main(String[] args) {
	// 일반 배열은 아래와 같이 인덱싱이 가능하다
	int[] iArr = {1,2,3,4};
	System.out.println(iArr[2]);
	
	// 문자열은 일반 인덱싱이 불가능하다
	String str = "가나다라";
//	System.out.println(str[2]); // 오류 발생 : Exception in thread "main" java.lang.Error
	System.out.println(str.charAt(2));

    }

}
