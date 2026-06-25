package exercise4;
public class Square{

	Point A;
	Point B;
	Point C;
    Point D; 
	
    public Sqaure(Point A, Point B, Point C, Point D){
        this.A = A; 
        this.B = B;
		this.C = C; 
        this.D = D;
        if(A.distance(B) != C.distance(D) && B.distance(C) != A.distance(B) && A.distance(B) != A.distance(D)){
            throw new Exception ("Not a valid square"); 
        }
    }

    public double perimeter() {
		return 4*A.distance(B);
	}
    public double area() {
		return Math.pow(A.distance(B),2);
	}

}