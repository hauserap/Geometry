public class Tester{
	public static void main(String[] args){
		Point point1 = new Point(0,0);
		Point point2 = new Point(1,0);
		Point point3 = new Point(0,1);
		Triangle triangle = new Triangle(point1, point2, point3);
		System.out.println(triangle.area());

	}
}