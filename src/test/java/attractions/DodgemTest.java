package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;


    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(10,180.00,10.50 );
        visitor2 = new Visitor (19,120.00,100.50 );
        visitor3 = new Visitor (19,180.00,100.50 );
        visitor4 = new Visitor (19,220.00,100.50 );
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeHalfPrice() {
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.01);
    }
    @Test
    public void canChargeNormalPrice() {
        assertEquals(4.50, dodgems.priceFor(visitor3), 0.01);
    }

}
