package inheritance;

public class Rabbit extends Monster{
    public Rabbit() {
	// 부모인 Monster에 이름, 체력, 공격력, 방어력, 경험치 전달
	super("토끼", 3, 0, 0, 5);
    }
}
