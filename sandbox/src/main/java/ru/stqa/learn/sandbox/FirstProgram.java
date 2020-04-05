package ru.stqa.learn.sandbox;

public class FirstProgram {
	
	public static void main(String[] args) {
	hello("world");
	hello("Maxz");

	double lon = 5;
		System.out.println("ПЛощадь квадрата со стороной " +lon+"="+area(lon));

		double a = 4;
		double b =6;
		System.out.println("Площадь промоугольника со сторонами " +a+ " и " +b+ "=" +area(a,b));
	}
	public static void  hello(String somebody) {
		System.out.println("hello, "+somebody+  "!");
	}

	public  static  double area (double l) {
		return l*l;
	}

	public  static  double area (double a, double b) {
		return a*b;
	}
}