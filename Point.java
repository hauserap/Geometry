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
        return Math.sqrt(((p.getYcord() - this . yCord) * (p.getYcord() - this.yCord)) + ((p.getXcord() - this . xCord) * (p.getXcord() - this . xCord)));
    }
    
    public boolean inside(Point n, Point m){
        if (this.yCord < n.getYcord() && this.yCord > m.getYcord()
            || this.yCord < m.getYcord() && this.yCord > n.getYcord()){
            if (this.xCord < n.getXcord() && this.yCord > m.getXcord()
                || this.xCord < m.getXcord() && this.xCord > n.getXcord()){
                return true;
            }
        }
        return false;
    }
}