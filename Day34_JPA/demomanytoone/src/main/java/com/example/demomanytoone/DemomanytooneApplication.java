package com.example.demomanytoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demomanytoone.DemomanytooneApplicationTests.OnetoonedemoApplication;

@SpringBootApplication
public class DemomanytooneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomanytooneApplication.class, args);
			ApplicationContext context;
			context=SpringApplication.run(DemomanytooneApplication.class, args);
			 Cartrepository Cart;
			 Cart= context.getBean(Cartrepository.class);
			Itemrepository Items;
			 Items=context.getBean(Itemrepository.class);
			 Cart c1 = new Cart(1,"abc");
			 Cart.save(c1);
			 
			 Items I1 = new Items(100,"mouse",200,c1);
			 Items.save(I1);
			 Items I2 = new Items(101,"Keyboard",800,c1);
			 emp.save(e2);
		}

	}


	}

}
