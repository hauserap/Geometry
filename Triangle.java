public class Triangle{

	private Point[] vertexes = new Point[3];

	public Triangle(Point point1, Point point2, Point point3){
		this.vertexes[0] = point1;
		this.vertexes[1] = point2;
		this.vertexes[2] = point3;
	}

	public double area(){
		double a = vertexes[0].distance(vertexes[1]);
		double b = vertexes[1].distance(vertexes[2]);
		double c = vertexes[2].distance(vertexes[0]);
		double s = 0.5 * (a + b + c);
		return Math.sqrt(s * (s-a) * (s-b) * (s-c));
	}
}