package challenege09;

public class pointTest {
	public static void main(String[] args) {
		
		point p1 = new point();				//This is a point instance (objects)
		p1.printPoint();
		
		point p2 = new point(20, 80);
		p2.printPoint();
		
		point p3 = new point();
		p3.x = 80;
		p3.y = 79;
		p3.printPoint();
	}
}
