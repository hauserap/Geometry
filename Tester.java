public class Tester{
	public static void main(String[] args){
		Point point1 = new Point(-5,-6);
		Point point2 = new Point(2,3);
		Point point3 = new Point(4,7);
		Triangle triangle = new Triangle(point1, point2, point3);
		System.out.println(triangle.area());

	}
}