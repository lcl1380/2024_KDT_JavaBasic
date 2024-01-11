package inheritance;

public class Rat extends Monster{
    public Rat() {
	// 부모인 Monster에 이름, 체력, 공격력, 방어력, 경험치 전달
	super("쥐", 5, 3, 1, 7);
    }
}
