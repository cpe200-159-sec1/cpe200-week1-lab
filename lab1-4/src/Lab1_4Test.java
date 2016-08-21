import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

public class Lab1_4Test {
    private Lab1_4 l;
    @Before
    public void setUp() throws Exception {
        l = new Lab1_4();
    }

    @Test
    public void findAverageZero() throws Exception {
        int[] inputs = {0, 0, 0, 0, 0, 0 ,0};
        assertEquals(0.0f, l.findAverage(inputs), 0);
    }
    @Test
    public void findAverageSame() throws Exception {
        int[] inputs = {5, 5, 5, 5, 5, 5 ,5 ,5};
        assertEquals(5.0f, l.findAverage(inputs), 0);
    }
    @Test
    public void findAverageSingle() throws Exception {
        int[] inputs = {5};
        assertEquals(5.0f, l.findAverage(inputs), 0);
    }
    @Test
    public void findAverageMultiple() throws Exception {
        int[] inputs = {1, 2, 3, 4, 5};
        assertEquals(3.0f, l.findAverage(inputs), 0);
    }
    @Test
    public void findAverageMultipleFloat() throws Exception {
        int[] inputs = {1, 2, 3, 4, 5, 6};
        assertEquals(3.5f, l.findAverage(inputs), 0);
    }
    @Test
    public void findAverageMultipleFloatInfinity() throws Exception {
        int[] inputs = {1, 2, 4};
        assertEquals(2.3333f, l.findAverage(inputs), 0.0001);
    }


}