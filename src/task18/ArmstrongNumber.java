package task18;

//Armstrong Number in Range Concepts: Loops, Math operators, Methods
//Task: Print all Armstrong numbers between 1 and 1000. A number is Armstrong if the sum of cubes of its digits
// equals the number (e.g. 153 → 1³+5³+3³=153).
//Hint: Use % and / to extract digits, then use a while loop.

import com.sun.source.tree.BreakTree;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n){
        int sum = 0;
        int originalNumber = n;
        while (n>0) {
            int digit = n % 10; //this will get the last digit
            sum = sum + (digit * digit * digit);
            n = n / 10; //remove last digit
        }return sum == originalNumber;

    }
    public static void main(String[] args){
        for (int i=1; i<=1000; i++){
            if(isArmstrong(i)){
            System.out.println(i);
            }
        }
    }
}
