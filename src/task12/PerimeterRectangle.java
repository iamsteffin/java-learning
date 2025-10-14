package task12;
//Write a program to calculate area and perimeter of a rectangle using float data type

public class PerimeterRectangle {

    public static float perimeter(float l, float w){
        float result = 2 * (l + w);
        return result;
    }

    public static void main(String[] args){
        float length = 2.1f;
        float width = 3.2f;
        System.out.println("The perimeter of the rectangle is: " +perimeter(length,width));
    }
}
