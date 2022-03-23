package Week10;

import Week5.Conversion;
import junit.framework.TestCase;

public class gradeGeneratorTest extends TestCase {
    //Test 1:
    //Objective: Invalid Values above 75 for exam and invalid values above 25
    //Input(s):  exam = 76, cw = 28
    //Expected Output: F
    public void testgradeGenerator001()
    {
        try{
            gradeGenerator testObj = new gradeGenerator();
            assertEquals('F',testObj.generatorGrade(28,76),2);
        }
        catch (MyExceptionHandler e)
        {
            fail("No exception expected");
        }


    }
    //Test 2:
    //Objective: valid Values between 0-75 for exam and invalid values above 25
    //Input(s):  exam = 70, cw = 26
    //Expected Output: A
    public void testgradeGenerator002()
    {
        try{
            gradeGenerator testObj = new gradeGenerator();
            assertEquals('F',testObj.generatorGrade(26,70),2);
        }
        catch (MyExceptionHandler e)
        {
            fail("No exception expected");
        }


    }
    //Test 3:
    //Objective: invalid Values above 0-75 for exam and valid values between 0-25
    //Input(s):  exam = 78, cw = 23
    //Expected Output: A
    public void testgradeGenerator003()
    {
        try{
            gradeGenerator testObj = new gradeGenerator();
            assertEquals('F',testObj.generatorGrade(23,78),2);
        }
        catch (MyExceptionHandler e)
        {
            fail("No exception expected");
        }

    }
    //Test 4:
    //Objective: valid Values between 0-75 for exam and valid values between 0-25
    //Input(s):  exam = 70, cw = 23
    //Expected Output: A
    public void testgradeGenerator004()
    {
        try{
            gradeGenerator testObj = new gradeGenerator();
            assertEquals('A',testObj.generatorGrade(23,70),2);
        }
        catch (MyExceptionHandler e)
        {
            fail("No exception expected");
        }

    }

    //Test 5:
    //Objective: valid Values between 0-75 for exam and valid values between 0-25
    //Input(s):  exam = 40, cw = 25
    //Expected Output: B
    public void testgradeGenerator005()
    {
        try{
            gradeGenerator testObj = new gradeGenerator();
            assertEquals('B',testObj.generatorGrade(25,40),2);
        }
        catch (MyExceptionHandler e)
        {
            fail("No exception expected");
        }

    }
    //Test 6:
    //Objective: valid Values between 0-75 for exam and valid values between 0-25
    //Input(s):  exam = 40, cw = 25
    //Expected Output: C
    public void testgradeGenerator006()
    {
        try{
            gradeGenerator testObj = new gradeGenerator();
            assertEquals('F',testObj.generatorGrade(26,40),2);
        }
        catch (MyExceptionHandler e)
        {
            fail("No exception expected");
        }

    }
    //Test 7:
    //Objective: valid Values between 0-75 for exam and valid values between 0-25
    //Input(s):  exam = 15, cw = 25
    //Expected Output: C
    public void testgradeGenerator007()
    {
        try{
            gradeGenerator testObj = new gradeGenerator();
            assertEquals('C',testObj.generatorGrade(15,25),2);
        }
        catch (MyExceptionHandler e)
        {
            fail("No exception expected");
        }

    }
    //Test 8:
    //Objective: valid Values between 0-75 for exam and valid values between 0-25
    //Input(s):  exam = 8, cw = 15
    //Expected Output: D
    public void testgradeGenerator008()
    {
        try{
            gradeGenerator testObj = new gradeGenerator();
            assertEquals('C',testObj.generatorGrade(8,15),2);
        }
        catch (MyExceptionHandler e)
        {
            fail("No exception expected");
        }

    }

}