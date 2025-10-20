package task20;
//🔢 4. Sum of Digits Until Single Digit Concepts: Loops, Conditionals, Methods
//Task: Given a number, repeatedly add its digits until you get a single digit.
//Example: 9875 → 9+8+7+5=29 → 2+9=11 → 1+1=2.


public class SumOfDigits {

    public static int sumOfDigit(int n){
        int sum =0;
        while(n>0){
            //int sum =0;
            int digit = n%10; //exttracting last digit
            sum = sum + digit;
            n = n/10;
        }
        //System.out.println(sum);
        int newSum = 0;
        while(sum > 0){  // sum =15
            //int newSum = 0;
            int newDigit = sum %10;  //extracting last digit = 5 now
            //System.out.println(newDigit);
            newSum = newSum + newDigit; // newsum =0+5=5
            //System.out.println(newSum);
            sum = sum /10; // sum =1 now
            n = newSum;
        }
        //System.out.println(n);
        return n;


    }
    public static void main(String[] args){
        System.out.println(sumOfDigit(99999999));
    }

}

// initiate sum variable to 0 since we are doing addition
// we get the last digit everytime and add it to sum and then remove the last digit and repeat
// use the while statement 2 times one for adding the digits to single digit