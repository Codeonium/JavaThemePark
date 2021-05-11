package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(10,180.00,10.50 );
        visitor2 = new Visitor (19,120.00,100.50 );
        visitor3 = new Visitor (19,180.00,100.50 );
        visitor4 = new Visitor (19,220.00,100.50 );

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void isNotAllowedToShort(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void isNotAllowedToTooYoung(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isAllowedToRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void hasPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeDoublePrice() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.01);
    }
    @Test
    public void canChargeNormalPrice() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor3), 0.01);
    }


}
