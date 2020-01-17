public class Square{
    private Point[]  vertexes = new Point[4];
    private int numberOfSides;


    public Square(Point point1, Point point2, Point point3, Point point4){
		this.vertexes[0] = point1;
		this.vertexes[1] = point2;
        this.vertexes[2] = point3;
        this.vertexes[3] = point4;
    }
    
    public double area(){
        double a = vertexes[0].distance(vertexes[1]);
        double b = vertexes[1].distance(vertexes[2]);
        return (a*b);
    }
    public double perimeter(){
		int perimeter = 0;
		for (int i = 0; i<this.numberOfSides - 1; i++){
			perimeter += Math.abs(vertexes.get(i).distance(vertexes.get(i + 1)));
		}
		perimeter += Math.abs(vertexes.get(numberOfSides - 1).distance(vertexes.get(i)));
		return perimeter;
	}
}
