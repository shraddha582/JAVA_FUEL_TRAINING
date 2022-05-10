/*Given a string, return a new string made of n copies of the first 2 chars \
of the original string where n is the length of the string. The string may be any length.
 If there are fewer than 2 chars, use whatever is there. If input is "Wipro" then
  output should be "WiWiWiWiWi"*/


public class Exercise3 {
    public static void main(String[] args) {
        
        String str = "abc";
        int length_of_str = str.length();
        char _CharAt0 = str.charAt(0);
        char _CharAt1 = str.charAt(1);
        System.out.println((_CharAt0 + "" + _CharAt1).repeat(length_of_str));

    }
    
}
