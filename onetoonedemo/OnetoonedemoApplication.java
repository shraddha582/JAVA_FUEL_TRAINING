package com.example.onetoonedemo;
import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnetoonedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetoonedemoApplication.class, args);
		
		
		ApplicationContext context;
		context=SpringApplication.run(OnetoonedemoApplication.class,args);
				RoleRepository role;
		role=context.getBean(RoleRepository.class);
		EmpRepository emp;
		emp=context.getBean(EmpRepository.class);
		Role r1=new Role(1,"Admin");
		role.save(r1);
		Emp e1=new Emp(100,"abc",r1);
		emp.save(e1);
		
		Optional<Role> op;
	
     //	op=role.findById(1);
	//Role r2=op.get();
	//	System.out.println(r2.getRoll_id());
	//	System.out.println(r2.getRoll_desc());
	//System.out.println(r2.desc());
	//	r2.setRoll_desc("HR");
	//	role.save(r2);
		
		//delete
		
		
		op=role.findById(1);
		Role r3=op.get();
		role.delete(r3);
		
		
		//List<Role> rolelist;
	//	rolelist=role.findAll();
		
		//for(Role r3:rolelist) {
		//	System.out.println(r3.getRoll_id());
		//	System.out.println(r3.getRoll_desc());
		}
		
	}


