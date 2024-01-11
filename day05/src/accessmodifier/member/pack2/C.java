package accessmodifier.member.pack2;

import accessmodifier.member.pack1.A;

public class C {
	
	public C() {
		A a  = new A();
		
		a.a = 1; //public이라 접근 가능
//		a.b = 2; // 같은 패키지 내에 있는 요소에 대해 default 접근 가능 : 다른 패키지라 접근 불가 (오류 발생)
//		a.c = 3; // private는 접근 불가 (오류 발생)
		
		a.method1(); // public : 접근 가능
//		a.method2(); // default : 같은 패키지 내, 접근 가능 : 다른 패키지라 접근 불가 (오류 발생)
//		a.method3(); // private : 접근 불가 (오류 발생)
	}
}
