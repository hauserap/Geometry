public class Polygon{

    private ArrayList<Point> points = new ArrayList<Point>();
    private int numberOfSides;

    public Polygon(ArrayList<Point> points){
        this . points = points;
        this . numberOfSides = this . points.size();
    }

	public int perimeter(){
		int perimeter = 0;
		for (int i = 0; i<this.numberOfSides - 1; i++){
			perimeter += Math.abs(vertexes.get(i).distance(vertexes.get(i + 1)));
		}
		perimeter += Math.abs(vertexes.get(numberOfSides - 1).distance(vertexes.get(i)));
		return perimeter;
	}
}