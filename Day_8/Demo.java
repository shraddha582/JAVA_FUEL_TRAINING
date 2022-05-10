//import java.util.*;

class Address{
   int housenum;
   String areaname;
   String city;
   void setHousenum(int x)
   {
   this.housenum=housenum;
   }
   int getHousenum()
   {
   return housenum;
   }
   void setAreaname(String areaname)
   {
   this.areaname=areaname;
   }
   int getAreaname()
   {
   return areaname;
   }
   void setCity(String city)
   {
   this.city=city;
   }
   int getCity()
   {
   return city;
   }
 }
   class Student{
   int id;
   String name;
   Address adr;
   
   void setId(Address adr)
   {
   this.id=id;
   }
   int get()
   {
   return housenum;
   }
   void setHousenum(int x)
   {
   this.housenum=housenum;
   }
   int getHousenum()
   {
   return housenum;
   }
   void setHousenum(int x)
   {
   this.housenum=housenum;
   }
   int getHousenum()
   {
   return housenum;
   }
     }
     
   class Demo{
public static void main(String []args){
   Address ad=new Address();
   ad.setHousenum(1);
   ad.setAreaname("abc");
   ad.setCity("Aurangabad");
   
   Student st=newStudent();
   int x=101;
   st.setId(x);
   st.setAdr(ad);
   st.setName("xyz");
   
   int id;
   id1=st.getId();
   String n;
   n=st.getAdr();
   Address ad1;
   ad1.getAdr();
   
   int hn;
   hn=ad1.getHousenum();
   String area;
   area=ad1.getAreaname();
   String city;
   city=ad1.getCity();
   }
}
