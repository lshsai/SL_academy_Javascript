package answer;

public class Main0726 {

	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(5, 8), new Circle(6.0), new Rectangle(5, 7)};
		
		for (Shape s : arr) {
			System.out.println(s.getName() + "ÀÇ ¸éÀû : " + s.calcArea());
		}
	}
}

class Position{
	int x;
	int y;

	
	public Position() {
		this(0,0);
	}
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

abstract class Shape{
	Position p;
	String name;
	
	public Shape() {
		this(new Position());
	}
	
	public Shape(Position p) {
		this.p = p;
	}
	
	String getName() {
		return name;
	}
	abstract double calcArea();
}

class Circle extends Shape {
	
	Circle(double radius){
		name = "Circle";
		this.radius = radius;
	}
	double PI = Math.PI;
	double radius;
	
	
	
	@Override
	double calcArea() {
		return radius*radius*PI;
	} 
}

class Rectangle extends Shape {
	int width;
	int height;
	
	Rectangle(int width, int height) {
		name = "Rectangle";
		this.height = height;
		this.width = width;
	}
	
	@Override
	double calcArea() {
		return width*height;
	}
}



