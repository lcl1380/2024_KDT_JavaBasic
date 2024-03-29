package encapsulation.good;

public class MyBirthDay {
    private int year;
    private int month;
    private int day;

    public MyBirthDay(int year, int month, int day) {
        this.year = year;
        setMonth(month);
        setDay(day);
    }

    public void setYear(int year) {
        if (isLeapYear(year)) {
            this.year = year;
        } else {
            System.out.println("윤년이 아닌 연도입니다. 연도를 변경할 수 없습니다.");
        }
    }

    private void setDay(int day) {
        if (day < 1 || day > 31) {
            this.day = 1;
        } else {
            this.day = day;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    void showDateInfo() {
		System.out.println("내 생일은 " + year + "년 " + month + "월 " + day + "일 이니까 선물을 준비하세요!!!");
	}
    
    private void setMonth(int month) {
        if (month < 1) { this.month = 1;}
        else if(month > 12) { this.month = 12; }
        else { this.month = month; }
    }
    
}
