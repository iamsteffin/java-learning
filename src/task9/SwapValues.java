package task9;
//Write a program that swaps two variables without using a third variable

public class SwapValues {
    public static void main(String[] args){
        int num1 = 99;
        int num2 = 1;
        System.out.println("before swapping: num1 = "+num1+" and num2 = "+num2);
        num1 = num1 + num2; // right now num1 = 100
        num2 = num1 - num2; // right now num2 = 100-1 = 99
        num1 = num1 - num2; // here num1 = 100-99 = 1
        System.out.println("after swapping: num1= "+num1+" and num2= "+num2);
    }
}
