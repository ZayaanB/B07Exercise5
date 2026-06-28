import exercise4.Point;

public class Circle {
	Point origin;
    int radius;
    double pi = Math.PI;
	
	public Circle(Point origin, int radius) {
		this.origin = origin;
        this.radius = radius;
	}
	
    public Circle(Point origin) {
		this.origin = origin;
        this.radius = 1;
	}

    public Circle() {
		this.origin = new Point(0, 0);
        this.radius = radius;
	}

	public double circumfrenece() {
		return 2*pi*radius;
	}
	
    public double area() {
		return pi*Math.pow(radius, 2);
	}

}
