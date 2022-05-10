class Address
{
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
String getAreaname()
{
   return areaname;
}

void setCity(String city)
{
   this.city=city; 
}
String getCity()
{
   return city;
}
}

   class Student
   {
   int id;
   String name;
   Address adr;
   
   void setId(int id)
   {
   this.id=id;
   }
   public void setAdr(Address adr)
   {
   this.adr=adr;
   }
   public void setName(String name)
   {
   this.name=name;
   }
int getId()
{
return id;
}
Address getAdr()
{
return adr;
}
String getName()
{
return name;
}
}
   class Demo
   {
      public static void main(String []args)
   {
   Address ad=new Address();
   ad.setHousenum(1);
   ad.setAreaname("abc");
   ad.setCity("Aurangabad");
   //create student class object
   
   Student st=new Student();
   int x=101;
   st.setId(x);
   st.setAdr(ad);
   st.setName("xyz");
   //read value
   int id1;
   id1=st.getId();
   String n;
   n=st.getName();
   Address ad1;
   ad1=st.getAdr();
   //read address object values
   
   int hn;
   hn=ad1.getHousenum();
   String area;
   area=ad1.getAreaname();
   String city=ad1.getCity();
   
    }
}
