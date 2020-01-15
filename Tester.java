import java.util.*;
public class Tester{
	public static void main(String[] args){
//		Point point1 = new Point(-5,-6);
//		Point point2 = new Point(2,3);
//		Point point3 = new Point(4,7);
//		Triangle triangle = new Triangle(point1, point2, point3);
//		System.out.println(triangle.area());

		Point point1 = new Point(0,0);
		Point point2 = new Point(2,0);
		Point point3 = new Point(2,1);
		Point point4 = new Point(1,2);
		Point point5 = new Point(0,2);

		ArrayList<Point> points = new ArrayList<Point>();
		points.add(point1);
		points.add(point2);
		points.add(point3);
		points.add(point4);
		points.add(point5);

		Polygon square = new Polygon(points);
		System.out.println(square.perimeter());
	}
}