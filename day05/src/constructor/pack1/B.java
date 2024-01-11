package constructor.pack1;

public class B {
		A a1 = new A(false);
		A a2 = new A(128);
		// 클래스가 다르기 때문에 private는 오류남, protected는 가능 
		// A a3 = new A("이건오류남");
}
