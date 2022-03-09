import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Task1 {
    public static void main(String[] args) throws IOException{ //Simple calculator
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float FirstNumber, SecondNumber,Subtraction,Multiplication,Addition,Division;
        System.out.println("Enter the first Number: ");
        FirstNumber= Float.parseFloat(br.readLine());
        System.out.println("Enter second number: ");
        SecondNumber= Float.parseFloat(br.readLine());

        System.out.println("The first number you entered is: " + FirstNumber );
        System.out.println("The second number you entered is: " + SecondNumber);

        Addition= FirstNumber+SecondNumber;
        Subtraction= FirstNumber-SecondNumber;
        Multiplication=FirstNumber*SecondNumber;
        Division=FirstNumber/SecondNumber;

        System.out.println("Addition= " +Addition);
        System.out.println("Subtraction= " +Subtraction);
        System.out.println("Multiplication= "+ Multiplication);
        System.out.println("Division= "+Division);
        System.out.println();


    }
}



