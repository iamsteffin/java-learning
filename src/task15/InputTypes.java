package task15;
import java.util.Scanner;

//Write a program that takes different types of inputs (int, double, String) and prints them in one formatted line using type conversion.

public class InputTypes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int intNumber = scanner.nextInt();

        System.out.println("Enter a double: ");
        double doubleNumber = scanner.nextDouble();

        System.out.print("Enter a string: ");
        String stringValue = scanner.next();

        scanner.close();
        System.out.println("The integer number is " +intNumber+ " the double number is: " +doubleNumber+ " the string is: "+stringValue);

    }
}
