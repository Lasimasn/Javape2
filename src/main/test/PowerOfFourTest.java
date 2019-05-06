import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {
    PowerOfFour power;

    @Before
    public void setUp() throws Exception {
        power=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testisPower() {
        String result=power.isPower(256);
        assertEquals("Number 256 is a power of 4",result);
        assertNotEquals("Number 256 is not a power of 4",result);
    }

    @Test
    public void testisNotPower() {
        String result=power.isPower(156);
        assertEquals("Number 156 is not a power of 4",result);
        assertNotEquals("Number 156 is a power of 4",result);
    }
}