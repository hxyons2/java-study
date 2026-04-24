package ex03;

public class Dog3 extends Animal3 {
	String breed; //품종
	
	Dog3(String name, int age, String breed) {
	super(name,age);
	this.breed = breed;
	}
		
	void showDog()
	{
		show(); //부모 클래스의 메서드
		System.out.println("품종:"+breed);
	}
}
