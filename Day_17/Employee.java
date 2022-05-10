import java.util.ArrayList;
import java.util.Iterator;

/*Create an ArrayList of Employee( id,name,address,sal) objects and
 search for particular Employee 
object based on id number */


class Employee{
    private int id;
    private String name;
    private String address;
    private Double salary;

    public Employee(int id , String name , String address , double salary) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() { 
        return id;
    }

    public String toString() {
        return "Employee \n[\nid = " + id + ",\n name = " + name + ",\n address = " + address + ",\n salary = " + salary + "\n]";
    }
}

public class Employee{
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Ajay", "Aurangabad, India", 1000000));
        employees.add(new Employee(102, "Bhushan", "Bihar, India", 2000000));
        employees.add(new Employee(103, "Chetana","Chennai, Tamil Nadu",3000000));
        employees.add(new Employee(104, "Diksha","Deharadun, India",4000000));
        employees.add(new Employee(105, "Pankaj", "Lonar, India",5000000));

        Iterator<Employee> it = employees.iterator();

        int searchId = 105;

        while (it.hasNext()) {
            Employee e = it.next();

            if(e.getId() == searchId){
                    System.out.println(e);
            }
        }
    }
}
