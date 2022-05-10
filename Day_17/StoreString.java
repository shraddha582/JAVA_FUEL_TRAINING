import java.util.ArrayList;
import java.util.Iterator;

/*Create an ArrayList which will be able to store only Strings. 
Create a printAll method which will print 
all the elements using an Iterator
*/

public class StoreString {
    public static void main(String[] args) {
        
      // create ArrayList object
      ArrayList<String> ar;
      ar = new ArrayList<>();
     
      // add item in arraylist
      ar.add("A");
      ar.add("B");
      ar.add("C");
      ar.add("D");
      ar.add("E");
      
      // add item at specific index

      System.out.println("By using Iterator");
      Iterator<String> it = ar.iterator();
      while(it.hasNext()){
          System.out.println(it.next());
      }
    }
        
}
