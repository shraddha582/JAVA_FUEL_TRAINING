/* Given a string, return a version without the first and last char, 
so "Wipro" yields "ipr". 
The string length will be at least 2*/


public class Exercise5 {
    public static void main(String[] args) {
        
        String str = "Wipro";
        int length = str.length();
        System.out.println(str.substring(1,length-1));
    }
    
}
