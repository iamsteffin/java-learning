package task19;

public class StrongNumberCheck {
    public static boolean strongNumber(int n) {
        int originalNumber = n;
        int sum = 0;
        int factorial = 1;

        while (n > 0) {
            int digit = n % 10; //extracting last digit
            factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }
            sum = sum + factorial;
            n = n / 10;

        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number");
            return true;
        } else {
            System.out.println(originalNumber + " is not a Strong Number");
            return false;
        }
    }

    public static void main(String[] args){
        strongNumber(145);
        }}



