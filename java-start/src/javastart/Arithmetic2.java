package javastart;

public class Arithmetic2 {
	public static void main(String[] args) {
		int i = 20; //정수형 변수
		double j = 10.5; //실수형 변수
		
		//sum(int, int) 메서드 호출
		int res1 =sum(i, 10); //i(20) + 10 -> 30
		
		//sum(double, double) 메서드 호출
		double res2 =sum(i,j); //i는 int지만 double로 자동 형변환 됨
							   // -> 20.0 + 10.5
								 
		//결과 출력
		System.out.println(res1); //30
		System.out.println(res2); //30.5
	}
	//정수형 덧셈 메서드
	public static int sum(int a, int b) {
		return a+b; //int + int -> int 반환
	}
	//실수형 덧셈 메서드
	public static double sum(double x, double y) {
		return x+y; //double + double -> double 반환
	}
}

//메서드 오버로딩
// -> 같은 이름의 메서드 생성
// -> 매개변수의 타입(형)과 개수, 순서 다름
// -> 반환 타입은 관계없음

//sum(int a, int b)
//sum(double a, double b) -> 오버로딩 가능
//
//sum(int a, int b)
//sum(int a, int b, int c) -> 오버로딩 가능
//
//sum(int a, double b)
//sum(double a, int b) -> 오버로딩 가능
//
//int sum(int a, int b)
//double sum(int x, int y) -> 오류