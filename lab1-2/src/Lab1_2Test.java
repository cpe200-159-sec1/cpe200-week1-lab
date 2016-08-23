import org.junit.Before;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by pruet on 8/8/2559.
 */
public class Lab1_2Test {
    private Lab1_2 l2;
    @Before
    public void setUp() throws Exception {
        l2 = new Lab1_2();
    }

    @Test
    public void isEqualsTrue() throws Exception {
        assertEquals(true, l2.isEquals(1,1));
    }

    @Test
    public void isEqualsFalse() throws Exception {
        assertEquals(false, l2.isEquals(1,2));
    }

    @Test
    public void isEqualsTrueZero() throws Exception {
        assertEquals(true, l2.isEquals(0,0));
    }

}