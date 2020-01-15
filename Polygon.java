import java.util.*;
public class Polygon{

    private ArrayList<Point> vertexes = new ArrayList<Point>();
    private int numberOfSides;

    public Polygon(ArrayList<Point> points){
        this . vertexes = points;
        this . numberOfSides = points.size();
    }

	public double perimeter(){
		int perimeter = 0;
		for (int i = 0; i<this.numberOfSides - 1; i++){

			perimeter += Math.abs(vertexes.get(i).distance(vertexes.get(i + 1)));
	;
		}
		perimeter += Math.abs(vertexes.get(numberOfSides - 1).distance(vertexes.get(0)));
		return perimeter;
	}
}