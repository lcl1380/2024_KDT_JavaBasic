package static_;

public class MainClass {
    public static void main(String[] args) {
	// 인스턴스 생성 전부터 이미 조회 가능한 팀 점수
	// 객체 선언하지도 않았는데 점수 조회 가능
//	System.out.println(Asean.presentationScore);
	
	// 객체 생성 하지 않았음에도 접근 가능
	Asean.showPresentationScore();
	
	// 학생 4명 만들어보기
	Asean a = new Asean("aaa", 20, 50);;
	Asean b = new Asean("bbb", 20, 35);
	Asean c = new Asean("ccc", 23, 50);
	Asean d = new Asean("ddd", 21, 40);
	
	a.showStudentScore();
	b.showStudentScore();
	c.showStudentScore();
	d.showStudentScore();
	
	
	// 어떤 인스턴스를 활용해도 팀 점수 조회가 가능함(모든 객체가 공유하는 변수)
//	System.out.println(a.presentationScore);
//	System.out.println(b.presentationScore);
//	System.out.println(c.presentationScore);
//	System.out.println(d.presentationScore);
	
    }
}
