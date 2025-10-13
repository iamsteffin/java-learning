package task10;
// Create a program that finds the maximum and minimum of three numbers using if-else
public class MinAndMax {
    public static void max(int a, int b , int c){ // we use void here because we are not returning any value instead
        if (a > b && a > c) {                     // we are just printing the largest number
            System.out.println(a + " is the largest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");

        }
    }

    public static void min (int a, int b, int c){
        if (a < b && a < c) {
            System.out.println(a + " is the smallest number");
        } else if (b < c && b < a) {
            System.out.println(b + " is the smallest number");
        } else {
            System.out.println(c + " is the smallest number");
        }
    }

    public static void main(String[] args){
        max(3,4,5);
        min(3,4,5);
    }
}