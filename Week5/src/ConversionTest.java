import junit.framework.TestCase;

public class ConversionTest extends TestCase
{
    //Test #:
    //Objective:
    //Input(s):
    //Expected Output:

    //Test 1:
    //Objective: Invalid Values below 0.25 for ex.Rate and invalid values below 100
    //Input(s):  ex.Rate = 0.21 . amtUSD = 87.95
    //Expected Output: -99.00
    public void testUSDtoEuro001()
    {
        Conversion testObj = new Conversion();
        assertEquals(-99.00,testObj.convertUSDtoEuro(87.95,0.21),2.00);

    }
    //Test 2:
    //Objective: Valid values
    //Input(s): ex.Rate = 0.88 . amtUSD = 750
    //Expected Output: 660.36
    public void testUSDtoEuro002()
    {
        Conversion testObj = new Conversion();
        assertEquals(660.36,testObj.convertUSDtoEuro(750,0.88),2.00);

    }
    //Test 3:
    //Objective: Invalid Values below 2.8 for ex.Rate and invalid values above 10000
    //Input(s):  ex.Rate = 3.12 , amtUSD = 11187.95
    //Expected Output: -99.00
    public void testUSDtoEuro003()
    {
        Conversion testObj = new Conversion();
        assertEquals(-99.00,testObj.convertUSDtoEuro(11187.95,3.12),2.00);

    }
}//end of class