import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    CandyflossStall candyflossStall;
    RollerCoaster rollerCoaster;


    @Before
    public void setUp() {
        themePark = new ThemePark();
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 3);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void canAddStall() {
        themePark.addStall(candyflossStall);
        assertEquals(1, themePark.themeParkCount());
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(rollerCoaster);
        themePark.addStall(candyflossStall);
        assertEquals(2, themePark.themeParkCount());
    }
}
