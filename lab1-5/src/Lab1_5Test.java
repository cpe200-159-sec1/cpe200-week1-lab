import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pruet on 8/8/2559.
 */
public class Lab1_5Test {
    private Lab1_5 l5;
    @Before
    public void setUp() throws Exception {
        l5 = new Lab1_5();
    }

    @Test
    public void sumSquareDifferenceTen() throws Exception {
        assertEquals(2640, l5.sumSquareDifference(10));
    }

    @Test
    public void sumSquareDifferenceOne() throws Exception {
        assertEquals(0, l5.sumSquareDifference(1));
    }

    @Test
    public void sumSquareDifferenceTwenty() throws Exception {
        assertEquals(41230, l5.sumSquareDifference(20));
    }

}