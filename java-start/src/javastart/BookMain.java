package javastart;

//class Book {
//	String title;	//책 제목
//	String author;	//작가
//	
//	// 1) 기본 생성자
//	Book() {
//		this.title = "";
//		this.author = "";
//	}
//	
//	// 2) 제목만 받는 생성자
//	Book(String title) {
//		this.title = title;
//		this.author = "작가 미상";
//	}
//	
//	// 3) 제목 + 작가 받는 생성자
//	Book(String title, String author){
//		this.title = title;
//		this.author = author;
//	}
//	
//	void show() {
//		System.out.println("제목: "+title+", 작가: " +author);
//	}
//}
//
//
//
//public class BookMain {
//
//	public static void main(String[] args) {
//		
//		// 1) 기본 생성자
//		Book b1 = new Book();
//		b1.show();
//		
//		// 2) 제목만
//		Book b2 = new Book("자바의 정석");
//		b2.show();
//		
//		// 3) 제목 + 작가
//		Book b3 = new Book("해리포터", "J.K. 롤링");
//		b3.show();
//	}
//
//}

class Book2{
	   String title;
	   String author;
	   
	   void show(){
	      System.out.println("책 제목: "+title+", "+"작가 이름: "+author); //14 //16 //18
	   }
	   //생성자(객체 생성되면서 초기값을 부여) 오버로딩
	   Book2(){ //매개변수 없는 생성자(기본생성자)
//	      title = "";
//	      author = "";
	      this("",""); //생성자간의 호출 //2
	      System.out.println("기본 생성자 호출"); //5
	   }
	   
	   Book2(String title){
//	      this.title = title; //왼쪽 title = 멤버 변수, 오른쪽 title = 매개변수
//	      this.author = "작가 미상";
	      this(title,"작가 미상"); //7
	   }
	   
	   Book2(String title, String author){
	      this.title = title; //3 //8 //11
	      this.author = author; //4 //9 //12
	 
	   }
	      
	}

	public class BookMain {
	   public static void main(String[] args) { //실행 부분
	      
	      Book2 b1 = new Book2(); //객체 생성 //1(생성자 진입)
	      Book2 b2 = new Book2("심청전"); //b2 : 참조 변수 //6(생성자 진입)
	      Book2 b3 = new Book2("폭풍의 언덕","에밀리 브론테"); //10(생성자 진입)
	      
	      b1.show(); //13
	      b2.show(); //15
	      b3.show(); //17
	            
	   }
	}

	//this는 현재 작동 중인 객체 자신을 가리키는 참조 변수입니다. 주로 매개변수와 멤버 변수의 이름이 같을 때 이를 구분하기 위해 사용
	//this()는 같은 클래스 안에 있는 다른 생성자를 호출할 때 사용하는 특수한 문법입니다. 코드의 중복을 줄이기 위해 사용

	//this() 설명
	//① 생성자에서만 사용 가능
	//this();  // 생성자 안에서만 사용 가능
	//② 반드시 첫 줄에 써야 함
	//Car() {
	    //this("Avante");  // 반드시 첫 줄
	//}

	//Car() {
	    //speed = 100;
	    //this("Avante"); // 에러
	//}
	//③ 자기 자신을 계속 호출하면 안됨 (무한루프)
	//Car() {
	    //this(); //  무한 호출 → 컴파일 에러

