package task22;
// 6. Find GCD and LCM of Two Numbers
//Write two methods — one for GCD (Greatest Common Divisor) and one for LCM (Least Common Multiple).
//For GCD: loop till min(a, b), find the largest divisor.
//For LCM: use formula LCM = (a*b)/GCD.

// we are defining gcd as 1 because every number is divisible by 1 and we try to find the smallest number because
// in gcd the divisor can be till the smallest number.
// we use the for loop with the condition where the loops end at smallest number
// then we use compare operator and if both a and b are completely divisible then that is gcd value and loop continues
// for lcm we use the formula lcm = (a*b)/gcd(a,b.
public class GCDAndLCMCheck {

    public static int gcd(int a, int b){
        int gcd = 1;
        int smallest;

        if (a < b) {
            smallest = a;
        } else{
            smallest = b;
        }

        for (int i = 1; i<=smallest; i++){
            if(a%i == 0 && b%i == 0){
            gcd = i;
            }
        }
        return gcd;
    }


    public static int lcm(int a, int b){
        int lcm = (a*b)/gcd(a,b);
        return lcm;
    }
    public static void main(String[] args){
        System.out.println(gcd(10,20));
        System.out.println(lcm(10,20));
    }
    }

