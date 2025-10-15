package task17;
// Write a method isPerfect(int num) that checks if the number is a perfect number.
//A number is perfect if the sum of its divisors (excluding itself) equals the number.

public class PerftectNumber {

    public static boolean isPerfect(int n){
        int sum = 0; //initialize sum to 0
        for (int i=1; i<=n/2; i++){ //we initialse i to 1 because all number is divisble by 1 add we check till n/2 because no number is divisible by a number greater than its half
            if (n % i == 0){
                sum = sum +i; // if the i is able to divide n then the sum will be incremented by i.
            }
        }
        if (sum == n){ // after the for loop sum will be checked against the number and if its equal then its perfect number
            return true;
        } else{
            return false;
        }

    }

public static void main(String[] args){
    System.out.println(isPerfect(6));

}

}