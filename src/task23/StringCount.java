package task23;
//Count Digits, Vowels, Consonants, and Spaces in a String
//Task:Write a program that takes a string and counts:


public class StringCount {


    public static void stringCheck(String str) {
        int vowels = 0;
        int digits = 0;
        int consonants = 0;
        int spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //System.out.println(ch);

            char chLower = Character.toLowerCase(ch);

            if (chLower == 'a' || chLower == 'e' || chLower == 'i' || chLower == 'o' || chLower == 'u') {
                vowels = vowels + 1;
                //System.out.println(vowels);
            } else if (chLower >= '0' && chLower <= '9') {
                digits = digits + 1;

            } else if (chLower == ' ') {
                spaces = spaces + 1;
            } else {
                consonants = consonants + 1;
                //System.out.println(consonants);
            }
        }
        System.out.println("Number of vowels:" +vowels);
        System.out.println("Number of digit:" +digits);
        System.out.println("Number of constants:" +consonants);
        System.out.println("Number of space:" +spaces);

    }

    public static void main(String[] args) {
        stringCheck("Hello this is me 222");

    }
}

