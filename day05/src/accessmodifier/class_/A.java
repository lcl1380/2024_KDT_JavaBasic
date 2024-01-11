package accessmodifier.class_;

// default ; 같은 패키지 내부끼리만 참조 가능
class A {
		
	// 클래스 A의 접근제한자가 default이기 때문에
	// 같은 패키지 내부인 B에서 A를 선언할 수 있음
	A a  = new A();
}
