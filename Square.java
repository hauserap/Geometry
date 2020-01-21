public class Square{
    private Point[]  vertexes = new Point[4];

    public Square(Point point0, Point point2){
    	if (   point0.getXcord() != point2.getXcord() 
    		&& point0.getYcord() != point2.getYcord()){
			this.vertexes[0] = point0;
        	this.vertexes[2] = point2;
        	this.vertexes[1] = new Point(point0.getXcord(), point2.getYcord());
        	this.vertexes[3] = new Point(point2.getXcord(), point0.getYcord());
    	}
    }
    
    public double area(){
        double a = vertexes[0].distance(vertexes[1]);
        double b = vertexes[1].distance(vertexes[2]);
        return (a*b);
    }
    public double perimeter(){
		return (double)this.vertexes[1].distance(this.vertexes[0]) *4;
    }

    public Point getPoint0(){
    	return this.vertexes[0];
    }
    public Point getPoint1(){
    	return this.vertexes[1];
    }
    public Point getPoint2(){
    	return this.vertexes[2];
    }
    public Point getPoint3(){
    	return this.vertexes[3];
    }

    public Point[] getPoints(){
    	return vertexes;
    }

    public boolean collision(Square sqr2){
    	for (int i = 0; i<4; i++){ //iterates between each point
    		if (this.vertexes[i].inside(sqr2.getPoint0(), sqr2.getPoint2())){
    			return true;
    		}
    	}

    	for (int i = 0; i<4; i++){ //iterates between each point
    		if (sqr2.getPoints()[i].inside(this.vertexes[0], this.vertexes[2])){
    			return true;
    		}
    	}


//    	if (sqr2.getPoint0().inside(this.vertexes[0], this.vertexes[2]) return true;
//    	if (sqr2.getPoint1().inside(this.vertexes[0], this.vertexes[2]) return true;
//    	if (sqr2.getPoint2().inside(this.vertexes[0], this.vertexes[2]) return true;
//    	if (sqr2.getPoint3().inside(this.vertexes[0], this.vertexes[2]) return true;

    	return false;
    }
    



}
