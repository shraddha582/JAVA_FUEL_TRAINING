package com.example.OnetoOneChoiceAssignmentdemo;

import java.util.List;
import java.util.*;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnetoOneChoiceAssignmentdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context ;
		context = SpringApplication.run(OnetoOneChoiceAssignmentdemoApplication.class, args);
		
		RoleRepository role ;
		role = context.getBean(RoleRepository.class);
		
		EmpRepository emp ;
		emp = context.getBean(EmpRepository.class);
	

		do {
			
			System.out.println("-----------------------------------------------");
			Date current_Date = new Date();
			System.out.println("\t JPA Database Application Version 1.0 ");
			System.out.print("\t"+current_Date+"");
			System.out.println("-----------------------------------------------");
			
			
			System.out.println("\t 1.Save Record \n"+
			"\t 2.Select Record \n"+
		    "\t 3.Update Record \n" +
			"\t 4.Delete Record \n" +
		    "\t 5.Exit \n"
			
		   );
			
		    
		   System.out.print("Enter your Choice : ");
		   Scanner sc = new Scanner(System.in);
		   int choice = sc.nextInt();
		   
		   
		   
		   if(choice == 1)
		   {
			    System.out.println("-----------------------------------------------");
				System.out.println("\t  Delete Operation  ");
				System.out.println("-----------------------------------------------");
				
		   System.out.println("Enter Role ID :");
			   Scanner S1= new Scanner(System.in);
		   int role_id = S1.nextInt();
		   System.out.println("Enter Role  :");
		   String role_name = S1.next();
		   
		   Role r1 = new Role(role_id,role_name);
			   role.save(r1);
			   
			   System.out.println("Enter Employee ID :");
			  
			   int emp_id = S1.nextInt();
			   System.out.println("Enter Employee Name  :");
			   String name = S1.next();
			   
			   Emp e1 = new Emp(emp_id,name,r1);
			   emp.save(e1);
			   
			   System.out.println("Successfully Record Saved !");
				   
					   
			  
			   
			   
		   }else if(choice == 2)
		   {
		   
			   List<Emp> list;
			   list = emp.findAll();
			   
			   System.out.println("Role ID " +" : "+"Employe Name"+" : "+"Employee Id");
			
		for(Emp e : list)
			{			
    		System.out.println(e.getRoleobj().getRole_id()+"  : "+e.getName()+"  : "+e.getEmp_id());      		
      		System.out.println("Successfully Select Query !");
			
					
			}
			   
		   }else if(choice == 3)
		   {
			   Optional<Emp> op;
 				op = emp.findById(100);
      			Emp e1 = op.get();
      			System.out.println(e1.getEmp_id());
            	System.out.println(e1.getName());
            	System.out.println("Enter Updated Name : ");
            	String UName = sc.next();
		    	e1.setName(UName);
			    emp.save(e1);
			    	
			    	System.out.println("Successfully Update Record !");
			    	
		   }else if(choice == 4)
		   {
			
//     		   Optional<Role> op1;
//     			op1 = role.findById();
//    			Role r1 = op1.get();
//    			System.out.println(r1.getRole_desc());
//    			role.deleteById();;
//    			role.save(r1);
			   
			   do {
				    System.out.println("-----------------------------------------------");
					System.out.println("\t  Delete Operation  ");
					System.out.println("-----------------------------------------------");
					
                   System.out.println();
				   System.out.println(
						   "\t 1.Delete Role Details  \n"+
				           "\t 2.Delete Employee Details  \n"+
						   "\t 3.Previous Back \n"
				   
						);
				   
				   System.out.print(" Enter your Choice :");
				   int ch = sc.nextInt();
				   
				   if(ch == 1)
				   {
					   Optional<Emp> op ;
					   System.out.println("Enter Employee Id  : ");
					   int emp_id = sc.nextInt();
					   op = emp.findById(emp_id);
					   emp.deleteById(emp_id);;
					   System.out.println("\t Sucessfully Record Delete ");
				   }
				   else if(ch == 2)
				   {
					   Optional<Role> op;
					   op = role.findById(46156);
					   role.deleteById(46156);;
					   System.out.println("Working progresss");
					   System.out.println("\t Sucessfully Record Delete ");
					   
				   }else if(ch == 3)
				   {
					  
                       break;
				   }
				   
			   }while(true);
			   
			   
			  
			
      		
			   
		   }else if(choice == 5)
		   {
			  System.exit(0); 
		   }
					
		
			
			
			
			
		}while(true);
		
	}

}