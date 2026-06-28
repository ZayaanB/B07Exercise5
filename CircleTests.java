import static org.junit.jupiter.api.Assertions.*;

import exercise4.Point;
import org.junit.jupiter.api.Test;

class CircleTests {
    private static final Point ORIGIN = new Point(0, 0);

    @Test
    void testCircumferenceRadius3() {
        Circle c = new Circle(ORIGIN, 3);
        assertEquals(2 * Math.PI * 3, c.circumfrenece());
    }

    @Test
    void testCircumferenceRadius7() {
        Circle c = new Circle(ORIGIN, 7);
        assertEquals(2 * Math.PI * 7, c.circumfrenece());
    }

    @Test
    void testAreaRadius3() {
        Circle c = new Circle(ORIGIN, 3);
        assertEquals(Math.PI * 9, c.area());
    }

    @Test
    void testAreaRadius7() {
        Circle c = new Circle(ORIGIN, 7);
        assertEquals(Math.PI * 49, c.area());
    }

    @Test
    void testAreaDefaultRadius() {
        Circle c = new Circle(ORIGIN);
        assertEquals(Math.PI, c.area());
    }

    @Test
    void testNoArgConstructorOrigin() {
        Circle c = new Circle();
        assertEquals(new Point(0, 0), c.origin);
    }

    @Test
    void testNoArgConstructorRadiusIsZero() {
        Circle c = new Circle();
        assertEquals(0, c.radius);
        assertEquals(0.0, c.circumfrenece());
        assertEquals(0.0, c.area());
    }
}
