import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        int i=0;
        String ch;
        do{
            System.out.println(&quot;Enter number:&quot;);
            arr[i]=sc.nextInt();
            i++;
            System.out.println(&quot;Do you want to continue(y/n)&quot;);
            ch=sc.next();
        }while(ch.equals(&quot;y&quot;));
        //Searching
        int x;
        System.out.println(&quot;Enter number to search&quot;);
        x=sc.nextInt();
        for(i=0;i&lt;arr.length;i++){
            if(x==arr[i]){
                System.out.println(&quot;Found&quot;);
                break;
            }
        }
    }
}
