package instanceof_example;

public class Human {
    private String name;
    private int age;
    
    // 생성자
    public Human(String name, int age) {
	this.name = name;
	this.age = age;
    }
    
    // void 파라미터로 생성자 호출 시,
    // "noname", 0을 이름과 나이로 초기화하는 생성자를 정의
    public Human() {
	this("noname", 0);
//	this.name = "noname";
//	this.age = 0;
    }
    
    public void showInfo() {
	System.out.println("이름 : " + this.name);
	System.out.println("나이 : " + this.age);
	System.out.println("-------------------------");
    }
}
