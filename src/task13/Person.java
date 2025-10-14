package task13;
// Create a class Person with variables name, age (instance variables), and a static variable population.
//Each time a new Person object is created, increase population by 1 and print the total population.

public class Person {
    String name;
    int age;
    static int population = 0; //when we use static there is only one copy of this population variable in the whole class

    public Person(String name, int age){ //this is constructor and the name shud be same as that of the class name
        this.name = name; // we are using this to get the instance variable from the class
        this.age = age;
        population = population + 1; // every time a new person object is created the population will increase by 1
        System.out.println("Total population is :" + population);
    }

    public static void main(String[] args){
        Person p1 = new Person("Bob", 20);
        Person p2 = new Person("Rob", 33);
    }
}
