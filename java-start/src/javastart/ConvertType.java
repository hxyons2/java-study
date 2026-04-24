package javastart;

import java.util.Scanner; //Scanner 클래스 사용
//import= ctrl+shift+o
public class ConvertType {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //키보드로 입력위해, 무조건 import 해야함
    //문자열 입력
    System.out.println("숫자를 문자로 입력해주세요.");
    String a = sc.nextLine(); //nextLine()은 문자열 1줄
    //문자열->숫자 변환
    int num = Integer.parseInt(a); //a는 문자->num(정수)
    //Integer(정수) : Wrapper class(래퍼 클래스)
    //기본형을 객체로 감싸는 클래스
    //Integer.parseInt(a) : 문자 -> 정수 변환
    
    //숫자 -> 문자열
    String s1 = Integer.toString(num); //toString(문자로 변환)
                   // toString 앞에 타입 지정
    String s2 = String.valueOf(num); //valueOf(문자로 변환)
                   //valueOf : 타입 관계없음
    //출력
    System.out.println("입력 문자열: "+a);
    System.out.println("숫자로 변환: "+num);
    System.out.println("다시 문자열로 변환(toString): "+s1);
    System.out.println("다시 문자열로 변환(valueOf): "+s2);
    
    sc.close();
 }

}
