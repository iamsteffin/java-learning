package task4;

public class MultiplicationTable {

    public static void multiple(int n){
        for (int i=1; i<=10; i++) { //here we use the i which is always initiated to 1 and will increment till 10
            System.out.println(n +"*" +i +"=" + n*i); // logic - n*i=result
        }
    }

    public static void main(String[] args){
        multiple(2);
    }
}
