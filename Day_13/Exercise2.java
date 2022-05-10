/*Given two strings, append them together (known as "concatenation")
 and return the result. However, if the concatenation creates a double-char, 
 then omit one of the chars. If the inputs are “Mark” and “Kate” then 
 the ouput should be “markate”. (The output should be in lowercase*/ 



public class Exercise2 {
    public static void main(String[] args) {
        
        String str1 = "Mark";
        String str2 = "Kate";

        String ConcatedString = str1 + "" + str2;
        System.out.println(ConcatedString.toLowerCase());
    }
    
}
