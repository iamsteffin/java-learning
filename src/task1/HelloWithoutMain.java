package task1;

public class HelloWithoutMain {
    static {
        System.out.println("Hello, Java!");
        // prevent the JVM from searching for a main method and throwing NoSuchMethodError
        System.exit(0);
    }
}
