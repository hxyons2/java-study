package test;

class Book {
	String title;
	
	Book(String title) {
		this.title = title;
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
		Book[] b = new Book[3];
		
		b[0] = new Book("자바의 정석");
		b[1] = new Book("파이썬 기초");
		b[2] = new Book("c언어 마스터");
		
		for(int i = 0; i < b.length ;i++) {
			System.out.println(b[i].title);
		}
	}
	
	

	
}
