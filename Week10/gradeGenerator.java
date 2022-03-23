package Week10;

public class gradeGenerator {
    public double generatorGrade(double cw, double exam) throws MyExceptionHandler
    {
        //throw new RuntimeException("No product code yet");
        //return cw + exam;
        /*if(exam >= 0 || exam<= 75 ||cw >= 0 || cw<= 25)
        {
            throw new MyExceptionHandler("Invalid values entered. Please Enter valid exam 0-75 and valid" + " cw mark 0-25");
        }*/
        Double FinalGrade = cw+exam;
        char grade = ' ';

        if(cw + exam >=70)
        {
            if(exam >= 0 || exam<= 75 || cw >= 0 || cw<= 25)
            System.out.print("Grade: " );
            System.out.println(grade = 'A' );
            System.out.println("Percentage: "+FinalGrade);
        }
        else if(cw + exam >=50 && cw + exam < 70)
        {
            if(exam >= 0 || exam<= 75 || cw >= 0 || cw<= 25)
            System.out.print("Grade: " );
            System.out.println(grade = 'B');
            System.out.println("Percentage: "+FinalGrade);
        }
        else if(cw + exam >=30 && cw + exam < 50)
        {
            if(exam >= 0 || exam<= 75 || cw >= 0 || cw<= 25)
            System.out.print("Grade: " );
            System.out.println(grade = 'C');
            System.out.println("Percentage: "+FinalGrade);
        }
        else
        {
            if(exam >= 0 || exam<= 75 || cw >= 0 || cw<= 25)
            System.out.print("Grade: " );
            System.out.println(grade = 'D');
            System.out.println("Percentage: "+FinalGrade);
        }

        return grade;
    }

}
