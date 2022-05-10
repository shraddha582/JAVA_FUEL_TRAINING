class Test1{
void add(int a,int b){
System.out.println("Int Addition");
System.out.println(a+b);
}

void add(float a,float b){
System.out.println("Float  Addition");
System.out.println(a+b);
}
}
public class DemoOverload{
public static void main(String []args){
Test1 t1=new Test1();
t1.add(2.3f,1.3f);
t1.add(100,200);
}
}
