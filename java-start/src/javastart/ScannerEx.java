package javastart;

import java.util.Scanner; //C언어의 #include와 동일
						  //java.utill: 패키지
						  //Scanner: Class

public class ScannerEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//객체 생성
		//Scanner: Class 이름
		//System.in: 키보드로 입력
		//Scanner sc -> Scanner(Class, Type), sc -> 참조변수
		
		System.out.print("이름 입력:");
		String name=sc.nextLine(); //문자열 한 줄(엔터까지 포함해서 읽음)
		
		System.out.print("주소 입력:");
		String addr=sc.nextLine(); //문자열 입력
		
		System.out.print("나이 입력:");
		int age=sc.nextInt(); //정수 입력
		
		System.out.print("몸무게 입력:");
		double wei=sc.nextDouble(); //실수 입력
		
		System.out.print("혼인 여부(true/false):");
		boolean mar=sc.nextBoolean(); //boolean 값 입력(true/false만 가능)
		
		System.out.println("이름:		"+name);
		System.out.println("주소:		"+addr);
		System.out.println("나이:		"+age);
		System.out.println("몸무게:		"+wei);
		System.out.println("혼인:		"+mar);
		
		sc.close(); //입력 도구 종료, 자원 정리
	}

}
