abstract class Account{
void getCustInfo(){
System.out.println("Get Cust Information");
}
abstract void calculateIntrest();
}
class Saving extends Account{
@Override
void calculateIntrest(){
System.out.println("calculate intrest of saving");
}
}
class Loan extends Account{
@Override
void calculateIntrest(){
System.out.println("calculate intrest of loan");
}
}
class AccountFactory{
public static Account getAccount(String type) {
Account obj= null;
if(type.equalsIgnoreCase("saving")){
obj=new Saving();
}
else{
obj=new Loan();
}
return obj;
}
}
public class DemoFactory{
public static void main(String[] args){
Account ob1=AccountFactory.getAccount("Loan");
ob1.calculateIntrest();
ob1=AccountFactory.getAccount("saving");
ob1.calculateIntrest();
}
}
