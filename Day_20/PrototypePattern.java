import java.util.*;

class Employee implements Cloneable {
    ArrayList<String> emp;

    Employee() {
        emp = new ArrayList<>();
    }

    Employee(ArrayList<String> e) {
        emp = e;
    }

    void loadData(){
        emp.add("1. Pankaj"); 
        emp.add("2. Virendra");
        emp.add("3. Shubham");
        emp.add("4. Raj");
        emp.add("5. Pratik");
    }

    void show(){
        for(String s : emp){
            System.out.println(s);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        ArrayList<String> emp2;
        emp2 = new ArrayList<>();
        for (String s : emp) {
            emp2.add(s);
        }
        Employee obj = new Employee(emp2);
        return obj;
    }
} 
public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("******* Original *******");

        Employee employee1 = new Employee();
        employee1.loadData();
        employee1.show();

        System.out.println("****** Duplicated *******");
        Employee employee2 = (Employee) employee1.clone();
        // employee1.show();
        employee2.emp.remove("1. Pankaj");
        employee2.show();

    }

}
