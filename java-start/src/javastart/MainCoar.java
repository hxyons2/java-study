package javastart;


		class Cart{ //Class(설계도) 생성
		//Class = 멤버변수(필드) + 메서드(기능) 구성
		String model;
		int speed; 
		
		Cart(String n, int s)  { 
			this.model = model;
			this.speed = speed;
			//this: 왼쪽 변수 - 객체 변수, 오른쪽 변수 - 매개변수
			//this: 객체 자신
		}
		
		//메서드 정의(기능, 행위)
		void printInfo() {
			System.out.println(model+" "+speed);
		}
		
	}

		
	public class MainCoar { 
		public static void main(String[] args) {
			
			Cart c1 = new Cart("Sonata",100); 
			Cart c2 = new Cart("Avante", 80); 
			
			c1.printInfo();
			c2.printInfo();
		
		
		}


	}


