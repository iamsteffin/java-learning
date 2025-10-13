package task6;

public class doubleConversion {

    public static int doubleToIntConversion(double n){
        int result = (int) n; //this is typecasting is done to eliminate the decimal part and convert to int.
        return result;
    }

    public static void main(String[] args){
        double number = 1.05;
        System.out.println("Before conversion: " + number);
        int convertedValue = doubleToIntConversion(number);
        System.out.println("After conversion: "+convertedValue);
        }
    }
