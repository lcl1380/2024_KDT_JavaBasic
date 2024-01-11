package accessmodifier.class_2;

import accessmodifier.class_.B;

public class C {
		// 클래스 B는 public 클래스이므로 패키지가 달라도 생성 가능
		// 패키지가 다른 경우, 무조건 import 구문이 선언되어야 사용 가능
		B b = new B();
		
		// 클래스 A는 default 접근제한자 : 패키지가 다르면 호출 불가
		// 자동완성도 안 뜸.
		// A a = new A();
}
