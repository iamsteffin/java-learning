package task2;

public class UsingVariables {
    String name = "Steffin";
    int age = 30;
    String profession = "engineer";

    public static void main(String[] args){
        UsingVariables person = new UsingVariables();
        System.out.println("my name is " +person.name+ " my profession is "+person.profession+ " and my age is "+person.age);
    }
}


// In this program, we define three instance variables: name, age, and profession.
// These variables are non-static, which means they belong to an object of the class.
// Since the main method is static, it cannot directly access non-static variables.
// To use them, we create an object of the class inside main() and access the variables through that object.
// Alternatively, we could make the variables static if we want to access them directly from main() without creating an object.

