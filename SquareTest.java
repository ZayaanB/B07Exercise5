package exercise4;

import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {

	@Test
	void testArea1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 1);
		Point p3 = new Point(1, 1);
		Point p4 = new Point(1, 0);
		
		Square s = new Square(p1, p2, p3, p4);
		assertEquals(s.area(), 1.0);
	}
	
	@Test
	void testArea2() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(2, 0);
		
		Square s = new Square(p1, p2, p3, p4);
		assertEquals(s.area(), 4.0);
	}
	
	@Test
	void testInvalidArea() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(2, 0);
		
		boolean thrown = false;
		
		try {
			Square s = new Square(p1, p3, p2, p4);
		} catch (Exception e) {
			thrown = true;
		}
		
		assertTrue(thrown);
	}
	
	@Test
	void testPerimeter() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(2, 0);
		
		Square s = new Square(p1, p2, p3, p4);
		assertEquals(s.perimeter(), 8.0);
	}
	
	@Test
	void testEquals1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(2, 0);
		
		Square s = new Square(p1, p2, p3, p4);
		assertTrue(s.equals(s));
	}
	
	@Test
	void testEquals2() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(2, 0);
		
		Square s1 = new Square(p1, p2, p3, p4);
		Square s2 = new Square(p1, p2, p3, p4);
		assertTrue(s1.equals(s2));
	}
	
	@Test
	void testEquals3() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(2, 0);
		Point p5 = new Point(0, 3);
		Point p6 = new Point(3, 3);
		Point p7 = new Point(3, 0);
		
		Square s1 = new Square(p1, p2, p3, p4);
		Square s2 = new Square(p1, p5, p6, p7);
		assertFalse(s1.equals(s2));
	}
}
