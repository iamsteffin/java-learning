//Write a program that takes two numbers from the user and
// prints their sum, difference, product, and quotient - https://www.w3schools.com/java/java_user_input.asp

package task3;

import java.util.Scanner;

public class UserInput {    //pubic means can access this method from anywhere inside this project
    public static int add(int a,int b) { //static means we can call the method from our main without creating obj
        return a + b;                           //int is the return type of this method it must return a int

    }

    public static int subtract(int a, int b){
        return a - b;

        }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double division(int a, int b){
        return (double) a / b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int FirstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int SecondNumber = scanner.nextInt();
        scanner.close();

        System.out.println("Add: " + UserInput.add(FirstNumber,SecondNumber));
        System.out.println("Subtract: " + UserInput.subtract(FirstNumber, SecondNumber));
        System.out.println("Multiple: " + UserInput.multiply(FirstNumber, SecondNumber));
        System.out.println("Division: " + UserInput.division(FirstNumber, SecondNumber));


    }
    }
