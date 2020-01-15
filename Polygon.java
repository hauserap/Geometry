public class Polygon{



	public int perimeter(){
		int perimeter = 0;
		for (int i = 0; i<this.numberOfSides - 1; i++){
			perimeter += Math.abs(vertexes.get(i).distance(vertexes.get(i + 1)));
		}
		perimeter += Math.abs(vertexes.get(numberOfSides - 1).distance(vertexes.get(i)));
		return perimeter;
	}
}