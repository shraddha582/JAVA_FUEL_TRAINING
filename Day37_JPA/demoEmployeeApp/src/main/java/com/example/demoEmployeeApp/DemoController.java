package com.example.demoEmployeeApp;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@EmployeeAppController
public class DemoController {

	@Autowired
	private EmployeeRepository emp;
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return emp.findAll();
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id")Integer empId) {
		Optional<Employee>op = emp.findById(empId);
		Employee em = op.get();
		return em;
	}
	/*@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee em) {
		return emp.save(em);
	}
	@PutMapping("/updateemp/{id}")
	public boolean updateEmployee(@PathVariable(value="id")Integer empId,
	@RequestBody Employee empDetails) throws Exception{
		boolean f = true;
		try {
			Optional<Employee>op = emp.findById(empId);
			Employee em = op.get();
			em.setName(empDetails.getName());
			final Employee updatedEmp = emp.save(em);
		}catch(Exception e) {
			f= false;
		}
		return f;
		}
	@DeleteMapping("/deleteemp/{id}")
	public boolean deleteEmployee(@PathVariable(value= "id")Integer empId,@RequestBody Employee empDetails)
	throws Exception{
		Optional<Employee>op = emp.findById(empId);
		Employee em = op.get();
		emp.delete(em);
		return true;
	}*/
}
