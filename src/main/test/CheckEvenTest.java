import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenTest {
    CheckEven even;

    @Before
    public void setUp() throws Exception {
        even=new CheckEven();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testisEven() {
        Boolean result=even.isEven(22);
        assertEquals(true,result);
        assertNotEquals(false,result);
        assertFalse(false);
        assertTrue(true);
    }
    @Test
    public void testisNotEven() {
        Boolean result=even.isEven(29);
        assertEquals(false,result);
        assertNotEquals(true,result);
        assertFalse(true);
        assertTrue(false);
    }
}