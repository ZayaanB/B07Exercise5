package exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise4Test {

	@Test
	void testDistance1() {
		Point origin = new Point(0, 0);
		Point p = new Point(4, 3);
		
		assertEquals(origin.distance(p), 5.0);
	}
	
	@Test
	void testDistance2() {
		Point origin = new Point(4, 3);
		Point p = new Point(4, 3);
		
		assertEquals(origin.distance(p), 0.0);
	}
	
	@Test
	void testDistance3() {
		Point origin = new Point(0, 0);
		Point p = new Point(0, 1);
		
		assertEquals(origin.distance(p), 1.0);
	}
	
	@Test
	void testHashCode1() {
		Point p = new Point(0, 0);
		Point q = new Point(0, 0);
		
		assertEquals(p.hashCode(), q.hashCode());
	}
	
	@Test
	void testHashCode2() {
		Point p = new Point(1, 2);
		Point q = new Point(-1, -2);
		
		assertNotEquals(p.hashCode(), q.hashCode());
	}
	
	@Test
	void testHashCode3() {
		Point p = new Point(1, 2);
		Point q = new Point(2, 1);
		
		assertNotEquals(p.hashCode(), q.hashCode());
	}
	
	@Test
	void testEquals1() {
		Point p = new Point(1, 2);
		
		assertTrue(p.equals(p));
	}
	
	@Test
	void testEquals2() {
		Point p = new Point(1, 2);
		Point q = new Point(1, 2);
		
		assertTrue(p.equals(q));
	}
	
	@Test
	void testEquals3() {
		Point p = new Point(1, 2);
		
		assertFalse(p.equals(null));
	}
	
	@Test
	void testEquals4() {
		Point p = new Point(1, 2);
		Triangle t = new Triangle(p, p, p);
		
		assertFalse(p.equals(t));
	}
	
	@Test
	void testEquals5() {
		Point p = new Point(1, 2);
		Point q = new Point(2, 2);
		
		assertFalse(p.equals(q));
	}
	
	@Test
	void testEquals6() {
		Point p = new Point(1, 2);
		Point q = new Point(1, 1);
		
		assertFalse(p.equals(q));
	}
	
	@Test
	void testPerimeter1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(4, 0);
		Point p3 = new Point(0, 3);
		Triangle t = new Triangle(p1, p2, p3);

		
		assertEquals(t.perimeter(), 12.0);
	}
	
	@Test
	void testPerimeter2() {
		Point p1 = new Point(0, 0);
		Triangle t = new Triangle(p1, p1, p1);
		
		assertEquals(t.perimeter(), 0.0);
	}
	
	@Test
	void testPerimeter3() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(4, 0);
		Triangle t = new Triangle(p1, p2, p1);

		
		assertEquals(t.perimeter(), 8.0);
	}
	
	@Test
	void testEquilateral1() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(Math.sqrt(5), 0);
		Point p3 = new Point(Math.sqrt(5)/2, Math.sqrt(15)/2);
		Triangle t = new Triangle(p1, p2, p3);

		assertTrue(t.isEquilateral());
	}
	
	@Test
	void testEquilateral2() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(100, 0);
		Point p3 = new Point(-5, 100);
		Triangle t = new Triangle(p1, p2, p3);

		assertFalse(t.isEquilateral());
	}
}
