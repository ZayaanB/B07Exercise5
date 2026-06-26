package exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTests {
    private static final Point P1 = new Point(0, 0);
    private static final Point P2 = new Point(4, 0);
    private static final Point P3 = new Point(4, 3);
    private static final Point P4 = new Point(0, 3);

    private static final Rectangle RECTANGLE = new Rectangle(P1, P2, P3, P4);

    @Test
    void testPerimeter() {
        assertEquals(RECTANGLE.perimeter(), 14.0);
    }

    @Test
    void testArea() {
        assertEquals(RECTANGLE.area(), 12.0);
    }

    @Test
    void testEqualTrue() {
        Rectangle r1 = new Rectangle(P1, P2, P3, P4);
        Rectangle r2 = new Rectangle(P1, P2, P3, P4);
        assertTrue(r1.equals(r2));
    }

    @Test
    void testEqualFalse() {
        Rectangle r1 = new Rectangle(P1, P2, P3, P4);
        Point q1 = new Point(0, 0);
        Point q2 = new Point(5, 0);
        Point q3 = new Point(5, 4);
        Point q4 = new Point(0, 4);
        Rectangle r2 = new Rectangle(q1, q2, q3, q4);
        assertFalse(r1.equals(r2));
    }

    @Test
    void testEqualSelf() {
        assertTrue(RECTANGLE.equals(RECTANGLE));
    }

    @Test
    void testHashCode() {
        Rectangle r1 = new Rectangle(P1, P2, P3, P4);
        Rectangle r2 = new Rectangle(P1, P2, P3, P4);
        assertEquals(r1.hashCode(), r2.hashCode());
    }
}
