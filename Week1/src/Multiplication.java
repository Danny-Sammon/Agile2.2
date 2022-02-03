import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int sum = 0;

        Scanner scanNumbers = new Scanner(System.in);

        System.out.println("Enter Number 1");
        num1 = scanNumbers.nextInt();

        System.out.println("Enter Number 2");
        num2 = scanNumbers.nextInt();

        System.out.println("Enter Number 3");
        num3 = scanNumbers.nextInt();

        if ((num1 < 0) || (num2 < 0) || (num3 < 0))
        {
            System.out.println("Error: Invalid Values");
        }
        else
        {
            sum = num1 * num2 * num3;
            System.out.println("Total of " + num1 + " * " + num2 + " * " + num3 +" is " + sum);
        }
    }
}
