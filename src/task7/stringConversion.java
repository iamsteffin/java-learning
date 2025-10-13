package task7;

import java.util.Scanner;

public class stringConversion {
    public static int stringToInt(String s){
        int result = Integer.parseInt(s); //https://www.tutorialspoint.com/java/number_parseint.htm
        result = result + 10;
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //https://www.geeksforgeeks.org/java/scanner-class-in-java/
        System.out.println("Enter a number: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.print("converted number to int: " +stringToInt(input));
    }
}
