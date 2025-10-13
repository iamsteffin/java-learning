//	Widening Conversion (Implicit):
//Convert an int to a double and print before & after values.

package task5;

public class WideningConversion {
    public static double intConversion(int n){
        double result = (double) n;
        return result;
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("Before conversion: " + n);
        double convertedValue = intConversion(n);
        System.out.println("After conversion: " + convertedValue);
    }
}
