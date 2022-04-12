import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        char operator;
        System.out.println("Enter 1st number :");
        a = s.nextInt();
        System.out.println("Enter 2nd number :");
        b = s.nextInt();
        System.out.println("Enter operation: ");
        operator = s.next().charAt(0);

        double addition = a + b;
        double subtraction = a - b;
        double multiplication = a * b;
        double division = a / b;

        switch (operator)
        {
            case '+' :
            {
                System.out.print("Total after Addition is : " +addition);
                break;
            }
            case '-' :
            {
                System.out.print("Total after Subtraction is : " +subtraction);
                break;
            }
            case '*' :
            {
                System.out.print("Total after Multiplication is : " +multiplication);
                break;
            }
            case '/' :
            {
                System.out.print("Total after Division is : " +division);
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }
        }

        
    }
}