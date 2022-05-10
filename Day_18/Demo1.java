import java.util.stream.*;

public class Demo1 {
    public static void main(String[] args) {
        
        Stream<Integer> s1 = Stream.of(10,20,30);
        s1.forEachOrdered(p -> System.out.println(p));
        Integer arr[] = {1,2,3,4};
        Stream<Integer> s2 = Stream.of(arr);
        
        s2.forEachOrdered(p -> System.out.println(p*p));
    }
    
}
