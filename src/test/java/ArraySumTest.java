import org.junit.Test;
import static org.junit.Assert.assertEquals;
 
public class ArraySumTest {
    @Test
    public void testSum() {
        ArraySum obj = new ArraySum();
        assertEquals(100, obj.sum(new int[]{10, 20, 30, 40}));
    }
}
