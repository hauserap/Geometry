public class Square{
    private Point[]  vertexes = new Point[4];

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
		return (double)this.vertexes[1].distance(this.vertexes[0]) *4;
    }
    
    // public Point getLowerLeft(){
    //     return 
    // }
}
