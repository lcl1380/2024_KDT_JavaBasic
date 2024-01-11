package accessmodifier.protec.pack2;

import accessmodifier.protec.pack1.A;

public class D extends A {
		public D() {
//			A a = new A();
//			a.s = "hi~~";
//			a.method();
			
			// protected는 패키지가 다를 경우
			// 두 클래스 사이에 상속 관계가 있다면
			// super 키워드를 이용하여 부모 쪽 참조를 허용한다
			// 단, super() 생성자는 첫 줄에 위치해야 함!!
			super();
			super.s = "hi";
			super.method();
		}
}
