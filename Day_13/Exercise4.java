/* Given a string of even length, return the first half. 
So the string "CatDog" yields "Cat". If the string length is odd number
 then return null*/

public class Exercise4 {
    public static void main(String[] args) {

        String str = "CatDog";
        int len = str.length();
        int halfStringLength = len / 2;

        if (len % 2 == 0) {
            System.out.println(str.substring(0, halfStringLength));
        } else {
            System.out.println("Odd number length of string");
        }
    }

}
