/*Given a string, if the first or last chars are 'x', 
return the string without those 'x' chars, and otherwise 
return the string unchanged. If the input is "xHix", then output is "Hi" */


public class Exercise7 {
    public static void main(String[] args) {
        
        String s = "xHix";
        String s1 = s.toLowerCase();

        char chatAt0 = s1.charAt(0);
        char chatAtLast = s1.charAt(s.length() -1);
   
        if (chatAt0 == chatAtLast) {
            System.out.println(s.substring(1, s1.length() - 1));
        }
    }
    
}
