

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PayDayTest.
 *
 * Michael Doll
 * 10.18.2019
 */
public class PayDayTest
{
    /**
     * Default constructor for test class PayDayTest
     */
    public PayDayTest()
    {

        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    @Test
    public void evaluatePrintPayTest(){
        PayDay payDayTest = new PayDay("Kris",21.5,10,.05);
        assertEquals("Kris 215.00 10.75 204.25",payDayTest.printPay("Kris",21.5,10,.05));
    }   
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    

}
