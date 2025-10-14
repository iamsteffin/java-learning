package task11;

//Write a program that demonstrates the difference between local, instance, and static variables

public class VariableDemonstration {
    static String staticVariable = "i m static variable"; // Static variable. Static variable must be defined outside any function inside main class.
                                                          // static variable can be accessed by any class or method within the package.

   String instanceVariable = "I am an instance variable"; // Instance variable; //instance variable is must also be defined in the class not method
                                                          // we need to create an object inside the main method to access this instance variable


    public void localVariable(){
        String localVar = "I am local Variable"; // local variable is local to this method only. no class or other methods can access this
    }

    public static void main(String[] args){
        System.out.println(staticVariable); //access static variable inside the main method directly
        VariableDemonstration instancevar = new VariableDemonstration();
        System.out.println(instancevar.instanceVariable);
    }


}
