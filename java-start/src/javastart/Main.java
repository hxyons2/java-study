package javastart;


class Student{//Class(설계도) 생성
		//Class = 멤버 변수(필드) (속성) + 메서드(기능) 구성
	String name = "김춘추"; //멤버변수
	int score; //멤버변수
	//생성자(constructor): 객체 생성할 때 값을 부여
	Student(string n, int s)  { //생성자(Class 이름과 동일)
		name = n;
		score = s;
	}
	
	//메서드 정의 (기능, 행위)
	void printInfo() {
		System.out.println(name+" "+score);
	}
	
}

public class Main { //실행하는 Class
	public static void main(String[] args) {//main method
		
		Student st1 = new Student("홍길동",90); //객체(인스턴스) 생성
		Student st2 = new Student("이순신", 100); //객체(인스턴스) 생성
		//new: 객체 생성 연산자
		//Student(): Class
		//s1: 참조 변수, 객체 생성
		
		System.out.println("이름은 : st1.name");
		
//		st1.name = "홍길동"; //s1.name에서 . 은 멤버 접근 연산자
//		st1.score = 90;
		st1.printInfo(); //메서드 호출
		
//		st2.name = "이순신";
//		st2.score = 100;
		st2.printInfo();
		
		System.out.println("이름은: "+st1.name);
		System.out.println("점수는: "+st1.score);
		
		System.out.println("이름은: "+st2.name);
		System.out.println("점수는: "+st2.score);
		
	}
}








