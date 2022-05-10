import java.util.*;

public class Demo {
    public static void main(String[] args) {
        
        Instrument[] arr;
        arr = new Instrument[3];
            
            arr[0] = new Piano();
            arr[1] = new Flute();
            arr[2] = new Guitar();
        

            Scanner sc = new Scanner(System.in);
            int i ;
            System.out.println("Enter index from 0 to 2:");
            i = sc.nextInt();

            if(arr[i] instanceof Piano){
                System.out.println("it is object of Piano.");
            }
            else if(arr[i] instanceof Flute){
                System.out.println("It is object of Flute.");
            }
            else{
                System.out.println("It is object of Guitar");
            }
    }
    
}
