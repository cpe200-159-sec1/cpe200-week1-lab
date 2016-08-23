import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pruet on 8/8/2559.
 */
public class Lab1_1Test {
    private Lab1_1 l1;
    @Before
    public void setUp() throws Exception {
        l1 = new Lab1_1();
    }

    @Test
    public void chooseMaxAscending() throws Exception {
        assertEquals(9, l1.chooseMax(1, 9));
    }

    @Test
    public void chooseMaxDescending() throws Exception {
        assertEquals(9, l1.chooseMax(9, 1));
    }

    @Test
    public void chooseMaxSame() throws Exception {
        assertEquals(1, l1.chooseMax(1, 1));
    }

    @Test
    public void chooseMaxZero() throws Exception {
        assertEquals(0, l1.chooseMax(0, 0));
    }

}