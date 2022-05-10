// 1.Write a Program that will check whether a given String is Palindrome or not

public class Exercise1_Check_Palindrome{

    static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;

        while (i < j){
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        
        String str = "NaYan";
        str = str.toLowerCase();

        if (isPalindrome(str)) {
            System.out.println("It is Palindrom String");
        }
        else{
            System.out.println("It is not Palindrom String");
        }
    }
}
