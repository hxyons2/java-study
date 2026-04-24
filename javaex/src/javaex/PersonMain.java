package javaex; 

class Person {
	private int age; //private : 그 class 안 접근

	public int getAge() { //get~: 값을 반환
		return age;
	}

	public void setAge(int age) { //set~: 값을 설정
		//나이가 1~100세 까지 -> 아니면 나이 입력 오류(1-100세)
		if(age < 1 || age > 100) {
			System.out.println("나이 입력 오류(1-100세 입력");
		}
		else {
			this.age = age;
			}
	} 
	
}

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
		
		//p.age = -10 -> 직접 접근 안 함
		p.setAge(25); //값을 설정
		System.out.println("현재나이:"+p.getAge()); //값을 가져옴
	}
}
