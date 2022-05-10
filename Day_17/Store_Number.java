import java.util.ArrayList;

/* Create an ArrayList which will be able to store only numbers 
like int,float,double,etc, but not any 
other data type*/

public class Store_Number {
    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(10);

        numbers.add(10.20f);

        numbers.add(30);

        numbers.add(40.20);

        numbers.add(50000000000000000D);

        // using for each loop

        for(Number n : numbers) {
            System.out.println(n);
        }
    }

}
