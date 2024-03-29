package instanceof_example;

public class MainClass {
    public static void main(String[] args) {
	// Human, Student, Cat 인스턴스 생성
	Human h1 = new Human("이자바", 20);
	h1.showInfo();
	
	Student s1 = new Student("이파", 23);
	s1.showInfo();
	
	Cat c1 = new Cat("두부", 5);
	c1.meow();
	
	// h1이 Human을 기반으로 한 인스턴스인지 확인
	System.out.println(h1 instanceof Human);
	
	// s1이 Human을 기반으로 한 인스턴스인지 확인
	System.out.println(s1 instanceof Human);
	
	System.out.println(h1 instanceof Student);
	System.out.println(s1 instanceof Student);
	// c1이 Human을 기반으로 한 인스턴스인지 확인
//	System.out.println(c1 instanceof Human); // 오류 발생
	
    }
}
