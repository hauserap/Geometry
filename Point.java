public class Point{
    private int xCord;
    private int yCord;

    public Point(int xCord, int yCord ){
        this . xCord = xCord;
        this . yCord = yCord;
    }

    public int getXcord(){
        return this . xCord;

    }

    public int getYcord(){
        return this . yCord;
    }

    public double distance(Point p ){
        return Math.sqrt((p.getYcord() - this . yCord) * (p.getYcord() - this.yCord) + (p.getXcord() - this . xCord * (p.getXcord() - this . xCord)));

    }
    
}