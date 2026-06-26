import exercise4.Point;

public class Rectangle {
    Point A;
    Point B;
    Point C;
    Point D;

    public Rectangle(Point A, Point B, Point C, Point D) {
        // assuming points A,B,C,D are given in a clockwise order
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;

        if ((A.distance(B) != C.distance(D)) || (B.distance(C) != A.distance(D))) {
            throw new Exception("Not a valid rectangle");
        }
    }
    
    public double perimeter() {
        return 2 * (A.distance(B) + B.distance(C));
    }

    public double area() {
        return A.distance(B) * B.distance(C);
    }

    @Override
    public int hashCode() {
        return (int)(perimeter());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        
        return A.equals(other.A) && B.equals(other.B) && C.equals(other.C) && D.equals(other.D);
    }
}
