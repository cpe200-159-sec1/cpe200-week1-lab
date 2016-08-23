import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lab_13Test {
    private Lab1_3 l3;
    @Before
    public void setUp() throws Exception {
        l3 = new Lab1_3();
    }

    @Test
    public void findMaxAscending() throws Exception {
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(9, l3.findMax(inputs));
    }
    @Test
    public void findMaxDescending() throws Exception {
        int[] inputs = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertEquals(9, l3.findMax(inputs));
    }
    @Test
    public void findMaxRandom() throws Exception {
        int[] inputs = {5, 8, 9, 6, 4, 1, 3, 2, 7};
        assertEquals(9, l3.findMax(inputs));
    }

    @Test
    public void findMaxSingle() throws Exception {
        int[] inputs = {9};
        assertEquals(9, l3.findMax(inputs));
    }

}