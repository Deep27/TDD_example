import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ValuteTest
{
    @Test
    public void testMultiplication()
    {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(five.amount, 10);
    }
}
