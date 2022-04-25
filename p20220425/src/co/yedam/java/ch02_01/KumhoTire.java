package co.yedam.java.ch02_01;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); //super => 타이어의 생성자를 불러옴
	}
	
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
	
	
	
}
