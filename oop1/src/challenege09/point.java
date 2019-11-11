package challenege09;

public class point {
		public int x;
		public int y;
		
		
	public point() {				//This default constructor will print 0 value for the variables
		
	}
	
	public point(int x1, int y1) {				//This is a parameterized constructors.
		x = x1;
		y = y1;
	}
	
	public void printPoint() {
		System.out.println("(Point: (" + x + "," + y + ")");
	}
	
}
