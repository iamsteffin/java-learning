package task14;
//Write a Java program to find if a number is odd or even using ternary operator and demonstrate automatic type conversion

public class OddEven {
    public static String oddOrEven(int n){
        String result = (n % 2 ==0) ? "Even" : "Odd";
        return result;
    }

    public static void main(String[] args){
        int number = 8;
        System.out.println("the number is : " +oddOrEven(number));

        double convertedValue = number;
        System.out.println("The converted number is: " + convertedValue);
    }
}
