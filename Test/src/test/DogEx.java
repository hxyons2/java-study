package test;
//자식(Sub) class
public class DogEx extends AnimalEx {
	String breed;
	
	DogEx(String name, int age, String breed) {
		super(name, age); //부모생성자 호출
		this.breed = breed;
	}
	
	void showDog() {
		show();
		System.out.println("품종: " + breed);
	}
}
