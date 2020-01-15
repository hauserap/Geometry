public class Polygon{

    private ArrayList<Point> points = new ArrayList<Point>();
    private int numberOfSides;

    public Polygon(ArrayList<Point> points){
        this . points = points;
        this . numberOfSides = this . points.size();
    }
	
}