package accessmodifier.protec.pack2;

import accessmodifier.protec.pack1.A;

public class C {
		public C() {
			// A와 패키지가 다르기 때문에 상속 없이 import만으로는 A의 객체를 생성 불가능함.
//			A a = new A();
//			a.equals(= "hi~");
//			a.method();
		}
}
