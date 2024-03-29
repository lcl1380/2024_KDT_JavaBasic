package inheritance;

public class MainClass1 {

    public static void main(String[] args) {
	// 전사 생성
	Warrior w1 = new Warrior("흑마도사");
	w1.show_Status();
	
	// 토끼 생성 후 전사와 교전 2회 
	Rabbit r1 = new Rabbit();
	w1.hunt(r1);
	w1.hunt(r1);
	w1.show_Status();
	
	// 쥐 생성
	Rat rat = new Rat();
	for(int i=0; i < 3; i++) {
	    w1.hunt(rat);
	}
	w1.show_Status();
	
	// 모그리 생성
	Moogle moogle = new Moogle();
	for(int i=0; i<5; i++) {
	    w1.hunt(moogle);
	}

    }

}
