package test;

class Car { //설게도 class
	String model; //멤버변수(필드) -> 속성
	int speed;
	
	//생성자(매개변수(model, speed 2개)
	Car(String model, int speed) {
		this.model=model; //왼쪽 model -> 필드(멤버 변수), 오른쪽 model은 매개변수
		this.speed=speed; 
		}
		
	//메서드 -> 기능, 행위
	void print() {
		System.out.println(model + "," + speed);
    }
}



public class Ex04 {
	public static void main(String[] args) {
		//객체 생성(생성자 호출)
		Car c1 = new Car("sonata", 100);
		Car c2 = new Car("avante", 120);
		
		//메서드 호출
		c1.print();
		c2.print();
	}

}
