public class ExceptionHandle {
     static int div(int x, int y){
        int z = 0;
        try {
            z = x/y;
        } catch (ArithmeticException e) {
           throw e;
        }
        return z;
    }
    public static void main(String[] args) {
        int a;
        a = div(10 , 0);
        System.out.println("div is " + a);
    }
    
}
