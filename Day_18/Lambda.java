@FunctionalInterface

interface A<T>{
    T add( T x , T y );
}

public class Lambda {
    public static void main(String[] args) {
        
        A<Integer> a = (x,y) -> x+y;

        System.out.println(a.add(200,300));
    }
    
}
