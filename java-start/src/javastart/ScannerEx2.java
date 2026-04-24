package javastart;

import java.util.Scanner;

public class ScannerEx2 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격 입력:");
		int price=sc.nextInt();
		
		System.out.print("수량 입력:");
		double quan=sc.nextDouble();
		
		System.out.print("상품명 입력:");
		String pro=sc.nextLine();
		sc.nextLine();
		//문자열 입력 -> 숫자 입력 -> 문제 없음
		//숫자 -> 문자열 -> 엔터키를 상쇄 sc.nextLine();
		
		System.out.print("회원 여부(true/false) 입력:");
		boolean mem=sc.nextBoolean();
		
		//총금액(tot): 수량 * 가격
		int tot = (int)quan * price;
		
		//할인 적용: 회원(true)이면 10% 할인
		if(mem) { //boolean이면 mem == true
			tot = (int)(tot * 0.9);
		}
		
		System.out.println("상품명:	"+pro);
		System.out.println("가격:		"+price);
		System.out.println("수량:		"+quan);
		System.out.println("회원:		"+mem);
		
		if(mem) { //boolean이면 mem == true
			System.out.println("회원입니다.");
		}
		else {
			System.out.println("비회원입니다.");
		}
		System.out.println("할인 금액:		"+tot);
		
		sc.close();
	}

}
