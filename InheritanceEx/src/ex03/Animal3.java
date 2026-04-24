package ex03;

public class Animal3 {
	String name; //변수
	int age;
	
	Animal3(String name, int age) { //생성자
		this.name=name;
		this.age=age;
	}
	
	void show() { //메서드
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}

}
