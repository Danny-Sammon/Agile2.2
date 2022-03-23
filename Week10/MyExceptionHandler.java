package Week10;

public class MyExceptionHandler extends Exception
{
    String message;
    public MyExceptionHandler(String errMessage)
    {
        message = errMessage;
    }

    public String getMessage()
    {
       return message;
    }
}
