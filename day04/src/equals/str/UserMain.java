package equals.str;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "두부";
		String s2 = "두부";
		
		// 문자열의 동등성 비교 : s1과 s2는 동일한 문자열 값을 가지므로, 주소만 공유하여 자원을 아낀다.
		// 주소가 같을 경우 true를 반환함
		System.out.println("s1과 s2의 주소 비교 : " + (s1 == s2));
		
		// 다른 주소를 가지게 하려면, new 키워드를 이용하여 새로운 객체를 힙에 할당하는 방법이 존재한다.
		String s3 = new String("두부");
		System.out.println("s1과 s3의 주소 비교 : "+(s1 == s3));
		
		// 값이 비교한지를 따질 때에는 .equals() 메소드를 이용한다.
		System.out.println("s1과 s3의 동등성 비교 : "+ s1.equals(s3));
		System.out.println("s2과 s3의 동등성 비교 : "+ s2.equals(s3));
	}

}
