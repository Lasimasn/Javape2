import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    private PalindromeCheck palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome=new PalindromeCheck();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testNumPalindromeChecker() {
        String result=palindrome.PalindromeDigit(121);
        assertEquals("Number is palindrome",result);
        assertNotEquals("Number is not palindrome",result);

    }
    @Test
    public void testNumNotPalindromeChecker() {
        String result=palindrome.PalindromeDigit(1212);
        assertEquals("Number is not palindrome",result);
        assertNotEquals("Number is palindrome",result);

    }
    @Test
    public void testAlphaPalindromeChecker() {
        String result=palindrome.PalindromeAlpha("saas");
        assertEquals("Is palindrome",result);
        assertNotEquals("Not palindrome",result);

    }
    @Test
    public void testAlphaNotPalindromeChecker() {
        String result=palindrome.PalindromeAlpha("oops");
        assertEquals("Not palindrome",result);
        assertNotEquals("Is palindrome",result);

    }

}