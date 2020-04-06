package ru.stqa.learn.sandbox;

public class FirstProgram {
	
	public static void main(String[] args) {
	hello("world");
	hello("Maxz");

Square s = new Square(5); // создаемновый объект типо квадрат с атрибутам
		System.out.println("ПЛощадь квадрата со стороной " +s.l+"="+s.area()); //функция area в классе Square

		Rectangle r = new Rectangle(4,6); //создаваемы объект типо прямоугольник с атрибутами
		System.out.println("Площадь промоугольника со сторонами " +r.a+ " и " +r.b+ "=" +area(r));
	}
	public static void  hello(String somebody) {
		System.out.println("hello, "+somebody+  "!");
	}

	public  static  double area (Rectangle r) {
		return r.a*r.b;
	}
}