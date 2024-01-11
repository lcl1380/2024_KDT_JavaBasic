package override;

public class OverrideExample {

	public static void main(String[] args) {
		// 프로그래머 클래스의 인스턴스 생성
		Programmer pro1 = new Programmer();
		pro1.name = "채";
		pro1.age = 23;
		pro1.language = "Python";
		pro1.projects_activity = 10;
		
		pro1.self_introducing();
		pro1.do_coding();
		
		Human cat = new Human();
		cat.name = "두부";
		cat.age = 5;
		
		System.out.println("\n");
		cat.self_introducing();
		cat.do_coding();
	}

}
