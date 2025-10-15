package task16;
// Create a simple menu-driven calculator using switch with int and double operations — demonstrate both implicit and explicit type conversions

import java.util.Scanner;


public class Calculator {
    public static double calculator(int choice){

        double result = 0;
        System.out.println("Calculator Menu:");
        System.out.println("1 for Add");
        System.out.println("2 for Subtract");
        System.out.println("3 for Multiply");
        System.out.println("4 for Divide");
        System.out.println("Enter choice: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        System.out.println("Enter first num: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second num: ");
        double num2 = scanner.nextDouble();


        switch (choice){
            case 1:
                return result=num1 + num2;
            case 2:
                return result = num1 - num2;
            case 3:
                return result=num1 * num2;
            case 4:
                return result=num1 / num2;
        }
        scanner.close();
        return result;

    }

    public static void main(String[] args){
        System.out.println("the result is: " +calculator(3));

    }
}
