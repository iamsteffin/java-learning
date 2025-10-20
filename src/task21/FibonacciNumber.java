package task21;

// Print Fibonacci Series up to N terms
//Write a method fibonacci(int n) to print Fibonacci series up to n terms.

public class FibonacciNumber {
    public static void fibonacci(int n){
        int first_number = 0;
        int second_number = 1;
        int sum = first_number + second_number;

        for (int i=0; i<n; i++){


            System.out.println(first_number); // the first number is always printed 0 which is constant
            first_number = second_number; // now first number =1
            second_number = sum; // second number =1
            sum = first_number + second_number; // sum =2
        }

    }

    public static void main(String[] args){
        fibonacci(10);
    }
}

// refernced for understanding - https://www.geeksforgeeks.org/java/java-fibonacci-series/